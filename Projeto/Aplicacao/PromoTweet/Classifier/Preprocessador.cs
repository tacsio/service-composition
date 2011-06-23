using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PromoTweet.Classificador
{
    class Preprocessador
    {
        public static String adaptarTexto(String txt)
        {
            if (txt.Substring(0, 2).Equals("rt"))
            {
                txt = txt.Substring(2);
            }


            if (txt != null && !txt.Equals(""))
            {

                char[] acentuados = new char[] { 'ç', 'á', 'à', 'ã', 'â', 'ä', 'é', 'è', 'ê', 'ë', 'í', 'ì', 'î', 'ï', 'ó', 'ò', 'õ', 'ô', 'ö', 'ú', 'ù', 'û', 'ü' };
                char[] naoAcentuados = new char[] { 'c', 'a', 'a', 'a', 'a', 'a', 'e', 'e', 'e', 'e', 'i', 'i', 'i', 'i', 'o', 'o', 'o', 'o', 'o', 'u', 'u', 'u', 'u' };

                for (int i = 0; i < acentuados.Length; i++)
                {
                    txt = txt.Replace(acentuados[i], naoAcentuados[i]);
                }

            }

            txt = txt.Replace("rt ", "#rt ");
            txt = txt.Replace("retweet", "#rt");
            txt = txt.Replace("de um #rt", "de #rt");

            txt = removerPontuacao(txt);
            txt = adaptarPreco(txt);

            return txt;
        }


        private static String adaptarPreco(String s)
        {
            String[] reais = new String[] { " r$ ", "r$ ", " r$" };
            String[] porcento = new String[] { " % ", "% ", " %" };

            for (int i = 0; i < 3; i++)
            {
                s = s.Replace(reais[i], "r$");
                s = s.Replace(porcento[i], "%");
            }

            return s;
        }

        private static String removerPontuacao(String s)
        {
            String[] acentuados = new String[] { ":", "," };

            for (int i = 0; i < acentuados.Length; i++)
            {
                s = s.Replace(acentuados[i], "");
            }

            return s;
        }

    }
}
