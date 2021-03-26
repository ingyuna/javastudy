package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

/*
 	FileWriter 클래스
 	1. "문자 기반 + 출력 스트림"입니다. (Writer)
 	2. 문자를 보낼 때 사용합니다.
 		1) 통신 : 상대방에게 문자를 보낼 때
 		2) 파일 : 텍스트 파일을 만들 때 
 	3. 출력 메소드 
 	  	write() 
 	4. 출력 단위
 		char[], String, int
 	5. 예외 처리가 필요합니다.
 */	


public class FileWriterMainClass {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("text1.txt");   // text1.txt 파일이 생성됩니다. 
			// text1.txt 파일로 전송할 데이터 
			char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
			String str = " Java";
			int ch = '!';                // char : 2byte int : 4byte  -> 4byte 공간에 2byte만 담아서 쓰고 나머지 2byte는 담지 않는다. 두개 이상 담을때는 배열을 쓴다.
			String str2 = "Nice to meet you!";
			// text1.txt 파일로 데이터 전송하기 
			fw.write(cbuf);
			fw.write(str);
			fw.write(ch);;
			fw.write('\n');   // write 메소드는 줄바꿈이 필요할때 이렇게 직접 넣는다. 
			fw.write(str2);
			System.out.println("text1.txt 파일이 생성되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) { fw.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
