package ex07_override;

public class Pizza {

	// field
	private String dough;   // 도우
	private int cheese;   // 치즈
	
	// constructor
	public Pizza(String dough, int cheese) {
		// super();       <- 있어도 되고 없어도 된다.          그리고 Pizza에 대놓고 지정하진 않았지만 슈퍼클래스가 이미 있다.
		this.dough = dough;
		this.cheese = cheese;
	}
	
	// method
	public void info() {
		System.out.println(dough + "(" + cheese + ")");
	}
		
}
