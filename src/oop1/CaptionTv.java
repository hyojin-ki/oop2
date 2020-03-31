package oop1;

public class CaptionTv extends Tv {
	
	boolean caption;
	
	public CaptionTv() {
		super();
	}
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
