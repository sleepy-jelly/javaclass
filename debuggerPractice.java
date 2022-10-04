
public class debuggerPractice {

	public static void main(String[] args) {
		int dan = 2;
		int mul = 1;

		for(int i =0; i<8; i++) {
			for(int j =0; j<9;j++) {
				System.out.println(dan+ " x "+ mul+" = "+dan*mul);
				mul++;
			}
			dan++;
			mul=1;
		}
	}
	
	
	

}
