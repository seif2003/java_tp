package td3ex2;

public class test {

	public static void main(String[] args) {
		Dictionnaire D = new Dictionnaire(100,"Larousse");
		MotDico m1 = new MotDico("couple","Objet unique compose de deux parties semblables et symetriques.");
		MotDico m2 = new MotDico("paire","Objet unique compose de deux parties semblables et symetriques.");
		MotDico m3 = new MotDico("bonjour","Souhait de bonne journee (adresse en arrivant, en rencontrant).");
		D.ajouterMot(m1);
		D.ajouterMot(m2);
		D.ajouterMot(m3);
		System.out.println("Lister dico : \n");
		D.listerDico();
		System.out.println("Mot n existe pas : "+D.chercherMot("bonsoir"));
		System.out.println("Mot existe : ");
		int i = D.chercherMot("bonjour");
		System.out.println(i);
		D.afficherMot(i);
		System.out.println("Nombre de synonymes de (paire) = "+D.nbSynonymes(m2));
		System.out.println("*Supprimer (pair)*");
		D.supprimerMot("paire");
		System.out.println("\nApres supprition de (pair) : \n");
		D.listerDico();
	}
}
