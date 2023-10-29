
public class Courrier {
	protected boolean mode;
	protected String adresse;
	private final double tarif = 0.5;
	
	Courrier(boolean m, String a){
		mode = m;
		adresse = a;
	}
	boolean valide() {
		return adresse!="";
	}
	void decrire() {
		if(mode) {
			System.out.println("mode : Express destination : "+adresse);
		}
		else {
			System.out.println("mode : normal destination : "+adresse);
		}
	}
	double affranchir() {
		if (valide()) {
			if(mode) {
				return tarif*2;
			}
			else {
				return tarif;
			}
		}
		return 0;
	}
}
