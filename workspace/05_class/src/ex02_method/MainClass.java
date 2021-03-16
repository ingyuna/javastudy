package ex02_method;

public class MainClass {

	public static void main(String[] args) {
	
		Person p = new Person();
		
		p.set("alice", 30, '여', false, 170.5, 70.5);     // 인수가 6개 
		
		p.info(); //인수가 0개 

		double bmi = p.getBMI();  // getBMI 메소드를 호출하면 메소드가 실행이 되고 결과값이 반환(return)된다. 반환된 결과값을 double 타입의 BMI로 저장시킨다.
		System.out.println(bmi);
		
		
	}

}
