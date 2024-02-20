package td1ex2;

public class test {

	public static void main(String[] args) {
		Livre l1 = new Livre("Coelho","L'alchimiste",255);
		Livre l2 = new Livre("","Le Coran",255);
		Livre l3 = new Livre("JK Rowling","Harry Potter");
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		l2.setAuteur("Paulo Coelho");
		l3.setNbPages(461);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}

}
