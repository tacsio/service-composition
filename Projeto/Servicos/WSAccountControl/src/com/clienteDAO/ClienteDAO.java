package com.clienteDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cliente.Cliente;
import com.fachada.RepositorioCliente;

public class ClienteDAO implements RepositorioCliente {

	private static final String PATH = "/home/tarcisio/Projects/distribuidos/Projeto/WSAccountControl/WebContent/Database/clientes.db";
	private static Connection connection = null;

	public String consultarClienteLogin(String login, String senha) {

		Cliente cliente = null;
		int index = 0;
		String retorno = "";
		PreparedStatement preparedStatement = null;
		ResultSet result = null;
		try {

			StringBuffer query = new StringBuffer();
			query.append(" SELECT * FROM cliente ");
			query.append(" WHERE login = ?");

			preparedStatement = getConnection().prepareStatement(
					query.toString());
			preparedStatement.setString(++index, login);

			result = preparedStatement.executeQuery();

			if (result.next()) {
				cliente = new Cliente();

				cliente.setNome(result.getString("nome"));
				cliente.setEmail(result.getString("email"));
				cliente.setLogin(result.getString("login"));
				cliente.setSenha(result.getString("senha"));
				cliente.setCpf(result.getInt("cpf"));
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		
		if(cliente != null){
			if(senha.equalsIgnoreCase(cliente.getSenha())){
				retorno = cliente.toString();
			}
		} 

		return retorno;
	}

	public String cadastrarCliente(String nome, String login, String senha, String email, int cpf) {

		int index = 0;
		boolean retorno = false;
		PreparedStatement preparedStatement = null;

		try {
			StringBuffer query = new StringBuffer();
			query.append(" INSERT INTO cliente ");
			query.append(" VALUES (null, ?, ?, ?, ?, ?) ");

			preparedStatement = getConnection().prepareStatement(
					query.toString());
			preparedStatement.setString(++index, nome);
			preparedStatement.setString(++index, login);
			preparedStatement.setString(++index, senha);
			preparedStatement.setString(++index, email);
			preparedStatement.setInt(++index, cpf);

			preparedStatement.execute();
			retorno = true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		
		return retorno+"";
	}

	public String existeLogin(String login) {

		boolean retorno = false;
		int index = 0;

		PreparedStatement preparedStatement = null;
		ResultSet result = null;
		try {

			StringBuffer query = new StringBuffer();
			query.append(" SELECT * FROM cliente ");
			query.append(" WHERE login = ?");

			preparedStatement = getConnection().prepareStatement(
					query.toString());
			preparedStatement.setString(++index, login);

			result = preparedStatement.executeQuery();

			if (result.next()) {
				retorno = true;
			}
			connection.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}

		return retorno+"";
	}

	private static Connection getConnection() {

		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:" + PATH);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}

		return connection;

	}
}
