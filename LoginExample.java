package after1024;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("White", "12345");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "54321");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public static void login(String id, String pw) {
		if(!id.equals("blue")) {
			new NotExistIDException("error");
		}
		if(!pw.equals("12345")) {
			new WrongPasswordException("error");
		}
		
		
	}

}
