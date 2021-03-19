package ex16_interface_extends;

public class Dog extends Pet implements Walkable {

	// Dog는 슈퍼클래스 타입이 2개입니다.
	// Pet, Walkable 
	

	// field      -> 안만들거.
	
	// constructor              // * 슈퍼클래스가 생성자를 가지고 있으니까 호출을 꼭 해준다!
	public Dog(String name) {
		super(name);
	}
	
	
}
