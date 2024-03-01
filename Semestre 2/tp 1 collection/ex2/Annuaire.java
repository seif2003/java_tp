import java.util.HashMap;
import java.util.Scanner;

public class Annuaire {
	HashMap<String,Fiche> tab = new HashMap<String, Fiche>();

	public static void main(String[] args) {
		Annuaire annuaire = new Annuaire();
		Fiche fiche;
		String ch;
		String ch2;
		Scanner sc;
		int num;
		String adresse;
		sc = new Scanner(System.in);
		while(true) {
			System.out.println("Commande : ");
			ch =  sc.nextLine();
			if(ch.equals("bye")) {
				return;
			}
			ch2 = ch.substring(1);
			if (ch.charAt(0) == '+') {
				System.out.println("Numero : ");
				num =  sc.nextInt();
				sc.nextLine();
				System.out.println("Adresse : ");
				adresse =  sc.nextLine();
				fiche = new Fiche(ch2,num,adresse);
				annuaire.tab.put(ch2, fiche);
			}
			else if(ch.charAt(0) == '?') {
				System.out.println(annuaire.tab.get(ch2));
			}
			else if(ch.charAt(0) == '!') {
				System.out.println(annuaire.tab);
			}
		}
	}
}
