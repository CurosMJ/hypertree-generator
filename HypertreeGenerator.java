import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;

class HypertreeGenerator {
	public static void main(String args[]) throws Exception
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		FileInputStream file = new FileInputStream(args[0]);

		Document document = builder.parse(file);

		Element root = document.getDocumentElement();

		//System.out.println("-----------------------------");

		Hypertree tree = new Hypertree(root, 0);
		tree.print();

		//System.out.println("\n-----------------------------");
	}
}