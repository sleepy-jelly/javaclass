import java.util.Scanner;
public class star_reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nSize=sc.nextInt(); //user input size of star Length, Height;
		
		int spaceCnt = nSize -1; // we need 1 space end of line star
		int starCnt = 1; // at least we need 1 star
		
		for(int i=0; i<nSize;i++) {
			for(spaceCnt=nSize-1;spaceCnt>i;spaceCnt--) {
				System.out.print(" ");
			}
			for(int j=0; j<starCnt;j++) {  // +1 loop after each loop ,start with once
				System.out.print("*");
			}
			starCnt++;
			System.out.println();
		}
		
		
		
		
		
		
		
		sc.close();
	}
		
}
	
