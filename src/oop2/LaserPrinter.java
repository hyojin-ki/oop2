package oop2;

public class LaserPrinter extends Printer{

	int dpi;
	
	@Override
	void print() {
		System.out.println("고품질의 해상도를 가진 레이저로 내용을 출력합니다.");
	}
}
