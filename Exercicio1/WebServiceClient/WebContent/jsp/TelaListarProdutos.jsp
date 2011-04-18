<%@page import="PackageListaProdutoPreco.Produto"%>
<%@page import="PackageListaProdutoPreco.ListaProdutosProxy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WebComprasLegal</title>
</head>
<body>
	<jsp:useBean id="sampleListaProdutosProxyid" scope="session" class="PackageListaProdutoPreco.ListaProdutosProxy" />
	<div style="text-align:center; margin-top:50px">
		<h2>Produtos:</h2>
		<form id="formIndex" action="TelaBuscarCEP.jsp" method="get">
			<table align="center" border="1">
				<tr>
					<td>Nome</td>
					<td colspan="2">Custo</td>
				</tr>
				<%
		        Produto[] produtos = sampleListaProdutosProxyid.listarProdutos();
				int index = 0;
				for(Produto p : produtos){
					index++;
				%>
				<tr>
					<td><%=p.getNome() %></td>
					<td><%=p.getPreco() %></td>
					<td><input type="checkbox" name="<%=p.getNome()%>"/></td>
					<td><input type="text"/></td>
				</tr>
				<%
				}
				%>
			</table>
			<div style="padding:20px 0 0 0">
				<input type="submit" value="Finalizar"/>
			</div>
		</form>
	</div>
</body>
</html>