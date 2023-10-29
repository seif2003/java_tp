
public class test {

	public static void main(String[] args) {
		BoiteCourrier t = new BoiteCourrier(3);
		Courrier c1 = new Courrier(true,"");
		Courrier c2 = new Lettre(20,"A3",false,"rades");
		Courrier c3 = new Colis(30,10,true,"nabeul");
		t.ajout(c1);
		t.ajout(c2);
		t.ajout(c3);
		t.afficher();
		System.out.println("affranchir : ");
		System.out.println(t.affranchir());
		System.out.println("Invalide : ");
		System.out.println(t.courriersInvalides());
	}

}
