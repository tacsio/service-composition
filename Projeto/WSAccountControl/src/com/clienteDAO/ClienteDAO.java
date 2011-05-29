package com.clienteDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cliente.Cliente;
import com.fachada.RepositorioCliente;

public class ClienteDAO implements RepositorioCliente {

	private static final String PATH = "/home/tacsio/Projects/distribuidos/Projeto/WSAccountControl/WebContent/Database/clientes.db";
	private static Connection connection = null;

	public Cliente consultarClienteLogin(String login) {

		Cliente cliente = null;
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
				cliente = new Cliente();

				cliente.setNome(result.getString("nome"));
				cliente.setEmail(result.getString("email"));
				cliente.setLogin(result.getString("login"));
				cliente.setSenha(result.getString("senha"));
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

		return cliente;
	}

	public void cadastrarCliente(Cliente cliente) {

		int index = 0;

		PreparedStatement preparedStatement = null;

		try {
			StringBuffer query = new StringBuffer();
			query.append(" INSERT INTO cliente ");
			query.append(" VALUES (null, ?, ?, ?, ?) ");

			preparedStatement = getConnection().prepareStatement(
					query.toString());
			preparedStatement.setString(++index, cliente.getNome());
			preparedStatement.setString(++index, cliente.getLogin());
			preparedStatement.setString(++index, cliente.getSenha());
			preparedStatement.setString(++index, cliente.getEmail());

			preparedStatement.execute();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}

	public boolean existeLogin(String login) {

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

		return retorno;
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
