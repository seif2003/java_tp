package td3ex2;

public class Dictionnaire {
	private int nbMots=0;
	private int nbMax;
	private MotDico[] dico;
	private String nom;
	
	Dictionnaire(int n,String nm){
		this.nom = nm;
		this.nbMax = n;
		this.dico = new MotDico[n];
	}
	void ajouterMot(MotDico m) {
		if(nbMots!=nbMax) {
			dico[nbMots] = m ;
			nbMots++;
		}
		else {
			System.out.println("le dictionnaire est plien!");
		}
	}
	void supprimerMot(String ch) {
		int index = chercherMot(ch);
		if (index == -1){
			System.out.println("mot n exist pas!");
		}
		else {
			for(int i = index;i<(nbMots-1);i++) {
				dico[index] = dico[index+1];
			}
			nbMots-=1;
		}
	}
	int chercherMot(String ch) {
		for(int i=0;i<nbMots;i++) {
			if(dico[i].getMot()==ch) {
				return i;
			}
		}
		return -1;
	}
	void listerDico() {
		for(int i=0;i<nbMots;i++) {
			System.out.println(dico[i]);
		}
	}
	int nbSynonymes(MotDico m) {
		int s = 0;
		for(int i=0;i<nbMots;i++) {
			if (m.synonyme(dico[i])){
				s++;
			}
		}
		return s;
	}
	void afficherMot(int i) {
		System.out.println(dico[i]);
	}
}
