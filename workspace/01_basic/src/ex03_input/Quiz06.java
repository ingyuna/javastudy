package ex03_input;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
	
		//6.주민번호(하이픈 없이) 전체 입력 받아서 "남", "여" 구분 출력하기
		
	Scanner sc = new Scanner(System.in);	

	System.out.println("주민번호입력(하이픈없이) >>> ");
	// 13자리를 처리할 수 있는 숫자타입 = int는 불가 -> 1. Long 타입으로 받는 방법이 있을 수 있고, 2. 숫자지만 문자열로 입력을 받는 방법 (2번을 쓰는게 좋다. 이유는 0으로 시작하는 번호가 있을 수 있기때문)
	
	String id = sc.next();
	char genderNum = id.charAt(6); //7번째자리지만 인덱스로 하면 6번째자리.
	
	// String gender = (genderNum == '1' || genderNum == '3') ? "남자" : "여자";   --> 1번 방법
	
	/* 
	    문자는 코드값을 가지고 있다.
	    문자를 연산하는 경우 "코드값"이 연산된다.
	  '1' % 2 --> 49 % 2 (=>아라비아 숫자 1의 코드값은 49) 
	  '2' % 2 --> 50 % 2 (=>아라비아 숫자 2의 코드값은 50)
	     --> 그래서 이렇게 운좋게 그럴듯한 결과가 나온거다.
	   --------
	   알아두면 좋은 코드 값
	  '0' : 48
	  'A' : 65
	  'a' : 97 
	  --> 이렇게 시작하는 값의 코드값을 알면 다음꺼를 알 수 있다. Ex: 'B' : 66... 이런식으로 차례대로 증가.     
	 */
	
	
	String gender = (genderNum % 2 == 1) ? "남자" : "여자";   // ---> 2번 방법
	
	// -> 여기서 2번 방법은 결과를 보면 되는것처럼 보인다.
	
	System.out.println("성별은 " + gender + "입니다.");
	
	sc.close();
	
	
	}

}
