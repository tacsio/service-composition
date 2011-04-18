<%@page import="PackageListaProdutoPreco.Produto"%>
<%@page import="PackageListaProdutoPreco.ListaProdutosProxy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WebComprasLegal</title>
<script>
	var produtos = [];
	function add(element){
		if(element.checked){
			produtos.push(element.value);
		}else {
			var i= 0;
			var total = produtos.length;
			for(i = 0; i < total; i++ ){
				if(produtos[i] == element.value){
					produtos[i] = produtos[total];
					produtos.pop();
				}
			}
		}
		document.getElementById("total").value = produtos.length;
		document.getElementById("compras").value = produtos.toString();
	}
</script>
</head>
<body>
	<jsp:useBean id="sampleListaProdutosProxyid" scope="session" class="PackageListaProdutoPreco.ListaProdutosProxy" />
	<jsp:useBean id="beanBuscaCep" scope="session" class="bean.BeanBuscaCEP" />
	<div style="text-align:center; margin-top:50px">
		<h2>Produtos:</h2>
		<form id="formIndex" action="TelaBuscarCEP.jsp" method="post">
			<table align="center" border="1">
				<tr>
					<td>Nome</td>
					<td colspan="2">Custo</td>
				</tr>
				<%
		        Produto[] produtos = sampleListaProdutosProxyid.listarProdutos();
				beanBuscaCep.setProdutos(produtos);
				int index = 0;
				for(Produto p : produtos){
					index++;
				%>
				<tr>
					<td><%=p.getNome() %></td>
					<td>R$<%=p.getPreco() %>0</td>
					<td><input type="checkbox" onchange="add(this)" value="<%=p.getNome() %>" name="<%=p.getNome()%>"/></td>
				</tr>
				<%
				}
				%>
			</table>
			<div style="padding: 15px 0 0 0 ">
				<label for="cep">Informe o cep para entrega</label>
				<input type="text" id="cep" name="cep" />
				
				<input type="hidden" id="total" name="total" />
				<input type="hidden" id="compras" name="compras" />
			</div>
			<div style="padding:3px 0 0 0px">
				<label for="tipoEntrega">Tipo Serviço Entrega</label>
				<select name="opcao">
					<option value="41106">PAC</option>
					<option value="40010">Sedex</option>
					<option value="40290">Sedex Hoje</option>
					<option value="40215">Sedex 10</option>
				</select>				
				<input type="submit" value="Finalizar"/>
			</div>
		</form>
	</div>
</body>
</html>