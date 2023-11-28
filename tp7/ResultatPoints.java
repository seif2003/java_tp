
public class ResultatPoints implements Resultat {
	private int nbp;
	
	public ResultatPoints(int nbp) {
		this.nbp = nbp;
	}

	public int getNbp() {
		return nbp;
	}

	public void setNbp(int nbp) {
		this.nbp = nbp;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " Nombre des points : "+ nbp;
	}
	
	public int compareTo(Resultat r) {
		if(r instanceof ResultatPoints) {
			if(((ResultatPoints)r).getNbp() > nbp) return 1;
			else if(((ResultatPoints)r).getNbp()==nbp) return 0;
			else return -1;
		}
		System.out.println("impossible");
		throw new IllegalArgumentException();
	}
	
}
