import java.util.Scanner;

public class Achat {
	static Article supermarche[] = new Article[4];

	public static void main(String[] args) {
		Vetement p1 = new Vetement(123,"Jupe",39.0f,2,"bleue","S");
		ProduitElec p2 = new ProduitElec(145,"TV Led 80cm",1450.0f,2,"TV");
		Vetement p3 = new Vetement(178,"Pantalon",39.0f,2,"noir","M");
		ProduitGC p4 = new ProduitGC(191,"Pates",0.41f,18);
		Scanner sc = new Scanner(System.in);
		
		supermarche[0] = p1;
		supermarche[1] = p2;
		supermarche[2] = p3;
		supermarche[3] = p4;
				
		float S = 0;
		
		for(int i=0;i<supermarche.length;i++) {
			// les qte a acheter son entrée par clavier
			System.out.println("Qte a acheter de ");
			supermarche[i].decrire();
			int j = sc.nextInt();
			if (supermarche[i].estDispo(j)) {
				if(supermarche[i] instanceof Vetement) {
					S += ((Vetement)supermarche[i]).prixDeVente("21/03/23");
				}
				else if(supermarche[i] instanceof ProduitElec){
					S += ((ProduitElec)supermarche[i]).prixDeVente("21/03/23");
				}
				else {
					S += supermarche[i].calculPrixTTC();
				}
				supermarche[i].setQteStock(supermarche[i].getQteStock()-j);
			}
			else {
				System.out.println("cet article est indisponible");
			}
		}
		System.out.println("montant total a payer = "+S);
	}

}
