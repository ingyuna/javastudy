package ex12_abstract;

public class Rectangle extends Shape {   // 직사강형은 도형이다. is_a 관계
	
	// field
	private int width; // 너비
	private int height; // 높이
	
	// constructor
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// method
	@Override
	public double getArea() {
		return width * height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
