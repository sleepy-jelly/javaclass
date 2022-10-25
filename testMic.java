package after1024;

public class testMic extends WebCam{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebCam wc = new WebCam();
		
		wc.initMic();
		wc.TurnON_Mic();
		wc.TurnOFF_Mic();
		wc.Checking_Mic();

		
		
		wc.initCam();
		wc.TurnON_Cam();
		wc.TurnOFF_Cam();
		
	}

}
