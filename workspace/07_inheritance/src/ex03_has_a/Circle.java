package ex03_has_a;

public class Circle extends Coord{

	// field
	private double radius;
	
	// method
	public void setCircle(int x, int y, double radius) {
		// Coord 클래스의 set() 메소드는 x, y 좌표값을 저장하는 메소드입니다.
		// Circle 클래스는 Coord 클래스를 상속받았기 때문에,
		// Coord 클래스의 모든 메소드를 자신의 것처럼 사용할 수 있다.
		set(x, y);  // Coord 클래스의 set() 메소드를 자신의 것처럼 호출합니다.
		this.radius = radius;
	}
	public void circleInfo() {
		System.out.print("중심좌표: ");
		info();   // Coord 클래스의 circleInfo 메소드를 자신의 것처럼 호출합니다.
		System.out.println("반지름: " + radius);
	}
	
}
