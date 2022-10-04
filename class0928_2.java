public class class0928_2 {
	public static void main(String[] args) {
		int nRanNum= (int)(Math.random()*100)+1;
		boolean nPrimeNumber =isPrimeNumber(nRanNum);
		String nString = (nPrimeNumber ? nRanNum+" is Prime number" : nRanNum+" is not PrimeNumber");
		System.out.println(nString);
	}
	static boolean isPrimeNumber(int nData) {
		boolean primeNumber= false;
		if(nData==1) {
			return primeNumber;
		}
		for(int i =2; i<nData;i++) {
			if(nData%i==0) {
				primeNumber= false;
				return primeNumber;
			}
		}
		primeNumber = true;
		return primeNumber;
	}
}

