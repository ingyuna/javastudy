package ex02_loop;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 4. 아래와 같은 모습으로 출력해 보기
		// 2x1=2   3x1=3   ... 9x1=9
		// 2x2=4   3x2=6   ... 9x2=18
		// ...
		// 2x9=18  3x9=27 ... 9x9=81
		
		
		for (int n = 1; n <= 9; n++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "x" + n + "=" + (dan * n) + "\t");    //줄 바꾸지 않게 해준다. n이 같으면 바뀌지 않아야하기 때문.그리고 여백주기는 \t.
			}
			System.out.println();  // 줄바꿈
		}
		
		
		
		
		
		
	}

}
