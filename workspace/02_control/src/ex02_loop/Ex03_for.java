package ex02_loop;

public class Ex03_for {

	public static void main(String[] args) {
		
		// while -> 언제 끝날지 모를때 쓴다.
		// 횟수가 정해져있는 경우에는 쓰지 않는다.
		
		// for문 
		// 1. 반복의 횟수나 범위가 명확할 때 사용한다.
		// 2. 배열이나 리스트와 같은 반복가능객체들(iterable)에서 사용한다.
		// 3. 동작 순서
		// for ( ① ; ② ; ④ ) { ③ }
		// ①은 최초 1회만 동작한다.
		// ②③④는 반복한다.
		
		
		
		// 1 ~ 10 출력
		/* for (int n = 1; n <= 10; n++ ) {  // 세미콜론이 2개 들어가야함(시작포인트 / 종료포인트). ; 마침표의 개념이 아니라 separator 구분자의 개념이다.
			System.out.println(n);
		}
		
		// 10 ~1 출력
		for (int n = 10; n >= 1; n--) {
			System.out.println(n);
		}
		*/
		
		
		// 3번 "Hello Java"를 출력하는 for문을 작성해 봅니다.
		
		for (int n = 0; n < 3; n++) {   // 프로그램은 시작은 1로 잡는 경우는 거의 없다. 보통 0으로 잡는다. 코드 가독성의 문제로 n<=2는 추천하지 않는다.
			// 사용되는 n : 0, 1, 2
			System.out.println("Hello Java");
		}
		
		
		

	}

}
