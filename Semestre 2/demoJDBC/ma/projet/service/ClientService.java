package ma.projet.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import ma.project.connexion.Connexion;
import ma.projet.beans.Client;
import ma.projet.dao.IDao;

public class ClientService implements IDao{

	@Override
    public boolean create(Client c) {
        try {
            Connection conn = Connexion.connect();
            String query = "INSERT INTO client (nom, prenom) VALUES (?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, c.getNom());
            statement.setString(2, c.getPrenom());
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.err.println("Error creating client: " + e.getMessage());
            return false;
        }
    }

	@Override
	public List<Client> findAll() {
	    List<Client> clients = new ArrayList<>();
	    try {
	        Connection conn = Connexion.connect();
	        String query = "SELECT * FROM client";
	        PreparedStatement statement = conn.prepareStatement(query);
	        ResultSet resultSet = statement.executeQuery();
	        while (resultSet.next()) {
	            int id = resultSet.getInt("id");
	            String nom = resultSet.getString("nom");
	            String prenom = resultSet.getString("prenom");
	            Client client = new Client(id, nom, prenom);
	            clients.add(client);
	        }
	    } catch (SQLException e) {
	        System.err.println("Error fetching clients: " + e.getMessage());
	    }
	    return clients;
	}


	@Override
	public Client findById(int id) {
	    Client client = null;
	    try {
	        Connection conn = Connexion.connect();
	        String query = "SELECT * FROM client WHERE id=?";
	        PreparedStatement statement = conn.prepareStatement(query);
	        statement.setInt(1, id);
	        ResultSet resultSet = statement.executeQuery();
	        if (resultSet.next()) {
	            String nom = resultSet.getString("nom");
	            String prenom = resultSet.getString("prenom");
	            client = new Client(id, nom, prenom);
	        }
	    } catch (SQLException e) {
	        System.err.println("Error finding client: " + e.getMessage());
	    }
	    return client;
	}


	@Override
	public boolean delete(Client o) {
	    try {
	        Connection conn = Connexion.connect();
	        String query = "DELETE FROM client WHERE id=?";
	        PreparedStatement statement = conn.prepareStatement(query);
	        statement.setInt(1, o.getId());
	        int rowsDeleted = statement.executeUpdate();
	        return rowsDeleted > 0;
	    } catch (SQLException e) {
	        System.err.println("Error deleting client: " + e.getMessage());
	        return false;
	    }
	}


	@Override
	public boolean update(Client o) {
	    try {
	        Connection conn = Connexion.connect();
	        String query = "UPDATE client SET nom=?, prenom=? WHERE id=?";
	        PreparedStatement statement = conn.prepareStatement(query);
	        statement.setString(1, o.getNom());
	        statement.setString(2, o.getPrenom());
	        statement.setInt(3, o.getId());
	        int rowsUpdated = statement.executeUpdate();
	        return rowsUpdated > 0;
	    } catch (SQLException e) {
	        System.err.println("Error updating client: " + e.getMessage());
	        return false;
	    }
	}

	
}
