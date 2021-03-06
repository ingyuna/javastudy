package ex01_random;

// 3. 윷놀이
// "도", 1칸 이동한다.
// "개", 2칸 이동한다.
// "걸", 3칸 이동한다.
// "윷", "개", 6칸 이동한다.
// "모", "모", "도", 11칸 이동한다.


public class Quiz03 {

	public static void main(String[] args) {
		
		String[] yut = { "도", "개", "걸", "윷", "모" };
		int move = 0; // 이동횟수
		
		while (true) {
			
			// 윷을 프로그램이 던집니다.
			int idx = (int)(Math.random() * 5) + 0;
			System.out.print("\"" + yut[idx] + "\""); // "도" ~ "모"
			
			// 이동횟수 계산합니다.
			move += (idx + 1);    // 이동하려면 "도" 일때 한칸, "개"일때 두칸이니까.
			
			// 도, 개, 걸은 끝
			if (idx < 3) {  // 도,개,걸이니까 3
				System.out.println(", " + move + "칸 이동한다." );
				break;
			}		
			// 윷, 모는 또 던집니다.
			else {
				System.out.print(", ");
			}
	}

	}
}
