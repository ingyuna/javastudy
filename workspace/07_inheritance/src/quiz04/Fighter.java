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
	public abstract void attack(Fighter figther);    // 내가 누구를 공격하는지 Fighter를 받아온다.    abstract -> 추상메소드 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {         // * 참고로 boolean 타입은 get이 아니라 is로 쓰기로 규약되어 있다.  => getAlive는 안된다는 말. 
		return isAlive;
	}

	public void setAlive(boolean isAlive) {    // 0보다 크면 살아있으니까 true가 될꺼고 살아있다라고 나오고, 아니면 죽은걸로 나온다. 
		this.isAlive = isAlive;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {     
		this.energy = energy;
		this.energy = this.energy < 0 ? 0 : this.energy;        // 1이 있는데 10을 공격받으면 -9. 에너지가 0보다 작으면 그냥 0으로 하고, 아니면 에너지값.
		setAlive(this.energy > 0);
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	public void info() {    // 시작 초기화값 보여주고 시작.
		System.out.println("[이름: " + name + " , 에너지: " + energy + ", 공격력: " + power + "]");
	}
	
	// * getter와 setter는 골라서 넣지말고 일단 나 넣고 필요하면 가져다 쓰는 방식으로 한다. 
	
	
	
	
}
