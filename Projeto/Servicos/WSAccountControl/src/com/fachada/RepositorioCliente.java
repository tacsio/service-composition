package com.fachada;


public interface RepositorioCliente {

	public String consultarClienteLogin(String login, String senha);

	public String cadastrarCliente(String nome, String login, String senha, String email, String cpf);

	public String existeLogin(String login);

}
