package td4;

public class Librairie {
	private Livre[] list ;
	private int capacite;
	private int nb;
	
	Librairie(int c) {
		list = new Livre[c];
		capacite = c;
	}
	int getNb() {
		return nb;
	}
	void inventaire() {
		for(int i=0;i<nb;i++) {
			System.out.println(list[i]+" Prix : "+list[i].calculPrix());
		}
	}
	void inventaire(String categ) {
		for(int i=0;i<nb;i++) {
			if(list[i].getClass().getSimpleName().equals(categ)) {
				System.out.println(list[i]+" Prix : "+list[i].calculPrix());
			}
		}
	}
	void ajoutLiv(Livre liv) {
		if(nb<capacite) {
			list[nb] = liv;
			nb+=1;
		}
		else {
			System.out.println("Librairie est plien!");
		}
	}
	void suppLiv(int num) {
	    int i = 0;
	    while(i<nb && list[i].getId()!=num){
	        i++;
	    }
	    if(i<nb) {
	        for(int j=i;j<(nb-1);j++) {
	            list[j] = list[j+1];
	        }
	        nb -= 1;
	    } else {
	        System.out.println("Livre introuvable !");
	    }
	}
	double prix(String categ) {
		double s = 0;
		for(int i=0;i<nb;i++) {
			if(list[i].getClass().getSimpleName().equals(categ)) {
				s += list[i].calculPrix();
			}
		}
		return s;
	}
}
