package quiz06;

public class BreadAndChange {

	// field
	private int bread;
	private int change;
	
	// constructor (빵이랑 잔돈만 있으면 됨)
	public BreadAndChange(int bread, int change) {
		this.bread = bread;
		this.change = change;
	}

	// method    (getter와 setter 불러옴) 
	public int getBread() {
		return bread;
	}

	public void setBread(int bread) {
		this.bread = bread;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}
	
	
	
	
	
}
