package ex11_abstract;

// 1. 추상메소드
// 		1) 본문이 없는 메소드입니다.
// 		2) 메소드를 정의할 때 abstract 키워드를 앞에 추가합니다.
//		3) 중괄호({})를 빼고 세미콜론(;)을 붙입니다.

//2. 추상클래스
//1) 추상메소드가 1개 이상 포함된 클래스입니다.
//2) 클래스 정의 앞에 abstract 키워드를 추가합니다. 

public abstract class Staff {     // abstract public도 가능합니다.


	// field
	private String name;
	
	// constructor
	public Staff(String name) {
		super();
		this.name = name;
	}
	
	// method
	public void info() {
		System.out.println("직원명: " + name);
	}
	/*
	public int getPay() {
		return ??;			// 반환할 수 있는 값은 없습니다. 			// 얼만지 몰라유..본문이 필요해서 넣긴 했는데. 
	}
	*/
	// 본문이 없는 getPay() 메소드를 만들면 됩니다.
	public abstract int getPay();  // abstract public도 가능합니다. -> 정해진 순서가 없다. 어쨌든 메소드 앞이니까 (메소드 : int getPay())
	
	

	
	
}
