
public class test {

	public static void main(String[] args) {
		Epreuve e1 = new Epreuve("programmation", 5);
		Candidat c1 = new Candidat(1, "seif");
		Candidat c2 = new Candidat(2, "ranim");
		Candidat c3 = new Candidat(3, "iyed");
		e1.ajoutCandidat(c1);
		e1.ajoutCandidat(c2);
		e1.ajoutCandidat(c3);
		e1.fixeResultat(1, new ResultatPoints(9));
		e1.fixeResultat(2, new ResultatPoints(10));
		e1.fixeResultat(3, new ResultatPoints(8));
		System.out.println(e1.getVinqueur().getNon());
	}

}
