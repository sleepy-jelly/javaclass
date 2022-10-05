package javaClass;

import java.util.Scanner;

public class class1005 {

	public static void main(String[] args) {
		class1005Student st1= new class1005Student();
		Scanner sc = new Scanner(System.in);
        st1.RESET();                        /// st1 객체 내부 배열 초기화 작업



		boolean flag=true;
		boolean flag2=true;
		
		int nPointer = 0;
		
		while(flag) {
			System.out.println("Student Mangement Program");
			System.out.println();
			System.out.println("Setting by pointer-----------1");
			System.out.println("Setting by Module------------2");
			System.out.println("Showing by pointer-----------3");
			System.out.println("Showing by Module------------4");
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
                    System.out.println("input studenet Name, pointer(integer)");
                    String nTempName = sc.next();
                    nPointer = sc.nextInt();
                    st1.setName(nTempName, nPointer);
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

				System.out.println("       Setting by Module              ");
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
                        System.out.println("input name, student number, kor , eng, math, pointer");
                        String newName=sc.next();
                        int newStudentNumber=sc.nextInt();
                        int newKorScore =sc.nextInt();
                        int newEngScore = sc.nextInt();
                        int newMathScore = sc.nextInt();
                        int newPointer =sc.nextInt();
						st1.setFull(newName, newStudentNumber, newKorScore, newEngScore, newMathScore, newPointer);
						break;
					case 2:
						System.out.println("Reset all setting? type 1 to confirm");
                        int finalCheck= sc.nextInt();
                        if(finalCheck==1){
                           st1.RESET();
                            System.out.println("Reseted all setting");
                        }else{
                            System.out.println("Reset canceled");
                        }
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
                System.out.println("Showing by pointer-----------3");
                System.out.println();
                flag2=true;
                while(flag2){
                    System.out.println("         Showing by pointer              ");
				    System.out.println();
				    System.out.println("Show student number by pointer-1");
				    System.out.println("Show student name by pointer---2");
			    	System.out.println("Show kor score by pointer------3");
			    	System.out.println("Show eng score by pointer------4");
			    	System.out.println("Show math score by pointer-----5");
                    System.out.println("Show average score by pointer--6");
                    System.out.println("Show total score by pointer----7");
			    	System.out.println("Exit---------------------------8");
			    	System.out.println();
                    
                    int newSelcect =sc.nextInt();
                    int newPointer2=0;

                    switch(newSelcect){
                        case 1:
                        System.out.println("Show student number by pointer");
                        System.out.println();
                        System.out.println("Input pointer(integer)");

                        newPointer2=sc.nextInt();
                        System.out.println("student number: "+st1.getStuNum(newPointer2));
                        break;

                        case 2:
                        System.out.println("Show student name by pointer");
                        System.out.println();
                        System.out.println("Input pointer(integer)");


                        newPointer2=sc.nextInt();
                        System.out.println("student name: "+st1.getName(newPointer2));
                        break;

                        case 3:
                        System.out.println("Show kor score by pointer------3");
                        System.out.println();
                        System.out.println("Input pointer(integer)");


                        newPointer2=sc.nextInt();
                        System.out.println("kor score : "+st1.getKor(newPointer2));
                        break;


                        case 4:
                        System.out.println("Show eng score by pointer------4");
                        System.out.println();
                        System.out.println("Input pointer(integer)");


                        newPointer2=sc.nextInt();
                        System.out.println("eng score : "+ st1.getEng(newPointer2));
                        break;


                        case 5:
                        System.out.println("Show math score by pointer-----5");
                        System.out.println();
                        System.out.println("Input pointer(integer)");


                        newPointer2=sc.nextInt();
                        System.out.println("math score : "+st1.getMath(newPointer2));
                        break;


                        case 6:
                        System.out.println("Show average score by pointer--6");
                        System.out.println();
                        System.out.println("Input pointer(integer)");


                        newPointer2=sc.nextInt();
                        System.out.println("average score : "+st1.getAvg(newPointer2));
                        break;


                        case 7: 
                        System.out.println("Show total score by pointer----7");
                        System.out.println();
                        System.out.println("Input pointer(integer)");


                        newPointer2=sc.nextInt();
                        System.out.println("total score : "+st1.getSum(newPointer2));
                        break;


                        case 8:
                        System.out.println("Exit");
                        System.out.println();

                        flag2=false;
                        break;

                        
                        default:
                        System.out.println("       value is out of range           ");
						System.out.println();

                        break;
                    }



                }

			}else if(nTemp==4) {
                System.out.println("Showing by Module");
                System.out.println();
                flag2=true;
                while(flag2){
                    System.out.println("Showing by Module----1");
                    System.out.println("Exit---------------------2");
                    int nSelect= sc.nextInt();
                    switch(nSelect){
                        case 1:
                            System.out.println("Input Pointer(Integer)");
                            System.out.println();
                            int newPointer2=sc.nextInt();
                            st1.getFullByString(newPointer2);
                            

                        break;

                        case 2:
                        System.out.println("Exiting.........");
                        System.out.println();


                        flag2=false;
                        break;

                        default :
                        System.out.println("       value is out of range           ");
						System.out.println();

                        break;
                    }

                }


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