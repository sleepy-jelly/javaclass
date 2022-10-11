
import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		arrayBubble sort = new arrayBubble();
		System.out.println("     input size of Data       ");

		int max= sc.nextInt();
		int[] array = new int[max];
		boolean whileFlag =true;
		////////////////////////////////
		// defines
		////////////////////////////////
		
		System.out.println("     random datas       ");
		
		for(int i=0; i<array.length;i++) {
			array[i]=(int)((Math.random()*214943)+1);        //data range is 1~100;
		}
		System.out.println();
		
		////////////////////////////////
		// checking datas;
		////////////////////////////////
		
		

		for(int i=0; i<array.length;i++) {   
			System.out.println(array[i]);
		}
		System.out.println();

		
		
		
		////////////////////////////////
		// sorting datas;
		////////////////////////////////
		
		
		
		
		while(whileFlag) {
			System.out.println("-----input sorting type-----");
			System.out.println("type 1 to sorted datas [ascending]");
			System.out.println("type 2 to sorted datas [descending]");

			int Select = sc.nextInt();
			switch(Select) {
			
			case 1:			////////////////////////////////
							// bubble sorting (ascending)
							////////////////////////////////
				
				sort.bubbleASC(array);
				
				System.out.println("     sorted datas[ascending]	       ");
				for(int i=0; i<array.length;i++) {   
					System.out.println(array[i]);
				}
				System.out.println();
				
				whileFlag=false; ////// stop loop
				break;
				
			case 2:			////////////////////////////////
							// bubble sorting (descending)
							////////////////////////////////
				
				
				sort.bubbleDESC(array); 
				
				System.out.println("     sorted datas[descending]	       ");

				for(int i=0; i<array.length;i++) {   
					System.out.println(array[i]);
				}
				whileFlag=false; ////// stop loop
				break;
				
				
			default: 
				System.out.println("     input value is out of range(1~2)	     ");
				break; ////// keep looping
			}
		}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("End Of Program..");
		
		sc.close();
	}
}