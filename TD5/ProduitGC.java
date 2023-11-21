
public class ProduitGC extends Article{
	ProduitGC(long ref, String lib, float p, int q){
		super(ref,lib,p,q);
	}
	void decrire() {
		System.out.println(this.getClass().getSimpleName());
		super.decrire();
	}
	float calculPrixTTC() {
		return prixHT*(1+TVA);
	}
}
