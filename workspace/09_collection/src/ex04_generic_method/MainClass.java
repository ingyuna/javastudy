package ex04_generic_method;

public class MainClass {

	public static void main(String[] args) {
	
		Integer[] a = { 1, 2, 3 };
		Double[] b = { 1.5, 2.5, 3.5 };
		String[] s = { "hello", "hi", "hahaha" };    
		
		Calculator calc = new Calculator();
		System.out.println(calc.getTotal1(a));
		// System.out.println(calc.getTotal1(s));   메소드 내부에서 s의 타입 String이 Number로 캐스팅되다가 예외 발생.
 		
		System.out.println(calc.getTotal2(b));
		// System.out.println(calc.getTotal2(s));    // T extends Number 때문에 String은 전달 자체가 안됩니다.
	}

}
