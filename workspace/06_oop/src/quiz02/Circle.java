package quiz02;

public class Circle {

	// field        이런걸 포함관계라고한다. 포함관계는 상속으로도 구현할 수 있다. 
	private Coord center;
	private double radius;
	
	// constructor
	public Circle (Coord center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle (int x, int y, double radius) {
		this.center = new Coord(x, y);     //this가 꼭 붙을 필요는 없지만 통일성을 위해 써줌
		this.radius = radius;      // this(new Coord(x, y), raidus);  이렇게 할수도 있음. new Coord는 꼭 해줘야함.  
		
	}
	
	
	
	// method
	public double getArea() {    // 눈에 안보였던것
		return Math.PI * Math.pow(radius, 2);			
	}
	public void info() {   // 눈에 보였던것
		System.out.print("중심좌표 ");
		center.info();     // [0, 0]
		System.out.println(", 반지름: " + radius + ", 넓이: " + getArea());
	}
}
