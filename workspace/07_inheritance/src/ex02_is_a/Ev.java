package ex02_is_a;

// 전기차 Ev

// Ev is a Car 관계가 성립합니다.

public class Ev extends Car {

	// method
	public void charging() {
		System.out.println("충전");   // 현재 Car가 가진 drive와 자기가 가진 charging 이렇게 2가지를 실행할 수 있는거.
	}
	
}
