package oop7.sub;

//클래스는 public
public class Modifier {

	//멤버변수는 private
	private int a;
	int b;
	protected int c;
	public int d;
	
	//가능하면 생성자는 public으로 선언	
	public Modifier() {
		
	}
	
	//외부에 공개할 내용은 public
	//클래스 내부에서만 사용할 멤버메소드는 private
	//클래스 변수(상수)는 public
	//클래스 메소드는 public
}
