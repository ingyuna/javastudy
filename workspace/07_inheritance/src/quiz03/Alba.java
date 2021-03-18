package quiz03;

public class Alba extends Staff {
	
	// field
	private int payPerHour;   // 시급
	private int times;			// 근무시간
	
	
	// contsructor           // 근무를 하면서 값을 받는걸로 할꺼라서 위에 시급, 근무시간을 넣지 않는다. -> 제너레이트 컨스트럭터 프롬 슈퍼클래스 생성
	public Alba(String name) {
		super(name);
		
	}
	
	// method
	public int getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	
	public int getPay() {         // peyPerHour를 따로 만들어준다. 
		return payPerHour * times;
	}
	
	@Override
	public void info() {
		super.info();   // Staff의 info()
		System.out.println("페이: " + getPay());
	}
	
}
