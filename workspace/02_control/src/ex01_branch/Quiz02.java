package ex01_branch;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

	/* // 2. 나이를 입력 받아서 구분 출력 
   7이하 : "미취학아동"
   13이하 : "초등학생"
   16이하 : "중학생"
   19이하 : "고등학생"
   20이상 : "성인"
   나이 범위(1~100)를 벗어나면 : "불가능한 나이" */
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("나이 입력 >>> ");
	int age = sc.nextInt();
	
	if (age <= 7) {
		System.out.println("미취학아동");
/* else if (age <= 13) {
		System.out.println("초등학생"); 
	} else (age <= 16) {
		System.out.println("중학생");
	} else (age <= 19) {
		System.out.println("고등학생");
	} else (age >= 20) {
		System.out.println("성인");
	} else {
		System.out.println("불가능한 나이");
	}
		*/
		
	if (age < 1 || age > 100) {
		System.out.println(age + "살은 불가능한 나이입니다.");
	} else if (age <= 7) {
		System.out.println(age + "살은 불가능한 미취학아동 입니다.");
	} else if (age <= 13) {
		System.out.println(age + "살은 불가능한 초등학생 입니다.");
	} else if (age <= 16) {
		System.out.println(age + "살은 불가능한 중학생 입니다.");
	} else if (age <= 19) {
		System.out.println(age + "살은 불가능한 고등학생 입니다.");
	} else {
		System.out.println(age + "살은 불가능한 성인 입니다.");
	}
    sc.close();
    
	}
}
}