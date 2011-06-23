<%@ Page Language="C#" EnableSessionState="True" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="PromoTweet._Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <link href="Styles/css.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="Scripts/jquery-1.4.1.min.js"></script>
	<script type="text/javascript" src="Scripts/fancybox/jquery.mousewheel-3.0.4.pack.js"></script>
	<script type="text/javascript" src="Scripts/fancybox/jquery.fancybox-1.3.4.pack.js"></script>

	<link rel="stylesheet" type="text/css" href="Scripts/fancybox/jquery.fancybox-1.3.4.css" media="screen" />

    <title>Tweet Promotion</title>
    <script language="javascript" type ="text/javascript">
	

        $(document).ready(function() {

            $("#various1").fancybox({
				'titlePosition'		: 'outside',
				'transitionIn'		: 'elastic',
				'transitionOut'		: 'elastic',
			});

        });
	</script>
</head>
<body>
    <div id="divTudo">
        <form id="form1" runat="server" defaultbutton="ImageButtonSearch">
            <div style="padding-left:20px; padding-top:10px;">
                <asp:ImageButton ID="ImageButtonLogo" runat="server" 
                    ImageUrl="~/Imagens/logoPromotion2.png" />
                <span style="text-align:right;padding-left:480px; cursor:pointer">
                    <a id="various1" href="#inline1"><img alt="Top Tweets" title="Top Tweets" src="Imagens/top3.png"/></a>
                </span>
            </div>
            <br />
            <div style="text-align: right; padding-right:84px">
                <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="~/EfetuarLogin.aspx"> >> LogIn</asp:HyperLink>
            </div>
            <div align="center" style="margin-top:10px">
                <div align="center" style="width:400px;">
                    <div style="float:left; margin-top:33px">
                        <asp:TextBox ID="TextBoxSearch" runat="server" BorderStyle="None" 
                            Font-Bold="True" Font-Names="Consolas" Font-Size="Larger" 
                            ForeColor="#FFFF99" Width="270px" Height="54px"></asp:TextBox>
                    </div>
                    <div style="float:left">
                        <asp:ImageButton ID="ImageButtonSearch" runat="server" 
                            ImageUrl="~/Imagens/botaoSearch2.png" onclick="searchKey" />
                    </div>
                    <div style="clear:left;"></div>
                    <br />
                    <br />
                </div>
            </div>
            <div>
                <asp:ScriptManager ID="ScriptManager1" runat="server">
                </asp:ScriptManager>
                <asp:UpdatePanel ID="UpdatePanel1" runat="server">
                    <ContentTemplate>
                        <table>
                            <tr>
                                <td>
                                    <div class="conteudo">
                                        <asp:Image ID="Image5" runat="server" ImageUrl="~/Imagens/cadastro.png" />
                                        <div class="tweetContainer">
                                            <asp:Label ID="divulgacao" runat="server" Text=""></asp:Label>
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="conteudo">
                                        <asp:Image ID="Image10" runat="server" ImageUrl="~/Imagens/retweetes2.png" />
                                        <div class="tweetContainer">
                                            <asp:Label ID="retweets" runat="server" Text=""></asp:Label>
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="conteudo">
                                        <asp:Image ID="Image15" runat="server" ImageUrl="~/Imagens/descontos2.png" />
                                        <div class="tweetContainer">
                                            <asp:Label ID="descontos" runat="server" Text=""></asp:Label>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </ContentTemplate>
                </asp:UpdatePanel>
            </div>
        </form>
    </div>
    <div style="display: none;">
		<div id="inline1" title="Top Promotions" class="topPromotions"">
            <p class="linksTweet" style="text-align:center; font-size:18px">Top Promotions</p>
			<asp:Label ID="top" runat="server" Text=""></asp:Label>
        </div>
    </div>
</body>
</html>
