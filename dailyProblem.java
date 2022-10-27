package after1024;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class dailyProblem {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String email ="jsh.ezen.2022@gmail.com";
		String email2 ="jsh.ezen.2022@.com";

		
		String sample = "@asdf";
		String sample2 = "@a@@@sdf";
		
		String sample3 = "@a@@.@sdf";
		
		int nData =email.indexOf('@');
		
		System.out.println(nData);
		
		System.out.println(isEmail(email));
		System.out.println(isEmail(sample));
		System.out.println(isEmail(sample2));
		System.out.println(isEmail(sample3));
		
		
		 nData =sample.indexOf('@');
		
			System.out.println(isEmail(email2));

		System.out.println();
		System.out.println();
		System.out.println(getDomain(email));
		System.out.println(getId(email));

		
		
		
		
		
	}
	
	public static boolean isEmail(String address) {
		if(address.indexOf('@')>=0) {
			
			
			if((false==(address.length()==address.indexOf('@')))) {
				
				
				if((address.lastIndexOf('.')>address.lastIndexOf('@'))) {
					
					int cnt =0;
					for(int i=0; i<address.length();i++) {
						if(address.charAt(i)=='@') {
							cnt++;
						}
					}
					if((address.lastIndexOf('.')-1)==address.lastIndexOf('@')) {
						return false;
					}
					if(cnt ==1) {
					return true;
					}
					
				}
				return false;
			}
			
			return false;
		}
		return false;
	}
	

	public static String getDomain(String nEmail) {
		if(isEmail(nEmail)==false) {
			return null;
		}
		String result="www."+(nEmail.substring(nEmail.indexOf('@')+1,nEmail.length()));

		
		
		
		
		
		
		
		
		
		
		
		return result;
	}
	
	public static String getId(String nEmail) {
		if(isEmail(nEmail)==false) {
			return null;
		}
		String result ="";
		for(int i =0; i<nEmail.length();i++) {
			if(nEmail.charAt(i)=='@') {
				break;
			}
			result=result+nEmail.charAt(i);
		}
		

		
		return result;
	}
	
	
	
	
	
	

}
