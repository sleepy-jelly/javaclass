import java.util.Scanner;
public class class0928_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		gugu(sc.nextInt());
		sc.close();
	}
	static void gugu(int nData) {
		for(int i=1;i<10;i++) {
			System.out.println(nData + " x " + i + " = " + nData * i);
		}
	}
}
