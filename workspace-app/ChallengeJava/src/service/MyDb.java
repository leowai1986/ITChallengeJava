package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDb {
	Connection con;
	public Connection getCon(){
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			String url = "jdbc:postgresql://localhost:5432/postgres";
			Properties props = new Properties();
			props.setProperty("user","postgres");
			props.setProperty("password","root");
			con = DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;	
	}
}