package buscaCEP_pkg.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import buscaCEP_pkg.endereco.Endereco;

public class RepositorioEndereco {

	public static Endereco consultarEndrecoPorCep(String cep){

		Endereco endereco = null;
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		ResultSet resultSet = null;
		StringBuffer query = new StringBuffer();
		int index = 0;

		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:/home/tacsio/Projects/distribuidos/Exercicio1/WebServiceBuscaCep/WebContent/db/database.db");

			query.append("select cidade, tipo, logradouro, bairro, cep ");
			query.append("from endereco ");
			query.append("where cep = ?");

			preparedStatement = connection.prepareStatement(query.toString());
			preparedStatement.setString(++index, cep);

			resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				endereco = new Endereco();
				
				endereco.setCidade(resultSet.getString("cidade"));
				endereco.setLogradouro( resultSet.getString("tipo") + " " + resultSet.getString("logradouro"));
				endereco.setBairro(resultSet.getString("bairro"));
				endereco.setCep(resultSet.getString("cep"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(connection != null){
					connection.close();
				}	
				if(preparedStatement != null){
					preparedStatement.close();
				}
				if(resultSet != null){
						resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return endereco;		
	}

}
