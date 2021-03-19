package ex02_try_catch;

/*
 	try {
 		코드작성
 		예외발생가능구역
 	} catch (예외처리 매개변수) {
 		예외처리구역
 	}
 */

public class MainClass {

	public static void main(String[] args) {

		int a = 0;
		
		
		try { 
			// System.out.println(2 / 0);  // 예외가 발생하면 try문이 곧바로 종료됩니다.
			Integer.parseInt("1.5"); // -> 예외처리가 안된다. 이유는, 여기서 발생한 Exception은 넘버 익셉션인데 아래는 아리스매스익셉션이기때문에. 
			a = 10;
		} catch (ArithmeticException e) {    // 얘네들은 객체이름을 다 e라고 한다.  // import가 필요할 수 있으니 그대로 적지말고 자동완성 해서 추가하는걸 권장한다.
			System.out.println("예외가 발생했습니다.");
		} catch (NumberFormatException e) {
			System.out.println("예외가 발생했습니다.2");
		}
		
		System.out.println(a);  // 0      -> 10이 아니라 0이 나온다. 예외가 발생해서 실행되지 않았기때문에.
		
		
		try {
			// String name = null;
			// name.equals("james");
			int[] b = new int[3];
			b[10] = 10;
 		} catch (Exception e) {  // Exception은 모든 예외클래스들(넘버익셉션,아리스익셉션 등)의 "슈퍼클래스"입니다.
			System.out.println("예외가 발생했습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
