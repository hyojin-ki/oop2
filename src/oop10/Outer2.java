package oop10;

public class Outer2 {

	int x;
	static int y;
	void m1(){
		
	}
	
	static void  m2() {
		
	}
	
	static class Inner2{
		int a;
		static int b;
		void m3() {
			
		}
		static void m4() {
			
		}
		void m5() {
			//System.out.println(x);
			System.out.println(Outer2.y);
			
			//m1();
			Outer2.m2();
			
			System.out.println(a);
			System.out.println(Inner2.b);
			
			m3();
			m4();
		}
	}
}
