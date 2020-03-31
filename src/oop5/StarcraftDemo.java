package oop5;

public class StarcraftDemo {

	public static void main(String[] args) {
		
		Unit ghost = new Ghost();
		ghost.name = "ghost";
		ghost.attack();
	
		
		Ghost ghost2 = new Ghost();
		ghost2.name = "realGhost";
		ghost2.nuclear();
		
		
	}
}
