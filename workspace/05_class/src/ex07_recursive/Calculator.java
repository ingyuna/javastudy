package ex07_recursive;

public class Calculator {

 	
	
	// 역할 : n! 값을 반환합니다.  (=3팩토리얼)
	// 3! (3팩토리얼) == 1 * 2 * 3            -> 이렇게 팩토리얼은 곱하기를 해주는거.
	public int getFactorial(int n) {
 		// return 3 * 2 * 1;
 		if (n == 1) {
 			return 1;     // return n; 이렇게 해도됨
 		} else {
 			return n * getFactorial(n - 1);
 		}
 		
 		
 		
 	}
	
	
	
}
