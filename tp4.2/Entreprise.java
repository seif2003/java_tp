package tp42;

public class Entreprise {
	public static void main(String[] args) {
		Salarie[] tabSalarie = new Salarie[5];
		tabSalarie[0] = new Employe(12345,"Walid",2002,15,4);
		tabSalarie[1] = new Vendeur(23445,"Yessine",2007,1000,0.1);
		tabSalarie[2] = new Vendeur(65478,"Nassime",2000,700,0.1);
		tabSalarie[3] = new Employe(87698,"Aymen",2003,19,5);
		tabSalarie[4] = new Employe(12345,"Khaled",2008,7,4);
		System.out.println("******************************** Liste des Employés*****************************");
		for(int i=0;i<5;i++) {
			if (tabSalarie[i] instanceof Employe) {
				tabSalarie[i].affiche();
			}
		}
		System.out.println("********************************************************************************");
		System.out.println("******************************** Liste des Vendeurs*****************************");
		for(int i=0;i<5;i++) {
			if (tabSalarie[i] instanceof Vendeur) {
				tabSalarie[i].affiche();
			}
		}
		System.out.println("********************************************************************************");
		System.out.println("*************** Nom du salarie le plus ancien dans l'entreprise ****************");
		
		Salarie max = tabSalarie[0];
		
		for(int i=1;i<5;i++) {
			if(max.getRecrutement()>tabSalarie[i].getRecrutement()) {
				max = tabSalarie[i];
			}
		}
		System.out.println("*************** Nom Nassime "+max.getNom()+" recrute en l'an "+max.getRecrutement()+" *********************");
		System.out.println("********************************************************************************");
		System.out.println("****************** Matricule du vendeur disposant du plus grand salaire ****************");

		Salarie maxS = null;
		
		for(int i=0;i<tabSalarie.length;i++) {
			if (tabSalarie[i] instanceof Vendeur) {
				if(maxS == null) {
					maxS = tabSalarie[i];
				}
				else if(maxS.salaire()<tabSalarie[i].getMat()){
					maxS = tabSalarie[i];
				}
			}
		}
		System.out.println("*************** Matricule="+maxS.getMat()+" de salaire= "+maxS.salaire()+" Dt *********************");
		System.out.println("********************************************************************************");
	}
}
