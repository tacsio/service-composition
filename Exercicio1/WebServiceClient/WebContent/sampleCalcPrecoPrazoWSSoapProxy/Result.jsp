<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCalcPrecoPrazoWSSoapProxyid" scope="session" class="org.tempuri.CalcPrecoPrazoWSSoapProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCalcPrecoPrazoWSSoapProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCalcPrecoPrazoWSSoapProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCalcPrecoPrazoWSSoapProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        org.tempuri.CalcPrecoPrazoWSSoap getCalcPrecoPrazoWSSoap10mtemp = sampleCalcPrecoPrazoWSSoapProxyid.getCalcPrecoPrazoWSSoap();
if(getCalcPrecoPrazoWSSoap10mtemp == null){
%>
<%=getCalcPrecoPrazoWSSoap10mtemp %>
<%
}else{
        if(getCalcPrecoPrazoWSSoap10mtemp!= null){
        String tempreturnp11 = getCalcPrecoPrazoWSSoap10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String nCdEmpresa_1id=  request.getParameter("nCdEmpresa18");
            java.lang.String nCdEmpresa_1idTemp = null;
        if(!nCdEmpresa_1id.equals("")){
         nCdEmpresa_1idTemp  = nCdEmpresa_1id;
        }
        String sDsSenha_2id=  request.getParameter("sDsSenha20");
            java.lang.String sDsSenha_2idTemp = null;
        if(!sDsSenha_2id.equals("")){
         sDsSenha_2idTemp  = sDsSenha_2id;
        }
        String nCdServico_3id=  request.getParameter("nCdServico22");
            java.lang.String nCdServico_3idTemp = null;
        if(!nCdServico_3id.equals("")){
         nCdServico_3idTemp  = nCdServico_3id;
        }
        String sCepOrigem_4id=  request.getParameter("sCepOrigem24");
            java.lang.String sCepOrigem_4idTemp = null;
        if(!sCepOrigem_4id.equals("")){
         sCepOrigem_4idTemp  = sCepOrigem_4id;
        }
        String sCepDestino_5id=  request.getParameter("sCepDestino26");
            java.lang.String sCepDestino_5idTemp = null;
        if(!sCepDestino_5id.equals("")){
         sCepDestino_5idTemp  = sCepDestino_5id;
        }
        String nVlPeso_6id=  request.getParameter("nVlPeso28");
            java.lang.String nVlPeso_6idTemp = null;
        if(!nVlPeso_6id.equals("")){
         nVlPeso_6idTemp  = nVlPeso_6id;
        }
        String nCdFormato_7id=  request.getParameter("nCdFormato30");
        int nCdFormato_7idTemp  = Integer.parseInt(nCdFormato_7id);
        String nVlComprimento_8id=  request.getParameter("nVlComprimento32");
            java.math.BigDecimal nVlComprimento_8idTemp = null;
        if(!nVlComprimento_8id.equals("")){
         nVlComprimento_8idTemp  = new java.math.BigDecimal(nVlComprimento_8id);
        }
        String nVlAltura_9id=  request.getParameter("nVlAltura34");
            java.math.BigDecimal nVlAltura_9idTemp = null;
        if(!nVlAltura_9id.equals("")){
         nVlAltura_9idTemp  = new java.math.BigDecimal(nVlAltura_9id);
        }
        String nVlLargura_10id=  request.getParameter("nVlLargura36");
            java.math.BigDecimal nVlLargura_10idTemp = null;
        if(!nVlLargura_10id.equals("")){
         nVlLargura_10idTemp  = new java.math.BigDecimal(nVlLargura_10id);
        }
        String nVlDiametro_11id=  request.getParameter("nVlDiametro38");
            java.math.BigDecimal nVlDiametro_11idTemp = null;
        if(!nVlDiametro_11id.equals("")){
         nVlDiametro_11idTemp  = new java.math.BigDecimal(nVlDiametro_11id);
        }
        String sCdMaoPropria_12id=  request.getParameter("sCdMaoPropria40");
            java.lang.String sCdMaoPropria_12idTemp = null;
        if(!sCdMaoPropria_12id.equals("")){
         sCdMaoPropria_12idTemp  = sCdMaoPropria_12id;
        }
        String nVlValorDeclarado_13id=  request.getParameter("nVlValorDeclarado42");
            java.math.BigDecimal nVlValorDeclarado_13idTemp = null;
        if(!nVlValorDeclarado_13id.equals("")){
         nVlValorDeclarado_13idTemp  = new java.math.BigDecimal(nVlValorDeclarado_13id);
        }
        String sCdAvisoRecebimento_14id=  request.getParameter("sCdAvisoRecebimento44");
            java.lang.String sCdAvisoRecebimento_14idTemp = null;
        if(!sCdAvisoRecebimento_14id.equals("")){
         sCdAvisoRecebimento_14idTemp  = sCdAvisoRecebimento_14id;
        }
        org.tempuri.CResultado calcPrecoPrazo13mtemp = sampleCalcPrecoPrazoWSSoapProxyid.calcPrecoPrazo(nCdEmpresa_1idTemp,sDsSenha_2idTemp,nCdServico_3idTemp,sCepOrigem_4idTemp,sCepDestino_5idTemp,nVlPeso_6idTemp,nCdFormato_7idTemp,nVlComprimento_8idTemp,nVlAltura_9idTemp,nVlLargura_10idTemp,nVlDiametro_11idTemp,sCdMaoPropria_12idTemp,nVlValorDeclarado_13idTemp,sCdAvisoRecebimento_14idTemp);
if(calcPrecoPrazo13mtemp == null){
%>
<%=calcPrecoPrazo13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">servicos:</TD>
<TD>
<%
if(calcPrecoPrazo13mtemp != null){
org.tempuri.CServico[] typeservicos16 = calcPrecoPrazo13mtemp.getServicos();
        String tempservicos16 = null;
        if(typeservicos16 != null){
        tempservicos16 = "Prazo de entrega: " + typeservicos16[0].getPrazoEntrega();
        tempservicos16 += "\nCusto entrega: " + typeservicos16[0].getValor();
        }
        %>
        <%=tempservicos16%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
exception: <%= e %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>