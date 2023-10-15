package td3;

public class CalculMoyenne {

	public static void main(String[] args) {
		Tab T = new Tab();
		float[] noteCtrl = new float[40];
		float[] noteExam = new float[40];
		float[] moyenne = new float[40];
		
		//set NMAX (taill du tableau)
		T.setNb(3);
		
		System.out.println("remplir note ctrl");
		T.remplir(noteCtrl);
		System.out.println("remplir note exam");
		T.remplir(noteExam);
		System.out.println("note ctrl");
		T.lister(noteCtrl);
		System.out.println("note exam");
		T.lister(noteExam);
		
		float div = 3;
		moyenne =T.produit((1/div), T.additionner(noteCtrl,T.produit(2, noteExam)));
		System.out.println("moyenne");
		T.lister(moyenne);
	}
}
