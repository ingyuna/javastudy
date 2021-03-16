package ex01_branch;

public class Ex02_switch {

	public static void main(String[] args) {
		
		int choice = 1;
		
		switch (choice) {
		case 1: 
			System.out.println("1이다.");
			break;   //switch문을 종료한다.
		case 2:
			System.out.println("2이다");
			break;
		default:                    // else에 해당. 위에 값 1, 2 둘다 아닐때 여길로 오게되어있음.
			System.out.println("1과 2가 아니다.");
			// break;                  // difault에 break는 넣지 않는게 좋다.default는 마지막에 배치되고 어차피 switch는 끝나기때문에 불필요하기 때문.
			
		// 1번과 2번에서 break를 넣어주지 않는다면, 1을 넣고 비교했을때 세개 다 찍힌다.왜냐면 끝내라는말이 없기때문에 계속 아래값까지 비교해서 출력되기 때문.	
		}
		
		
	}

}
