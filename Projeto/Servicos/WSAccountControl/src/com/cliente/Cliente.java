package com.cliente;

public class Cliente {

	private  String nome;
	private String login;
	private String senha;
	private String email;
	private int cpf;
	
	public Cliente(String nome, String login, String senha, String email, int cpf) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.cpf = cpf;
	}
	
	public Cliente() {}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		StringBuffer retorno = new StringBuffer();
		retorno.append(this.nome + ",");
		retorno.append(this.login +",");
		retorno.append(this.email + ",");
		retorno.append(this.cpf);
		
		return retorno.toString();
	}
	
}
