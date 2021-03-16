package ex02_operator;

public class Ex03_operator {

	public static void main(String[] args) {
		
		// 6. 조건 연산자 (삼항 연산자)
		// 조건식 ? true일 때 : false일 때    ---> if문의 연산자 버젼
		
		int score = 70;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		// 문제1. 평균이 85점 이상이거나, 국어와 영어 점수가 모두 80점 이상이면 "합격", 아니면 "불합격"
		int kor = 80;
		int eng = 90;
		boolean isPass = ((kor + eng) / 2 >= 80) || (kor >= 80 && eng >= 80); // 평균 구하기를 무조건 하는 버젼. 아래는 안 할 수도 있는 버젼. 
		// boolean isPass = (kor >= 80 && eng >= 80); ((kor + eng) / 2 >= 80);  두 위치를 바꿔보면 논란의 여지가 있다. 위에 보다 이 버젼이 효율이 더 높다. 앞에가 true이면 뒤에를 계산 안하니까 뒤에 평균도 구하지 않기 때문에.
		System.out.println(isPass ? "합격" : "불합격");
		
		
		// 문제2. 2자리(10~99) 정수 중에서 하나를 임의로 선언하고, 
		// 그 값이 '카프리카 수'이면 "맞다", 아니면 "아니다"
		// 45, 55, 99가 카프리카 수 입니다.
		int n = 45; // 45 * 45 -> 2025  -> 20 25 -> 20 + 25 -> 자신 
		int square = n * n; // Math.pow(n, 2) == n * n
		int front = square / 100; // 100으로 나눴을 때 몫
		int end = square % 100; // 100으로 나눴을 때 나머지
		boolean isKaprekar = ( n == front + end);
		System.out.println(isKaprekar ? "맞다" : "아니다");
		
	}

}
