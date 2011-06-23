using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PromoTweet.Classificador
{
    class Classificador

    {       
        public static int RT = 0;
	    public static int DESCONTO = 1;
	    public static int CADASTRO = 2;

        public static int classificar(String texto){
            texto = texto.ToLower();
            texto = Preprocessador.adaptarTexto(texto);

		    int classe = -1;

            if ((((texto.Contains("de #rt")) && (texto.Contains("concorr") || texto.Contains("ganh") || texto.Contains("participe"))) || (texto.Contains("rt e concorra"))))
            {
			    classe = RT;
		    }
            else if (texto.Contains("cadastr") && (texto.Contains("ganh") || texto.Contains("gratis")))
            {
			    classe = CADASTRO;
		    }		
		    else if(texto.Contains("%off")){
                classe = DESCONTO;
		    }
		    else if(texto.Contains("promo") || texto.Contains("ofert")){		
			
			    int de = texto.IndexOf("der$");
			
			    if(texto.Contains("gratis") || texto.Contains("free")
					    ||texto.Contains("desconto")){
                            classe = DESCONTO;
			    }
			    else if(de != - 1){
				    Console.WriteLine("der$ " + de);
				
				    int i = de+4;

				    while(i < texto.Length &&ehDigito(texto[i])){
					    i++;
				    }

				    int por = texto.IndexOf("por", i);
				    Console.WriteLine("por " + por);
				
				    if(por != -1 && (por -  i) <= 2){
					    Console.WriteLine("distancia der$dig - por " + (por - i));
					    classe = DESCONTO;
				    }
			    }

			
			
		    }
		    return classe;
	}

        private static bool ehDigito(char c)
        {
            return (c == '0' || c == '1' || c == '2' ||
                    c == '3' || c == '4' || c == '5' ||
                    c == '6' || c == '7' || c == '8' ||
                    c == '9');
        }

    }
}
