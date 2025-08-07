/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game.internal;

import io.netty.channel.Channel;
import net.n3.nanoxml.IXMLElement;

public interface InternalEvent {

	void onEvent(IXMLElement msg, Channel channel);

}
