package quiz04;

public abstract class Fighter {

	// field
	private String name;
	private boolean isAlive;    // 에너지가 0이면 false
	private int energy;  // 에너지 (1 ~ 100)
	private int power;   // 공격력 (1 ~ 10) 
	
	// constructor
	public Fighter(String name, int energy, int power) {   // alive만 빼고 constructor field generate하기. 아래는 직접 타이핑 해줌. 
		super();
		this.name = name;
		this.energy = energy;
		this.power = power;
		this.isAlive = true;
	}
	
	// method
	public abstract void attack(Fighter figther);    // 내가 누구를 공격하는지 Fighter를 받아온다.
	
	
}
