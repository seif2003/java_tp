package ma.project.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

	public static Connection connect() {	
		String url = "jdbc:mysql://localhost:3306/demojdbc";
		try {
			Connection conn = DriverManager.getConnection(url, "root","");
			return conn;
		}
		catch (SQLException e) {
			System.err.println("Error opening SQL connection:"+ e.getMessage());
		}
		return null;
	}
}
