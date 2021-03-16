package ex01_random;

public class Ex02_Math {

	public static void main(String[] args) {
		
		// java.lang.Math  <- 요 패키지. 임포트가 필요없는 기본 클래스다.
		
		System.out.println(Math.random());  // 0.0 <= Math.random() < 1.0
		
		// Math.random() 의 결과가 0.1보다 작을 확률은 얼마일까요? 10%
		// Math.random() 의 결과가 0.2보다 작을 확률은 얼마일까요? 20%
		// ..........
		// Math.random() 의 결과가 0.99보다 작을 확률은 얼마일까요? 99%
		
		// 10% 확률로 "강화성공", 90% 확률로 "강화실패"
		if (Math.random() < 0.1) {
			System.out.println("강화성공");
		} else {
			System.out.println("강화실패");
		}
		
		
		//Ex01_Random은 쉽게 쓸 수 있지만 성능상으로는 Math 이게 낫다.
		
		
		// Math.random()                0.0 <= random < 1.0
		// Math.random() * 3            0.0 <= random < 3.0
		// (int)(Math.random() * 3)        0 <= random < 3 
		// (int)(Math.random() * 3) + 1    1 <= random < 4
		                    // int형으로 바꿀때는 바로 위 아래 2가지 방식을 쓴다.
		// 일반화에서 공식처럼 활용합니다.
		// 원하는 난수의 범위
		// (int)(Math.random() * 개수) + 시작값

		// 주사위 : (int)(Math.random() * 6) + 1     -> 1부터 6개. 그래서 주사위 만들때.
		// 로또 : (int)(Math.random() * 45) + 1
		int lotto = (int)(Math.random() * 45) +1;
		System.out.println(lotto);
		
		
	}

}
