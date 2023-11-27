
public class Mathematique {
	static double f(double x,double n) throws ParametreNullException,NegatifException {
		if(x==0) {
			throw new ParametreNullException("parametre null !");
		}
		if(n==0) {
			throw new ParametreNullException("impossible de faire une division par zéro !");
		}
		if(x<0) {
			throw new NegatifException();
		}
		return Math.sqrt(x)/n; 
	}

	public static void main(String args[]) {
		try {
			double x=Double.parseDouble(args[0]);
			double n=Double.parseDouble(args[1]);
			System.out.println(f(x,n));
			
		}
		catch(ArrayIndexOutOfBoundsException E) {
			System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne");
		}
		catch(NumberFormatException E) {
			System.out.println("Les arguments doivent être des nombres");
		}
		catch(ParametreNullException E){
			System.out.println(E.getMessage());
		}
		catch(NegatifException E){
			System.out.println(E.getMessage());
		}
		finally{
			System.out.println("finally");
		}
		
	}
}
