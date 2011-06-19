package buscarTweet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BuscarTweet {

	static final String TWITTER_SEARCH_URL = "http://search.twitter.com/search.atom?rpp=%1$d&q=%2$s";
	static final int QUANTIDADE_TWITTER = 50;

	public String buscaEntradaTwitter(String search) {
		String retorno = "";
		System.out.println("BuscaTweet Request Received");

		try {
			URL url = new URL(String.format(TWITTER_SEARCH_URL, QUANTIDADE_TWITTER, search));

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Request-Method", "GET");
			connection.setDoInput(true);
			connection.setDoOutput(false);
			connection.connect();

			BufferedReader bufferReader = new BufferedReader(
					new InputStreamReader(connection.getInputStream()));

			StringBuffer xmlRespostaBuffer = new StringBuffer(10000);
			String strinLine = bufferReader.readLine();

			while (strinLine != null) {
				xmlRespostaBuffer.append(strinLine);
				strinLine = bufferReader.readLine();
			}
			bufferReader.close();
			retorno = xmlRespostaBuffer.toString();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(retorno);
		return retorno;
	}

//	public static void main(String[] args) {
//		try {
//			File file = new File("TESTE.xml");
//			FileWriter fileWriter = new FileWriter(file);
//			file.createNewFile();
//			fileWriter.write(buscaEntradaTwitter("propaganda"));
//			fileWriter.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
