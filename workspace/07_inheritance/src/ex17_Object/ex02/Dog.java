package ex17_Object.ex02;

public class Dog {

	// field
	private String name;

	// constructor
	public Dog(String name) {
		super();   // Object의 생성자 호출 (생략해도 됩니다.)
		this.name = name;
	}

	
	// method
	// Object 클래스의 toString()을 사용하지 않기 위해서
	// toString() 메소드를 오버라이드합니다.
	@Override
	public String toString() {
		return "[name: " + name + "]";
	}
	
	
	
	
}
