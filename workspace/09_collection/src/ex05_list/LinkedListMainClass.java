package ex05_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
	LinkedList 클래스
	1. List 인터페이스를 구현한 클래스입니다. 
	2. 생성방법
		1) LinkedList<E> list = new LinkedList<E>();
		2) List<E> list = new LinkedListList<E>();  -> Array 생략 가능 : List가 부모 클래스니까! 그리고 List처럼 항상 인터페이스가 타입이 되는거다.
	3. 연결리스트를 구현한 클래스입니다. 자동으로 길이를 조정합니다.
	4. 장점: 모든 위치에 추가/삭제가 빠르다.
	5. 단점: 순차적인 접근이 느리다.
	
	* 같은 인터페이스를 구현하면 사용법이 같다. 그래서 앞에서 했던 ArrayList 코드를 그냥 LinkedList라고만 바꿔주면 된다. 
*/

public class LinkedListMainClass {

	public static void main(String[] args) {
		
		// ArrayList와 LinkedList의 사용법은 같습니다.
		
		// 성능비교
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		// 1. 추가 (인덱스 0에 데이터 추가)
		long start1 = System.nanoTime();   // 10억분의 1초 단위 
		for (int n = 1; n <= 10000; n++) {
			list1.add(0, n);
		}
		long end1 = System.nanoTime();
		System.out.println("ArrayList 삽입 소요시간: " + (end1 - start1) + "ns");   // ns = nano seconds
		
		long start2 = System.nanoTime();   // 10억분의 1초 단위 
		for (int n = 1; n <= 10000; n++) {
			list2.add(0, n);
		}
		long end2 = System.nanoTime();
		System.out.println("LinekdList 삽입 소요시간: " + (end2 - start2) + "ns");
		
		// 2. 순회
		long start3 = System.nanoTime();
		for (int i = 0, length = list1.size(); i < length; i++) {
			list1.get(i);
		}
		long end3 = System.nanoTime();
		System.out.println("ArrayList 순회시간: " + (end3 - start3) + "ns");
		
		long start4 = System.nanoTime();
		for (int i = 0, length = list2.size(); i < length; i++) {
			list2.get(i);
		}
		long end4 = System.nanoTime();
		System.out.println("LinkedList 순회시간: " + (end4 - start4) + "ns");
		
		
		
	}

}
