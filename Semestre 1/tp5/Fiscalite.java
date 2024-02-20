
public class Fiscalite {

	public static void main(String[] args) {
		Personne p1 = new Personne(123,"seif ddine","ben amara");
		Personne p2 = new Personne(321,"amine","ben amara");
		Personne p3 = new Personne(111,"ranim","zghibi");
		
		Lotissement l1 = new Lotissement(5);
		
		ProprietePrivee pr1 = new ProprietePrivee(1,p1,"Corniche",350,4);
		Villa pr2 = new Villa(2,p2,"Dar Chaabane", 400,6,true);
		Appartement pr3 = new Appartement(3,p2,"Hammamet",1200,8, 3);
		ProprieteProfessionnelle pr4 = new ProprieteProfessionnelle(4,p3,"Korba", 1000, 50,true);
		ProprieteProfessionnelle pr5 = new ProprieteProfessionnelle(5,p1,"Bir Bouragba",2500, 400, false);
		
		
		l1.ajouter(pr1);
		l1.ajouter(pr2);
		l1.ajouter(pr3); 
		l1.ajouter(pr4);
		l1.ajouter(pr5);
		
		l1.afficherPropeietes();
		
		System.out.println("Nombre total de pieces : "+l1.getnbPieces());
		l1.supprimer(pr3);
		l1.afficherPropeietes();
		
		ProprietePrivee mip = l1.moinsImpots();
		System.out.println("Impot a payer = "+mip.calculImpot()+" Responsable = "+mip.getResponsable());
		
		//LotissementPrivee
		Lotissement lt = new LotissementPrivee(10);
		lt.ajouter(pr1);
		System.out.println(lt.getProprieteByIndice(0));
		System.out.println("nombre pieces = "+lt.getnbPieces());
		
	}

}
