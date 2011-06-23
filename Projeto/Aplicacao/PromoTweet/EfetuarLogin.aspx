<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="EfetuarLogin.aspx.cs" Inherits="PromoTweet.EfetuarLogin" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">

     <link href="Styles/css.css" rel="stylesheet" type="text/css" />
    <title>Efetuar Login</title>
</head>
<body>

    <div id="divTudo">
        <form id="form1" runat="server">

            <div style="padding-left:20px; padding-top:10px;">
                <asp:ImageButton ID="ImageButtonLogo" runat="server" 
                    ImageUrl="~/Imagens/logoPromotion2.png" />
                <span style="text-align:right;padding-left:480px; cursor:pointer">
                    &nbsp;</span></div>

            <center>
                 <div style="padding-left:20px; padding-top:100px;">
               
                    <asp:Table ID="Table1" runat="server" BackColor="#F7F6F3" BorderColor="#E6E2D8" 
                        BorderPadding="4" BorderStyle="Solid" BorderWidth="1px"
                        Font-Size="1em" ForeColor="#333333" style="padding:20px 20px 20px 20px">
                    
                        <asp:TableRow>
                            <asp:TableCell><asp:Label ID="labelLogin" runat="server" Text="Login: "></asp:Label></asp:TableCell>
                            <asp:TableCell><asp:TextBox ID="tbLogin" runat="server"></asp:TextBox></asp:TableCell>
                        </asp:TableRow>

                        <asp:TableRow>
                            <asp:TableCell><asp:Label ID="labelSenha" runat="server" Text="Senha: "></asp:Label></asp:TableCell>
                            <asp:TableCell><asp:TextBox ID="tbSenha" runat="server"></asp:TextBox></asp:TableCell>
                        </asp:TableRow>

                        <asp:TableRow>
                            <asp:TableCell></asp:TableCell>
                            <asp:TableCell><asp:Button ID="Button1" runat="server" Text="Logar" BackColor="#FFFBFF" BorderColor="#CCCCCC" BorderStyle="Solid" 
                            BorderWidth="1px" Font-Names="Verdana" Font-Size="0.8em" ForeColor="#284775" onclick="acaoBotaoLogar"/></asp:TableCell>
                        </asp:TableRow>

                        <asp:TableRow>
                            <asp:TableCell><br /></asp:TableCell>
                            <asp:TableCell><asp:HyperLink ID="HyperLink1" runat="server" Font-Size="0.8em" NavigateUrl="~/TelaCadastro.aspx">Cadastre-se</asp:HyperLink></asp:TableCell>
                        
                        </asp:TableRow>
                    </asp:Table>
                   
                </div>
            </center>
        </form>    
    </div>
</body>
</html>


