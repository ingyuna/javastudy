package ex01_branch;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
	
	/* 5. Switch, 점수를 입력 받아서 해당하는 학점을 출력하시오.
	char grade : 'S', 'A', 'B', 'C', 'F'
	char poinrt : '+', '0', '-', ' '
	
	 100    :   S
	 99~97 : A+
	 96~94 : A0
	 93~90 : A-
	 89~87 : B+
	 86~84 : B0
	 83~80 : B-
	 79~77 : C+
	 76~74 : C0
	 73~70 : C-
	 69~0   : F         */
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("점수를 입력하세요 >>> ");
	
	int score = sc.nextInt();
	
	//먼저 포인트 계산을 해준다.
	char point = '-';  //기본값  
	switch (score % 10) { // s랑 f 빼고 뒷자리만 보면 9~7 : + , 6~4 : 0, 3~0 : -
	case 9:	case 8:	case 7:
		point = '+';
		break;
	case 6: case 5: case 4:
		point = '0'; // 마지막은 case던 default던 break가 필요 없기 때문에 생략. 
	}
	  
	// 그다음에 grade 계산
	
	char grade = 'F';
	switch (score / 10) {
	case 10:   //->100점
		grade = 'S';
		point = ' ';  // 공백이니까 빈칸을 준다.
		break;
	case 9:
		grade = 'A';
		break;
	case 8:
		grade = 'B';
		break;
	case 7:
		grade = 'C';
		break;
	default:
		point = ' ';
	}
	
	
	/* System.out.println(grade + point); 이렇게 하면 문제가 생기는이유 : 코드값을 더하기 때문. */ 
    
	System.out.println("" + grade + point); //앞에를 문자열로 바꿔준다.
	System.out.println(grade + "" + point); // 자바는 세개를 연속 못 더한다. 그래서 처음에 앞에 두개만 계산을 하고 뒤에까지 문자열로 계싼.
	System.out.println(grade + point + ""); // 위에 두개는 되지만 이건 안된다. 위에서 얘기했듯이 앞에 두개가 코드값을 이미 더하고 난후고 뒤에 ""이게 너무 늦게 나왔기때문이다.
	
	
    sc.close();	
    
    }
	
}


