
public class Appartement extends ProprietePrivee{
	int numEtage;
	Appartement(int i,Personne p,String a,double s,int n,int ne){
		super(i,p,a,s,n);
		numEtage=ne;
	}
}
