package ex04_constructor;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student("짱구", "서강초");    // super('짱구')가 호출된 상황. 자동완성 (name, school) 사용 
		s.info();

	}

}
