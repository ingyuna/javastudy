package ex06_override;

// 에스프레소는 커피이다.

// 서브클래스
public class Espresso extends Coffee {   // 여기까지하면 오류나는 이유는 생성자를 아직 안만들어줘서 그렇다.

	// field
	private int water;

	// constructor
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	
									// 여기까지는 복습. 이제 override를 배워보자.
	// method
	
	// Espresso 클래스는 이미 Coffee 클래스의 메소드를 사용할 수 있습니다.
	// Espresoo 클래스가 Coffee 클래스의 taste() 메소드를 사용하는 것이 적절할까요?
	// No! Espresso 클래스는 자신의 맛을 표현하기 위해서 새롭게 taste() 메소드를 만드는 것이 좋습니다.   
	
	// 메소드 오버라이드 (method override)
	// 슈퍼클래스의 메소드를 사용하지 않기 위해서,   (=> Coffee의 taste를 말함) 
	// 서브클래스가 메소드를 다시 만드는 것을 의미한다.
	
	// 유사단어 : 오버로딩과 오버라이드! 전혀 다르므로 주의.
	
	// 오버라이드 주의점
	// 1. 똑같은 형태로 만듭니다. 똑같지 않으면 오버라이드가 아닙니다. (단 한톨도 다르게 만들지 않음)
	// 2. @Override 애너테이션(annotation)을 작성해줍니다.      (권장인데 필수처럼 여겨지는 권장사항)
	//    1) 개발자가 자바에게 이 메소드는 오버라이드 하는 것이라고 알리는 것입니다.
	//    2) 그러면 자바는 오버라이드 규칙을 어겼을 경우 오류를 발생시켜줍니다.  (여기서 말하는 규칙은 똑같이 만들었는지 점검해주는것)
	
	@Override
	public void taste() {    // 에스프레소의 맛 표현을 taste()에 함.    Coffee의 taste()를 쓸 수 있지만 부적절하다. 그래서 이렇게 다시 Override해서 만들어줌.
		System.out.println("에스프레소는 향이 좋지만 맛은 약간 씁니다.");
	}
	
}
