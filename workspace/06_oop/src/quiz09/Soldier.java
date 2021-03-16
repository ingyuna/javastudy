package quiz09;

public class Soldier {

	// field
	private String name;
	private Gun[] guns;
	private int idx;
	
	// constructor
	public Soldier(String name, int gunCount) {
		this.name = name;
		this.guns = new Gun[gunCount];
	}
	
	// method
	public void addGun(Gun gun) {
		if (idx < guns.length) {
			guns[idx++] = gun;   // idx : 현재 저장된 총의 갯수
		} else {
			System.out.println("더 이상 총을 추가할 수 없습니다.");
		}
	}
	public void shoot() {   // 전체를 다 쏘는 슛
		for (int i = 0; i < idx; i++ ) {     // 실제로 추가되어있는 총의 갯수는 idx이기때문에 i < guns.length가 아니라 idx로 해준다.
			guns[i].shoot();
		}
	}
	public void shoot(int gunNo) {
		guns[gunNo - 1].shoot();
	}
	public void shoot(String model) {
		for (int i = 0; i <idx; i++) {
			if (guns[i].getModel().equals(model)) {
				guns[i].shoot();		
			}	
		}
	}
	public void reload(int bullet) {
		for (Gun gun : guns) {
			if (gun != null) {
				gun.reload(bullet);
			}
		}
		
 	}
	public void reload(int gunNo, int bullet) {
		guns[gunNo - 1].reload(bullet);
	}
	public void reload(String model, int bullet) {
		for (Gun gun : guns) {
			if (gun != null && gun.getModel().equals(model)) {
				gun.reload(bullet);
			}
		}
	}
	public void info() {
		System.out.println("이름: " + name);
		for (int i = 0; i < idx; i++) {
			guns[i].info();
		}
	
	
}
	
}	
	
	
	
	
	
	
	
	
