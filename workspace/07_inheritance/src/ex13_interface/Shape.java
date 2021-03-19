package ex13_interface;

// 인터페이스
// 1. 모든 메소드가 추상메소드인 클래스입니다.
// 2. jdk 1.8 이후에 default 메소드와 static 메소드를 가질 수 있습니다. 
// 3. 모든 필드는 final 상수를 가집니다.       - 변하지 않는 값을 가진다. 변할 수 없음. 


public interface Shape {  // interface <-> abstract class (조건만 맞으면 인터페이스는 앱스트랙트 클래스와 같다) 
										
	// method
	// 모든 도형은 크기가 있다.
	public abstract double getArea();     // interface는 public abstract를 생략해도 자동으로 삽입되고 처리됩니다. 
		
	
	
	
}
	
