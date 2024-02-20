
public class ResultatOral implements Resultat {
	private char appreciation;
	
	public ResultatOral(char appreciation) {
		this.appreciation = appreciation;
	}
	
	char getAppreciation() {
		return appreciation;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " Appreciation : "+ appreciation;
	}
	
	public int compareTo(Resultat r) {
		if(r instanceof ResultatOral)
			if(((ResultatOral)r).getAppreciation() > appreciation) return 1;
			else if(((ResultatOral)r).getAppreciation()==appreciation) return 0;else return -1;
		System.out.println("impossible");
		throw new IllegalArgumentException();
	}
	
}
