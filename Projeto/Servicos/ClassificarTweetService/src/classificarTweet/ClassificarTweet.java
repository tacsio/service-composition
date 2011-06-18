package classificarTweet;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import classificarTweet.TweetEntry;

public class ClassificarTweet {

	public static String classificarTweet(String xml){
		List<TweetEntry> tweetEntries = new ArrayList<TweetEntry>();
		//System.out.println("ENTROU CLASSIFICAR TWEET");

		try {
//			File file = new File("NewFile.xml");
//			FileWriter fileWriter = new FileWriter(file);
//			file.createNewFile();
//			fileWriter.write(xml);
//			fileWriter.close();

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new ByteArrayInputStream( xml.getBytes("ISO-8859-1") ));
//			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();

			NodeList nodeList = doc.getElementsByTagName("entry");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				if(node.getNodeType() == Node.ELEMENT_NODE){
					TweetEntry entry = new TweetEntry();
					Element entryNode  = (Element) node;

					//TWEET
					NodeList tweetList = entryNode.getElementsByTagName("tweet");
					Element tweet = (Element) tweetList.item(0);
					NodeList tweetChildren = tweet.getChildNodes();
					entry.setTweet(((Node) tweetChildren.item(0)).getNodeValue());

					//AVATAR
					NodeList avatarList = entryNode.getElementsByTagName("avatar");
					Element avatar = (Element) avatarList.item(0);
					NodeList avatarChildren = avatar.getChildNodes();
					entry.setAvatar(((Node) avatarChildren.item(0)).getNodeValue());

					//AUTHOR
					NodeList authorList = entryNode.getElementsByTagName("author");
					Element author = (Element) authorList.item(0);
					NodeList authorChildren = author.getChildNodes();
					entry.setAuthor(((Node) authorChildren.item(0)).getNodeValue());

					//URI
					NodeList uriList = entryNode.getElementsByTagName("uri");
					Element uri = (Element) uriList.item(0);
					NodeList uriChildren = uri.getChildNodes();
					entry.setUri(((Node) uriChildren.item(0)).getNodeValue());

					//COUNT
					NodeList countList = entryNode.getElementsByTagName("count");
					Element count = (Element) countList.item(0);
					NodeList countChildren = count.getChildNodes();
					entry.setCount(Integer.parseInt(((Node) countChildren.item(0)).getNodeValue()));

					tweetEntries.add(entry);
				}
			}

		} catch (IOException e) {			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
		buffer.append("<feed>");

		for(TweetEntry entry : tweetEntries){
			buffer.append("<entry>");
			buffer.append("<tweet>" + entry.getTweet().replaceAll("[&]", "&amp;").replaceAll("[<]", "&lt;").replaceAll("[>]", "&gt;")+ "</tweet>");
			buffer.append("<avatar>" + entry.getAvatar().replaceAll("[&]", "&amp;").replaceAll("[<]", "&lt;").replaceAll("[>]", "&gt;")+ "</avatar>");
			buffer.append("<author>" + entry.getAuthor().replaceAll("[&]", "&amp;").replaceAll("[<]", "&lt;").replaceAll("[>]", "&gt;")+ "</author>");
			buffer.append("<uri>" + entry.getUri().replaceAll("[&]", "&amp;").replaceAll("[<]", "&lt;").replaceAll("[>]", "&gt;")+ "</uri>\n");
			buffer.append("<count>" + entry.getCount()+ "</count>");
			buffer.append("<classe>" + ClassificadorTweets.classificar(entry.getTweet())+ "</classe>"); 
			buffer.append("</entry>");
		}
		buffer.append("</feed>");
		String bufferString = buffer.toString();
		//System.out.println(bufferString);
		return bufferString;
	}
	public static void main(String[] args){ 
		try {
			File file = new File("Classificad.xml");
			FileWriter fileWriter = new FileWriter(file);
			file.createNewFile();
			fileWriter.write(classificarTweet(""));
			fileWriter.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
