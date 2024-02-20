package tp4;

public class AgenceMobiliere {
	private static int max;
	private static int nb = 0;
	private Vehicule[] tab;
	AgenceMobiliere(int m) {
		this.max = m;
		tab = new Vehicule[this.max];
	}
	int getNb() {
		return this.nb;
	}
	void ajoutVehicule(Vehicule v) {
		if(this.nb < this.max ) {
			tab[this.nb] = v;
			this.nb +=1 ;
		}
		else {
			System.out.println("Le tableau est deja plien!");
		}
	}
	void selection(int n) {
		if(n < this.nb && n >=0 ) {
			this.tab[n].decrisVehicule();
		}
		else {
			System.out.println("Case vide !");
		}
	}
	void selection(String mq) {
		boolean s = false;
		for(int i=0;i<this.nb;i++) {
			if (tab[i].getMaque() == mq) {
				System.out.println(tab[i]);
				s = true;
				System.out.println("***********");
			}
		}
		if (!s) {
			System.out.println("il n’y a pas de véhicules de cette marque");
		}
	}
	 void selection(Double px) {
		 boolean s = false;
		 for(int i=0;i<this.nb;i++) {
				if (tab[i].getPrix() < px) {
					System.out.println(tab[i]);
					s = true;
					System.out.println("***********");
				}
		 }
		if (!s) {
			System.out.println("il n y a pas de vehicules dans cette marge de prix");
		}
	 }
	 void selection_ancienne() {
		 Vehicule va;
		 if (this.nb >0) {
			 va = this.tab[0];
			 for(int i=1;i<this.nb;i++) {
				 if (tab[i].getAnnee()< va.getAnnee()) {
					 va = tab[i];
				 }
			 }
			 System.out.println(va);
		 }
		 else {
			 System.out.println("Tableau vide ! ");
		 }
	 }
}
