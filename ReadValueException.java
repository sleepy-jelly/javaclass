package after1024;
import java.nio.*;
import java.util.InputMismatchException;
import java.io.*;

public class ReadValueException {
	static 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	
	
	public static void main(String[] args)throws IOException{
		
		int age= 5;
		
		System.out.println("input the age ");
		
		try {
		age=Integer.parseInt(br.readLine());
		
		System.out.println(age/0);

		}
		catch(NumberFormatException e){
			System.out.println("자료형이 안맞습니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");

		}
		finally {
			System.out.println(age);

		}
		
		
		
			
		
		

	}

}
