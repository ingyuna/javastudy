package ex02_2d_array;

// 2. 구구단의 결과만 2차원 배열에 저장하고 출력하기
// 2 4 6 .. 18
// 3 6 9 .. 27
// ...
// 9 18 27 ... 81

public class Quiz02 {

	public static void main(String[] args) {
		
		int[][] multi = new int[8][9];
		
		for (int i = 0; i < multi.length; i++) {  //i는 단과 관련
			for (int j = 0; j < multi[i].length; j++) {  // j는 n과 관련
				multi[i][j] = (i + 2) * (j + 1);   // 2단부터 1부터 시작해야하니까. 지금 i와 j의 초기값이 0이니까.
	}
		}

		for ( int[] a : multi) {
			for ( int n : a ) {
				System.out.print(n + "\t");   //공백보다는 라인을 맞춰줄 수 있는 탭키를 적어준다.
			}
			System.out.println();
		}
		 // for문 하나로 합쳐서 할 수 있음. 지금은 연습이라 나눠서 함
	}
}