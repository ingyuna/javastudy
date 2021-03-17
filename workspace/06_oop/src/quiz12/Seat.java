package quiz12;

public class Seat {

	// field
	private String name;    // seat의 예매자 이름

	// constructor
	    // -> 안만듦. 비어있는 좌석을 만들 수 있게 해놓음.
	
	// method
	// 1. 예매자 이름 확인
	public String getName() {
		return name;
	}
	// 2. 예매 할 때 (예매자 이름 저장) 
	public void setName(String name) {
		this.name = name;
	}       // 그렇다고 꼭 getter와 setter의 이름을 쓸 필요는 없다. 바꿔도 됨.
	// 3. 예매취소
	public void cancel() {
		this.name = null;					// 예매를 취소하면 좌석이 비니까, 빈 좌석으로 만드는 코드.
	}
	// 4. 예매 여부 확인 
	// 1) 예매가 된 좌석 : false (예매 불가를 의미) 
	// 2) 예매가 안 된 좌석 : true (예매 가능을 의미)
	public boolean check() {           // 여부니까 boolean으로. 반환타입은 => true / false
		return (name == null);   		// null이면 예매가 안된거니까 true
	}
	// 5. 좌석 확인
	public void info() {
		if (name == null) {
			System.out.print("가능");
		} else {
			System.out.print(name.charAt(0) + "*" + (name.length() > 2 ? name.charAt(name.length() -1) : ""));   // 제*드 이런식으로 할려고함. 마지막은 (2)라고 하면 안되는게 이름이 4글자일수도 있으니까. 
																			// 이름이 2글자일수도 있으니까 이렇게 설정해주기.							
		}
	}
	
	
}
