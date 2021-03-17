package ex06_override;

public class Coffee {

	// field
	private String bean;  // 원두
	
	// constructor
	public Coffee(String bean) {
		this.bean = bean;
	}
	
	// method
	public void taste() {   // coffee에서만 사용할 수 있는 taste()
		System.out.println(bean + "원산지 원두는 맛이 없습니다.");
	}
	
}
