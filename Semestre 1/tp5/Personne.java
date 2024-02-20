
public class Personne {
	private int cin;
	private String nom;
	private String prenom;
	Personne(int c,String n,String p){
		cin=c;
		nom=n;
		prenom=p;
	}
	void setCin(int c) {
		cin=c;
	}
	void setNom(String n) {
		nom=n;
	}
	void setPrenom(String p) {
		prenom=p;
	}
	int getCin() {
		return cin;
	}
	String getNom() {
		return nom;
	}
	String getPrenom() {
		return prenom;
	}
	public String toString() {
		return("cin : "+cin+" nom : "+nom+" prenom : "+prenom);
	}
}
