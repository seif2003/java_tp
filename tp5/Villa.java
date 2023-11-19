
public class Villa extends ProprietePrivee {
	boolean avecPiscine;
	Villa(int i,Personne p,String a,double s,int n,boolean ap){
		super(i,p,a,s,n);
		avecPiscine=ap;
	}
	double calculImpot() {
		return super.calculImpot()+200;
	}
}
