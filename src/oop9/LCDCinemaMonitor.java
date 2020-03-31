package oop9;

public class LCDCinemaMonitor extends AbstractMonitor implements Speakable, Tochable{
	
	
	private String screenSize;
	private int volume;
	
	public LCDCinemaMonitor() {
		
		screenSize = "30인치";
		volume = 30;
	}
	
	public LCDCinemaMonitor(String screenSize, int volume) {
		this.screenSize = screenSize;
		this.volume = volume;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("["+screenSize+"] 크기의 LCD 시네마 모니터로 동영상을 재생합니다.");
		sound();
	}
	
	@Override
	public void touch() {
		// TODO Auto-generated method stub
		System.out.println("화면의 메뉴를 터치해서 장면을 전환합니다.");
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("소리를 재생합니다.");
	}
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(volume<Speakable.MAX_VOLUME) {
			volume += 5;
		}
		
	}
	
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub

		if(volume>Speakable.MIN_VOLUME) {
			volume -= 5;
		}
	}
}
