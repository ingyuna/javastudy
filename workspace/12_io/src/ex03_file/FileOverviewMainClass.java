package ex03_file;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;


/*
 	File 클래스
 	1. 파일을 조작하는 클래스입니다.
 	2. 파일 생성, 삭제, 파일명, 파일크기, 수정날짜 등의 확인이 가능합니다.
 
 */

public class FileOverviewMainClass {

	public static void main(String[] args) {
		
		// 디렉터리 조작
		File dir = new File("C:\\MyTemp");    // 경로 구분 (\\ == File.separator)
		// File dir = new File("C:" + File.separator + "MyTemp"); // Linux와 Windows 호환용 
		
		System.out.println(dir.exists());  // 존재하는 경로이면 true 반환, 아니면 false 반환
		
		if ( dir.exists() == false ) {  // if ( !dir.exists() ) {  존재하지 않는 dir이면        * ! = not 연산자
			dir.mkdirs();    // dir 디렉터리를 생성합니다.
			System.out.println("MyTemp 디렉터리가 생성되었습니다.");
	}
		/*
		if ( dir.exists() == true ) {  // if ( dir.exists() ) {  * 주석 코드가 더 좋습니다.
			dir.delete();   // dir 디렉터리를 삭제합니다. 
			System.out.println("MyTemp 디렉터리가 삭제되었습니다.");
		}
		*/
		
		// 파일 조작
		File file = new File("C:\\MyTemp\\MyFile.txt");
		//File file = new File("C:\\MyTemp", "MyFile.txt");
		//File file = new File(dir, "MyFile.txt");   // File dir = new File("C:\\MyTemp");
		
		System.out.println(file.exists()); 
		try {
		if ( file.exists() == false ) {  // if ( !file.exists() ) {
			file.createNewFile();   // 내용이 없는 파일을 생성합니다.
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
		
		
		System.out.println(file.getAbsolutePath());   // C:\MyTemp\MyFile.txt       -> 아래보다 앱솔루트패스를 더 많이 쓴다. 
		System.out.println(file.getPath());  // C:\MyTemp\MyFile.txt
		System.out.println(file.getParent());  // C:\MyTemp    -> 파일 위치
		System.out.println(file.getName());   // MyFile.txt
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
		System.out.println( sdf.format(new Date(file.lastModified())) );  // 1616978575540  --> 2021-03-29  -> 20201-03-29 오전 10:10    -> 최종수정일.   이 숫자는 현재 날짜를 숫자로 표시한거다(밀리초)
													// java.util.Date 입력하고, new Date(timestamp)  괄호안에 이 숫자를 넣으면 현재 날짜로 나온다. 
														// sql로 해도됨. 
		System.out.println(file.length());  // 0
		
		
		// 디렉터리 내의 모든 디렉터리와 파일 목록 출력하기
		File javaDir = new File("C:\\Program Files\\Java\\jdk1.8.0_202");
		File[] files = javaDir.listFiles();          // -> javaDir의 모든 파일들이 나타난다.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (File f : files) {
			System.out.print(sdf2.format(new Date(f.lastModified())) + " ");  // -> date는 sql로 연습하기
			if ( f.isDirectory()) {
				System.out.print("<DIR> " + "    ");
			} else {
				System.out.print("      " + new DecimalFormat("#, ##0").format(f.length()));
			}
			System.out.println("  " + f.getName());
		}

}
	
}
