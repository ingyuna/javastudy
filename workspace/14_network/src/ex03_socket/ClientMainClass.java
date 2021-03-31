package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {
		
		Socket client = null;
		Scanner sc = null;
		BufferedOutputStream bos = null;    // -> 좀 더 좋은거 쓰고 싶으면 그냥 OutputStream말고 BufferedOutpuStream으로 쓰면 된다.
 		BufferedInputStream bis = null;
			
		
		try {
			
			// 서버에 접속하기
			client = new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			System.out.println("서버에 접속되었습니다.");
			
			// 서버에 메시지 보내기
			sc = new Scanner(System.in);
			System.out.print("서버에 인사말을 건네보세요 >>> ");
			String message = sc.nextLine();
			bos = new BufferedOutputStream(client.getOutputStream());         // -> Reader 종류가 아님 = 텍스트를 보내는 용도 x, 바이트 기반이다. 
			bos.write(message.getBytes("UTF-8"));  // -> String을 byte[] 바이트 배열로 바꿔주는거.
			bos.flush();   // -> bos를 통해 보냈는데 남아있는게 있으면 강제로 마저 내보낸다는 기능의 flush()를 써준다.
			
			
			
			// 서버가 보낸 답변 메시지 받기 
			bis = new BufferedInputStream(client.getInputStream());
			byte[] b = new byte[1024];
			int length = bis.read(b);
			String recieveMsg = new String(b, 0, length, "UTF-8");
			System.out.println(recieveMsg);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) { bos.close(); }
				if (bis != null) { bis.close(); }
				if ( !client.isClosed()) {client.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
