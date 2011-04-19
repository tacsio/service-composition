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

<script>
function CriticaCampos()
{
	
	if(produtos.length <= 0){
		alert("Selecione pelo menos um produto");
		return (false);
	}
  if (document.formIndex.cep.value == "")
  {
    alert("Informe no mínimo os 5(cinco) primeiros dígitos do CEP. Ex. 70001");
    document.formIndex.cep.focus();
    return (false);
  }

  if (document.formIndex.cep.value.length <= 4)
  {
   	alert("Informe no mínimo os 5(cinco) primeiros dígitos do CEP. Ex. 70001");
   	document.formIndex.cep.focus();
   	return (false);
  }  

  { 
   var Numeros = "0123456789";
   var Posic, Carac;
   var Temp = document.formIndex.cep.value.length;    
   var Cont = 0;
   for (var i=0; i < Temp; i++)   
   {  
   Carac =  document.formIndex.cep.value.charAt (i);
   Posic  = Numeros.indexOf (Carac);   
   if (Posic > -1)   
	  Cont++;      
   }   
   if (Cont == 9)
   {
    	alert("O CEP tem no máximo 8(oito) digitos numéricos. Ex. 70001-970");
    	document.formIndex.cep.focus();
    	return (false);
   } 
 }
  { 
   var Numeros = "0123456789-";
   var Posic, Carac;
   var Temp = document.formIndex.cep.value.length;    
   var Cont = 0;
   for (var i=0; i < Temp; i++)   
   {  
   Carac =  document.formIndex.cep.value.charAt (i);
   Posic  = Numeros.indexOf (Carac);   
   if (Posic == -1)   
      {	  
    	alert("Informe um CEP válido. Ex. 70001-970");
    	document.formIndex.cep.focus();
    	return (false);
      }
   }   
 }
}    
</script> 
<script language="javascript">
	function MascaraCEP (formato, keypress, objeto)
	{
	campo = objeto;
	if (formato=='CEP')
		{
		caracteres = '01234567890';
		separacoes = 1;
		separacao1 = '-';
		conjuntos = 2;
		conjunto1 = 5;
		conjunto2 = 3;
		if ((caracteres.search(String.fromCharCode (keypress))!=-1) && campo.value.length < 
		(conjunto1 + conjunto2 + 1))
			{
			if (campo.value.length == conjunto1) 
			   campo.value = campo.value + separacao1;
			
			}
		else 
			event.returnValue = false;
		
		}
	}
</script>

</head>
<body>
	<jsp:useBean id="sampleListaProdutosProxyid" scope="session" class="PackageListaProdutoPreco.ListaProdutosProxy" />
	<jsp:useBean id="beanBuscaCep" scope="session" class="bean.BeanBuscaCEP" />
	<div style="text-align:center; margin-top:50px">
		<h2>Produtos:</h2>
		<form id="formIndex" action="TelaBuscarCEP.jsp" method="post" onSubmit="return CriticaCampos();">
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
				<input id="cep" name="cep" onkeypress="MascaraCEP('CEP', window.event.keyCode, this);"/>
				
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