package ds2019;

public class Film {
	private String titre;
	private String realisateur;
	private String pays;
	private int duree;
	private int nbrPlaces;
	
	Film(String titre,String r,String pays,int d){
		this.titre = titre;
		this.realisateur = r;
		this.pays = pays;
		this.duree = d;
	}
	
	void setNbrPlaces(int nb) {
		this.nbrPlaces = nb;
	}
	int getNbrPlaces() {
		return nbrPlaces;
	}
	public String toString() {
		return (titre+" de "+realisateur+" ("+pays+") - "+duree+"min.");
	}
	float totalVenteBillets(int placeEtudiant) {
		if(placeEtudiant<=nbrPlaces) {
			return (2*placeEtudiant) + ((nbrPlaces-placeEtudiant)*3);
		}
		System.out.println("Verfier le nombre des etudiants !");
		return -1.0f;
	}
}
