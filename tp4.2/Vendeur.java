package tp42;

public class Vendeur extends Salarie{
	private double vente;
	private double pourcentage;
	
	Vendeur(int mat,String nom,double rec,double v,double p){
		super(mat,nom,rec);
		this.vente = v;
		this.pourcentage = p;
	}
	void setVente(double ven){
		vente = ven;
	}
	void setPourcentage(double pr){
		pourcentage = pr;
	}
	@Override
	void affiche(){
		super.affiche();
		System.out.println("Vente : "+this.vente+" Pourcentage : "+this.pourcentage);
	}	
	double salaire() {
		return (pourcentage*vente)+super.salaire();
	}
}
