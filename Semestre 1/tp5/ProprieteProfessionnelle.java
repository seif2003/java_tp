
public class ProprieteProfessionnelle extends Propriete {
	int nbEmployes;
	boolean estEtatique;
	ProprieteProfessionnelle(int i,Personne p,String a,double s,int n,boolean e){
		super(i,p,a,s);
		nbEmployes=n;
		estEtatique=e;
	}
	public String toString() {
		return super.toString()+" nombre des employes : "+nbEmployes+(estEtatique?" Etatique":" Non Etatique");
	}
	double calculImpot() {
		return estEtatique?0.0:100*(surface/100)+30*nbEmployes;
	}
}
