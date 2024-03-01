import java.util.ArrayList;
import java.util.Collections;

public class Stats {
	static public Note meilleurNote(Etudiant e) {
		return(Collections.max(e.getNote()));
	}
	
	static public Note moisBonneNote(Etudiant e) {
		return(Collections.min(e.getNote()));
	}
	
	static public float moyenne(Etudiant e) {
		return e.getValue();
	}
	
	static public float moyenneGroupe(ArrayList<Etudiant> g) {
		float s=0;
		for(Etudiant e : g) {
			s += e.getValue(); 
		}
		return s/g.size();
	}
	
	static public Etudiant meilleurEtudiant(ArrayList<Etudiant> g) {
		return Collections.max(g);
	}
	
	static public Etudiant moinsBonEtudiant(ArrayList<Etudiant> g) {
		return Collections.min(g);
	}
	
	public static void main(String[] args) {
		ArrayList<Etudiant> listEtudiant = new ArrayList<Etudiant>();
		Note e1n1,e1n2,e1n3,e2n1,e2n2,e2n3,e3n1,e3n2,e3n3;
		Etudiant e1,e2,e3;

		e1n1 = new Note("java", 18);
		e1n2 = new Note("python", 16);
		e1n3 = new Note("c", 14);
		
		e2n1 = new Note("java", 20);
		e2n2 = new Note("python", 16);
		e2n3 = new Note("c", 5);
		
		e3n1 = new Note("java", 19);
		e3n2 = new Note("python", 18);
		e3n3 = new Note("c", 19);
		
		e1 = new Etudiant(1, "seif ddine");
		e2 = new Etudiant(2, "ramzi");
		e3 = new Etudiant(3, "ranim");
		
		e1.addNote(e1n1);
		e1.addNote(e1n2);
		e1.addNote(e1n3);
		
		e2.addNote(e2n1);
		e2.addNote(e2n2);
		e2.addNote(e2n3);
		
		e3.addNote(e3n1);
		e3.addNote(e3n2);
		e3.addNote(e3n3);
		
		listEtudiant.add(e1);
		listEtudiant.add(e3);
		listEtudiant.add(e2);
		
		System.out.println("Sort by Matricule :");
		Collections.sort(listEtudiant,new MatriculeCompare());
		System.out.println(listEtudiant);
		
		System.out.println("Sort by Nom :");
		Collections.sort(listEtudiant,new CompareNom());
		System.out.println(listEtudiant);
		
		System.out.println("Sort by Moyenne :");
		Collections.sort(listEtudiant);
		System.out.println(listEtudiant);
		
		for(Etudiant e: listEtudiant) {
			System.out.println(e.getNom() + " meilleur note : ");
			System.out.println(meilleurNote(e));			
		}
		
		for(Etudiant e: listEtudiant) {
			System.out.println(e.getNom() + " mois bonne note : ");
			System.out.println(moisBonneNote(e));			
		}

		for(Etudiant e: listEtudiant) {
			System.out.println(e.getNom() + " Moyenne : ");
			System.out.println(moyenne(e));			
		}
		
		System.out.println("moyenne groupe");
		System.out.println(moyenneGroupe(listEtudiant));
		
		System.out.println("meilleur etudiant(e)");
		System.out.println(meilleurEtudiant(listEtudiant));
		
		System.out.println("moins bon Etudiant(e)");
		System.out.println(moinsBonEtudiant(listEtudiant));
		
	}

}
