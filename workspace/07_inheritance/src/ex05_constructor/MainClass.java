package ex05_constructor;

public class MainClass {

	public static void main(String[] args) {
		
		  Circle c = new Circle(1, 1, 1.5);   // 항상 서브클래스만 확인하면 된다. 알아서 슈퍼클래스를 호출해주니까. 
		  c.info();                 
		
		

	}

}
