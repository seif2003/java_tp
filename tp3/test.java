package tp3;

public class test {

	public static void main(String[] args) {
		int n = 3;
		Compte[] T = new Compte[n];
		Personne p1 = new Personne("seif ddibe","ben amara","rades");
		Personne p2 = new Personne("ramzi","ben amara","rades1");
		Personne p3 = new Personne("mohammed","ben amara","rades2");
		T[0] = new Compte(p1,1000,500,500);
		T[1] = new Compte(p2,1200,600,550);
		T[2] = new Compte(p3,1500,700,600);
		for (Compte C : T) {
			System.out.println(C);
        }
		System.out.println("Avant virement");
        System.out.println(T[0].getSolde());
        System.out.println(T[1].getSolde());
        Compte.Virement(200,T[0],T[1]);
        System.out.println("Apres virement");
        System.out.println(T[0].getSolde());
        System.out.println(T[1].getSolde());


        Compte MaxCompte = T[0];
        for (Compte compte : T) {
        	if (compte.getSolde() > MaxCompte.getSolde()) {
        		MaxCompte = compte;
        	}
        }
        System.out.println("Compte max :"+MaxCompte);
        }
}
