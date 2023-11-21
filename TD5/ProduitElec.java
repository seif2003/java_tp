
public class ProduitElec extends Article implements Promotion{
	private String categorie;
	public ProduitElec(long ref, String lib, float p, int q, String categorie) {
        super(ref, lib, p, q);
        this.categorie = categorie;
    }
	public float calculPrixTTC() {
		return prixHT*(1.08f+TVA);
	}
	void decrire() {
		super.decrire();
		System.out.println("categorie : "+categorie);
	}
	public float prixDeVente(String dateStr) {
        if (estPeriodePromo(dateStr)) {
            return calculPrixTTC() * 0.8f;
        } 
        return calculPrixTTC();
     
    }
}
