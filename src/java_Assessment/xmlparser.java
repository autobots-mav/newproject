package java_Assessment;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xmlparser {
public static void main(String[] args) {
	try
	{
		File file = new File("C:\\Users\\training\\Desktop\\Vignesh_3774\\sample.xml");
		DocumentBuilderFactory db =DocumentBuilderFactory.newInstance();
		DocumentBuilder document =db.newDocumentBuilder();
		Document  doc = document.parse(file);
		doc.getDocumentElement().normalize();
		Element root = doc.getDocumentElement();
		System.out.println("Root element :" + root);
		System.out.println("Root Element Name :"+root.getNodeName());
		NodeList list = doc.getElementsByTagName("staff");
		System.out.println("============================");
		for (int temp = 0; temp < list.getLength(); temp++)
		{
		 Node node = list.item(temp);
		 System.out.println("");
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    Element eElement = (Element) node;
		    System.out.println("Staff ID :" +eElement.getAttribute("id"));
		    System.out.println("First Name : "  + eElement.getElementsByTagName("firstname").item(0).getTextContent());
		    System.out.println("Last Name : "   + eElement.getElementsByTagName("lastname").item(0).getTextContent());
		    System.out.println("Nick Name : "    + eElement.getElementsByTagName("nickname").item(0).getTextContent());
		    System.out.println("Salary : "    + eElement.getElementsByTagName("salary").item(0).getTextContent());
		 }
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
