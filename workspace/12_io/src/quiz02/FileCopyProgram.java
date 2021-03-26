package quiz02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyProgram {

	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;	
		
		try {
			bis = new BufferedInputStream(new FileInputStream("Nightview.mp4"));     // 원본       -> // 이 파일의 입력을 받아보겠다라는 뜻.
			bos = new BufferedOutputStream(new FileOutputStream("Nightview2.mp4"));  // 복사본 
			byte[] b = new byte[1024];   // 1KB      // ->1KB씩 옮기려고 1KB 준비함.
			while (true) {
				int readByte = bis.read(b);      // 영상 저자은 b, 실제 읽은 바이트수는 readByte
				if (readByte == -1) {
					break;
				}
				bos.write(b, 0, readByte);           // 항상 b배열의 바이트를 전체 보낼필요 없다. 0번 인덱스부터 읽어드린 크기만큼반 보내준다.
			}
			System.out.println("Nightview.mp4 파일이 복사되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) { bos.close(); }
				if (bis != null) { bis.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
