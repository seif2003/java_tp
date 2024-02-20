package td1ex3;


class Livre {
	private String titre;
	private String auteur;
	private int nbPages;
	private double prix;
	boolean prixFixe = false;
	Livre(String a,String t) {
		this.auteur = a;
		this.titre = t;
	}
	Livre(){
		this.nbPages = 0;
	}
	Livre(String a,String t,int nb){
		this.nbPages = nb;
		this.auteur = a;
		this.titre = t;
	}
	Livre(String a,String t,int nb,double p){
		this.nbPages = nb;
		this.auteur = a;
		this.titre = t;
		this.prix = p;
		this.prixFixe = true;
	}
	public String getAuteur() {
		return (auteur);
	}
	public String getTitre() {
		return (titre);
	}
	public int getNbPages() {
		return (nbPages);
	}
	public double getPrix() {
		return (prix);
	}
	public void setPrix(double p) {
		if(!prixFixe) {
			this.prix = p;
			this.prixFixe = true;
		}
		else {
			System.out.println("La prix a etait deja modifier !");
		}
	}
	public void setAuteur(String a) {
		this.auteur = a;
	}
	public void setTitre(String t) {
		this.titre = t;
	}
	public void setNbPages(int nb) {
		if(nb>20) {
			this.nbPages = nb;
		}
		else {
			System.out.println("Nombre est faible");
		}
	}
	public String toString() {
		return("Livre intitulé "+titre+" de "+auteur+", contenant "+nbPages+" pages prix = "+prix+".");
	}
	boolean testPrix() {
		return(prix != 0.0);
	}
}