import java.util.Scanner;

public class Authentification  {
	private final String LoginCorrect = "scott";
	private final String PwdCorrect = "tiger";
	Scanner sc = new Scanner(System.in);
	
	Authentification() throws WrongInputLength,WorngLoginException,WrongPwdException,java.io.IOException {
		getUserLogin();
		getUserPwd();
	}
	
	String getUserLogin() throws WrongInputLength,WorngLoginException,java.io.IOException{
		String user = sc.nextLine();
		if (user.length()>10) {
			throw new WrongInputLength();
		}
		if (!user.equals(LoginCorrect)) {
			throw new WorngLoginException();
		}
		return user;
	}
	String getUserPwd()throws WrongInputLength,WrongPwdException,java.io.IOException{
		String pwd = sc.nextLine();
		if (pwd.length()>10) {
			throw new WrongInputLength();
		}
		if (!pwd.equals(PwdCorrect)) {
			throw new WrongPwdException();
		}
		return pwd;
	}
}
