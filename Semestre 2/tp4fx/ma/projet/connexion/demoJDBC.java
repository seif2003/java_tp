package ma.projet.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class demoJDBC {
	public static Connection connect() {	
		String url = "jdbc:mysql://localhost:3307/DemoJDBC";
		try {
			Connection conn = DriverManager.getConnection(url, "root","my-secret-pw");
			return conn;
		}
		catch (SQLException e) {
			System.err.println("Error opening SQL connection:"+ e.getMessage());
		}
		return null;
	}
}