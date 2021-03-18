package quiz03;

public class SalaryMan extends Staff {     // Staff의 기능을 물려받음.

	// field
	private int salary;

	// constructor
	public SalaryMan(String name, int salary) {
		super(name);    // 슈퍼클래스 Staff의 생성자를 호출
		this.salary = salary;
	}

	// method
	public int getPay() {
		return salary;
	}
	@Override
	public void info() {
		super.info();    // Staff의 info() -> name 출력
		System.out.println("기본급: " + salary);
	}
	
}
