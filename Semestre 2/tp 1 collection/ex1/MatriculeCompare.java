import java.util.Comparator;

public class MatriculeCompare implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Etudiant && o2 instanceof Etudiant) {
	        if (((Etudiant) o2).getMatricule() == ((Etudiant) o1).getMatricule()) {
	            return 0; 
	        } else if (((Etudiant) o2).getMatricule() > ((Etudiant) o1).getMatricule()) {
	            return -1; 
	        } else {
	            return 1;
	        }
		}
		else {
			throw new ClassCastException("Cannot compare different type");
		}
	}

}
