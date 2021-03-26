package ex01_char;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderMainClass {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("text3.txt"))) {
			/*
			StringBuilder sb = new StringBuilder();
			char[] cbuf = new char[5];
			while (true) {
				int readCharCount = br.read(cbuf);
				if (readCharCount == -1) {
					break;
				}
				sb.append(cbuf, 0, readCharCount);    // 읽은 글자 수만큼만 sb에 저장합니다.
			}
			System.out.println(sb.toString());   // sb만 하면 일반 객체이기 때문에 출력값으로 주소값이 나온다. 그래서 toString을 붙여준다.
			*/
			// 아까와 같은 줄임 버젼
			StringBuilder sb = new StringBuilder();
			char[] cbuf = new char[5];
			int readCharCount = 0;
			while ( (readCharCount = br.read(cbuf)) != -1 ) {
				sb.append(cbuf, 0, readCharCount);
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
