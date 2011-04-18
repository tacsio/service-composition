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
	<%
		
		String cep = request.getParameter("cep");
		beanBuscaCep.buscarCep(cep);
	%>
		<br>
		<table>
			<tr>
				<td><label>Total: </label></td>
				<td><label><%=beanBuscaCep.getTotalCompras(request) %></label></td>
			</tr>
			<tr>
				<td><label>Cidade: </label></td>
				<td><input type="text" name="campoCidade" value="<%=beanBuscaCep.getCidade() %>"/></td>
			</tr>
			<tr>
				<td><label>Bairro: </label></td>
				<td><input type="text" name="campoBairro" value="<%=beanBuscaCep.getBairro() %>"/></td>
			</tr>
			
			<tr>
				<td><label>Logradouro: </label></td>
				<td><input type="text" name="campoRua" value="<%=beanBuscaCep.getLogradouro() %>" /></td>
			</tr>
		</table>
		
		<br>

<%
	beanBuscaCep.calculaFrete(request);
%>		
		<table>
			<%
				if(beanBuscaCep.msg.equals("")){
			%>
			<tr>
				<td><label>Frete: </label></td>
				<td><label>R$<%=beanBuscaCep.getValorFrete()%></label></td>
			</tr>
			<tr>
				<td><%=beanBuscaCep.getDiasEntrega() %>
			</tr>
			<%
				}else {
			%>
			<tr>
				<td>
					<%=beanBuscaCep.msg %>
				</td>
			</tr>
			<%
				}	
			%>
			<tr>
				<td><label>Total da compra: </label></td>
				<td><label>R$<%=beanBuscaCep.getTotalCompras()%>0</label></td>
			</tr>
		</table>
</body>
</html>