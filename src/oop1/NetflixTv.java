package oop1;

public class NetflixTv extends IPTv{

	String membership;
	
	//membership.equals("basic")도 가능하지만 아래 처럼 적는걸 권장함
	//왜냐하면 "basic"은 문자열이 확실하지만 membership은 null일수도 있어서 에러.
	void watchMovie(String title) {
		if("basic".equals(membership)) {
			System.out.println("표준 화질로 시청 중");
		}else if("standard".equals(membership)) {
			System.out.println("HD화질로 시청 중");
		}else if("preminum".equals(membership)) {
			System.out.println("UHD 4k화질로 시청 중");
		}
	}
}
