package br.com.jonatas.conta.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.jonatas.conta.objetos.Conta;

public class ContaDAO {

	private String sql;

	public void adiciona(Conta conta) {
		System.out.println("Antes de criar a conexão");
		Connection con1 = new ConnectionFactory().getConnection();

		sql = "INSERT INTO DBADM.CONTA "
				+ "(NUMERO, AGENCIA, SALDO)"
				+ "VALUES (?,?,?)";

		try {
			PreparedStatement stmt = con1.prepareStatement(sql);
			stmt.setInt(1, conta.getNumero());
			stmt.setInt(2, conta.getAgencia());
			stmt.setDouble(3, conta.getSaldo());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao Executar SQL: " + e);
		}
	}
}
