
public class Fiche {
	String nom;
	int numero;
	String adresse;
	public Fiche(String nom, int numero, String adresse) {
		this.nom = nom;
		this.numero = numero;
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Fiche [nom=" + nom + ", numero=" + numero + ", adresse=" + adresse + "]";
	}
}
