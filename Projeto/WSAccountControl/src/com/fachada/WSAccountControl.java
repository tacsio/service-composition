package com.fachada;

import com.cliente.Cliente;
import com.clienteDAO.ClienteDAO;

public class WSAccountControl implements RepositorioCliente{
	
	private RepositorioCliente repositorio;
	
	public WSAccountControl() {
		repositorio = new ClienteDAO();
	}

	@Override
	public Cliente consultarClienteLogin(String login) {
		return repositorio.consultarClienteLogin(login);
	}

	@Override
	public void cadastrarCliente(Cliente cliente) {
		repositorio.cadastrarCliente(cliente);
	}

	@Override
	public boolean existeLogin(String login) {
		return repositorio.existeLogin(login);
	}

}
