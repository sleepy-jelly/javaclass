package after1024;

public class NotExistIDException extends Exception {

	public NotExistIDException() {}
	public NotExistIDException(String Message) {
		System.out.println("id doesn't exist");
		
	}
	

}
