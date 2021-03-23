package ex05_list;

import java.util.ArrayList;
import java.util.List;

/*
 	ArrayList 클래스
 	1. List 인터페이스를 구현한 클래스입니다.  ( * collection은 모두 generic 기반 => 모든지 가능함. 구체화해서 정해줘야한다)
 	2. 생성방법
 		1) ArrayList<E> list = new ArrayList<E>();
 		2) List<E> list = new ArrayList<E>();  -> Array 생략 가능 : List가 부모 클래스니까! 그리고 List처럼 항상 인터페이스가 타입이 되는거다.
 	3. 배열을 구현한 클래스입니다. 자동으로 길이를 조정합니다.
 	4. 장점: 순차적인 접근이 빠르다.
 	5. 단점: 중간 위치에 추가/삭제가 느리다.   (Ex: 첫번째가 삭제되면 그 다음것들이 차례로 앞으로 밀려오는 오버헤드가 발생한다)
 	// ** 추가/삭제가 자주 발생하지 않는 시스템에서 쓰면 좋은게 -> ArrayList이다.
 */

public class ArrayListMainClass {

	public static void main(String[] args) {
		
		// 1. 생성
		List<String> list = new ArrayList<String>();    // <> 여기는 '요소'라고 한다. 
		
		// 2. 추가
		list.add("브레드");
		list.add("짱구");
		list.add("자두");
		list.add("둘리");
		list.add("띠띠뽀");
		
		// 3. 삭제 
		list.remove(0);
		list.remove("짱구");
		
		// 4. 크기
		System.out.println("리스트의 길이: " + list.size());
		
		// 5. 포함 여부 확인 
		if (list.contains("둘리")) {
				System.out.println("둘리가 있습니다.");
		} else {
			System.out.println("둘리가 없습니다.");
		}
		
		// 6. 요소 가져오기
		System.out.println("첫 번째 요소: " + list.get(0));
		System.out.println("마지막 요소: " + list.get(list.size() - 1));
		
		// 7. 전체 순회
		// 1) 일반 for문
		int length = list.size();  // size() 메소드 호출을 1번만 진행하도록 변수에 저장해 둡니다.
		for (int i = 0; i <length; i++) {
			System.out.println((i + 1) + "번째 요소: " + list.get(i));
		}
		// for (int i = 0, length = list.size(); i <lenght i++) {  -> 이렇게 작성할 수도 있다.
		
		// 아래꺼는 성능이 안좋아서 위에껄로 향상시킴. list.size()를 한번만 부르게 함. 반복문에서 여러번 호출되는 메소드가 있다면 어떻게든 그걸 조정할 수 있는지 점검해야 한다. 
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 요소: " + list.get(i));
		}
		*/
		
		// 2) 향상 for문
		for (String element : list) {
			System.out.println(element);
		}
		
		// 8. 출력
		System.out.println("한 번에 출력: " + list);
		
		// 9. 초기화
		list.clear();
		System.out.println("한 번에 출력: " + list);
	}
}
