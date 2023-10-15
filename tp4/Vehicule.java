package tp4;

public class Vehicule {
	private static int count = 0;
	private	int numero;
	private String marque;
	private String modele;
	private int annee;
	private double prix;
	
	Vehicule(String mar,String mod,int an,double pr){
		this.count += 1 ;
		this.numero = this.count ;
		this.marque = mar ;
		this.modele = mod ;
		this.annee = an;
		this.prix = pr;
	}
	
	public String toString() {
		return("Numero : "+numero+"\nMarque : "+marque+"\nModele : "+modele+"\nAnnee : "+annee+"\nPrix : "+prix);
	}
	void decrisVehicule() {
		System.out.println(this.toString());
	}
	void setMarque(String ma) {
		this.marque = ma;
	}
	void setModele(String mo) {
		this.marque = mo;
	}
	void setPrix(double pr) {
		this.prix = pr;
	}
	String getMaque() {
		return this.marque;
	}
	String getModele() {
		return this.modele;
	}
	double getPrix() {
		return this.prix;
	}
	
	int getCount() {
		return this.count;
	}
	int getAnnee() {
		return this.annee;
	}
	
}
