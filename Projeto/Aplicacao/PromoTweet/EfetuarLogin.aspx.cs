using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace PromoTweet
{
    public partial class EfetuarLogin : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

           

        }

        protected void acaoBotaoLogar(object sender, EventArgs e)
        {

            WSCliente.WSCliente servicoTwitter = new WSCliente.WSCliente();
            WSCliente.logar servicoLogar = new WSCliente.logar();

            servicoLogar.login = this.tbLogin.Text;
            servicoLogar.senha = this.tbSenha.Text;
            WSCliente.logarResponse response = new WSCliente.logarResponse();
            response = servicoTwitter.logar(servicoLogar);

            if (response.result.Equals("login invalido"))
            {
                Response.Redirect("~/EfetuarLogin.aspx");
            }
            else
            {
                Response.Redirect("~/Default.aspx");
            }        
        }


    }
}