package ex13_interface;

public class Square extends Rectangle {         // rectangle은 클래스기때문에 상속을 받는게 맞다. 그래서 여기서 interface로 바꾸지 않는거. 


	// field가 없습니다.
	
	// constructor
	public Square(int width) {          // Sueprclass constructor 불러옴.
		super(width, width);          // -> 값을 하나만 받아서 너비와 높이를 동시에 쓸 수 있게끔 커스터마이징함 (직접 타이핑해서 수정함) 
	}
	
	
	// Rectangle의 메소드는 이미 사용할 수 있습니다.
	// getter, setter, getArea()는 이미 사용할 수 있습니다.
	
	
	
	
}
