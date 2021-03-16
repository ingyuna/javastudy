package ex03_api;

public class Ex01_System {

	public static void main(String[] args) {
		
		// 1. 시스템 종료
		// System.exit(0);    // 실행되다가 끝난다.
		
		// 2. 현재 시간(타임스탬프) 알아내기
		// timestamp : 1970-01-01 0:00:00 부터 현재까지 경과한 시간(단위: 밀리초    *밀리초 = 1000분의 1초)		
					// -> **자주쓰니까 기억해두기
		long timestamp = System.currentTimeMillis();    // 앞에 long을 붙인 이유는 저 타임스탬프를 기준으로 현재까지 얼마만큼의 밀리초가 지났는지를 보면 10자리 넘기때문에 long을 붙여준다.
		System.out.println(timestamp);
		
		// 3. 현재 시간 알아내기 
		// 	    자바가 마음대로 결정한 기준일로부터 경과한 시간(단위: 나노초   *나노초 : 10억분의 1초. 그래서 굉장히 정밀한 시간을 구할 수 있다.          (->1970년이 아니고 정한 기준이 랜덤같은 느낌으로 나온다.) 
		//   경과된 시간을 측정하는 용도(= 하나쓰는게 아니라 두개쓰려는 목적. 시작한 시간과 끝나는 시간의 차이)
		long something = System.nanoTime();
		System.out.println(something);
		
		// 4. 배열 복사하기 
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b= new int[10];
		
		System.arraycopy(a, 0, b, 0, a.length);
		// a[0]에서 b[0]로 복사합니다.
		// a.length만큼 복사 작업을 반복수행합니다.
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		
		
	}

}
