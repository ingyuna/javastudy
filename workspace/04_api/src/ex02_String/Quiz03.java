package ex02_String;

// 3. 파일명과 확자자명을 분리하기
// 

public class Quiz03 {

	public static void main(String[] args) {
		
		String fullname = "2021-03-10.jpg";
		int idx = fullname.lastIndexOf(".");
		String filename = fullname.substring(0, idx);     // 2021-03-10
		String extname = fullname.substring(idx + 1);    // jpg

		System.out.println("파일명: " + filename);
		System.out.println("확장자명: " + extname);
		
		
	
	}

}
