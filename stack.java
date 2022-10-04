
public class stack {
	
	public static void main(String[] args) {
		int[] nArray = new int[10];
		int sP = 0;
		int i=1;
		sP=push(nArray,sP,i++);
		printStack(nArray);
		System.out.println();

		sP=pop(nArray,sP);
		printStack(nArray);
		System.out.println();
		
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		sP=pop(nArray,sP);
		printStack(nArray);
		System.out.println();

		
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		printStack(nArray);		
		System.out.println();
		
		
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		sP=push(nArray,sP,i++);
		printStack(nArray);		
		System.out.println();
		
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		printStack(nArray);
		System.out.println();
		
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		sP=pop(nArray,sP);
		printStack(nArray);
		System.out.println();
	}
	static int push(int[] nStack,int stackPointer,int pushData) {
		if(stackPointer<nStack.length) {
			nStack[stackPointer] = pushData;
			stackPointer++;
			return stackPointer;
		}
		System.out.println("Error Stack Overflow / push is not unable");
		return stackPointer;
	}
	static int pop(int[] nStack,int stackPointer) {
		if(stackPointer>0) {
			nStack[stackPointer-1] = 0;
			stackPointer--;
			return stackPointer;
			
		}
		System.out.println("Error Stack Underflow / pop is not unable");
		return stackPointer;
	}
	static void printStack(int[]nStack) {
		for(int i =0;i<nStack.length;i++) {
			System.out.println("Stack ["+i+"] value ="+nStack[i]);

		}
	}
	
}
