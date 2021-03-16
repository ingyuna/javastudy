package quiz04;

public class Soldier {

	// field
	private String name;
	private Gun gun;
	
	// constructor (=생성자)
	public Soldier(String name, Gun gun) {
		this.name = name;
		this.gun = gun;
	}
	
	// method      // soldier shoot reload에서 로직을 짜지말고 gun을 써라. 
	public void shoot() {   // 이건 군인이 쏘는건데 아래 실제 내부를 보면 총이 쏘고있는것. 
		gun.shoot();
	}
	public void reload(int bullet) {
		gun.reload(bullet);
	}
	
	public void info() {
		System.out.print(name + ", ");
		gun.info();
	}
	
	
}
