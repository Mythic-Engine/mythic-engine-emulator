/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game;

import com.mythic.network.game.data.User;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.util.CharsetUtil;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SFS {

	final private static Logger log = LoggerFactory.getLogger(SFS.class);
	private static final SFS _instance = new SFS();

	public static SFS sfs() {
		return _instance;
	}

	public void sendResponse(String[] params, int fromRoom, Channel channel) {
		write(channel, IntStream.range(1, params.length).mapToObj(i -> params[i] + "%").collect(Collectors.joining("", "%" + "xt" + "%" + params[0] + "%" + fromRoom + "%", "")));
	}

	public void sendResponse(String params, Channel channel) {
		write(channel, params);
	}

	public void sendResponse(JSONObject jso, int fromRoom, Channel channel) {
		try {
			write(channel, new JSONObject()
				.element("t", "xt")
				.element("b", new JSONObject().element("r", fromRoom).element("o", jso)).toString()
			);
		} catch (JSONException jsoEx) {
			log.error("Error creating JSON response: ", jsoEx);
		}
	}

	public void sendResponseRemoveUser(String params, User user, LinkedList<Channel> channels) {
		channels.stream().filter(channel -> !user.network().getChannel().equals(channel)).forEach(channel -> write(channel, params));
	}

	public void sendResponseRemoveUser(String[] params, int fromRoom, User user, LinkedList<Channel> channels) {
		channels.stream().filter(channel -> !user.network().getChannel().equals(channel)).forEach(channel -> {
			String response = IntStream.range(1, params.length).mapToObj(i -> params[i] + "%").collect(Collectors.joining("", "%" + "xt" + "%" + params[0] + "%" + fromRoom + "%", ""));
			write(channel, response);
		});
	}

	public void sendResponse(String[] params, int fromRoom, LinkedList<Channel> channels) {
		String response = IntStream.range(1, params.length).mapToObj(i -> params[i] + "%").collect(Collectors.joining("", "%" + "xt" + "%" + params[0] + "%" + fromRoom + "%", ""));
		channels.forEach(channel -> write(channel, response));
	}

	public void sendResponse(JSONObject jso, int fromRoom, LinkedList<Channel> channels) {
		try {
			channels.forEach(channel -> channel.writeAndFlush(
				Unpooled.copiedBuffer(new JSONObject()
					.element("t", "xt")
					.element("b", new JSONObject()
						.element("r", fromRoom)
						.element("o", jso))
					.toString() + '\0', CharsetUtil.UTF_8
				), channel.voidPromise()
			));
		} catch (JSONException jsoEx) {
			log.error("Error creating JSON response: ", jsoEx);
		}
	}

	public StringBuffer makeHeader(String type, int room, String action) {
		return new StringBuffer().append("<msg t='").append(type).append("'><body action='").append(action).append("' r='").append(room).append("'>");
	}

	private void write(Channel channel, String content) {
		channel.writeAndFlush(Unpooled.copiedBuffer(content + '\0', CharsetUtil.UTF_8), channel.voidPromise());
	}

}
