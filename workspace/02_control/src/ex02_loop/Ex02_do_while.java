package ex02_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		
		// do = while 문
		// 1. while문입니다.
		// 2. 반드시 한 번은 실행하는 while문입니다.
		
		
		// while문이 불편할 때, do while문이 편할때가 있을때 쓴다.
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int n = 0;      //입력받는 변수
		
		do {               // -> 점검없이 본문 진행 
			System.out.println("양수만 입력 >>> ");
			n = sc.nextInt();    // n값이 -(음수)여도 정상적으로 동작. 일단 하라고 했으니까.
			total += n;
		} while (n >= 0);
		
		total -= n;
		System.out.println("합계: " + total);
		
		sc.close();
		
		
		
		
		

	}

}
