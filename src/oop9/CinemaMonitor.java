package oop9;

public class CinemaMonitor extends AbstractMonitor implements Speakable{

	private String screenSize;
	private int volume;
	
	

		


	public CinemaMonitor() {
		screenSize="100인치";
	}
	
	public CinemaMonitor(String screenSize) {
		this.screenSize = screenSize;
	}

	public CinemaMonitor(String screenSize, int volume) {
		this.screenSize = screenSize;
		this.volume = volume;
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(!powerCheck()) {			
			return;
		}
		
		System.out.println("["+this.screenSize+"크기의 스크린으로로 동영상을 표시합니다.");
		sound();
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		if(!powerCheck()) {			
			return;
		}
		
		System.out.println("["+this.volume+"으로 소리를 재생합니다.");
	}
	
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if(!powerCheck()) {			
			return;
		}
		
		volume -= 5;
		if(volume < Speakable.MIN_VOLUME) volume = Speakable.MIN_VOLUME;
		System.out.println("현재 볼륨: "+volume);
		
	}
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(!powerCheck()) {			
			return;
		}
		
		volume += 5;
		if(volume > Speakable.MAX_VOLUME) volume = Speakable.MAX_VOLUME;
		System.out.println("현재 볼륨: "+volume);
	}
	

	
	private boolean powerCheck() {
		
		boolean isPower = false;
		if(!this.power) {
			System.out.println("전원이 꺼져있습니다.");
		}else {
			isPower = true;
		}
		
		
		return isPower;
	}
	
}
