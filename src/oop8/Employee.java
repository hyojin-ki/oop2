package oop8;

public class Employee extends Person{

	private String dept;
	private String position;
	private int salary;
	
	public Employee() {
		
	}
		
	public Employee(String name, String email, String dept, String position, int salary) {
		/*
		 * super()는 부모클래스의 생성자를 가르킨다
		 * 자식 클래스에서 부모클래스의 생성자를 호출해야 할 때 쓰인다.
		 * super() 메소드는 메소드의 첫번째 수행문으로만 사용할 수 있다. 하극상따윈 불허한다.
		 * 모든 자식 클래스의 생성자에서는 부모클래스의 기본 생성자를 자동으로 호출하는 super()가 숨겨져 있다.
		 */
		super(name, email);
		
		this.dept = dept;
		this.position = position;
		this.salary = salary;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		
		System.out.println("### Employee의 printInfo() ###");
		System.out.println("부서: "+dept);
		System.out.println("직위: "+position);
		System.out.println("급여: "+salary);
		
	
	}
}
