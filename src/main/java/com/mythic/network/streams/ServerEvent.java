/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.streams;

import io.netty.channel.Channel;
import net.n3.nanoxml.IXMLElement;
import net.sf.json.JSONObject;

import java.util.LinkedList;

public class ServerEvent {

	IXMLElement xmlMsg;
	String strMsg;
	String type;
	JSONObject jsonObj;
	Channel sender;
	LinkedList recipients;
	private boolean isXml;
	private boolean isJson;

	public ServerEvent(String type, IXMLElement msg, Channel sender) {
		this.type = type;
		this.xmlMsg = msg;
		this.sender = sender;
		this.isXml = true;
		this.isJson = false;
	}

	public ServerEvent(String type, String msg, Channel sender) {
		this.type = type;
		this.strMsg = msg;
		this.sender = sender;
		this.isXml = false;
		this.isJson = false;
	}

	public ServerEvent(String type, JSONObject msg, Channel sender) {
		this.type = type;
		this.jsonObj = msg;
		this.sender = sender;
		this.isXml = false;
		this.isJson = true;
	}

	public ServerEvent(String type, String msg, Channel sender, LinkedList recipients) {
		this.type = type;
		this.strMsg = msg;
		this.sender = sender;
		this.recipients = recipients;
	}

	public IXMLElement getXmlMsg() {
		return this.xmlMsg;
	}

	public JSONObject getJsonMsg() {
		return this.jsonObj;
	}

	public String getStrMsg() {
		return this.strMsg;
	}

	public String getType() {
		return this.type;
	}

	public LinkedList getRecipients() {
		return this.recipients;
	}

	public Channel getSenderChannel() {
		return this.sender;
	}

	public boolean getIsXml() {
		return this.isXml;
	}

	public boolean getIsJson() {
		return this.isJson;
	}

	public boolean getIsStr() {
		return !this.isJson && !this.isXml;
	}


}
