package ex05_throw;

public class MainClass {

	public static void main(String[] args) {
		
		// 예외를 직접 발생시키는 경우 throw를 이용합니다.
		/*
		try {
			throw new NumberFormatException();                 // 생성자의 인수 없이 호출. 그럼 이 넘버포멧익셉션은 아래 Exception e로 전달된다.
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다. : " + e);
		}
		*/
		
		Calculator calculator = new Calculator();
		
		try {
			calculator.division(0);
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다. " + e);
		}
		
		
	}

}
