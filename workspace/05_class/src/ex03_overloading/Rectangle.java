package ex03_overloading;

/*
	오버로딩(overloading)
	1. 이름이 같고, 매개변수가 다른 메소드가 있음을 의미합니다. (메소드 이름 둘다 set, 전달 되는게(=매개변수) 다르다_
	2. 결과타입은 오버로딩과 상관이 없습니다. (=> 관심이 없다) 
*/



public class Rectangle {

	// field
	int width;   // 너비
	int height;  // 높이
	
	// method
	void set(int w, int h) {
		if (w > 0) {
			width = w;
		}
		if (h > 0) {
		height = h;
		}
	}
	void set(int n) {
		// 다른 set() 메소드를 호출해서 처리합니다. (=> 일반적인 과정이다)
		set(n,n);		
	}
	int getArea() {
		return width * height;
	}
	
	
	
	
	
	// * 모든 클래스들의 궁극적인 목적 = 안전한 데이터 보관
}
