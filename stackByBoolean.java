
public class stackByBoolean {
	public static void main(String[] args) {
		int[] si = new int[2];   // si[0]  for StackPointer . si[1] for StackCounter;
		si[0] =1;

		int[] nData = new int[10];
		int nPushData= 100;
 		System.out.println(push(nData,si,nPushData++));
 		System.out.println(push(nData,si,nPushData++));
 		System.out.println(push(nData,si,nPushData++));
		printStack(nData,si);
		System.out.println(si[0]);
		System.out.println();

		
		
 		System.out.println(push(nData,si,nPushData++));
 		System.out.println(push(nData,si,nPushData++));
		printStack(nData,si);
		System.out.println(si[0]);
		System.out.println();


		
		System.out.println(pop(nData,si));
		System.out.println("popped:"+si[1]);
		printStack(nData,si);
		System.out.println(si[0]);

		for(int i=0; i<11;i++) {
		System.out.println(push(nData,si,nPushData++));
		}
 		printStack(nData,si);
		System.out.println(si[0]);
		System.out.println();
		
		
		for(int i=0; i<11;i++) {
			System.out.println(pop(nData,si));
			System.out.println("popped:"+si[1]);

		}
 		printStack(nData,si);
		System.out.println(si[0]);	
		System.out.println();


		
	}
	public static boolean push(int[]nData,int[] si, int data) {
		if(nData.length>si[0]) {
			nData[si[0]]= data;
			si[0]++;
			return true;
		}
		return false;
	}
	
	public static boolean pop(int[]nData, int[] si) {
		if(si[0]>0) {
			si[1]=nData[si[0]-1];
			nData[si[0]-1]=0;
			si[0]--;
			return true;
		}
		si[1]=0;
		return false;
	}
	static void printStack(int[]nStack,int[] si){
		for(int i =0;i<nStack.length;i++) {
			System.out.println("Stack ["+i+"] value ="+nStack[i]);
		}
		System.out.println("Total data count"+si[0]);
	}
	
	
}
