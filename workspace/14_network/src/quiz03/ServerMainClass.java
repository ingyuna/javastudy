package quiz03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMainClass {

	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket client = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;   // PrintWriter out = null;
		Scanner sc = null;
		
		try {
			
			// 서버 생성
			server = new ServerSocket();
			server.bind(new InetSocketAddress(InetAddress.getLocalHost().getHostAddress(), 4966)); // 현재 로컬호스트 정보 알아내서 Address를 알아낼 수 있다.
																	// localhost와 큰 개념의 차이는 없다. 4966빼고 안에 괄호안에 있는건 => 모두 localhost를 가르킴
			
			
				
			// 클라이언트 접속 처리
			client = server.accept();
			InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
			System.out.println("Connected client : [" + isa.getHostString() + "]");
			
			// 바이트 기반 스트림을 문자 기반 스트림으로 바꿔서 진행합니다.  (-> byte -> char로 바꿈. 좀 더 편하게 하기 위해서) 
			br = new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"));
			// out = new PrintWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"));  참고로 이름 'out'은 자바에서는 약속되어있지 않지만, JSP에서는 약속되어있다.
			sc = new Scanner(System.in);
			
			while (true) {
				
				
				// receive from client
				String fromClient = null;
				fromClient = br.readLine();  // "\n"을 읽을때까지 read합니다.
				if (fromClient == null) {
					System.out.println("Disconnect By Client!");
					break;
				}
				System.out.println("From Client <<< : " + fromClient);
				
				// send to client
				System.out.println("To Client >>> ");
				String toClient = sc.nextLine();   // -> 공백 포함 할 수 있음. 
				bw.write(toClient + "\n");   // out.println(toClient);     -> println은 자동으로 \n을 포함하고 있기때문에.      
									// /n을 하는 이유는 위에서 readLine() -> \n을 읽을때까지 read하기때문에.
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) { bw.close(); }
				if (br != null) { br.close(); }
				if (!server.isClosed()) { server.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
