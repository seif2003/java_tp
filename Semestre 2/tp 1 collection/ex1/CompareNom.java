import java.util.Comparator;

public class CompareNom implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Etudiant && o2 instanceof Etudiant) {
	        return ((Etudiant) o1).getNom().compareTo(((Etudiant) o2).getNom());
		}
		else {
			throw new ClassCastException("Cannot compare different type");
		}
	}

}
