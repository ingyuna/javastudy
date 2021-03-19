package ex01_exception;

// Exception (예외)
// 1. 개발자가 회피할 수 있는 수준의 오류입니다.
//    심각한 수준의 오류는 Error입니다.
// 2. 모든 예외는 Exception 클래스를 상속 받은 클래스입니다. 

public class MainClass {

	public static void main(String[] args) {
		
		// System.out.println(2 / 0);   ArithmeticException
		// Integer.parseInt("1.5");  // or Inter.parseInt("")  NumberFormatException
		// String name = null; name.equals("james");  // NullPointerException
		// int[] a = new int[3]; a[30] = 10;  ArrayIndexOutOfBoundsException

	}

}
