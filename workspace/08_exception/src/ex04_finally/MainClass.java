package ex04_finally;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		try {
			System.out.println("정수를 입력하세요 >>> ");        // -> 정수 외에 값을 입력하면 "예외가 발생했다"고 뜨고 프로그램이 종료된다. 
			a = sc.nextInt();
			System.out.println("입력은 " + a + "입니다.");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		} finally {    // *무조건 실행하는 영역      // finally는 catch 뒤에 단 한번만 붙을 수 있다.
			System.out.println("프로그램을 종료합니다.");
			sc.close();          // try가 정상적으로 실행되는 경우와 catch가 발생하는 두 상황 모두 무조건 스캐너를 닫아준다.
		}
		
		
		
		
		
		

	}

}
