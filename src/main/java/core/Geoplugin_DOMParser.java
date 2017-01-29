package core;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Geoplugin_DOMParser {

	public static void main(String[] args) throws Throwable, Exception,	ParserConfigurationException {

String url = "http://www.geoplugin.net/xml.gp?ip=50.131.226.156";
String root_element="geoPlugin";
String element_00="geoplugin_request";
String element_01="geoplugin_city";
String element_02="geoplugin_countryName";
String element_03="geoplugin_regionName";
String element_04="geoplugin_request";

DocumentBuilderFactory f = DocumentBuilderFactory.newInstance(); // Get the DOM Builder Factory
DocumentBuilder b = f.newDocumentBuilder(); // Get the DOM Builder
Document doc = b.parse(url);// Load and Parse the XML document contains the complete XML as a Tree.
//doc.getDocumentElement().normalize(); // Optional

Element e=(Element) doc.getElementsByTagName(root_element).item(0);
// Parsing elements
System.out.println("debug: "+((Element) doc.getElementsByTagName(element_00).item(0)).getChildNodes().item(0).getNodeValue());
System.out.println("geoplugin_city: \t "      + e.getElementsByTagName(element_01).item(0).getChildNodes().item(0).getNodeValue());
System.out.println("geoplugin_countryName: \t "+ e.getElementsByTagName(element_02).item(0).getChildNodes().item(0).getNodeValue());
System.out.println("geoplugin_regionName: \t "  + e.getElementsByTagName(element_03).item(0).getChildNodes().item(0).getNodeValue());
System.out.println("geoplugin_request: \t "      + e.getElementsByTagName(element_04).item(0).getChildNodes().item(0).getNodeValue());


	}
}