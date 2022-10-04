import java.util.Scanner;
public class class1004 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] nArray= new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		for(int i =0; i<nArray.length; i++) {
			for(int j =0;j<nArray[0].length;j++) {
				System.out.print(nArray[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//problem 1 end problem 2 start
		
		
		double sumKorean =0;
		double sumEnglish = 0;
		double sumMath =0;
		double avg1[] = new double[6];
		int[][] nArray2 = new int[][] {{78,55,78,60,99,77},{78,56,95,90,33,66},{77,88,74,93,57,80}};
		
		
		
		for(int j =0;j<nArray2[0].length;j++) {
			sumKorean=sumKorean+ nArray2[0][j];
			sumEnglish=sumEnglish+nArray2[1][j];
			sumMath=sumMath+nArray2[2][j];	
		}
			
			
			
		for(int i =0; i<nArray2[0].length; i++) {
			avg1[i]=nArray2[0][i]+nArray2[1][i]+nArray2[2][i];
		}
		
		
		System.out.printf("Korean aver: %.2f\n",(sumKorean/nArray2[0].length));
		System.out.printf("English aver: %.2f\n",(sumEnglish/nArray2[0].length));
		System.out.printf("Math aver: %.2f\n",(sumMath/nArray2[0].length));
		System.out.println();
		
		
		System.out.printf("1st grade season1: %.2f\n",avg1[0]/3);
		System.out.printf("1st grade season2: %.2f\n",avg1[1]/3);
		System.out.printf("2nd grade season1: %.2f\n",avg1[2]/3);
		System.out.printf("2nd grade season2: %.2f\n",avg1[3]/3);
		System.out.printf("3rd grade season1: %.2f\n",avg1[4]/3);
		System.out.printf("3rd grade season2: %.2f\n",avg1[5]/3);
		
		
		
				
		sc.close();
		
	}
}
