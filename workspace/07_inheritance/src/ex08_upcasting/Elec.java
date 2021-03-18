package ex08_upcasting;

public class Elec {

	// field
	private int watt;   // 소비전력    (모든 전자제품에 들어있는거)

	// constructor
	public Elec(int watt) {
		super();
		this.watt = watt;
	}
	
	// method
	public void info() {
		System.out.println("소비전력: " + watt + "W");   // 뒤에 W 붙인거는 단위 (몇 와트) 
	}
	
}
