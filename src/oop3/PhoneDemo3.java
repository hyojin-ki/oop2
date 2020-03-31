package oop3;

public class PhoneDemo3 {

	public static void main(String[] args) {
		/*
		 * Iphone p = new Iphone()
		 * 
		 * p가 참조하는 객체가 --타입의 객체인가?
		 * p instanceof Iphone			true
		 * p instanceof Galaxy			false
		 * p instanceof SmartPhone		true
		 * p instanceof Phone			true
		 */
		
		Phone p = new Iphone8();
		
		System.out.println("Phone --> "+ (p instanceof Phone));
		System.out.println("FeaturePhone --> "+ (p instanceof FeaturePhone));
		System.out.println("SmartPhone --> "+ (p instanceof SmartPhone));
		System.out.println("IPhone --> "+ (p instanceof Iphone));
		System.out.println("Galaxy --> "+ (p instanceof Galaxy));
		System.out.println("IPhone8 --> "+ (p instanceof Iphone8));
		System.out.println("IPhoneX --> "+ (p instanceof IphoneX));
		System.out.println("IPhone11 --> "+ (p instanceof Iphone11));
		
	}
}
