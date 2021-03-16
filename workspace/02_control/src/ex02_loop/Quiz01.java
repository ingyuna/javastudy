package ex02_loop;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 1. 퀴즈 맞히기
		// 맞힐때까지 계속 물어보는 퀴즈입니다.
		// 대한민국의 수도는? >>> 서울 또는 seoul
		// 정답입니다.
		// 대한민국의 수도는? >>> 인천
		// 오답입니다.
		
		
		Scanner sc = new Scanner(System.in);
		// String city = "";  // 첫번째 초기화 방법       (선언문을 위로(밖으로) 뺌)
		String city = null; // 두번째 초기화 방법
		
		do {
			if (city != null) {  // 아직 입력받기 전이라서 "오답입니다"가 나올 수 없다.
			 System.out.println("오답입니다.");  
			} 
			System.out.println("대한민국의 수도는?");
			city = sc.next();  // scope 안에서만 쓸 수 있음. 위에 안빼고 String city 이렇게 하면 city가 뭔지 모른다.
		} while (!city.equals("서울") && !city.equalsIgnoreCase("seoul") );// 틀리면 계속 물어봅니다.scope범위 (중괄호 '시작'해서 '끝'까지의 범위)를 몰라서.
								//'서울'이 아니면 반복하는거니까 city.equals("서울")이라고 하면 안되고 not이 필요한 상황
								// || (또는)을 쓰게 되면 둘 다 틀려야 해서 &&(엔드)가 낫다.
		//while문이 끝나면 정답이다.
		
		System.out.println("정답입니다");
		
		sc.close();
	}

}
