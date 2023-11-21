
public class Vetement extends ProduitGC implements Promotion {
	String couleur;
	String taille;
	Vetement(long ref, String lib, float p, int q,String c,String t){
		super(ref,lib,p,q);
		couleur = c;
		taille = t;
	}
	void decrire() {
		super.decrire();
		System.out.println(this.getClass().getSimpleName()+" couleur : "+couleur+" taille : "+taille);
	}
	public float prixDeVente(String dateStr) {
        if (estPeriodePromo(dateStr)) {
            return calculPrixTTC() * 0.7f;
        } 
        return calculPrixTTC();
     
    }
}
