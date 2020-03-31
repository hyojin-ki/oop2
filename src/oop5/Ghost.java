package oop5;

public class Ghost extends Unit{

	
	@Override
	void attack() {
	// TODO Auto-generated method stub
		System.out.println("["+name+"]은 은신한 상태로 적을 암살합니다.");
	}
	
	void nuclear() {
		System.out.println("핵 쏨");
	}

}
