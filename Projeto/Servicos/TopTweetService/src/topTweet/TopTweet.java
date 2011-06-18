package topTweet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TopTweet {

	public String topTweet(String xml){
		List<TweetEntry> tweetEntries = new ArrayList<TweetEntry>();
		Map<String, Integer> tweets = new HashMap<String, Integer>();

		//System.out.println("ENTROU TOP TWEET");
		try {
//			File file = new File("tempTop.xml");
//			FileWriter fileWriter = new FileWriter(file);
//			file.createNewFile();
//			fileWriter.write(xml);
//			fileWriter.close();

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new ByteArrayInputStream( xml.getBytes("UTF-8") ));
			doc.getDocumentElement().normalize();

			NodeList nodeList = doc.getElementsByTagName("entry");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				if(node.getNodeType() == Node.ELEMENT_NODE){
					TweetEntry entry = new TweetEntry();
					Element entryNode  = (Element) node;

					//TWEET
					NodeList titles = entryNode.getElementsByTagName("title");

					Element title = (Element) titles.item(0);
					NodeList titleChildren = title.getChildNodes();
					String tweet = ((Node) titleChildren.item(0)).getNodeValue();

					if(!tweets.containsKey(tweet)){
						entry.setTweet(tweet);

						//AVATAR
						NodeList links = entryNode.getElementsByTagName("link");
						Element secondLink = (Element) links.item(1);
						entry.setAvatar(secondLink.getAttribute("href"));

						NodeList authors = entryNode.getElementsByTagName("author");
						Element author = (Element) authors.item(0);
						NodeList childrenName  = author.getElementsByTagName("name");
						NodeList chilrenUri  = author.getElementsByTagName("uri");

						//AUTHOR
						Element name = (Element) childrenName.item(0);
						NodeList nameChildren = name.getChildNodes();
						entry.setAuthor(((Node) nameChildren.item(0)).getNodeValue());

						//URI
						Element uri = (Element) chilrenUri.item(0);
						NodeList uriChildren = uri.getChildNodes();
						entry.setUri(((Node) uriChildren.item(0)).getNodeValue());

						tweetEntries.add(entry);
						tweets.put(tweet, 1);
					}else{
						tweets.put(tweet, tweets.get(tweet).intValue() + 1);
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}

		StringBuffer stringBuffer = new StringBuffer(); 
		stringBuffer.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
		stringBuffer.append("<feed>");
		for(TweetEntry entry : tweetEntries){
			stringBuffer.append("<entry>");
			stringBuffer.append("<tweet>" + entry.getTweet().replaceAll("[&]", "&amp;").replaceAll("[<]", "&lt;").replaceAll("[>]", "&gt;")+ "</tweet>");
			stringBuffer.append("<avatar>" + entry.getAvatar().replaceAll("[&]", "&amp;").replaceAll("[<]", "&lt;").replaceAll("[>]", "&gt;")+ "</avatar>");
			stringBuffer.append("<author>" + entry.getAuthor().replaceAll("[&]", "&amp;").replaceAll("[<]", "&lt;").replaceAll("[>]", "&gt;")+ "</author>");
			stringBuffer.append("<uri>" + entry.getUri().replaceAll("[&]", "&amp;").replaceAll("[<]", "&lt;").replaceAll("[>]", "&gt;")+ "</uri>\n");
			stringBuffer.append("<count>" + tweets.get(entry.getTweet())+ "</count>");
			stringBuffer.append("</entry>");
		}
		stringBuffer.append("</feed>");

		String bufferString = stringBuffer.toString();
		//System.out.println(bufferString);
		
		return bufferString;
	}

//	public static void main(String[] args) {
//		try {
//			File file = new File("T.xml");
//			FileWriter fileWriter = new FileWriter(file);
//			file.createNewFile();
//			fileWriter.write(topTweet(""));
//			fileWriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
