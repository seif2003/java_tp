
public class Lettre extends Courrier{
	private double poid;
	private String format;
	Lettre(double p,String f,boolean m, String a){
		super(m,a);
		poid =p;
		if(f.toUpperCase()=="A3"||f.toUpperCase()=="A4") {
			format=f;
		}
		else {
			format="A3";
			System.out.println("format invalide");
		}
	}
	void decrire() {
		super.decrire();
		System.out.println("Poid : "+poid+"format : "+format);
	}
	double affranchir() {
		if(valide()) {
			double s = 0;
			if(format.toUpperCase() == "A3") {
				s = 2.5+0.5+poid*0.001;
			}
			else {
				s = 2.5+0.5+poid*0.001;
			}
			if(mode) {
				return s*2;
			}
			return s;
		}
		return 0;
	}
}
