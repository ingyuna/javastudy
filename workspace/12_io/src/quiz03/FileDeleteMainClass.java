package quiz03;

import java.io.File;

public class FileDeleteMainClass {

	public static void main(String[] args) {
		
		// C:\\MyTemp 디렉터리를 삭제합니다.
		File myTemp = new File("C:\\MyTemp");
		
		if (myTemp.exists()) {
			File[] files = myTemp.listFiles();
			for (File file : files) {
				if (file.isFile()) {
				System.out.println(file.getName() + " 파일을 삭제합니다.");
				} else {
					System.out.println(file.getName() + " 디렉터리를 삭제합니다.");
				}
				file.delete();
			}
			System.out.println(myTemp.getName() + " 디렉터리를 삭제합니다.");
			myTemp.delete();
		}
		
	}

}
