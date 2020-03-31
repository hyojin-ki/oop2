package oop2;

public class ContactDemo {

	public static void main(String[] args) {
		
		Contact c1 = new Contact("홍길동","010-1234-5678","gdhong@daum.net");
		Contact c2 = new Contact("김유신","010-7656-1231","yusink@gmail.com");
		Contact c3 = new Contact("강감찬","010-1994-0453","ggchan@naver.com");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
