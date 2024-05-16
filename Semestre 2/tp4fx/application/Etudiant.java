package application;

public class Etudiant {
	private int id; 
	private String nom;
	private String prenom;
	private String sexe;
	private String filiere;
	
	public Etudiant(int id, String nom, String prenom, String sexe, String filiere) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.filiere = filiere;
	}
	
	public Etudiant(String nom, String prenom, String sexe, String filiere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.filiere = filiere;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	
	

}
