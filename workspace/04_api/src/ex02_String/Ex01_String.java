package ex02_String;

public class Ex01_String {

	public static void main(String[] args) {
		
		// 1. 동일한 문자열 리터럴은 자바에 의해서 최적화 되기 때문에
		//     "apple"이 하나만 생깁니다.
		String a = "apple";
		String b = "apple";
		System.out.println(a == b);  // 참조비교(주소비교) --> apple 비교한게 아님. 값이 true라고 나오면 그 주소값이 같다는말.
		                    // 자바가 스스로 개입해서 하나만 쓴다. 최적화를 위해서
							// apple은 지금 하나만 있는거. 각 a와 b는 그 주소가 들어가 있는것.
		
		// 2. new는 무조건 새로 만듭니다.
		// 		"banana"는 2개가 있습니다.
		String c = new String("banana");
		String d = new String("banana");
		System.out.println(c == d);  // 참조비교(주소비교)  --> false라고 나온다. 주소 값이 다르다는말.
		
		// 3. 문자열의 길이는 length() 메소드로 구합니다.
		System.out.println(a.length());  // 5  (한글이든 영어든 글자수를 의미)
		
		// 4. 문자열의 일부를 추출하는 경우에는 substring() 메소드를 사용합니다.
		// 1) substring(시작인덱스): 시작인덱스부터 끝까지 추출합니다.
		// 2) substring(시작인덱스, 종료인덱스): 시작인덱스 <= 추출한문자열 < 종료인덱스
		System.out.println(a.substring(0, 3)); // app (사용인덱스 : 0, 1, 2)
		
		// 5. 문자열 양 옆의 공백문자(white space)를 제거하려면 trim() 메소드를 사용합니다.
		String name = "   alice    ";
		System.out.println(name.trim().length());   // 양 옆의 공백을 모두 제거하고 alice만 남깁니다.
		                                            // 출력값 => 5 
		
		// 6. 특정 문자를 찾는 경우에 indextOf() 메소드를 사용합니다.
		//    찾고자 하는 문자(문자열)의 인덱스를 반환합니다.
		String str = "best of best of best";
		System.out.println("첫 번째 best의 인덱스: " + str.indexOf("best"));  // 처음부터 BEST를 검색합니다.
														// 출력값 => 0
		System.out.println("두 번째 best의 인덱스: " + str.indexOf("best", 4)); // 인덱스4부터 best를 검색합니다. 
		System.out.println("두 번째 best의 인덱스: " + str.indexOf("best", str.indexOf("best") + 1));
		                       									// 문자열 parsing할때 쓰는 기법. 바로 위에랑 같은 식이다. 
																// 근데 위에보다 이게 더 나음. 
																// String str = 이게 "best of best of best"; 라는걸 모를때.
		System.out.println("찾는 문자(열)이 없으면" + str.indexOf("v") + "이 나타납니다.");    // -1
		
		
		// 7. 뒤에서부터 검색하는 lastindexOf() 메소드가 있습니다.
		System.out.println("마지막 best의 인덱스: " + str.lastIndexOf("best"));
		
		// 8. 기존 문자를 새로운 문자로 변경하는 replace() 메소드가 있습니다.
		System.out.println(str.replace("b", "B"));    // -> 하나만 변경되는게 아니라 모든 문자열이 변경된다.
		System.out.println(str.replace("f", "")); // "f"를 지웁니다.
		                            // 업로드 다운로드할때 리플레이스 작업이 필요할 수 있다. 내려받기, 올리기 경로 파일명 
		
		
	}

}
