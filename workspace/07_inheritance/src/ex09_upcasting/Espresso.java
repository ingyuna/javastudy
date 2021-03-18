package ex09_upcasting;

public class Espresso extends Coffee {
	
	// field
	private int water;

	// constructor
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	
	// method
	@Override
	public void info() {    // override의 유효 범위는 메소드 하나이다. 그래서 아래 하나 더 만들어준다.
		super.info();      // Coffee의 info()  --> 원두 원산지가 나올꺼.
		System.out.println("물: " + water + "ml");
	}
	@Override
	public void taste() {
		System.out.println("에스프레소 맛이 진하다.");
	}
	

}
