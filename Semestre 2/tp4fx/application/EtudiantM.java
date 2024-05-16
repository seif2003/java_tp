package application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import ma.projet.connexion.demoJDBC;

public class EtudiantM {

    public boolean create(Etudiant o) {
        String sql = "INSERT INTO Etudiant (nom, prenom, sexe, filiere) VALUES (?, ?, ?, ?)";
        try (Connection conn = demoJDBC.connect(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPrenom());
            ps.setString(3, o.getSexe());
            ps.setString(4, o.getFiliere());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Etudiant o) {
        String sql = "DELETE FROM Etudiant WHERE id = ?";
        try (Connection conn = demoJDBC.connect(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, o.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Etudiant o) {
        String sql = "UPDATE Etudiant SET nom = ?, prenom = ?, sexe = ?, filiere = ? WHERE id = ?";
        try (Connection conn = demoJDBC.connect(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPrenom());
            ps.setString(3, o.getSexe());
            ps.setString(4, o.getFiliere());
            ps.setInt(5, o.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Etudiant findById(int id) {
        String sql = "SELECT * FROM Etudiant WHERE id = ?";
        try (Connection conn = demoJDBC.connect(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Etudiant(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("sexe"),
                    rs.getString("filiere")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Etudiant> findAll() {
        List<Etudiant> etudiants = new ArrayList<>();
        String sql = "SELECT * FROM Etudiant";
        try (Connection conn = demoJDBC.connect(); 
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Etudiant etudiant = new Etudiant(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("sexe"),
                    rs.getString("filiere")
                );
                etudiants.add(etudiant);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return etudiants;
    }
}
