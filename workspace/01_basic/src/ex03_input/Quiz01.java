package ex03_input;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1.
		System.out.println("점수1 >>> ");
		int score1 = sc.nextInt();
		System.out.println("점수2 >>> ");
		int score2 = sc.nextInt();
		System.out.println("점수3 >>> ");
		int score3 = sc.nextInt();
		
		double ave = (score1 + score2 + score3) / 3.0;
		System.out.println("평균 :" + ave + "점");
		
		sc.close();
		
		
				

	}

}
