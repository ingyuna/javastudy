package ex01_char;

import java.io.FileReader;
import java.io.IOException;

/*
	FileReader 클래스
	1. "문자 기반 + 입력 스트림"입니다. (Reader)
	2. 문자를 읽을 때 사용합니다.
		1) 통신 : 상대방이 보낸 문자를 받을 때
		2) 파일 : 텍스트 파일을 읽을 때
	3. 입력 메소드 
	  	read() 
	4. 입력 단위
		char[], int
	5. 예외 처리가 필요합니다.
*/	


public class FileReaderMainClass {

	public static void main(String[] args) {
		
		try (FileReader fr = new FileReader("text1.txt")) {
			
			
			// read() 메소드를 이용해서 읽기  -> 기본적으로 필요한건 int(정수)이다.
			/*
			while (true) {
				int ch = fr.read();  // 읽은 문자 또는 -1이 ch에 저장됩니다.
				if (ch == -1) {   // -1이면 모두 읽은거니까 멈춰라. 
					break;
				}
				System.out.print((char)ch);   // 파일 전체를 읽어주는 코드.  -> 꼭 print로 해서 라인을 맞춰라.
			}
			*/
			int ch = 0;
			while ( (ch = fr.read()) != -1) {     // -1이 아니면 보여주겠다고 말만 바꿈. 위에랑 코드는 똑같다. 코드를 줄인거. 
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
