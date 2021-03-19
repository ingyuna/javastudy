package quiz01;

public class MainClass {

	public static void main(String[] args) {
		
		// 계산기를 만들고,
		// 4가지 연산을 모두 수행하고,
		// 발생할 수 있는 예외를 예상해서 처리해 봅시다.
		
		Calculator calculator = new Calculator();
		                           // 예외 : System.out.println(2 / 0);   ArithmeticException 이게 발생할 소지가 있다. 
		try {
			calculator.addition(10);
			calculator.subtraction(5);
			calculator.multiplication(2);
			calculator.division(0);         // 여기서 예외발생. 10을 0으로 나누겠다.
		} catch (ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		// 10 / 0 : Exception
		// 10.0 / 0.0 : infinite  (자바 연산의 특징은 소수점끼리 나누면 무한대로 나온다. Exception은 발생하지 않는다)
		
	}

}
