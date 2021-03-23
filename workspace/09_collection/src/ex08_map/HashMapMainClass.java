package ex08_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMainClass {

	/*
	 HashMap 클래스
	 1. Map 인터페이스를 구현한 클래스입니다.
	 2. 데이터를 쌍(pair)으로 저장하는 클래스입니다.   Ex: 네이버 도메인 주소 - IP   두개를 합친 하나의 데이터.
	 3. 키(key)-값(value)의 쌍으로 저장됩니다. 
	 	1) 키(key) : 중복이 불가능합니다.
	 	2) 값(value) : 중복이 가능합니다. 
	 4. 인덱스의 역할을 키(key)가 수행합니다. 	
	 */
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> sungjuk = new HashMap<String, Integer>();      // 일반적으로 key는 String이다. 다른건 거의 x
										// * 참고로 저렇게 한글 이름을 그대로 쓰는건 '공공기관'에서 많이 쓴다.
		
		// 1. 추가 : put(key, value)
		sungjuk.put("지구력", 80);
		sungjuk.put("근력", 70);
		sungjuk.put("인내력", 90);

		sungjuk.put("지구력", 100);      // 기존 지구력을 덮어씁니다. 오류는 안난다. (key값이 중복됨) 
		
		// 2. 삭제 : remove(key)
		sungjuk.remove("근력");
		
		// 3. 요소 가져오기 : get(key)
		System.out.println("지구력: " + sungjuk.get("지구력"));
		System.out.println("인내력: " + sungjuk.get("인내력"));
		
		// 4. 크기 
		System.out.println("저장된 데이터 개수: " + sungjuk.size());
		
		// 5. 출력
		System.out.println(sungjuk);
		
		// 6. 순회는 방법이 많아서 따로 진행합니다.
		
		
	}

}
