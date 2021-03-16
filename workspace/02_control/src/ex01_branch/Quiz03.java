package ex01_branch;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
	// 	3. switch, 나이 입력 받아서 "성인", "미성년자"
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("나이 입력 >>> ");
	int age = sc.nextInt();
	
	//int age1 = age >= 20;
			
	int state = 0; // 미성년자
	if (age >= 20) {
		state = 1;
	}
	
	switch (state) {	// switch (age >= 20) 안됨.괄호안에 boolean(true/false)타입 안됨.
	case 0:
		System.out.println("미성년자");
		break;
	case 1:
		System.out.println("성인");
		break;
	}
	//default 생략가능. 여기서는 답이 0 아니면 1이기 때문에 
	
		
	// 또 다른방법 (1~10의 수를 10으로 나누면 몫이 0. 10~19 10으로 나누면 몫이 1 나온다.
	
	switch ( age / 10) {
	case 0: // age = 1 ~ 9   sysout. 여기서 생략 가능.
	case 1: // age = 10 ~ 19
		System.out.println("미성년자");
		break;
	default: // age >= 20
		System.out.println("성인");
		break;
	}

	sc.close();
}
	
}
