package ex07_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 	Iterator 인터페이스
 	1. Collection(List, Set)을 순회하는 경우에 사용합니다.
 	2. "반복자"라고 합니다.
 	3. 순회를 하고자 하는 Collection에 iterator() 메소드를 부착해서 생성합니다.
 	4. 인덱스 유무와 상관없이 사용합니다.   *인덱스 없는 구조 -> List, 있는 구조 -> Set 
 */

public class IteratorMainClass {

	public static void main(String[] args) {
	
		Set<String> set = new HashSet<String>();
		
		set.add("movie");
		set.add("music");
		set.add("sport");
		
		// set를 순회할 수 있는 Iterator 객체 생성
		
		//Iterator<String> itr = new Iterator;		-> new Iterator는 안됨.  이유는? 인터페이스니까. 인터페이스는 본문이 없다. 껍질밖에 없음(=추상메소드 밖에 없음) 
															// -> 모든 인터페이스는 new가 불가능하다.
		
		Iterator<String> itr = set.iterator();   // set를 순회할 수 있는 itr 객체 생성
		
		// hasNext() : 다음 요소가 있으면 true, 없으면 false를 반환한다.
		// next() : 다음 요소를 가져온다. 
		while (itr.hasNext()) {  // set에 남아있는 요소가 있으면,
			String str = itr.next();   // 저장된 요소를 가져와서 str에 저장
			System.out.println(str);
		}
		
		List<String> list = new ArrayList<String>();
		list.add("운동");
		list.add("뜨개질");
		list.add("요리");
		
		Iterator<String> itr2 = list.iterator();
		
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}

}
