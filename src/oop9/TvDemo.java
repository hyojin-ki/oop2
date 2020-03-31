package oop9;



/*
 * 인터페이스를 쓰는 이유
 * 구현 클래스의 표준을 만들기 위해, 모니터 클래스 쓰는 놈들은 전부 모니터의 형식에 맞게 한다.
 * 클래스간의 결합을 느슨하게 하기 위해
 * 	결합도가 느슨하다. 유지보수가 쉽다. 확장성이 높다.
 * 	호환성이 좋다.
 * 	ex) usb 표준처럼. 사용법이 똑같다.
 * 
 * 
 */

public class TvDemo {

	public static void main(String[] args) {
		
		NormalMonitor m1 = new NormalMonitor();				//monitor 인터페이스 구현
		HDMonitor m2 = new HDMonitor("4k");					//monitor 인터페이스 구현
		CinemaMonitor m3 = new CinemaMonitor();				//monitor, speakable 인터페이스 구현
		LCDCinemaMonitor m4 = new LCDCinemaMonitor();		//monitor, speakable, touchable 구현
		
		
		
		NormalTv tv1 = new NormalTv(m1);
		NormalTv tv2 = new NormalTv(m2);
		NormalTv tv3 = new NormalTv(m3);
		NormalTv tv4 = new NormalTv(m4);
		
//		CinemaTv tv5 = new CinemaTv(m1);
//		CinemaTv tv6 = new CinemaTv(m2);
		CinemaTv tv7 = new CinemaTv(m3);
		CinemaTv tv8 = new CinemaTv(m4);
	}	
}
