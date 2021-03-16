package ex03_input;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		
		// Scanner 클래스
		// 1. 패키지: java.util (=java 패키지 안에 util이라는 폴더가 있고 그 안에 Scanner가 있는거)
		// 2. import가 필요하다. (=내부에 있지 않고 외부에 있다면 불러들여서 쓰겠다는 뜻)
		//    - import가 필요 없는 패키지: java.lang (자바랭) => 자바 랭귀지라는 뜻. (Ex: System 클래스 / String 클래스_
		// 3. 메소드 
		// 	  1) nextInt() : int 입력
	    //    2) nextLong() : long 입력
		//    3) nextDouble() : double 입력
		//    4) next() : String 입력 (공백 없는 String)
		//    5) nextLine() : String 입력 (공백 있는 String)
		//    *참고로 문자(char)입력 메소드는 없음. 위에 String을 활용해서 문자 입력을 받으면 되기 때문에.
		
		// 입력을 위해서는 "표준 입력 스트림"을 사용한다.
		// 표준 입력 스트림: System.in  --> 키보드에 연결된 통로 / * 표준 출력 시스템: System.out
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 이름 입력하기
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine(); // 이름에 공백이 가능하다.
		
		// 2. 나이 입력하기
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		// 3. 키 입력하기
		System.out.println("키를 입력하세요");
		double height = sc.nextDouble();
		
		// 4. 성별 입력하기
		System.out.println("성별을 입력하세요");
		char gender = sc.next().charAt(0); // charAt()에서 괄호안에 index값(=배열).첫번째 글자만 입력받을거니까 0
		// -> 성별이 "남자"라고 두글자로 입력되도 "남"만 나올거임.
		
		// 5. 정보 확인하기
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(gender);
		
		// 6. 스트림 닫기
		sc.close(); // 생략이 가능하다. (->jvm이 알아서 해주기 때문)
		
		
		
	}

}
