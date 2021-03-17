package ex03_has_a;

// has - a 관계도 상속으로 처리할 수 있습니다.
// Circle has a Coord (원은 점을 가지고 있다.(포함한다.))

// Coord 클래스를 슈퍼클래스로 지정하고,
// Circle 클래스를 서브클래스로 지정합니다.

public class MainClass {

	public static void main(String[] args) {
		
		// 서브클래스인 Circle 클래스의 객체가 
		// 정상적으로 생성되는지 확인합니다.
		Circle c = new Circle();
		c.setCircle(1, 1, 1.5);
		c.circleInfo();
		
	}

}
