package oop9;

/*
 * 추상클래스 -> 기획서에 대한 미완성 설계도를 일컷는다.
 * 모든 모니터가 공통적으로 가지는 속성 혹은 기능을 구현함으로써 자식클래스의 구현부담을 감소시킨다.
 * 자식클래스마다 조금씩 다르게 구현되는 기능을 자식클래스에서 직접 재정의 하도록 한다.
 * 추상클래스에서 해당기능을 별도로 구현하지 않고, 자식 클래스에게 구현을 위임한다.
 */
public abstract class AbstractMonitor implements Monitor{

	public boolean power;
	
	
	@Override
	public void off() {
		// TODO Auto-generated method stubㅣㅣㅣ
		
		power = false;
		System.out.println("전원을 끕니다.");
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		power = true;
		System.out.println("전원을 켭니다.");
		
	}

	public boolean getPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	//Monitor 인터페이스의 void display() 기능의 구현은 자식 클래스에게 위임한다.
}
