package ex05_throw;

public class Calculator {

	// field
	private int result;      // 계산의 결과를 항상 저장한다.
	
	// constructor      
	
	// method
	public void addition(int a) {
		result += a;
		System.out.println("현재 저장된 값: " + result);
	}
	public void subtraction (int a) {
		result -= a;
		System.out.println("현재 저장된 값: " + result);
	}
	public void multiplication(int a) {
		result *= a;
		System.out.println("현재 저장된 값: " + result);
	}
	public void division(int a) throws ArithmeticException {  // 2. division() 메소드가 어떤 예외를 던지는지 명시합니다.   -> 이런 예외가 던져진다고 '선언'하는거.
		if (a == 0) {
			throw new ArithmeticException();         // 1. 예외를 직접 던집니다. (얘가 문제가 있다고)  -> 실제로 던지는 행위
		}                                      // 위에는 s가 붙고 throws, 아래는 throw다. 왜냐하면 던지는게 하나가 아니라 여러개가 있기때문 ( Ex: 아래 if를 하나 더 추가해서 throw new NumberFormatException도 던짐) 
		result /= a;
		System.out.println("현재 저장된 값: " + result);
	}
	
	
	
	
	
}
