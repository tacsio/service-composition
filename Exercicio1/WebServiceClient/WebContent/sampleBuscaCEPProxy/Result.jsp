<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBuscaCEPProxyid" scope="session" class="buscaCEP_pkg.BuscaCEPProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBuscaCEPProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleBuscaCEPProxyid.getEndpoint();
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
        sampleBuscaCEPProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        buscaCEP_pkg.BuscaCEP getBuscaCEP10mtemp = sampleBuscaCEPProxyid.getBuscaCEP();
if(getBuscaCEP10mtemp == null){
%>
<%=getBuscaCEP10mtemp %>
<%
}else{
        if(getBuscaCEP10mtemp!= null){
        String tempreturnp11 = getBuscaCEP10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String cep_1id=  request.getParameter("cep16");
            java.lang.String cep_1idTemp = null;
        if(!cep_1id.equals("")){
         cep_1idTemp  = cep_1id;
        }
        java.lang.String buscaCEP13mtemp = sampleBuscaCEPProxyid.buscaCEP(cep_1idTemp);
if(buscaCEP13mtemp == null){
%>
<%=buscaCEP13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(buscaCEP13mtemp));
        %>
        <%= tempResultreturnp14 %>
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