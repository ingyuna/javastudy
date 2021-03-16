package ex01_branch;

public class Ex01_if {

	public static void main(String[] args) {
		
		/*
		if (true) {
			System.out.println("만족합니다."); 
			}
	    if (false) {
			System.out.println("만족합니다."); 
			} 
	 --> 이렇게 하게 되면 dead code가 발생한다. *dead code = 전혀 실행되지 않는 코드 */
		
	/*	 int score = 60;
		 boolean isPass = (score >= 60);
		 if (isPass) {
			 System.out.println("합격");			 
		 } else {
			 System.out.println("불합격");
		 }
	}
     
	
	int score =50;
	 
	 if (score >= 60) {
		 System.out.println("합격");			 
	 } else {
		 System.out.println("불합격");
	 }
    */
	
		
	int score = 50;
	
	// 80이상 : "상", 70 ~ 60 : "중", 59 이하 : "하"
	if (score >= 80 ) {
		System.out.println("상");
	} else {
		if (score >= 60) {
			System.out.println("중");
		} else {
			System.out.println("하");
		}
	}
	
	if (score >= 80) {
		System.out.println("상");
	} else if (score >= 60) {
		System.out.println("중");
	} else {
		System.out.println("하");
	}
	
	// -> 위 아래는 같은 코드인데 아래가 더 선호도가 높다.
	
	
	
	}
	
	
	
	
	
	
	
}
