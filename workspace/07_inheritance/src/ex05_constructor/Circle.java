package ex05_constructor;

public class Circle extends Coord {
							
	// field
	private double radius;
	
	// constructor
	public Circle(int x, int y, double radius) {
					// = super(x, y);  이 코드는 Circle이 처리하지 않고 super 클래스가 한다.
		super(x,y); // Coord 클래스의 생성자를 호출
		this.radius = radius;
		
	}
	
	// method
	public void info() {
		System.out.println("중심좌표: [" + getX() + ", " +  getY() + "]");
		System.out.println("반지름: " + radius);
	}
	
	
}
