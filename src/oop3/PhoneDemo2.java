package oop3;

import java.util.Scanner;

public class PhoneDemo2 {

	public static void main(String[] args) {
		/**
		 * Iphone p1 = new Iphone();
		 * Iphone 객체를 생성해서 모든 멤버를 사용하겠다.
		 * 
		 * 인터넷 기능이 지원되믄 SmartPhone류 객체를 
		 * 생성해서 SmartPhone타입의 변수에 저장하고 
		 * SmartPhone류들이 지원하는 멤버를 사용
		 * SmartPhone p1 = new SmartPhone();
		 * SmartPhone p2 = new Iphone()
		 * SmartPhone p3 = new Galaxy();
		 * 
		 * SmartPhone기능도 되면서 Iphone기능, Galaxy기능도 되는 객체를 만들어서
		 * 각 객체들을 비교할 수 있다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		SmartPhone testPhone = null;
		System.out.println("인터넷 기능을 테스트할 폰을 선택하세요. 테스트를 진행해드립니다.");
		System.out.print("1.그냥 스마트폰	2.아이폰	3.갤럭시");
		int no  = scanner.nextInt();
		
		if(no==1) {
			testPhone = new SmartPhone();
		}else if(no == 2) {
			testPhone = new Iphone();
		}else if(no == 3) {
			testPhone = new Galaxy();
		}
		
		if(testPhone != null) {
			testPhone.internet();
		}else {
			System.out.println("잘못된 번호를 입력하셨습니다.");
		}
		
		
		FeaturePhone p1 = new FeaturePhone();
		p1.photo();
		
		p1 = new SmartPhone();
		p1.photo();
		
		p1 = new Iphone();
		p1.photo();
		
		p1 = new Galaxy();
		p1.photo();
	}
}
