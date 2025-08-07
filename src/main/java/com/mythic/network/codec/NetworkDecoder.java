/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.codec;

import com.google.common.base.Charsets;
import com.mythic.Main;
import com.mythic.helper.XMLParser;
import com.mythic.network.game.Game;
import com.mythic.network.streams.ServerEvent;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import net.n3.nanoxml.IXMLElement;
import net.n3.nanoxml.StdXMLReader;
import net.n3.nanoxml.XMLException;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class NetworkDecoder extends MessageToMessageDecoder<ByteBuf> {

	private final static Logger log = LoggerFactory.getLogger(NetworkDecoder.class);

	private final static char MESSAGE_XML = '<';
	private final static char MESSAGE_JSON = '{';
	private final static char MESSAGE_SFS = '%';
	
	private final static String MESSAGE_SFS_POLICY = "policy";
	
	private final static String RESPONSE_POLICY = "<cross-domain-policy><allow-access-from domain='*' to-ports='" + Main.server.getPort() + "' /></cross-domain-policy>\0)";

	private static final String XML_VER_CHK = "verChk";
	private static final String XML_LOGIN = "login";
	private static final String XML_ENTITY = "<!ENTITY";
	private static final String XML_HTTP = "http";
	private static final String XML_SYSTEM = "SYSTEM";

	private static final String JSON_BODY = "body";
	private static final String JSON_TYPE = "type";

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf byteBuf, List<Object> out) {
		try {
			byteBuf.markReaderIndex();

			if (byteBuf.readableBytes() < 6) {
				log.warn("Received packet with less than 6 bytes from {}", ctx.channel().remoteAddress());
				
				Game.banIP(ctx.channel().remoteAddress(), System.currentTimeMillis());

				if (ctx.channel().isActive()) {
					ctx.close();
				}
				
				return;
			}

			String msg = byteBuf.toString(Charsets.UTF_8);

			switch (msg.charAt(0)) {
				case MESSAGE_XML -> { //XML
					if (msg.contains(MESSAGE_SFS_POLICY)) {
						ChannelFuture future = ctx.writeAndFlush(Unpooled.copiedBuffer(RESPONSE_POLICY.getBytes()));
						future.addListener(ChannelFutureListener.CLOSE);
						return;
					}

					try {
						if (msg.contains(XML_VER_CHK) || msg.contains(XML_LOGIN)) {
							if (msg.contains(XML_ENTITY) || msg.contains(XML_HTTP) || msg.contains(XML_SYSTEM)) {
								log.warn("Blocked suspicious XML from {}", ctx.channel().remoteAddress());

								Game.banIP(ctx.channel().remoteAddress(), System.currentTimeMillis());
								return;
							}

							XMLParser.xmlParser().setReader(StdXMLReader.stringReader(msg));

							IXMLElement header = (IXMLElement) XMLParser.xmlParser().parse();

							out.add(new ServerEvent(header.getAttribute("t", ""), header.getFirstChildNamed("body"), ctx.channel()));
							return;
						}

						log.warn("User sent crafted packet (XML not allowed): {}", ctx.channel().remoteAddress());

						Game.banIP(ctx.channel().remoteAddress(), System.currentTimeMillis());

						if (ctx.channel().isActive()) {
							ctx.close();
						}
					} catch (XMLException e) {
						log.warn("Malformed XML from {} - kicking client", ctx.channel().remoteAddress());

						Game.banIP(ctx.channel().remoteAddress(), System.currentTimeMillis());

						if (ctx.channel().isActive()) {
							ctx.close();
						}
					}
				}
				case MESSAGE_JSON -> {
					try {
						JSONObject jso = JSONObject.fromObject(msg);
						out.add(new ServerEvent(jso.getString(JSON_TYPE), jso.getJSONObject(JSON_BODY), ctx.channel()));
					} catch (Exception e) {
						log.warn("Malformed JSON from {} - {}", ctx.channel().remoteAddress(), e.getMessage());
						
						Game.banIP(ctx.channel().remoteAddress(), System.currentTimeMillis());
						
						if (ctx.channel().isActive()) {
							ctx.close();
						}
					}
				}
				case MESSAGE_SFS -> {
					int msgBody = msg.indexOf(MESSAGE_SFS, 1);

					if (msgBody == -1) {
						log.warn("Bad SFS string format from {}", ctx.channel().remoteAddress());

						Game.banIP(ctx.channel().remoteAddress(), System.currentTimeMillis());

						if (ctx.channel().isActive()) {
							ctx.close();
						}
						
						return;
					}

					out.add(new ServerEvent(msg.substring(1, msgBody), msg.substring(msgBody + 1), ctx.channel()));
				}
				default -> {
					log.warn("Unknown packet type from {} - closing connection", ctx.channel().remoteAddress());

					Game.banIP(ctx.channel().remoteAddress(), System.currentTimeMillis());

					if (ctx.channel().isActive()) {
						ctx.close();
					}
				}
			}
		} catch (Exception e) {
			log.error("Unhandled exception in decoder for {}: {}", ctx.channel().remoteAddress(), e.getMessage(), e);

			if (ctx.channel().isActive()) {
				ctx.close();
			}
		}
	}

}
