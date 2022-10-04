import java.util.Scanner;
public class class0928_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		for (int j =2; j<=9;j++){
		gugu(j);
		}
		sc.close();
	}
	static void gugu(int nData) {
		int nCounter=1; 
		for(int i=0;i<9;i++) {
			System.out.println(nData + " x " + nCounter + " = " + nData * nCounter);
			nCounter++;
		}
	}
}
