package td4;

public class Magazine extends Livre {
	private String parution;
	
	Magazine(String t,int i,double tv,String d,int n,String p){
		super(t,i,tv,d,n);
		parution = p;
	}
	public String toString() {
		return super.toString()+" Mois de parution : "+parution;
	}
	double calculPrix(int bonus) {
		return (0.35*nbPages)*(1+tva)+bonus;
	}
}
