package core;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DOMParser {

	public static void main(String[] args) throws Throwable, Exception,	ParserConfigurationException {

String url = "http://alex.academy/ebay.xml";

String node = "kadu-response";
String element_001 = "server";
String element_01 = "orig-kw";
String element_02 = "engine";
String element_03 = "kadu-version";
String element_04 = "response-time";
String element_05 = "deals";
String attribute_01 = "count";


DocumentBuilderFactory f = DocumentBuilderFactory.newInstance(); // Get the DOM Builder Factory
DocumentBuilder b = f.newDocumentBuilder(); // Get the DOM Builder
Document doc = b.parse(url);// Load and Parse the XML document contains the complete XML as a Tree.
doc.getDocumentElement().normalize(); // Optional

// Parsing elements
/*System.out.println("Key: \t\t "+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_01).item(0).getChildNodes().item(0).getNodeValue());
System.out.println("Engine: \t "+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_02).item(0).getChildNodes().item(0).getNodeValue());
System.out.println("Version: \t "+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_03).item(0).getChildNodes().item(0).getNodeValue());
System.out.println("Response: \t "+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_04).item(0).getChildNodes().item(0).getNodeValue());*/

System.out.println("Key: \t\t "+ ((Element) doc.getElementsByTagName(element_001).item(0)).getElementsByTagName(element_01).item(0).getChildNodes().item(0).getNodeValue());
System.out.println("Engine: \t "+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_02).item(0).getChildNodes().item(0).getNodeValue());
System.out.println("Version: \t "+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_03).item(0).getChildNodes().item(0).getNodeValue());
System.out.println("Response: \t "+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_04).item(0).getChildNodes().item(0).getNodeValue());			
// Parsing attribute
System.out.println("Number of deals: "+ ((Element) doc.getElementsByTagName(element_05).item(0)).getAttribute(attribute_01).trim());
	}
}
