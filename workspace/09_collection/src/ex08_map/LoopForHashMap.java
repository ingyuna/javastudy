package ex08_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopForHashMap {

	public static void main(String[] args) {
		
		Map<String, String> me = new HashMap<String, String>();
		me.put("name", "민경태");
		me.put("age", 44 + "");        // 변수로 저장된다고 하면 "44" 이렇게 따옴표로 묶을 순 없으니까 요렇게 연습하는게 더 도움이 된다.
		me.put("phone", "010-8725-4966");
		
		// 1. 향상 for문은 Key를 뺍니다.  (Key를 이용해서 Value를 빼기 때문입니다.)
		// me에서 Key만 빼는 메소드 : kesSet()    ->  key들을 다 빼서 Set로 만들어서 반환한다는말. 
		Set<String> keys = me.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + me.get(key));
		}
		
		// 2. Iterator 인터페이스
		
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			String value = me.get(key);
			System.out.println(key + ": " + value);
		}							 		// while문으로 구성됐을 뿐 위에 for문과 똑같다.
											// 1번과 2번의 공통점은 keySet()를 이용했다는거. 사람에 따라 사용하는게 다르다.
							// * 참고로 Iterator while문은 여기서 끝. 한번 더 못 쓴다. 1회용이다. 다시 만들어서 쓰는 수 밖에 없다.
		
		// 3. 데이터 쌍(pair)으로 뺄 수 있습니다.
		// entry : key와 value를 묶어서 entry라고 합니다.
		// key : getKey()
		// value : getValue()
		Set<Map.Entry<String, String>> entrys = me.entrySet();

		// 1) for
		for (Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
		// 2) Iterator
		Iterator<Map.Entry<String, String>> itr2 = entrys.iterator();
		while (itr2.hasNext()) {
			Map.Entry<String, String> entry = itr2.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
		
		
		
		
	}

}
