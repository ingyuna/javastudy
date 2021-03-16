package ex02_loop;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 2. 영화 평점을 입력받아서 ★을 출력
		// 평점은 1~5 사이의 정수이고, 잘못된 평점은 다시 입력받습니다.
		
		Scanner sc = new Scanner(System.in);
		
		int grade = 0;  // 평점
		
		do {
			System.out.println("평점을 입력하세요 >>> ");
			grade = sc.nextInt(); 
		}while (grade < 1 || grade >5);
		
		String stars = "";   // 빈 문자열("")은 문자열 연결 연산(+)의 경우에 초기화로 사용된다.// null을 주게되면 문자열로 인식해서 'null'이 출력값에 같이 나온다. 일반적으로 초기화는 null이 맞다. 
		for (int n = 0; n < grade; n++) { // n < 5 이렇게 되면 5번 반복하게 되기때문. 5부분에 grade만큼 반복되게 한다.
			stars += "★";
		}
		
	 	System.out.println("평점: " + grade + "(" + stars + ")");
	 	
	 	sc.close();

	}

}
