package com.fachada;

import com.cliente.Cliente;

public interface RepositorioCliente {

	public Cliente consultarClienteLogin(String login);

	public void cadastrarCliente(Cliente cliente);

	public boolean existeLogin(String login);

}
