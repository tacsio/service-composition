package buscaCEP_pkg.endereco;

public class Endereco {

	private int codigo;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String cep;

	public Endereco() {
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String toString() {
		return this.getLogradouro() + "," + this.getBairro() + "," + this.getCidade() + "," + this.getCep();
	}
}
