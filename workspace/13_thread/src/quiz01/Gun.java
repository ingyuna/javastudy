package quiz01;

public class Gun extends Weapon implements Runnable {      // Runnable은 java.lang이기 때문에 import 되지 않는다.
															// Runnable은 어제 한 것 처럼 run() override을 해줘야 한다.

	// field
	private String model;
	private int bullet;

	// constructor
	public Gun(String model, int bullet) {
		super();
		this.model = model;
		this.bullet = bullet;
	}

	// method
	@Override
	public void run() {
		for (int i = 0; i < bullet; i++) {    // for문의 의미는 bullet만큼 슛 
			shoot(i);			
		}
			
	}
	public void shoot(int nth) {   // 한 발 씩 쏘는 메소드
		if (bullet == 0) {
			System.out.println("헛빵!");
			return;
		}
		System.out.println(model + " " + (nth + 1) +  " 발 쐈다.");  // 최초 시작이 int i = 0이었으니까 시작은 1발 쐈다로 시작함. 
	}
	
	
	
}
