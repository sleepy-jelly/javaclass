
public class mol_lu {
	public static void main(String[] args) {
		
		int maxNum= 100;
		
		int j=0;
		
		
		for(int i=2; i<=maxNum;i++) {
			for(j=2; j<i;j++) {
				if((i%j)==0) { // when i is not prime number;
					break; 
				}
			}
			if (i == j){
	        	System.out.print(i+" "); 
	        }
			
			
			
		}
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}
