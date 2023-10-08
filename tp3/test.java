package tp3;

public class test {

	public static void main(String[] args) {
		Personne p1 = new Personne("seif ddibe","ben amara","rades");
		Compte c1 = new Compte(p1,1000,500,500);
		Compte c2 = new Compte(p1,1000,500,500);
		c1.Virement(100, c2);
		System.out.println(c1);
		System.out.println(c2);
		Compte.Virement(100, c2,c1);
		System.out.println(c1);
		System.out.println(c2);
	}

}
