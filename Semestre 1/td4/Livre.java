package td4;

public class Livre {
	protected String titre;
	protected int id;
	protected static double tva = 0.1;
	protected String domaine;
	protected int nbPages; 
	
	Livre(String t,int i,double tv,String d,int n){
		titre = t;
		id = i;
		tva = tv;
		domaine = d;
		nbPages = n;
	}
	public String toString() {
		return("Type de livre : "+this.getClass().getSimpleName()+" Titre : "+this.titre+" Id : "+this.id+" Domaine : "+this.domaine+" Nombre de pages : "+this.nbPages);
	}
	
	int getId(){
		return id;
	}
	
	double calculPrix(){
		return (0.075*nbPages)*(1+tva);
	}
}
