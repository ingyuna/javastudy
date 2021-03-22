package ex08_static;

public class MyMath {

	// private 생성자  -> MyMath 내부에서만 생성이 가능합니다.     // => 외부에서는 new를 할 수 없다.
	private MyMath() {}
	
	// 원주율 (클래스 필드)
	public static final double PI = 3.141592;
	
	// 절대값 (클래스 메소드)
	public static double abs(double n) {
		return (n > 0) ? n : -n;
	}
	
	// 제곱 (클래스 메소드) 
	public static double pow(double a, double b) {  // a의 b제곱
		double result = 1;   // 곱하기는 초기화 = 1,  0 주면 다 0이 되니까 절대 노노!
		for (int i = 0; i < b; i++) {  // b만큼 곱하기를 진행합니다.
			result *= a;
		}
		return result;
	}
	
	
}
