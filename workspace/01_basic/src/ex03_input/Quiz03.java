package ex03_input;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		//3.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		/*
		String result = age >= 20 ? "성인" : "미성년자";
		System.out.println("결과 :" + result);
		*/
		
		System.out.println(age >= 20 ? "성인" : "미성년자");
				
		sc.close();		

	}

}
