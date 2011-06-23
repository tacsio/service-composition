using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace PromoTweet
{
    public partial class TelaCadastro : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

            

        }

        protected void acaoBotaoCadastrar(object sender, EventArgs e)
        {
            WSCliente.WSCliente servicoTwitter = new WSCliente.WSCliente();
            string retorno = servicoTwitter.cadastar(tbNome.Text, tbLogin.Text, tbSenha.Text, tbEmail.Text, tbCPF.Text);

            if(retorno.Equals("false")){

            }else {
                Response.Redirect("~/Default.aspx");
            }
        }
    }
}