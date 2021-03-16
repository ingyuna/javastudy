package quiz07;

import java.util.Scanner;

public class Player {

	// field 
	private String name;
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public Player(String name) {
		this.name = name;
	}

	// method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int play() {          // 게임을 합니다.  -> 몇 초 경과되었다.
		System.out.println(name + "'s game start!");
		System.out.println("Press Enter");
		// Enter입력 : nextLine()   Enter가 입력될때까지 모두 문자열로 처리해주는 메소드. 엔터만 입력받을거임.
		sc.nextLine();
		long start = System.currentTimeMillis();  // 첫 엔터 시간
		System.out.println("After 10seconds Press Enter!");
		sc.nextLine();
		long end = System.currentTimeMillis();  // 두 번째 엔터 시간
		// 경과시간 반환
		return (int)((end - start) / 1000);   // 소수점은 다 없어지고 초만 살리는 방식.
}
}