package ds2019;
import java.util.Scanner;

public class Jcc {
	private Film[] competition ;
	private int annee;
	private final int NBFMAX=30;
	private int nbF=0;
	
	Jcc(int a,int t){
		if (t<NBFMAX) {
			this.annee = a;
			competition = new Film[t];
		}
		else {
			System.out.println("erreur");
		}
	}
	void ajoutFilm(Film f){
		if (nbF<NBFMAX) {
			competition[nbF]=f;
			nbF+=1;
		}
		else {
			System.out.println("La competition est au complet");
		}
	}
	void listeFilmJCC(){
		for(int i =0;i<nbF;i++) {
			System.out.println(competition[i]);
		}
	}
	float totalVenteBilletsJCC(){
		float s = 0;
		int x;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<nbF;i++) {
			if(competition[i].getClass().getSimpleName().equals("Film")) {
				System.out.println("Saisir nbr d etudiants pour "+competition[i]);
				x = sc.nextInt();
			}
			else {
				x = competition[i].getNbrPlaces();
			}
			s += competition[i].totalVenteBillets(x);
		}
		return s;
	}

	public static void main(String[] args) {
		Jcc J = new Jcc(2021,2);
		Documentaire d1 = new Documentaire("La guerre civile","Le dernier refuge","Ousman","Mali",86);
		d1.setNbrPlaces(30);
		Film f1 = new Film("Insurrection","Jilani Saadi","Tunisie",105);
		f1.setNbrPlaces(45);
		J.ajoutFilm(d1);
		J.ajoutFilm(f1);
		J.listeFilmJCC();
		System.out.println(J.totalVenteBilletsJCC());
	}

}
