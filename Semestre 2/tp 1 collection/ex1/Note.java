
public class Note implements Statisticable,Comparable{
	private String titre;
	private float note;
	
	public Note(String titre, float note) {
		super();
		this.titre = titre;
		this.note = note;
	}

	public float getNote() {
		return this.note;
	}

	@Override
	public float getValue() {
		return this.note;
	}

	@Override
	public int compareTo(Object o) {
	    if (o instanceof Note) {
	        Note otherNote = (Note) o;
	        if (this.note == otherNote.note) {
	            return 0; 
	        } else if (this.note < otherNote.note) {
	            return -1; 
	        } else {
	            return 1;
	        }
	    } else {
	        throw new ClassCastException("Cannot compare a Note to an object of a different type");
	    }
	}

	@Override
	public String toString() {
		return "Note [titre=" + titre + ", note=" + note + "]";
	}
	
}
