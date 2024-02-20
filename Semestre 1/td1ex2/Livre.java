package td1ex2;

class Livre {
	private String titre;
	private String auteur;
	private int nbPages;
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
	public String getAuteur() {
		return (auteur);
	}
	public String getTitre() {
		return (titre);
	}
	public int getNbPages() {
		return (nbPages);
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
		return("Livre intitulé "+titre+" de "+auteur+", contenant "+nbPages+" pages.");
	}
}