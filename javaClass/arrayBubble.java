package kimdohyeong;

public class arrayBubble {
	
	////////////////////////////////
	// sorting by bubble sort (ASCENDING)
	////////////////////////////////	
	
	public void bubbleASC(int[] arr) {
		int nTemp=0;
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1])
				{
					nTemp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= nTemp;
				}
			}
			
			
		}
		
	}
	
	
	
	////////////////////////////////
	// 	DESCENDING
	////////////////////////////////
	public void bubbleDESC(int[] arr) {
		int nTemp=0;
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr.length-1;j++) {
				if(arr[j]<arr[j+1])
				{
					nTemp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= nTemp;
				}
			}
		}
	}
	
	
}
