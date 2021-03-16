package ex01_random;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		
		// 랜덤 : 알 수 없는 값을 만들어주는 난수 
		//	랜덤이 가장 많이 사용되는곳 => 게임 
		
		// java.util.Random  => 패키지가 자바랭이 아니니까 임포트해준다.
		Random random = new Random();
		
		// 1. int 난수
		int rand1 = random.nextInt(); // int 범위 중 하나 (무슨 숫자가 나올지 모름.40몇억개중에 맞출 수 없음)
		int rand2 = random.nextInt(10); // bound값이 10 들어가있는데 이건 10개 중 하나라는 뜻 (0 ~ 9) 이건 대략 맞추는게 가능한 수준
		
		System.out.println(rand1);
		System.out.println(rand2);
		
		// -> 실행을 돌리면 출력값들 실행될때마다 계속 랜덤으로 나온다! 
		
		
		// 2. double 난수
		double rand3 = random.nextDouble(); // 0 <= 난수 < 1
		System.out.println(rand3); 			// 0% <= 난수 < 100%  (퍼센트로 바꿨을시 이렇게 되니까)
                                // dobule난수는 뭘 맞출려는 목적이 아니다.	
								// 확률 처리용으로 쓰고싶어서 소수점 난수를 쓴다!
		
		
		
		// 근데 이 1.2번은 잘 안 쓴다. 
		
		
		
		
		

	}

}
