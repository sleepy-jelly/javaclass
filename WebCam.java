package after1024;

public class WebCam implements Mic,Cam{

	@Override
	public void initCam() {
		System.out.println("캠 초기화");
		
		
	}

	@Override
	public boolean TurnON_Cam() {
		
		System.out.println("캠 키기");

		return true;
	}

	@Override
	public void TurnOFF_Cam() {
		System.out.println("캠 끄기");

	}

	@Override
	public void initMic() {
		System.out.println("마이크 초기화");

	}

	@Override
	public boolean TurnON_Mic() {
		System.out.println("마이크 키기");

		return true;
	}

	@Override
	public void TurnOFF_Mic() {
		System.out.println("마이크 끄기");

		
	}

}
