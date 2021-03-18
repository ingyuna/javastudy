package quiz01;

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
	
// 스탭이 payPerHour를 가지고 있지 않으니까 오버라이드 대상은 아니다.
}
