
public class Epreuve {
	private String denomination;
	private Candidat tab[];
	private int max;
	private int eff;
	private boolean etat=false;
	
	Epreuve (String denomination, int max){
		this.max = max;
		this.denomination = denomination;
		this.tab = new Candidat[max]; 
	}
	
	public String toString() {
		String ch="";
		for(int i=0;i<max;i++) {
			ch += tab[i].getNon(); 
			ch += "|";
		}
		return denomination+(etat?" terminer ":" non terminer ")+" Les candidats : "+ch;
	}
	
	void ajoutCandidat(Candidat a) {
		if(eff<max) {
			tab[eff] = a;
			eff++;
		}
		else System.out.println("error");	
	}
	
	void terminer () {
		this.etat = false;
	}
	
	boolean estTerminer() {
		return this.etat;
	}
	
	Resultat getRecord() {
		Resultat record = tab[0].getResultat();
		for(int i=1;i<eff;i++) {
			if (tab[i].getResultat().compareTo(record)==-1){
				record = tab[i].getResultat();
			}
		}
		return record;
	}
	
	Candidat getVinqueur() {
		for(int i=0;i<eff;i++) {
			if(getRecord()==tab[i].getResultat()) {
				return tab[i];
			}
		}
		return null;
	}
	
	void fixeResultat(int id, Resultat r) {
		if(!etat) {
			for(int i=0;i<eff;i++) {
				if(tab[i].getId()==id) {
					tab[i].setResultat(r);
				}
			}
		}
		else throw new IllegalArgumentException();
	}
	Resultat getResultat(int id) {
		for(int i=0;i<eff;i++) {
			if(tab[i].getId()==id) {
				return tab[i].getResultat();
			}
		}
		return null;
	}
}
