package quiz02;

public class Calculator {

	// method
	// 1. 결과타입 : 결과값이 없다. (void)
	// 2. 메소드명 : addtion
	// 3. 매개변수 : 전달되는 2개의 int 값이 있다.
	// 4. 역할 : 전달된 인수의 합계 결과를 아래와 같은 형식으로 보여줍니다.
	//	  1 + 2 = 3
	
	void addition(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));   // 자기가 직접 출력문을 받아서 처리
	}
	
	
	
	// 1. 결과타입 : 결과값의 타입이 int입니다.
	// 2. 메소드명 : subtraction
	// 3. 매개변수 : 전달되는 2개의 int 값이 있다.
	// 4. 역할 : 전달된 인수의 뺄셈 결과를 반환합니다. 
	//           항상 큰 수에서 작은 수를 뺍니다.
	
	
	int subtraction(int a, int b) {  // 여기서 a,b는 매개변수이다.
		return (a >= b) ? a -b : b-a; 													// subtraction의 반환은 int이다 라는말.	
	}     // 결과를 받아서 처리 
	
	
	
	
	
	
}
