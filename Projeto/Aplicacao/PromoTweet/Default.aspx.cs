using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Text;

using PromoTweet.Twitter;
using PromoTweet.Extractor;

using PromoTweet.WSCliente;
using PromoTweet.WSTwitter;

namespace PromoTweet
{
    public partial class _Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            WSTwitter.twitter servicoTwitter = new WSTwitter.twitter();
            
            List<TwitterEntry> result = new List<TwitterEntry>();
            
            WSTwitter.twitterRequest twitterReq = new WSTwitter.twitterRequest();
            twitterReq.input = "promocao";
            WSTwitter.twitterResponse twitterResp = servicoTwitter.process(twitterReq);
            List<TwitterEntry> query1 = Util.parserXML(twitterResp.result);

            WSTwitter.twitterRequest twitterReq2 = new WSTwitter.twitterRequest();
            twitterReq2.input = "ganhe";
            WSTwitter.twitterResponse twitterResp2 = servicoTwitter.process(twitterReq2);
            List<TwitterEntry> query2 = Util.parserXML(twitterResp2.result);
            
           /* WSTwitter.twitterRequest twitterReq3 = new WSTwitter.twitterRequest();
            twitterReq3.input = "concorra";
            WSTwitter.twitterResponse twitterResp3 = servicoTwitter.process(twitterReq3);
            List<TwitterEntry> query3 = Util.parserXML(twitterResp3.result);

            WSTwitter.twitterRequest twitterReq4 = new WSTwitter.twitterRequest();
            twitterReq4.input = "desconto";
            WSTwitter.twitterResponse twitterResp4 = servicoTwitter.process(twitterReq4);
            List<TwitterEntry> query4 = Util.parserXML(twitterResp4.result);
            */
            
            result.AddRange(query1);
            result.AddRange(query2);
            //result.AddRange(query3);
            //result.AddRange(query4);
            //result.AddRange(query5);
            //result.AddRange(query6);
            //result.AddRange(query7);

            List<TwitterEntry> cadastro = new List<TwitterEntry>();
            List<TwitterEntry> retuite = new List<TwitterEntry>();
            List<TwitterEntry> desconto = new List<TwitterEntry>();
            
            HashSet<int> keys = new HashSet<int>();
         
            foreach (TwitterEntry entry in result)
            {

                if (!keys.Contains(entry.Tweet.GetHashCode()))
                {

                    int classe =entry.Classe;

                    if (classe == Classificador.Classificador.RT)
                    {
                        retuite.Add(entry);
                    }
                    else if (classe == Classificador.Classificador.DESCONTO)
                    {
                        desconto.Add(entry);
                    }
                    else if (classe == Classificador.Classificador.CADASTRO)
                    {
                        cadastro.Add(entry);
                    }

                    keys.Add(entry.Tweet.GetHashCode());
                }

            }

            divulgacao.Text = Util.loadTweets(cadastro);
            retweets.Text = Util.loadTweets(retuite);
            descontos.Text = Util.loadTweets(desconto);
            top.Text = Util.topTweets(result);            

        }

        protected void searchKey(object sender, ImageClickEventArgs e)
        {

            if (!TextBoxSearch.Text.Equals(""))
            {
                Session["query"] = TextBoxSearch.Text;
                Response.Redirect("Result.aspx");
            }
        }

    }
}
