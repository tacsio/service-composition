package bean;

import buscaCEP_pkg.BuscaCEP;
import buscaCEP_pkg.BuscaCEPProxy;

public class BeanBuscaCEP {

	private String logradouro;
	private String cidade;
	private String bairro;
	private BuscaCEPProxy proxyBuscaCep;
	
	public BeanBuscaCEP() {
		proxyBuscaCep  = new BuscaCEPProxy();
		bairro = "";
		cidade = "";
		logradouro ="";
	}
	
	public String buscarCep(String cep){
		BuscaCEP dadosCep = proxyBuscaCep.getBuscaCEP();
		String[] dados = dadosCep.toString().split("\\,");
		if(dados != null)
			logradouro = dados[0];
			cidade = dados[1];
			bairro = dados[2];
		
		return "";
	}

	public String getLogradouro() {
		return logradouro;
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
}
