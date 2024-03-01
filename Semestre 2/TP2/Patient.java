import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Patient {
	private String nom ;
	private Set <String > ordonnance ;
	
	public Patient ( String n){
		nom = n ;
		ordonnance = new HashSet <String >();
	}
	public String getNom () { return nom ;}

	public boolean ordonnanceVide (){
		return ordonnance.isEmpty();
	}

	public void ajoutMedicament ( String m) {
		ordonnance.add(m);
	}

	public void affiche(){
		System.out.println("Nom :  "+ nom + " Ordonnance : " + ordonnance);
	}

	public boolean contientMedicament (String m) {
		for(String tmp : ordonnance) {
			if(tmp.equals(m)) {
				return true;
			}
		}
		return false;
	}
    public void trieOrdonnace() {
        Set<String> sortedOrdonnance = new TreeSet<>(ordonnance);
        ordonnance = sortedOrdonnance;
    }
	@Override
	public String toString() {
		return "Patient [nom=" + nom + ", ordonnance=" + ordonnance + "]";
	}
    
}
