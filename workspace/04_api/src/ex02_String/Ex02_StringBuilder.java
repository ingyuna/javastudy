package ex02_String;

// String의 +연산자를 많이 사용하면 성능이 떨어집니다. (=불필요하게 메모리에 흘리고 다니는게 많아서 속도가 떨어진다)

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		
		// java.lang.StringBuilder   -> import가 필요없다.
		
		// 문자열 생성
		StringBuilder sb = new StringBuilder("hello");
		

		// 문자열 추가 (핵심 메소드) 
		sb.append(" ").append("java");    // 이렇게 하는 이유는 메모리 크기가 불필요하게 많아지지않고 그냥 넓혀준다.
		
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		// 문자열 비교 
		System.out.println(sb1.equals(sb2));  // 결과값이 false라고 나온다. 왜 다르다고 나올까?
												// String이 아니라서 비교 못합니다. (정확하게는 스트링빌더가 아니라서)
		
		// 문자열로 변환해 봅시다.
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2));
		
		
		
		
		
		
	}

}
