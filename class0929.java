import java.util.Arrays;  //<- if you want to array (is okay to skip tho)
public class class0929 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		genLotto(lotto);
		
		Arrays.sort(lotto);      // <- for array (disable atm)
		for(int i =0; i<6;i++) {
			System.out.println(lotto[i]);
		}
	}
	
	/*static void genLotto(int[] nData) {
		int nRanNum=0;
		int nMax=nData.length;
		for(int i =0; i<nMax;i++) {
			nRanNum=(int) (Math.random()*45)+1;
			nData[i] =nRanNum;
			for(int j=0;j<i;j++) {
				if(nData[i]==(nData[j])) {
					i--;
					break;
				}
			}
		}
	}*/
	
	static void genLotto(int[] nData) {
		int nRanNum=0;
		int j=1;
		int nMax=nData.length;
		for(int i =0; i<nMax;i++) {
			nRanNum=(int) (Math.random()*45)+1;
			nData[i] =nRanNum;
			while(j<i){
				if(nData[i]==nData[j]) {
					i--;
					break;
				}
				j++;
			}
			j=0;
		}
	}
}

