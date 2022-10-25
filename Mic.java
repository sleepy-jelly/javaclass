package after1024;

public interface Mic {

	
	
	public void initMic();
	public boolean TurnON_Mic();
	public void TurnOFF_Mic();
	
	default void Checking_Mic() {
		
		System.out.println("having Mic ");
		
		
	}
	
	
}
