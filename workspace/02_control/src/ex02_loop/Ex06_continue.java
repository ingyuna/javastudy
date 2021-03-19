package ex02_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
		
		// continue문
		// 1. loop문으로 되돌아가서 다시 실행합니다.
		// 2. continue문 이후의 코드를 실행하지 않기 위해서 사용합니다.
		
		/*
		int n = 1;
		while (n <= 10) {
			if (n % 2 == 1) { // 홀수는 출력합니다.
				System.out.println(n);
			}
			n++;
		}
		*/
		
		
		// 위와 같은 출력값이 나온다.
		// continue는 없어도 구현할 수 있지만 있으면 편할 때가 있다. (필수코드까지는 아님). 실무에서도 잘 안보인다.
		// break는 필수!
		
		
		/*
		int n = 1;
		while (n <= 10) {
			if (n % 2 == 0) { // 짝수는 while문으로 돌려보냅니다.
				n++;
				continue;
			}
			System.out.println(n);
			n++;
		}
		*/
		
		// 위에와 똑같은걸 for문 버젼으로 짜면 더 괜찮을 수 있다. (아래 for문)
		
		/*
		for (int n = 1; n<= 10; n++) {
			if (n % 2 == 0) {
				continue;
			}
			System.out.println(n);
		}                      // 본문에서 올라갈 때는 둘 다 n++로 돌아간다. (continue -> n++로 돌아감)
		*/
		
		// 가독성은 당연히 continue보다 for문이 더 좋다. 
		
		
		// 소원을 3개 들어줍니다.
		// 안 되는 소원은 "로또당첨"입니다. 나머지 소원은 모두 들어줍니다.
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		String wishList = "";
		while (count < 3) {
			System.out.println("소원을 말해보세요");
			String wish = sc.next();
			if (wish.equals("로또당첨")) {
				continue;      //카운팅안하고 위로 돌려보내겠다. 카운트를 안하면 소원3개에는 포함 x. 
			}
			wishList += wish;
			count++;
		}
		System.out.println(wishList);
		
		sc.close();
		
		
}
}

