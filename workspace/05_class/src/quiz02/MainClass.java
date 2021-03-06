package quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calc; // 객체는 없고, 참조 변수만 있는 상태입니다.   (*선언한다고 객체가 아니다) 
		
		// 객체를 만드는 명령은 "new"입니다.
		
		calc = new Calculator();  // 이 때 객체가 만들어지고, 그 참조 값이 calc에 전달됩니다.
								  // 객체가 만들어지는 시점을 "인스턴스화" 되었다고 합니다.

		calc.addition(1, 2);
		
		int a = 5;
		int b = 10;
		if (a >= b) {
			System.out.println(a + "-" + b + "=" + calc.subtraction(a, b));  // 여기서 a, b는 인수다. 매개변수 x 
		} else {
			System.out.println(b + "-" + a + "=" + calc.subtraction(a, b));
		}
		
		
		
	}

}
