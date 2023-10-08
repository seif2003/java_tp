package tp3;

public class Personne {
	private String nom;
	private String prenom;
	private String adresse;
	Personne(String n,String p,String a){
		this.nom = n;
		this.prenom = p;
		this.adresse = a;
	}
	public String toString() {
		return("nom : "+nom+" prenom : "+prenom+" adresse : "+adresse);
	}
}

