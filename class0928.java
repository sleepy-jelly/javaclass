import java.util.Scanner;
public class class0928 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nInt1 =sc.nextInt();
		int nInt2 =sc.nextInt();
		
		System.out.println("add result = "+add(nInt1,nInt2));
		System.out.println("addEven result = "+addEven(nInt1,nInt2));
		System.out.println("addOdd result = "+addOdd(nInt1,nInt2));
		
		
		sc.close();
	}
	static int add(int n1, int n2) {
		int total =0;
		total = n1+n2;
		return total;
	}
	static int addEven(int n1, int n2) {
		int result =0;
		for(int i=Math.min(n1, n2); i<Math.max(n1, n2)+1;i++) {
			if(i%2==0) {
				result= result+i;
				System.out.println(i);
			}
		}
		return result;
	}
	static int addOdd(int n1, int n2) {
		int result =0;
		for(int i=Math.min(n1, n2); i<Math.max(n1, n2)+1;i++) {
			if(i%2==1) {
				result=result+i;
				System.out.println(i);

			}
		}
		return result;
		
		
	}

}
