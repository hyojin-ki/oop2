package oop9;

public class MonitorDemo {

	public static void main(String[] args) {
		
//		NormalMonitor m1 = new NormalMonitor();
//		m1.on();
//		m1.display();
//		m1.off();
		
		HDMonitor m2 = new HDMonitor("4k");
		m2.on();
		m2.display();
		m2.off();
		
		CinemaMonitor m3 = new CinemaMonitor("200인치");
		m3.on();
		m3.display();
		m3.off();
		
		LCDCinemaMonitor m4 = new LCDCinemaMonitor("200인치", 50);
		m4.on();
		m4.touch();
		m4.display();
		m4.volumeUp();
		m4.volumeUp();
		m4.display();
		m4.off();
		
		
		
	}
}
