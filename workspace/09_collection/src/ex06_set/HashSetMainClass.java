package ex06_set;

import java.util.HashSet;
import java.util.Set;

/*
 	HashSet 클래스
 	1. Set 인터페이스를 구현한 클래스입니다.
 	2. 기본 특징
 	 	1) 인덱스가 없습니다. (순서가 없다.)     => 먼저 저장, 나중에 저장 이런 개념이 없음.
 	 	2) 중복 저장이 불가능합니다. 
 	3. 기본적인 사용법은 List와 같지만, 인덱스가 없음에 주의합니다. 	
 */

public class HashSetMainClass {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("java");
		set.add("jsp");
		set.add("jsp");
		set.add("spring");
		set.add("spring");

		System.out.println("요소 개수: " + set.size());
		
		for (String s : set) {
			System.out.println(s);
		}
		

	}

}
