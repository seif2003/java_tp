
public class BoiteCourrier {
	private int nb =0;
	private int n;
	private Courrier[] t;
	BoiteCourrier(int n){
		t=new Courrier[n];
		this.n=n;
	}
	double affranchir() {
		double s=0;
		for(int i=0;i<n;i++) {
			s+=t[i].affranchir();
		}
		return s;
	}
	int courriersInvalides() {
		int s=0;
		for(int i=0;i<n;i++) {
			if(!t[i].valide()) {
				s+=1;
			}
		}
		return s;
	}
	void afficher(){
		for(int i=0;i<n;i++) {
			System.out.println("==================");
			t[i].decrire();
			System.out.println(t[i].valide() ? "valide":"non valide");
		}
	}
	void ajout(Courrier c) {
		if(nb<t.length)
		{
		t[nb]=c;
		nb+=1;
		}
	}
}
