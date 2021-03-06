package ex01_random;

// 1. 임시비밀번호 발급하기
// 영문대문자 + 아라비아숫자 6자리
// 약 5:5

public class Quiz01 {

	public static void main(String[] args) {
		
		// 방법1.
		char[] charSet = { '0', '1', '2', '3', '4', '5',
							'6', '7', '8', '9', 'A', 'B', 
							'C', 'D', 'E', 'F', 'G', 'H', 
							'I', 'J', 'K', 'L', 'M', 'N',
							'O', 'P', 'Q', 'R', 'S', 'T',
							'U', 'V', 'W', 'X', 'Y', 'Z'
				};   // 이렇게 일일이 써서 힘들지만 만들어 놓으면 관리하기 편하다. 특수문자 등 추가 할 수도 있음. 
		
		// 인덱스를 랜덤하게 생성합니다. 0 <= random < charSet.length
		
		String tempPw = "";  // 빈 문자열로 초기화 해준다.
		for (int n = 0; n < 6; n++) { // 6번 반복을 의미합니다.
			int idx = (int)(Math.random() * charSet.length) + 0;  // 뒤에 +0은 생략 가능.
			tempPw += charSet[idx];
		}
		System.out.println(tempPw);
		
		// 방법2.
		// 문자 == 정수
		// '0' ~ '9' == 48 ~ 57
		// 'A' ~ 'Z' == 65 ~ 90
		// 'a' ~ 'z' == 97 ~ 122
		// -> 이건 외울필요는 없고 그냥 이런게 있다하는 정도만 알아두자.
		// 1번 방법 필요없이 이렇게도 만들 수 있음.
		
		String tempPw2 = "";
		for (int n = 0; n < 6; n++) {
			if (Math.random() < 0.5) {
				int arabia = (int)(Math.random() * 10) + '0'; // -> 1번 방법(charSet) 필요 없이 10개를 만드는거.
				tempPw2 += (char)arabia;
			} else {
				int alphabet = (int)(Math.random() * 26) + 'A';  
				tempPw2 += (char)alphabet;
			}
				}
		
		System.out.println(tempPw2);
		
		
		
		}
		
	}


