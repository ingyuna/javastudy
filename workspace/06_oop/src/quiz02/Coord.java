package quiz02;

public class Coord {    // x, y를 클래스로 구성한것. 좌표 만들기 
	
	// field
	private int x;
	private int y;
	
	
	// constructor
	
	public Coord (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// method
	
	public void info() {
		System.out.print("[" + x + ", " + y + "]");
	}
	
	
	

}
