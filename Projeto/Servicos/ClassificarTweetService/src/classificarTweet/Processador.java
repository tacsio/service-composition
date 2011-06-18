package classificarTweet;

public class Processador {

	public static String adaptarTexto(String texto){
		
		if(texto.substring(0, 2).equals("rt")){
			texto = texto.substring(2);	
		}
		
        if (texto != null && !texto.equals("")){
        	char[] acentuados = new char[] { 'ç', 'á', 'à', 'ã', 'â', 'ä', 'é', 'è', 'ê', 'ë', 'í', 'ì', 'î', 'ï', 'ó', 'ò', 'õ', 'ô', 'ö', 'ú', 'ù', 'û', 'ü' };
        	char[] naoAcentuados = new char[] { 'c', 'a', 'a', 'a', 'a', 'a', 'e', 'e', 'e', 'e', 'i', 'i', 'i', 'i', 'o', 'o', 'o', 'o', 'o', 'u', 'u', 'u', 'u' };
        	
        	for (int i = 0; i < acentuados.length; i++){
        		texto = texto.replace(acentuados[i], naoAcentuados[i]);
        	}
        }
        
        texto = texto.replace("rt ", "#rt ");
        texto = texto.replace("retweet", "#rt");
        texto = texto.replace("de um #rt", "de #rt");
        
        texto = removerPontuacao(texto);
        texto = adaptarPreco(texto);

        return texto;
        
	}

	private static String adaptarPreco(String texto) {
		
		String[] reais = new String[] { " r$ ", "r$ ", " r$" };
		String[] porcento = new String[] { " % ", "% ", " %" };
		
		for (int i = 0; i < 3; i++){
			texto = texto.replace(reais[i], "r$");
			texto = texto.replace(porcento[i], "%");
		}
		
		return texto;
	}

	private static String removerPontuacao(String texto) {
		
		String[] acentuados = new String[] { ":", "," };
		
		for (int i = 0; i < acentuados.length; i++){
			texto = texto.replace(acentuados[i], "");
		}
		
		return texto;
	}
	
}
