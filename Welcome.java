import java.util.Scanner;

public class Welcome 
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int cnt= 0;
		
		for(int i = 0; i<9;i++) {
			for(int j = 0;j<cnt;j++) {
			System.out.print("*");
			}
			System.out.println("*");
			
			cnt++;
		}
		
		/*int nValue = sc.nextInt();
		
		
		for(int i=0; i <nValue;i++) {
			
			
			
		}
		
		
		
		/* int i=0;
		int maxLoop =sc.nextInt();
		int sum = 0;

		while(i<maxLoop) {
			
			sum=sum+(i+1);
			
			i++;
		
			/*System.out.printf("%d + ",i);
			if(i==(maxLoop-1)) {
				System.out.print(i+1);
			}
			i++;
			
		}
		System.out.println(sum);
		
		*/
		
	   /* for(int i=1;i<max+1;i++) {              // bad code
	   	System.out.println((num)+" x "+(i) +" = "+(num*i));
	   } */
		
		/*                        // bad code
	    for(int i=1;i<max+1;i++) { //this for loop only loop (int max) time(s);
	    	int sum= i*num;
	    	System.out.println((num)+" x "+(i) +" = "+sum);
	    }
	    */
	    
	    
	    /* bad code 
	    int kor = 30;
	    int eng = 40;
	    int math = 50;
	    
	    eng=(eng+math+kor)/3;
	    System.out.println(eng);
	    */  
	    sc.close();
	    
	}

}
