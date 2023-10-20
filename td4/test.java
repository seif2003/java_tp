package td4;

public class test {

	public static void main(String[] args) {
		Librairie L = new Librairie(4);
		Livre lv1 = new Livre("Le petit prince",1,0.1,"Litterature",96);
		Roman lv2 = new Roman("L etranger",2,0.1,"Litterature",96,"Albert Camus","Gallimard");
		Magazine lv3 = new Magazine("Le Monde",3,0.1,"Actualites",24,"Hebdomadaire");
		L.ajoutLiv(lv1);
		L.ajoutLiv(lv2);
		L.ajoutLiv(lv3);
		Roman lv4 = new Roman("1984",4,0.1,"Litterature",328,"George Orwell","Secker and Warburg");
		L.ajoutLiv(lv4);
		L.inventaire("Roman");
		System.out.println("Prix tous les Roman = ");
		System.out.println(L.prix("Roman"));
		Roman lv5 = new Roman("nouveau",6,0.1,"nouveau",1,"nouveau","nouveau");
		L.ajoutLiv(lv5);
		L.suppLiv(3);
		L.ajoutLiv(lv5);
		L.inventaire();
	}

}
