	import java.util.Arrays;  //<- if you want to array (is okay to skip tho)

public class betterlotto {
		public static void main(String[] args) {
			int[] lotto = new int[6];
			genLotto(lotto);
			
			Arrays.sort(lotto);      // <- for array (disable atm)
			for(int i =0; i<6;i++) {
				System.out.println(lotto[i]);
			}
		}

		static void genLotto(int[] nData) {
			
			int nRanNum=0;
			int i =0;
			int nMax=nData.length;
			
			while(i<nMax) {
				
				nRanNum=(int) (Math.random()*45)+1;
				nData[i] =nRanNum;
				
				if(isExist2(nData,nRanNum)==true) {
					i--;
				}
				
				i++;
			}
		
			
		}

		
	static boolean isExist2(int[]nData,int nNumber) {
		int nCounter =0;
		
		for(int i=0; i<nData.length;i++) {
			
			if(nData[i]==nNumber) {
				nCounter++;
			}
			
			if(nCounter==2) {
				return true;
			}
		}
		return false;
	}
}



