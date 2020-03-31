package oop3;

public class IphoneTester {

	void testIphone(Iphone p) {
		p.applemusic();
		p.siri();
		
		//p에 전달된 객체가 Iphone8이라면 지문인식기능 실행
		//p에 전달된 객체가 IphoneX라면 얼굴인식기능 실행
		//p에 전달된 객체가 Iphone11이라면 카메라기능 실행

		if(p instanceof Iphone11) {			
			((Iphone11)p).tripleCamera();
			System.out.println("아이폰11의 짱 좋은 카메라 기능 테스트 완료");					
		}else if(p instanceof IphoneX) {
			((IphoneX)p).FaceScan();	
			System.out.println("아이폰x의 얼굴인식기능 테스트 완료");
		}else if(p instanceof Iphone8) {
			Iphone8 i8 = (Iphone8)p;	//p가 참조하는 객체에서 Iphone8객체에서
										//Iphone8객체를 찾아서 형변환
										//그 객체의 주소값을 반환	
			i8.fingerScan();		
			System.out.println("아이폰8의 지문인식기능 테스트 완료");
		}
	}
}
