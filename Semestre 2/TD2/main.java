package td2;

public class main {

	public static void main(String[] args) {
		Stock s = new Stock();
		Article a1 = new Article("voiture1",80000);
		Article a3 = new Article("voiture3",90000);
		Article a2 = new Article("voiture2",150000);
		
		s.addNouvArticle(a1, 5);
		s.addNouvArticle(a3, 3);
		s.addNouvArticle(a2, 10);
		
		Facture f = new Facture(s);
		
		s.sortStock();
		
		f.addLigne(1, a1.getNom());
		f.addLigne(5, a3.getNom());
		f.addLigne(3, a2.getNom());
		
		s.sortStock();
		System.out.println(f.getMontantTotal());
	}	

}
