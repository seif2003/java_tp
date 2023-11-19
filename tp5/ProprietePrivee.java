
class ProprietePrivee extends Propriete {
	int nbPieces;
	ProprietePrivee(int i,Personne p,String a,double s,int n){
		super(i,p,a,s);
		nbPieces=n;
	}
	public String toString() {
		return super.toString()+" nombre des pieces : "+nbPieces;
	}
	
	double calculImpot() {
		return 50*(surface/100.0)+(10*nbPieces);
	}
	int getNbPieces() {
		return nbPieces;
	}
}
