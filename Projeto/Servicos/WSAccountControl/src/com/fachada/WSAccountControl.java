package com.fachada;

import com.clienteDAO.ClienteDAO;

public class WSAccountControl implements RepositorioCliente{
	
	private RepositorioCliente repositorio;
	
	public WSAccountControl() {
		repositorio = new ClienteDAO();
	}

	public String consultarClienteLogin(String login, String senha) {
		return repositorio.consultarClienteLogin(login, senha);
	}

	public String cadastrarCliente(String nome, String login, String senha, String email, int cpf) {
		return repositorio.cadastrarCliente(nome, login, senha, email, cpf);
	}

	public String existeLogin(String login) {
		return repositorio.existeLogin(login);
	}

}
