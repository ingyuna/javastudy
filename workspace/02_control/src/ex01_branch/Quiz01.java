package ex01_branch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
	// 1. 임의의 양수 1개 입력 받아서 "홀수", "짝수", "3의 배수" 출력
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("양수 입력 >>> ");
	int positiveNum = sc.nextInt();
	
	/*
	if (positiveNum % 3 == 1) {
		System.out.println("홀수");
	} else if (positiveNum % 2 == 0) {
		System.out.println("짝수");
	} else {
		System.out.println("3의 배수");
	}
	*/
	
	if (positiveNum % 3 == 0) {
		System.out.println(positiveNum + "은(는) 3의 배수입니다.");
	} else if (positiveNum % 2 == 0) {
		System.out.println(positiveNum + "은(는) 3의 짝수입니다.");
	} else {
		System.out.println(positiveNum + "은(는) 3의 홀수입니다.");
	}
	
	sc.close();
}
}