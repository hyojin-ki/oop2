package oop9;

public class HDMonitor extends  AbstractMonitor{
	
	private String reasolution;
	
	public HDMonitor(String resolution) {
		this.reasolution = resolution;
	}
	
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		if(!getPower()) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		
		System.out.println("["+this.reasolution+"]화질로 동영상을 표시합니다.");
	}
	
	
}
