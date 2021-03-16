package ex02_loop;

public class Ex07_label {

	public static void main(String[] args) {
		
		// label
		// 1. 소스코드의 특정 위치를 지정하는 방법입니다.
		// 2. 방법
		//    label: 소스코드
		
		// dan x n = (dan * n)
		
		
		outer: for (int dan = 2; dan <= 9; dan++) {
			inner: for (int n = 1; n <= 9; n++) {
				System.out.println(dan + "x" + n + "=" + (dan * n));
				if (dan == 5 && n ==5) {
					// break inner;
					break outer;
				}
			}
		}
		
		
		/* label이 없을 때 
		for (int dan = 2; dan <= 9; dan++) {
			int n;
			for (n = 1; n <= 9; n++) {
				System.out.println(dan + "x" + n + "=" + (dan * n));
				if (dan == 5 && n == 5 ) {
					break;   //break만 쓰면 inner for문만 끝내는거기 때문에 5*5까지만 나오고 다시 6단이 나온다.
				}
			}
			if (dan == 5 && n == 5 ) {
				break;             // -> 5x5까지만 나오고 그 이후엔 아예 나오지 않는다.
			}
		}
		*/
		

	// 참고로 수업시간에 label 할 일은 거의 없다. 
	
	}

}
