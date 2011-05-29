package com.cliente;

public class Cliente {

	private  String nome;
	private String login;
	private String senha;
	private String email;
	
	public Cliente(String nome, String login, String senha, String email) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.email = email;
	}
	
	public Cliente() {}

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
		retorno.append("Nome: " + this.nome + "\n");
		retorno.append("Login: " + this.login +"\n");
		retorno.append("Email: " + this.email);
		
		return retorno.toString();
	}
	
}
