package tp42;

public class Salarie {
	private int mat;
	private String nom;
	private double recrutement;
	
	Salarie(){};
	
	Salarie(int mat,String nom,double annee){
		this.mat = mat;
		this.nom = nom;
		this.recrutement = annee;
	};
	
	void setMat(int mat) {
		this.mat = mat;	
	}
	void setNom(String nom) {
		this.nom = nom;	
	}
	void setRecrutement(double annee) {
		this.recrutement = annee;	
	}
	int getMat() {
		return this.mat;
	}
	String getNom() {
		return this.nom;
	}
	double getRecrutement() {
		return this.recrutement;
	}
	void affiche() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Matricule : "+mat+" Nom : "+nom+" Recrutement : "+recrutement);
	}
	double salaire() {
		if(recrutement<2005) {
			return 400.0;
		}
		else {
			return 280.0;
		}
	}
}
