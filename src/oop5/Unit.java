package oop5;

//추상클래스 정의
public abstract class Unit {
	String name;
	
	void move() {
		System.out.println("["+name+"]이 지정한 포인트로 이동합니다.");
	}
	
	//추상메소드 정의
	abstract void attack();
}
