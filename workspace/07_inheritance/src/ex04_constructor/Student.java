package ex04_constructor;


// 서브클래스 (자식클래스) 

// 부모가 먼저 태어나야 자식도 태어날 수 있습니다.
// 서브클래스의 생성자는 슈퍼클래스의 생성자를 "반드시" 먼저 호출해야 한다.
// 생략이 가능한 경우는 슈퍼클래스의 생성자가 "디폴트 생성자" 형태일 때 입니다.

// 슈퍼클래스 키워드 
// super : 슈퍼클래스의 참조 값
// 1. super.멤버 : super.필드, super.메소드()
// 2. super() : 슈퍼클래스의 생성자        // *유사품주의 -> super()는 슈퍼클래스. this는 현재 클래스. 

public class Student extends Person {   // 이렇게만 하면 오류가 생긴다. Person의 생성자를 먼저 만들어야 함.  -> constructor에서 만들자.

	// field
	private String school;
	
	// constructor
	public Student(String name, String school) {
		super(name);    // super를 먼저 부른다.
		this.school = school;     // 그 다음에 school.  -> 사람 밑에 Student가 만들어지는 구조. 
	}
	
	// method
	public void info() {
		System.out.println("이름: " + getName());   // Person의 field는 private라서 못쓰고 메소드만 쓸 수 있다. Stduent에는 getName이 없지만, Person에 있기때문에 가능. 
		System.out.println("학교: " + school);
	}
	
}
