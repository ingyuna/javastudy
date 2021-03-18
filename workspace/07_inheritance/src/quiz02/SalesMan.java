package quiz02;

public class SalesMan extends SalaryMan {
	
	// field
	private int salesAmount;   // 판매 실적 
	private double incentive;   // 인센티브(%)
	
	
	// 판매사원을 뽑았을때 판매실적을 주는건 좋은 생각이 아니다.
	// 위에 판매 실적과 인센티브를 사용하지 않는 생성자를 만든다.
	// 그럴려면 'Generate Constructor using Fields'를 쓰면 안되고,
	// 그 아래 'Generate Constructor from Superclass'를 써야 한다.
	// 여기서 말하는 슈퍼클래스는 -> SalaryMan
	
	// constructor
	public SalesMan(String name, int salary) {
		super(name, salary);	
	}


	// method
	public int getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
		if (salesAmount >= 1000) {
			setIncentive(0.07);   // 7% 인센티브
		} else {
			setIncentive(0.05);   // 5% 인센티브
		}
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	@Override
	public int getPay() {
		return super.getPay() + getSalesPay();                      // 별도의 메소드를 만들어서 반환해주는게 좋다. 아래 getSalesPay 따로 메소드를 만들어준다.
	}
	public int getSalesPay() {
		return (int)(salesAmount * incentive);          // return salesAmount * incentive 그냥 이렇게 하면 타입이 안맞음. 뒤에가 double이니까. 
	}
	@Override
	public void info() {
		super.info();  // 지원명, 기본급
		System.out.println("판매수당: " + getSalesPay());
		System.out.println("총합: " + getPay());
	}
	
	
}
