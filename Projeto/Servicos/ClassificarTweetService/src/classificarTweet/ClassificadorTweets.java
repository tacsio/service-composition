package classificarTweet;

public class ClassificadorTweets {

	public static int RT = 0;
    public static int DESCONTO = 1;
    public static int CADASTRO = 2;
	
	public static int classificar(String tweet) {

		tweet = tweet.toLowerCase();
		tweet = Processador.adaptarTexto(tweet);

		int classe = -1;

		if ((((tweet.contains("de #rt")) && (tweet.contains("concorr")
				|| tweet.contains("ganh") || tweet.contains("participe"))) || (tweet
				.contains("rt e concorra")))) {

			classe = RT;
		
		}else if (tweet.contains("cadastr") && (tweet.contains("ganh") || tweet.contains("gratis"))){
			classe = CADASTRO;
		}else if(tweet.contains("%off")){
			classe = DESCONTO;
		}else if(tweet.contains("promo") || tweet.contains("ofert")){
			
			int de = tweet.indexOf("der$");
			
			if(tweet.contains("gratis") || tweet.contains("free")
				    ||tweet.contains("desconto")){
				
				classe = DESCONTO;
			
			}else if(de != - 1){
				
				int i = de+4;
				
				while(i < tweet.length() &&ehDigito(tweet.charAt(i))){
					i++;
				}
				
				int por = tweet.indexOf("por", i);
				
				if(por != -1 && (por -  i) <= 2){
					classe = DESCONTO;
				}
			}
		}
		
		return classe;
	}
	
	private static boolean ehDigito(char c){
		
		return (c == '0' || c == '1' || c == '2' ||
                c == '3' || c == '4' || c == '5' ||
                c == '6' || c == '7' || c == '8' ||
                c == '9');
		
	}

}
