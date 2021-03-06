package ex05_constructor;

/*
 	생성자 (constructor)
 	1. 객체를 생성하는 메소드입니다.  (=항상 객체를 생성하는 방법에 관한 이야기다라는걸 생각하면 된다)
 	2. 특징
 		1) 결과타입 : 존재하지 않습니다. 아예 작성하지 않습니다.
 		2) 메소드명 : 클래스명과 같습닏.
 		3) 매개변수 : 일반 메소드처럼 사용합니다. 
 	3. 호출시점
 		: 객체를 생성하기 위해서 new를 호출하면 그 때 호출됩니다. (-> 다른데선 부를 수 없다. 메소드인데 조금 성격이 다름)
 */
/*
 	객체 생성                             생성자
 	Person p = new Person()				  Person() { ... }
 	Person p = new Person("james")        Person(String name) { ... }	
 	Perosn p = new Person("ali", 20)  	  Person(String name, int age) { ... }
 	
 	*
 	Person p = new Person()	  =>이름이 person인 메소드 
 	Person p = new Person("james")        Person(String name) { ... }  => 이름이 person이고 인수가 String
 */

public class Person {

	// field
	String name;
	int age;
	char gender;
	
	// constructor (=생성자 만드는 자리는 필드 끝나고 나서 여기에다가!)
	Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	} 							// 아래는 잘 안쓰고 지금 이거 위에만 기억하면 된다. 먹고사는데 지장없음 ㅎㅎ
	Person(String name) {
		this(name, 0, '\0');   // 여기서 this는 생성자(Constructor)를 의미
	}
	Person(String name, int age) {
		this(name, age, '\0');
	}
	Person() {
		this(null, 0, '\0');
	}
						// 여기서 모든 this는 생성자(Constructor)를 의미
	
	
	
}
