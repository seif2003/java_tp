package ds2019;

public class Documentaire extends Film {
	private String sujet;
	static final float tarif = 2;
	
	Documentaire(String suj,String titre,String r,String pays,int d){
		super(titre,r,pays,d);
		this.sujet = suj;
	}
	public String toString() {
		return ("sujet : "+sujet+super.toString());
	}
	float totalVenteBillets(int i){
		return tarif*i;
	}
}
