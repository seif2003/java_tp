
abstract public class Article {
	protected long reference;
	protected String libelle;
	protected float prixHT;
	protected int qteStock;
	protected final float TVA = 0.1f;
	
	Article(long ref, String lib, float p, int q){
		reference = ref;
		libelle = lib;
		prixHT = p;
		qteStock = q;
	}
	
	void setQteStock(int i) {
		qteStock=i;
	}
	
	int getQteStock() {
		return qteStock;
	}
	
	void approvisionner(int nb) {
		qteStock += nb;
	}
	
	void decrire() {
		System.out.println("Reference : "+reference+" Libelle : "+libelle);
	}
	
	abstract float calculPrixTTC();
	
	boolean appartientPromo() {
		return this instanceof ProduitElec || this instanceof Vetement;
	}
    public boolean estDispo(int qteAchat) {
        return qteStock >= qteAchat;
    }
	
	
}
