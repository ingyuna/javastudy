package ex02_operator;

public class Ex01_operator {

	public static void main(String[] args) {
		
		// 1. 산술연산자: +, -, *, /, %
		System.out.println(7 + 2); // 9
		System.out.println(7 - 2); // 5
		System.out.println(7 * 2); // 14
		System.out.println(7 / 2); // 3 (몫)
		System.out.println(7 % 2); // 1 (나머지)
		
		System.out.println(7.0 / 2.0); // 3.5 (나누기 연산)
		
		// 2. 증감연산자: ++, --
		int a = 10;
		System.out.println(++a); // 11, a를 먼저 증가시키고 출력한다.
		System.out.println(a++); // 11, a를 먼저 출력시키고 증가시킨다.
		
		int b = 10;
		System.out.println(--b); // 9, b를 먼저 감소시키고 출력한다.
		System.out.println(b--); // 9, b를 먼저 출력시키고 감소시킨다.
		System.out.println(a + b); // 20, 12 + 8로 연산된 결과이다.
		
		// 3. 대입연산자: =, +=, -=, *=, /=, %=
		// 문제) x와 y를 교환해 봅니다.
		int x = 1;
		int y = 2;
		int temp = x; // x를 temp에 백업해 둔다.
		x = y; // x는 y가 되었다.
		y = temp; // y는 백업해 둔 x가 되었다.
		System.out.println(x);
		System.out.println(y);
		
		// a += 1 : a = a + 1
		// a -= 1 : a = a - 1;
		// a *= 1 : a = a * 1;
		// a /= 1 : a = a / 1;
		// a %= 1 : a = a % 1;
		// 문제. money를 5% 증가시켜보세요.
		int money = 100;
		money += (int)(money * 0.05);
		System.out.println(money);
		
		// money *= 1.05; -> 이런식의 접근도 좋다.
		// money *= 0.95; -> 0.5% 감소했다면 이렇게.
		
	}

}
