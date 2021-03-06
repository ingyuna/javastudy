package quiz04;

public class Gun {
	
	
	private String model;
	private int bullet;
	private final int FULL_BULLET = 6;
	
	
	// constructor
	public Gun(String model, int bullet) {  // 각 K2, 2를 저장 
		this.model = model;   // 이 총의 모델은 = K2
		this.bullet = bullet;		
	}
	
	// method
	public void shoot() {    // 쏘는 작업
		if (bullet > 0) {
			bullet--;
			System.out.println("빵야! " + bullet + "발 남았다");
		} else {
			System.out.println("헛빵!");
		}
	}
	
	public void reload(int bullet) {  // 장전
		if (this.bullet + bullet <= FULL_BULLET) {     // 현재들어있는 총알 + 새로 받아온 총알
			this.bullet += bullet;   // 받아온 총알을 더해주고
			System.out.println(bullet + "발이 장전되었다. 현재 " + this.bullet + "발");      //받아온 총알이 몇발인지
		} else {
			int realBullet = FULL_BULLET - this.bullet;         // 실제 넣을 수 있는 총알을 realBullet이라고 하자.
			this.bullet = FULL_BULLET;
			System.out.println(realBullet + "발 장전되엇다. 현재 " + this.bullet + "발");
			
		}
	}

	// 정보출력
	public void info() {
		System.out.println(model + "에 " + bullet + "발 남았다.");
		
	}	
}
