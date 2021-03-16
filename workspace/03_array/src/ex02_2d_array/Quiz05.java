package ex02_2d_array;

import java.util.Scanner;

// 5. 영한사전
// "영어단어"와 "의미"를 배열에 저장해 두고, 
// 묻고 답하는 프로그램
// 봄을 영어로 하면? >>> spring
// 정답
// 여름을 영어로 하면? >>> suuuumer
// 오답
// 가을을 영어로 하면? >>> fall
// 정답
// 겨울을 영어로 하면? >>> winder
// 오답
// 2문제를 맞히고, 2문제를 틀렸습니다.

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] dict = {
				{ "봄", "spring" },  // dict[0][0], dict[0][1]
				{ "여름", "summer" }, // dict[1][0], dict[1][1]
 				{ "가을", "fall" },   // dict[2][0], dict[2][1]
				{ "겨울", "winter" }  // dict[3][0], dict[3][1]
		};							//	왼쪽 ->dict[i][0]   오른쪽 -> dict[i][1]
		
		int wrong = 0;  // 틀린 문제의 갯수
		
		
		for (int i = 0; i < dict.length; i++) {
			System.out.print(dict[i][0] + "을 영어로 하면? >>> ");
			String answer = sc.next();   
			if (answer.equalsIgnoreCase(dict[i][1])) {	//  -> 영어 단어를 비교해야하니까 							// String 비교할 땐 = 안되니까 equals로!
				System.out.println("정답");
			} else {
				System.out.println("오답");
				wrong++;
			}
		}
		
		System.out.println((dict.length - wrong) + "문제를 맞히고, " + wrong + "문제를 틀렸습니다.");
							// -> 4 - 틀린문제
		
		sc.close();
		
		
		
		
		
	}

}
