package ma.projet.dao;

import java.util.List;

import ma.projet.beans.Client;



public interface IDao {
	boolean create(Client o);//Méthode permettant d'ajouter un objet o de type T. 
	List<Client> findAll ( );// Méthode permettant de renvoyer la liste des objets de type T.
	Client findById (int id);// Méthode permettant de renvoyer un objet dont id est passé en paramètre.
	boolean delete (Client o);//Méthode permettant de supprimer un objet o de type T.
	boolean update (Client o); // Méthode permettant de modifier un objet o de type T.

}
	
