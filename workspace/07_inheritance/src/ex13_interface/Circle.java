package ex13_interface;

public class Circle implements Shape {

	private double radius;
	
   


 // constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}





	@Override
	public double getArea() {
		
		return Math.PI * Math.pow(1.5, 2);
	}

}
