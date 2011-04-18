<%@page import="buscaCEP_pkg.BuscaCEP"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="beanBuscaCep" scope="session" class="bean.BeanBuscaCEP" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table>
			<tr>
				<td>CEP:</td>
				<td>Logradouro</td>
			</tr>
			<tr>
				<td><input id="cep" type="text" /><input type="button" value="Buscar" onclick="<%=beanBuscaCep.buscarCep("54100-570")%>"/></td>
				<%
					if(beanBuscaCep.getBairro() != ""){
						%>
						<td><input type="text" value="<%= beanBuscaCep.getLogradouro()%>"/></td>
						<%						
					}
				%>
			</tr>
		</table>
	</div>
</body>
</html>