package br.com.jonatas.conta.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String drive = "com.mysql.cj.jdbc.Driver";
	private String url  = "jdbc:mysql://localhost:3306/dbadm?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String psw  = "123456";

	public Connection getConnection()  {
		try {
			Class.forName(drive);  
			return DriverManager.getConnection(url, user, psw);
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro ao conectar com o banco: " + e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException();
		}
	}
}

