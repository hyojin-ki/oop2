package oop3;

public class PhoneDemo {

	public static void main(String[] args) {
		/*
		 * 클래스의 형변환(참조변수 형변환)
		 * 클래스의 형변환은 상속관계에 있는 클래스에서만 가능하다.
		 * 
		 * 자동형변환
		 * 	자손타입의 객체는 그 객체의 클래스타입 변수와
		 * 	그 객체의 조상 클래스타입 변수에 담을 수 있다.
		 * 수동형변환
		 * 	자손타입의 객체를 생성해서 조상타입의 변수에 저장했을때,
		 *  특정 위치의 자손객체의 참조값을 획득해야 하는 경우
		 *  형변환 연산자를 이용해서 특정 자손객체의 참조값을 획득할 수 있다.
		 *  
		 * 조상 변수1 = new 자손();
		 * 자손 변수2 = (자손)변수1;
		 */
		
		
		
		Iphone p1 = new Iphone();
		SmartPhone p2 = new Iphone();
		FeaturePhone p3 = new Iphone();
		Phone p4 = new Iphone();
		
		//Iphone 타입은 자기 자신이나 자신의 조상 타입의 객체만 담을 수 있다.
		//Galaxy p5 = new Iphone();
		
		
		p1.userid = "hong";						//iphone 	p1
		p1.password = "abcd1123";				//iphone	p1
		p1.siri();								//iphone	p1
		
		p1.ip = "192.168.18.21";				//smartphone	p1	p1
		p1.email ="honggd@gmail.com";			//smartphone	p1	p1
		p1.email();								//smartphone	p1	p1
		p1.internet();							//smartPhone	p1	p1
		
		p1.pixel = "천만화소";						//FeaturePhone	p1	p1	p3
		p1.photo();								//				p1	p1	p3
		
		p1.tel="010-1234-5677";					//phone			p1	p1	p3	p4
		p1.call();								//				p1	p1	p3	p4
		p1.receive();							//0				p1	p1	p3	p4
				
		
		
	}
}
