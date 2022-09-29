


public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		
		int[] scores=new int[] {83,90,87};
		
		int sum=0;
		for(int i =0; i<3; i++) {
			sum=sum+ scores[i];
		}
		double avg = ((double)sum)/scores.length;
		System.out.println("sum is = "+sum+"\navg is = "+avg);
	}
}
