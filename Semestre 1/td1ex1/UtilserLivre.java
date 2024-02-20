package td;

public class UtilserLivre {

	public static void main(String[] args) {
		Livre a = new Livre("seif","java");
		Livre a2 = new Livre("seif","python");
		System.out.println(a.getAuteur());
		System.out.println(a2.getAuteur());
		if(a2.getAuteur() == a.getAuteur()) {
			System.out.println("Les deux livre ont le meme auteur");
		}
		else {
			System.out.println("non ! ");
		}
		
	}

}
