package ex03_input;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
	//4.
		
	Scanner sc = new Scanner(System.in);

	System.out.print("매출액 >>> ");
	int salesMoney = sc.nextInt();	// salesMoney -> lower camel case
	System.out.println("등급 >>> ");
	String grade = sc.next();
	
    // grade == "VIP" --> 스크립트에서는 이렇게 grade.equals("VIP") -> 자바에서는 이렇게. grade가 VIP와 같은지 비교하는거.
    // double disCountRate = grade.equals("VIP") ? 0.2 : 0.05;
	
	double disCountRate = grade.equalsIgnoreCase("VIP") ? 0.2 : 0.05;  // -> 대소문자 무시할 수 있는 코드
	salesMoney -= (salesMoney * disCountRate); // int * double 타입을 맞춰주기 위해서 내부적으로 promotion(자동 형변환)이 진행됨. 소수점이 나올때 무시하고 잘라버려서 값을 보여줌.
	
	System.out.println("실 매출액: " + salesMoney);
	
	sc.close();
	
	
	
	
	
	
	
	
	
	
	}

}
