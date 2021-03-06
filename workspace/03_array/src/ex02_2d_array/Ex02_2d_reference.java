package ex02_2d_array;

public class Ex02_2d_reference {

	public static void main(String[] args) {
		
		int[][] a = {
				{ 1, 2 },
				{ 3, 4, 5, 6},
				{ 7, 8, 9}
		};
		
		System.out.println(a);  // a[0], a[1], a[2] 참조값이 모여 있는 주소입니다. 
								// -> 1차원배열을
		
		System.out.println(a[0]);  // a[0]는 { 1, 2, } 입니다.
		System.out.println(a[1]);  // a[1]는 { 3, 4, 5, 6} 입니다.
		System.out.println(a[2]);  // a[2]는 { 7, 8, 9}
									// -> 이렇게 3개 가지고 있는 구조 
		// 실제로 테이블이 만들어지는게 아니고 모아놓은것!
		
		System.out.println(a.length);  // 3 (a[0], a[1], a[2])
		
		System.out.println(a[0].length);  // 2 (1, 2)
		System.out.println(a[1].length);  // 4 (3, 4, 5, 6)
		System.out.println(a[2].length);  // 3 (7, 8, 9)
		
		// for문으로 순회합니다.
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {   // a[i].length 여기에 들어갈 숫자가 달라진다. (줄마다 달라진다는 말. 첫번째 줄 2, 두번째 줄 4 이런식)
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		// 암기하기!!!
		// for문에서 i와 j헷갈리지 말기. i < a.length 와 j< a[i].length 여기가 헷갈릴 수 있음!
	}

}
