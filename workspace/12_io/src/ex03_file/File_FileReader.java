package ex03_file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_FileReader {

	public static void main(String[] args) {
		
		File file = new File("C:\\MyTemp\\text.txt");
		
		try (FileReader fr = new FileReader(file)) {
			int ch = 0;
			while ( (ch = fr.read()) != -1) {  // fr이 종료되지 않았다면 fr에서 한 글자를 읽어 ch에 저장합니다.
				System.out.print((char)ch);   // -> ch가 int여서 char로 바꿔준다. 이거 안쓰면 숫자만 쫘르륵 나온다. 잘못된게 아니라 코드값인거.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		

	}

}
