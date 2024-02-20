package td4;

public class Roman extends Livre{
	private String auteur;
	private String editeur;
	
	Roman(String t,int i,double tv,String d,int n,String a,String e){
		super(t,i,tv,d,n);
		auteur = a;
		editeur = e;
	}
	
	public String toString() {
		return super.toString()+" Auteur : "+auteur+" Editeur : "+editeur;
	}
	
	double calculPrix() {
		return (0.075*nbPages)*(1+tva);
	}
}
