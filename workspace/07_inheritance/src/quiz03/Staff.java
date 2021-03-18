package quiz03;

public class Staff {  // 직원 관리를 위한 최상의 슈퍼클래스 

	// field
	private String name;

	// constructor
	public Staff(String name) {
		super();
		this.name = name;
	}

	// method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("직원명: " + name);
	}
	
}
