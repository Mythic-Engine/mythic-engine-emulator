/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network;

import com.aqalter.api.PlayerNetwork;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.util.CharsetUtil;

import java.util.Arrays;

public class NettyPlayerNetwork extends PlayerNetwork {

    private final Channel channel;

    public NettyPlayerNetwork(Channel channel, int connectionId) {
        super(connectionId);
        this.channel = channel;
    }

    @Override
    public Channel getChannel() { return channel; }

    @Override
    public void close() {
        if (channel.isActive()) {
            channel.close();
        }
    }

    @Override
    public void flush() {
        channel.flush();
    }

    @Override
    public void send(String[] msg) {
        channel.writeAndFlush(Unpooled.copiedBuffer(Arrays.toString(msg) + (char) 0, CharsetUtil.UTF_8));
    }

    @Override
    public void sendQueued(String[] msg) {
        channel.write(Unpooled.copiedBuffer(Arrays.toString(msg) + (char) 0, CharsetUtil.UTF_8));
    }

}
