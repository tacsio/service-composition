<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleListaProdutosProxyid" scope="session" class="PackageListaProdutoPreco.ListaProdutosProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleListaProdutosProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleListaProdutosProxyid.getEndpoint();
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
        sampleListaProdutosProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        PackageListaProdutoPreco.ListaProdutos getListaProdutos10mtemp = sampleListaProdutosProxyid.getListaProdutos();
if(getListaProdutos10mtemp == null){
%>
<%=getListaProdutos10mtemp %>
<%
}else{
        if(getListaProdutos10mtemp!= null){
        String tempreturnp11 = getListaProdutos10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        PackageListaProdutoPreco.Produto[] listarProdutos13mtemp = sampleListaProdutosProxyid.listarProdutos();
if(listarProdutos13mtemp == null){
%>
<%=listarProdutos13mtemp %>
<%
}else{
    String tempreturnp14 = null;
    if(listarProdutos13mtemp != null){
    
    for(PackageListaProdutoPreco.Produto p : listarProdutos13mtemp){%>
            <%=p.getNome() + " R$" + p.getPreco()%>
            <br/>
    <%
    
    }
    
    }
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