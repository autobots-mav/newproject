package sample;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xml {
	public static void main(String[] args) {
		try
		{
		File file = new File("C:\\Users\\hp\\Desktop\\Janani\\DemoFile.xml");
		DocumentBuilderFactory db =DocumentBuilderFactory.newInstance();
		DocumentBuilder document =db.newDocumentBuilder();
		Document  doc = document.parse(file);
		doc.getDocumentElement().normalize();
		Element root = doc.getDocumentElement();
		System.out.println("Root element :" + root);
		System.out.println("Root Element Name :"+root.getNodeName());
		NodeList list = doc.getElementsByTagName("staff");
		System.out.println("============================");
		for (int i = 0; i < list.getLength(); i++)
		{
		Node node = list.item(i);
		System.out.println("");
		if (node.getNodeType() == Node.ELEMENT_NODE)
		{
		   Element ele = (Element) node;
		   System.out.println("Staff ID :" +ele.getAttribute("id"));
		   System.out.println("First Name : "  + ele.getElementsByTagName("firstname").item(0).getTextContent());
		   System.out.println("Last Name : "   + ele.getElementsByTagName("lastname").item(0).getTextContent());
		   System.out.println("Nick Name : "    + ele.getElementsByTagName("nickname").item(0).getTextContent());
		   System.out.println("Salary : "    + ele.getElementsByTagName("salary").item(0).getTextContent());
		}
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		}

}
