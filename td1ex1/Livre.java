package td;

class Livre {
	private String titre;
	private String auteur;
	private int nbPages;
	Livre(String a,String t) {
		this.auteur = a;
		this.titre = t;
	}
	public String getAuteur() {
		return (auteur);
	}
	public void setNbPages(int nb) {
		this.nbPages = nb;
	}
}