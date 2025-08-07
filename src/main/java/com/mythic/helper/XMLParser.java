/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.helper;

import net.n3.nanoxml.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Reader;
import java.io.StringReader;

public class XMLParser {

	private static final Logger log = LoggerFactory.getLogger(XMLParser.class);

	private static IXMLParser xmlParser;

	static {
		try {
			xmlParser = XMLParserFactory.createDefaultXMLParser();
			xmlParser.setResolver(new VoidXMLEntityResolver());
		} catch (Exception e) {
			log.error("Can't instantiate XML Parser! Server quits");
		}
	}

	public static IXMLParser xmlParser() {
		return xmlParser;
	}

}

class VoidXMLEntityResolver extends XMLEntityResolver {

	protected Reader openExternalEntity(IXMLReader xmlReader, String publicID, String systemID) throws XMLParseException {
		return new StringReader("");
	}

}