package ex01_branch;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("단계(1~4) 입력 >>> ");
	int step = sc.nextInt();
	
	switch (step) {
	case 1: System.out.print("기");  //println이 아니라 print로 라인을 없앰.
	case 2: System.out.print("승");
	case 3: System.out.print("전");
	case 4: System.out.print("결");
			break;
	default: System.out.println("알 수 없음");		
	}
	
	sc.close();
	}

}
