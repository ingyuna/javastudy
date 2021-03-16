package ex02_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		
	/* 무한루프 만들기	
	while (true) {  // 여러개 있는데 몇개인지 잘 모르겠을땐 while문을 쓴다. 몇개인지 알면 이거 안씀. 물론 써도 되긴하지만 굳이..몇개 있는지 알 땐 for문을 쓴다.while문보다 for문을 좀 더 씀.
		System.out.println("무한루프입니다.");		
	} 
	*/
	
	/* 1 ~ 10 출력
	int n = 1;
	while (n <= 10) { // n: 1~10인 경우 while (true) {
		System.out.println(n++);
	}
	*/
		
	// 10 ~ 1 출력
	
	/*int n = 10;
	while (n >= 1) {
		System.out.println(n--);
	}
		
	// 'A' ~ 'Z' 사이를 계속 입력 받는 프로그램 -> 코드값으로 따지면 65 ~ 90. 그래서 이렇게 정의해서 문제를 해결할 수도 있다. 
	// 대문자가 입력되지 않으면 종료합니다. */
	
	
	Scanner sc = new Scanner(System.in);
	
	/*
	char ch = 'A'; // 허용되는 대문자 기초 초기화. 최초 통과목적이기때문에 'B', 'C'...아무거나 가능 
	
	while (ch >= 'A' && ch <= 'Z') {
	// while (ch >=65 && ch <= 90) { -> 코드값을 알고 있으면 이렇게 해도 됨. 근데 굳이..
		System.out.print("대문자 입력 >>> ");
		ch = sc.next().charAt(0);	
	}
	*/
	
	// 입력 받은 정수를 모두 더해줍니다.
	// 0 이상은 모두 더해주고, 음수가 입력되면 그만합니다.
	// 합계를 출력해 봅시다.
	
	
	int total = 0; // 초기화 설정. 아직 아무것도 더한게 없다.
	int n = 0; // 최초 while문 진입 용도 
	
	while (n >= 0) {
		System.out.println("양수 입력 >>> ");
		n = sc.nextInt();
		total += n; //양수인지 음수인지 모름. 음수일때도 더해준다.
		// -> -값이 토탈에 더해진다. 
	}
	total -= n; // n이 음수일 때 처리되므로, -로 처리한다. --만나면 +가 된다. 빼줬던 값을 다시 더해준다. 
	System.out.println("합계는 " + total + "입니다.");
		
	
		
	sc.close();
	
	
	
	
	
	
	}

}
