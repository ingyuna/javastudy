package ex10_downcasting;

public class MainClass {

	public static void main(String[] args) {
		
		// 컴파일 -> 실행
		// 코드 -> new 처리   (컴파일이 아니라 실행되는거) 
		
		Person p1;
		p1 = new Student();
		// Person p1 = new Student();   --> 이거랑 같은 말임 
		p1.eat();
		p1.sleep();
		// p1.study();   // Person p; 만 보고 호출할 메소드를 결정하기 때문에 불가능합니다.

		// Person타입의 p1을 Student타입으로 변경하면 해결됩니다.
		// 1. (Student)p1 : p1을 Student로 캐스팅합니다. (downcasting)  -> 다운캐스팅 용어까지 공부할 필요는 없다. 그냥 캐스팅이라고 해도 무방.  
		// 2. (Student)p1.study() : 정상 동작하지 않습니다.
		//    연산자 최우선 순위 : 마침표(.)이므로 p1.study()가 먼저 호출되기 때문입니다.   ex)위에 (Studnet)p1.study면 캐스팅을 하기전에 study를 먼저 호출한거다.
		// 3. ((Student)p1).study() : 캐스팅을 먼저 처리하고나면 study()가 호출됩니다.
		((Student)p1).study();
		
		
		Person p2;
		p2 = new Worker();
		p2.eat();
		p2.sleep();
		((Worker)p2).work();         // Worker를 p2로 바꿔주세요. 그럼 work를 부를게요!
		
		
		// 실수를 해 봅시다.
		Person p3;
		p3 = new Student();
		p3.eat();
		p3.sleep();
		// ((Worker)p3).work();            // ClassCastException 발생    : student하고 worker는 위아래 관계가 아니라서 못바꾼다구. eclipse는 코드 작성할때 모른다. -> 실행이 됨.		
		
		// 타입을 확인한 뒤 캐스팅 할 수 있습니다.
		
		// p3가 Student이면 Student로 캐스팅하고, 
		// p3가 Worker이면 Worker로 캐스팅하시오.
		
		if ( p3 instanceof Student) {    // instance = 객체   p3가 Student의 객체이면,
			((Student)p3).study();			
		} else if ( p3 instanceof Worker ) {
			((Worker)p3).work();
		}
											// -> 얘는 객체가 자주 바뀔때 할 때 쓰면 된다. 객체가 명확하면 굳이 쓰지 않아도 된다. 
		
		
	}

}
