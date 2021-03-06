package ex01_random;

import java.util.Scanner;

// 4. 가위바위보
// 가위바위보 >>> 가위
// Player는 가위, Computer는 보, 이겼습니다.
// 가위바위보 >>> 바위
// Player는 바위, Computer는 바위, 비겼습니다.
// 가위바위보 >>> 보
// Player는 보, Computer는 가위, 졌습니다.
// 1승 1무입니다.  (지면 끝. 패는 없다. 이긴거랑 비긴거만 있음)



public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] gababo = { "가위", "바위", "보" };
		
		int win = 0; // 이긴횟수
		int draw = 0; // 비긴횟수
		
		loop:  						// labe문은 자주써도 좋은건 없지만 복습차원에서.
		while (true) {
			
			System.out.println("가위바위보 >>> ");
			int player = 0;  // 초기화로 가위
			switch (sc.next()) {
			case "바위":
				player = 1;
				break;
			case "보":
				player = 2;
			}  // 입력받은 가위바위보를 0,1,2 중에 하나로 셋팅한다 (문자로 안받고 숫자로 받겠다는말)
			System.out.print("Player는 " + gababo[player]);
			
			int computer = (int)(Math.random() * 3) +0;  // gababo 배열의 인덱스
			System.out.print(", Computer는 " + gababo[computer]);
								// 위에 int부터 두줄은 '가위','바위', '보' 랜덤 돌리기 
			
			// player : 0, 1, 2
			// computer : 0, 1, 2
			// diff = player = computer 
			// 1. 이긴 경우 : diff = -2, 1
			// 2. 비긴 경우 : 0
			// 3. 진 경우 : 이 외의 값
			switch (player - computer) {
			case -2: case 1:
				System.out.println(", 이겼습니다.");
				win++;          // 이긴 횟수 추가 
				break;
			case 0:
				System.out.println(", 비겼습니다.");
				draw++;        // 비긴 횟수 추가 
				break;
			default:
				System.out.println(", 졌습니다.");
				break loop;
			}                // break는 위에 스위치만 끝낸다. 위에 while문은 끝내지 않음. 
								// 그래서 다시 올라가서 loop: 를 써줬다.
			
			
		}
		
		
		
		System.out.println(win + "승 " + draw + "무");
		sc.close();

	}

}
