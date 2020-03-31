package oop9;

public class NormalTv {
	
	private Monitor monitor; 	//monitor류를 담는 멤버변수
	
	public NormalTv(Monitor monitor) {		//생성자 실행시 Monitor를 구현한 객체를 전달받는다.
		this.monitor = monitor;				// NormalMonitor, HDMIMonitor, CinemaMonitor, LCDCinemaMonitor
	}
	
	
	public void watch() {
		//Monitor 인터페이스를 기준으로 프로그램을 작성한다.
		//on, display
		monitor.on();
		monitor.display();
		
		//monitor.display()를 실행하면
		//실제 멤버변수에 조립된 객체가 NoemalMonitor라면 --->컬러로 동영상 재생
		//						HDMonitor라면 -----> 4k로 동영상 재생
		//						CinemaMonitor라면 ---->100인치 화면에서 동영상 재생
		//						LCDMonitor라면 ------>터치가 가능한 100인치 화면에서 동영상 재생
		/*
		 * polymorphism
		 *  1. 조상타입의 참조변수로 여러가지 형태의 자손타입 객체를 참조할 수 있다는 의미
		 *  2. 실행하는 메소드는 동일하지만, 조상타입의 참조변수에 실제로 조립된 객체의 재정의된 내용이 실행된다. 
		 */
		System.out.println();
	}
}
