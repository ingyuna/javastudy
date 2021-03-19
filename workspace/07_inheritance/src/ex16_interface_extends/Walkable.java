package ex16_interface_extends;

// 인터페이스의 이름은 ~할 수 있는(~able) 의 형태를 가지는 경우가 있습니다.  => 이 인터페이스를 구현하면 산책 '할 수 있다'라고 이해하면 된다.

// Pet 중에서 산책할 수 있는 Pet만 골라서,
// Walkable 인터페이스를 구현해 줍니다.


public interface Walkable {   // -> 인터페이스를 만들어서 내용을 구현할 생각은 하지 않고 타입으로만 사용하게끔 만들었다. 

	
	// 본문 (내용은) 채우지 않고 이 Walkable이라는것만 존재하고 있다. 
	// dog로 가서 public class Dog extends Pet  -> public class Dog extends Pet implements Walkable {  로 바꿔준다.
	
}
