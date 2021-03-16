package ex03_input;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		//2.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수1");
		double number1 = sc.nextDouble();
		
		System.out.println("실수2");
		double number2 = sc.nextDouble();
		
		/* double x = number1;
		double y = number2;
		double temp = x;
		x = y;
		y = temp;
		System.out.println("실수1 :" + x);
		System.out.println("실수2 :" + y);
		*/
		
		double temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("number1=" + number1 + ", number2=" +number2);
		
		sc.close();
	 

	}

}
