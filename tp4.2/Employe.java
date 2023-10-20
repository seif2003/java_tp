package tp42;

public class Employe extends Salarie {
	private double hsupp;
	private double phsupp;
	Employe(int mat,String nom,double rec,double hs,double phs){
		super(mat,nom,rec);
		this.hsupp = hs;
		this.phsupp = phs;
	}
	void setHsupp(double hs) {
		this.hsupp=hs;
	}
	void setPhsupp(double phs) {
		this.phsupp=phs;
	}
	void affiche(){
		super.affiche();
		System.out.println("Hsupp : "+this.hsupp+" PHsupp : "+this.phsupp);
	}
	double salaire() {
		return super.salaire() + (hsupp*phsupp);
	}
}
