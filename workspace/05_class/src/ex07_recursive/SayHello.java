package ex07_recursive;

public class SayHello {
	
	public void say(int n) {    // 현재 여기는 5가 전달되고 있는 상황. n=5
		if (n > 0) {
		System.out.println("Hello");
		say(n - 1);  // 재귀적 호출
	}
}	
	
}
