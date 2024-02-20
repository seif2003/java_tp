import java.util.ArrayList;

public class Etudiant implements Statisticable, Comparable{
	private int matricule;
	private String nom;
	private ArrayList<Note> note = new ArrayList<Note>();
	
	public Etudiant(int matricule, String nom) {
		super();
		this.matricule = matricule;
		this.nom = nom;
	}
	
	public ArrayList<Note> getNote() {
		return this.note;
	}
	
	public void addNote(Note e) {
		note.add(e);
	}
	
	@Override
	public float getValue() {
		float s = 0;
		for(Note i : note) {
			s += i.getNote();
		}
		return s/note.size();
	}
	
	@Override
	public int compareTo(Object o) {
	    if (o instanceof Etudiant) {
	        if (this.getValue() == ((Etudiant) o).getValue()) {
	            return 0; 
	        } else if (this.getValue() < ((Etudiant) o).getValue()) {
	            return -1; 
	        } else {
	            return 1;
	        }
	    } else {
	        throw new ClassCastException("Cannot compare a Etudiant to an object of a different type");
	    }
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", note=" + note + "]";
	}
	
}
