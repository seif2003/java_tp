
public class Colis extends Courrier{
	private double poid;
	private double volume;
	Colis(double p,double v,boolean m, String a){
		super(m,a);
		poid =p;
		volume=v;
	}
	void decrire() {
		super.decrire();
		System.out.println("Poids : "+poid+" Volume : "+volume);
	}
	double affranchir() {
		return (0.25*volume*poid/1000*1.0);
	}
}
