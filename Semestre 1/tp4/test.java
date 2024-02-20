package tp4;

public class test {

	public static void main(String[] args) {
		AgenceMobiliere AM = new AgenceMobiliere(3);
		Vehicule v = new Vehicule("Clio","Classique",2000,20.000);
		Vehicule w = new Vehicule("Marcedes","Fantome",2008,60.000);
		Vehicule x = new Vehicule("KIA","Picanto",2012,35.000);
		AM.ajoutVehicule(v);
		AM.ajoutVehicule(w);
		AM.ajoutVehicule(x);
		for(int i = 0 ; i<AM.getNb() ; i++) {
			AM.selection(i);
			System.out.println("----------------");
		}
		System.out.println("Tous marcades : ");
		AM.selection("Marcedes");
		System.out.println("Les voitures ayants un prix inferieur a 40.000 ");
		AM.selection(40.000);
		System.out.println("La voiture la plus ancienne dans le parking. ");
		AM.selection_ancienne();
	}

}
