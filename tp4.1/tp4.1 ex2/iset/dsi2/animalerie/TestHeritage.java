package iset.dsi2.animalerie;

public class TestHeritage {

	public static void main(String[] args) {
		Animal[] T = new Animal[3]; 
		T[0] = new Animal("rouge",5);
		T[1] = new Chat(true,"beige",10);
		T[2] = new Chien("berget","blanc",15);
		for (int i=0;i<3;i++) {
			System.out.println("----------------");
			if(T[i].getClass().getSimpleName().equals("Animal")) {
				//Après recherche sur internet, j’ai trouvé qu’il faut utiliser .equals()
				System.out.println("L'espece de cet animal est inconnue");
			}
			T[i].decrisToi();
			T[i].manger();
			T[i].boire();
			T[i].crier();
		}
		System.out.println("----------------");
	}

}
