package demoJDBC;

import ma.projet.beans.Client;
import ma.projet.service.ClientService;

public class Test {

    public static void main(String[] args) {
        // Créer 5 clients
        ClientService clientService = new ClientService();
        Client client1 = new Client("Ben Amara", "Seif Ddine");
        Client client2 = new Client("Zghibi", "Ranim");
        Client client3 = new Client("Ben Amara", "Ramzi");
        Client client4 = new Client("Ben Amara", "Imed");
        Client client5 = new Client("Saoud", "Oussema");
        
        clientService.create(client1);
        clientService.create(client2);
        clientService.create(client3);
        clientService.create(client4);
        clientService.create(client5);

        // Afficher le client dont id = 3
        Client clientWithId3 = clientService.findById(3);
        if (clientWithId3 != null) {
            System.out.println("Client avec ID 3 : " + clientWithId3.getNom() + " " + clientWithId3.getPrenom());
        } else {
            System.out.println("Aucun client trouvé avec ID 3.");
        }

        // Supprimer le client dont id = 3
        Client clientToDelete = clientService.findById(3);
        if (clientToDelete != null) {
            boolean deleted = clientService.delete(clientToDelete);
            if (deleted) {
                System.out.println("Client avec ID 3 supprimé avec succès.");
            } else {
                System.out.println("Erreur lors de la suppression du client avec ID 3.");
            }
        } else {
            System.out.println("Aucun client trouvé avec ID 3 pour la suppression.");
        }

        // Modifier le client dont id = 2
        Client clientToUpdate = clientService.findById(2);
        if (clientToUpdate != null) {
            clientToUpdate.setNom("Ben Amara");
            clientToUpdate.setPrenom("Mohammed");
            boolean updated = clientService.update(clientToUpdate);
            if (updated) {
                System.out.println("Client avec ID 2 mis à jour avec succès.");
            } else {
                System.out.println("Erreur lors de la mise à jour du client avec ID 2.");
            }
        } else {
            System.out.println("Aucun client trouvé avec ID 2 pour la mise à jour.");
        }

        // Afficher la liste des clients
        System.out.println("Liste des clients :");
        for (Client client : clientService.findAll()) {
            System.out.println(client.getId() + ": " + client.getNom() + " " + client.getPrenom());
        }
    }
}

