
public class TestAuthentification {
	public static void main(String args[]) {
		boolean v = false;
		do {
			try {
				new Authentification();
				v = true;
			}
			catch(java.io.IOException E){
				System.out.println(E.getMessage());
				System.exit(0);
			}
			catch(WrongInputLength E){
				System.out.println(E.getMessage());
				System.exit(0);
			}
			catch(WorngLoginException E) {
				System.out.println(E.getMessage());
			}
			catch(WrongPwdException E) {
				System.out.println(E.getMessage());
			}
		}while(!v);
		System.out.println("Bienvenu!");
	}
}
