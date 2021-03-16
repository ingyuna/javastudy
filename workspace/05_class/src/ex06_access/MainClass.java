package ex06_access;

public class MainClass {

	public static void main(String[] args) {
	
		// 클래스의 생성자가 없는 경우에는 
		// "디폴트 생성자"가 자동으로 사용됩니다.
		// public Person() { } 
		
		
		Person p = new Person();     // 이렇게 괄호안에 비어있는 모습으로만 만들 수 있다(-> 디폴트 생성자)
		
		p.setName("david");
		p.setAge(25);
		p.setKorean(false);
		
		System.out.println("이름: " + p.getName());
		System.out.println("나이: " + p.getAge());
		System.out.println(p.isKorean() ? "한국인" : "외국인");  // "국적" + (p.isKorean() ? "한국인" : "외국인"); 이렇게 해도되기는함.
							
 
	}

}
