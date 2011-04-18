package bean;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.tempuri.CResultado;
import org.tempuri.CalcPrecoPrazoWSSoapProxy;

import PackageListaProdutoPreco.Produto;
import buscaCEP_pkg.BuscaCEP;
import buscaCEP_pkg.BuscaCEPProxy;

public class BeanBuscaCEP {

	private String logradouro;
	private String cidade;
	private String bairro;
	private BuscaCEPProxy proxyBuscaCep;
	private CalcPrecoPrazoWSSoapProxy proxyFrete;

	private Map<String, Produto> mapProduto;
	private List<Produto> listaCompras;

	private int totalCompras;
	private String valorFrete;
	private String diasEntrega;
	public String msg = "";

	public String getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(String valorFrete) {
		this.valorFrete = valorFrete;
	}

	public String getDiasEntrega() {
		return diasEntrega;
	}

	public void setDiasEntrega(String diasEntrega) {
		this.diasEntrega = diasEntrega;
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {

		mapProduto = new HashMap<String, Produto>();
		for (Produto p : produtos) {
			mapProduto.put(p.getNome(), p);
		}

		this.produtos = produtos;
	}

	private Produto[] produtos;

	public BeanBuscaCEP() {
		proxyFrete = new CalcPrecoPrazoWSSoapProxy();
		proxyBuscaCep = new BuscaCEPProxy();
		bairro = "";
		cidade = "";
		logradouro = "";
		produtos = null;
	}

	public void buscarCep(String cep) {
		BuscaCEP dadosCep = proxyBuscaCep.getBuscaCEP();
		String[] dados = null;
		try {
			dados = dadosCep.buscaCEP(cep).split("\\,");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		if (dados != null)
			logradouro = dados[0];
		bairro = dados[1];
		cidade = dados[2];
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getTotalCompras() {
		double frete = Double.parseDouble(valorFrete.replaceAll("\\,", "."));
		return Double.toString(this.totalCompras + frete);
	}

	public int getTotalCompras(HttpServletRequest request) {
		int retorno = 0;
		this.listaCompras = new ArrayList<Produto>();

		String compras = request.getParameter("compras");
		String[] lista = compras.split("\\,");

		for (String item : lista) {
			if (mapProduto.containsKey(item))
				retorno += mapProduto.get(item).getPreco();
			listaCompras.add(mapProduto.get(item));
		}
		this.totalCompras = retorno;
		return retorno;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void calculaFrete(HttpServletRequest request) {
		String tipoServico = request.getParameter("opcao");
		String cep = request.getParameter("cep");
		double pesoTotal = 0;
		java.math.BigDecimal comprimento = null;
		java.math.BigDecimal largura = null;
		java.math.BigDecimal altura = null;
		BigDecimal diametro = null;
		double comprimentoTemp = 0, larguraTemp = 0, alturaTemp = 0;

		for (Produto p : listaCompras) {
			pesoTotal += p.getPeso();
			comprimentoTemp += p.getComprimento();
			larguraTemp += p.getLargura();
			alturaTemp += p.getAltura();
		}
		comprimento = new BigDecimal(comprimentoTemp);
		largura = new BigDecimal(larguraTemp);
		altura = new BigDecimal(alturaTemp);
		double temp = Math.sqrt(Math.pow(comprimentoTemp, 2)
				+ Math.pow(larguraTemp, 2));
		diametro = new BigDecimal((int) Math.sqrt(Math.pow(temp, 2)
				+ Math.pow(alturaTemp, 2)));
		try {
			CResultado valorFrete = proxyFrete.calcPrecoPrazo("", "",
					tipoServico, "51030-340", cep, Double.toString(pesoTotal),
					1, comprimento, altura, largura, diametro, "N",
					new java.math.BigDecimal(0), "N");

			this.valorFrete = valorFrete.getServicos()[0].getValor();
			this.diasEntrega = valorFrete.getServicos()[0].getPrazoEntrega()
					+ " dias úteis";

			this.msg = valorFrete.getServicos()[0].getMsgErro();
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
