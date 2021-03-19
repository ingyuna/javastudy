package quiz01;

public class Calculator {

	// field
	private int result;      // 계산의 결과를 항상 저장한다.
	
	// constructor      -> 안만듦.
	
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
	public void division(int a) {
		result /= a;
		System.out.println("현재 저장된 값: " + result);
	}
	
	
	
	
	
}
