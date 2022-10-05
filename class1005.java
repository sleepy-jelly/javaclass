import java.util.Scanner;
public class class1005 {

	public static void main(String[] args) {
		class1005Student st1= new class1005Student();
		Scanner sc = new Scanner(System.in);

		boolean flag=true;
		boolean flag2=true;
		
		int nPointer = 0;
		
		while(flag) {
			System.out.println("Student Mangement Program");
			System.out.println();
			System.out.println("Setting by pointer-----------1");
			System.out.println("Setting by fullModule--------2");
			System.out.println("Showing by pointer-----------3");
			System.out.println("Showing by fullModule--------4");
			System.out.println("Exit-------------------------5");
			System.out.println();
			int nTemp =sc.nextInt();
			if(nTemp==1) {
				flag2=true;
				while(flag2){
				System.out.println("         Setting by pointer              ");
				System.out.println();
				System.out.println("Setting student number by pointer-1");
				System.out.println("Setting student name by pointer---2");
				System.out.println("Setting kor score by pointer------3");
				System.out.println("Setting eng score by pointer------4");
				System.out.println("Setting math score by pointer-----5");
				System.out.println("Exit-------------------------6");
				System.out.println();
				
				int nTempIn=sc.nextInt();
				switch(nTempIn) {
				case 1:
					System.out.println("input studenet number, pointer(integer)");
					int tempStuNum = sc.nextInt();
					nPointer = sc.nextInt();
					st1.setStuNum(tempStuNum, nPointer);
					break;
				case 2:
					
					break;
				case 3:
					System.out.println("input kor score, pointer(integer)");
					int kor = sc.nextInt();
					nPointer = sc.nextInt();
					st1.setStuNum(kor, nPointer);
					break;
				case 4:
					System.out.println("input eng score, pointer(integer)");
					int eng = sc.nextInt();
					nPointer = sc.nextInt();
					st1.setStuNum(eng, nPointer);
					break;
					
					
				case 5:
					System.out.println("input math score, pointer(integer)");
					int math = sc.nextInt();
					nPointer = sc.nextInt();
					st1.setStuNum(math, nPointer);
					break;
					
				case 6:
					System.out.println("              exiting              ");
					System.out.println();
					flag2 = false;
					break;
				default:
					System.out.println("       value is out of range           ");
					System.out.println();
					break;
					
				}
			}
				
			}else if(nTemp==2) {
				System.out.println("       Setting by fullModule              ");
				System.out.println();
				flag2=true;
				while(flag2){
					System.out.println("Setting all---------1");
					System.out.println("Reset all-----------2");
					System.out.println("Exit----------------3");
					System.out.println();
					int nTempIn=sc.nextInt();
					switch(nTempIn) {
					case 1:
						
						
						break;
					case 2:
						
						
						break;
					case 3:
						System.out.println("              exiting              ");
						System.out.println();
						flag2=false;
						break;
					default :
						System.out.println("       value is out of range           ");
						System.out.println();
						break;
					}
				}
				
			}else if(nTemp==3) {
				
				
			}else if(nTemp==4){
				
			}else if(nTemp==5) {
				System.out.println("         End of program              ");
				System.out.println();
				flag= false;
			}else {
				System.out.println("input value is out of range");
				System.out.println();
			}
			
		
			
			
		}
		
		sc.close();
	}

}
