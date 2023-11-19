
abstract public class Propriete {
	protected int id;
	protected Personne responsable;
	protected String adresse;
	protected double surface;
	Propriete(int i,Personne p,String a,double s){
		id=i;
		responsable=p;
		adresse=a;
		surface=s;
	}
	public String toString() {
		return("id : "+id+" responsable : "+responsable+" adresse : "+adresse+" surface : "+surface);
	}
	abstract double calculImpot();
	
	int getId() {
		return id;
	}
	Personne getResponsable() {
		return responsable;
	}
}
