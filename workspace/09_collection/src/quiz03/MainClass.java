package quiz03;

import java.util.HashSet;
import java.util.Set;

// 로또 번호 6개를 HashSet에 저장하기

public class MainClass {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		while (lotto.size() != 6) {
			lotto.add((int)(Math.random() * 45) + 1);  // 6번하면 똑같은게 또 들어갈 수 있고, 자바는 여기서 똑같은게 나오면 넣지 않는다. 
		}											// 그래서 로또 번호가 6개 완성될때까지 하는걸로 설정해준다.
		
		
		
			System.out.println(lotto);
		
		
		
	}

}
