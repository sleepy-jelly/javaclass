public class class0928_2 {
	public static void main(String[] args) {
		isPrimeNumber((int)(Math.random()*100)+1);
	}
	static void isPrimeNumber(int nData) {
		if(nData==1) {
			System.out.println(nData+" is not a Prime Number");	
			return;
		}
		for(int i =2; i<nData;i++) {
			if(nData%i==0) {
				System.out.println(nData+" is not a Prime Number");	
				return;
			}
		}
		System.out.println(nData+" is a Prime Number");
	}
}

