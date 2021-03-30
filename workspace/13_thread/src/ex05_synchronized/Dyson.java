package ex05_synchronized;

// critical section
// 1. 임계 영역
// 2. 공유 자원을 관리하기 위해서 한 번에 한 스레드의 접근만 허용합니다.
//		"thread safe하다."라고 표현합니다. 
// 3. synchronized 키워드를 추가합니다.

public class Dyson {
	
	// synchronized
	// 한 스레드만 floorCleaning()나 homeCleaning()에 접근할 수 있습니다.
	// 동시 접근이 안 됩니다.

	// method
	public synchronized void floorCleaning() {
		try {
			System.out.println("바닥 청소를 하고 있습니다.");
			Thread.sleep(1000);  // 1000밀리초(1초) 일시중지.    -> 1초의 바닥 청소시간을 주었다.라고 생각하면 된다.
			notify();   // 다른 스레드에게 floorCleaning() 메소드가 끝났음을 알립니다. 
			wait();     // 다른 스레드가 끝났다고 알려줄때까지 기다립니다.   (=실행을 넘김) 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void homeCleaning() {    // 청소 툴을 바꿈. 
		try {
			System.out.println("집안을 청소하고 있습니다.");
			Thread.sleep(1000);
			notify();
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
