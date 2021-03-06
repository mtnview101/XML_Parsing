package core;

import java.io.*;
import java.net.URL;
import javax.xml.stream.*;

public class StAXParser {
	public static void main(String[] args) throws XMLStreamException, IOException {

		//URL url = new URL("http://alex.academy/ebay.xml"); http://www.ebay.com/sch/i.html?_odkw=sony&_nkw=sony&country_id=1&lang_id=1
		URL url = new URL("http://www.ebay.com/sch/i.html?_odkw=sony&_nkw=sony&country_id=1&lang_id=1");
		final String element_01 = "orig-kw";
		final String element_02 = "engine";
		final String element_03 = "kadu-version";
		final String element_04 = "response-time";
		final String element_05 = "deals";

		InputStream in = url.openStream();

		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(in);
		int eventType = reader.getEventType();

		while (reader.hasNext()) {
		eventType = reader.next();
			if (eventType == XMLStreamReader.START_ELEMENT) {
			if (reader.getLocalName() == element_01) {System.out.println("Key: \t\t " + reader.getElementText());}
			if (reader.getLocalName() == element_02) {System.out.println("Engine: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_03) {System.out.println("Version: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_04) {System.out.println("Response: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_05) {System.out.println("Number of deals: " + reader.getAttributeValue(0));}}}
	}
}
