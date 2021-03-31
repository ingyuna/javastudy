package quiz03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {
		
		Socket client = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner sc = null;
		
		try {
			
			// 서버에 접속
			client = new Socket();
			client.connect(new InetSocketAddress(InetAddress.getLocalHost().getHostAddress(), 4966));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"));
			br = new BufferedReader(new InputStreamReader(client.getInputStream(), "UFT-8"));
			sc = new Scanner(System.in);
			
			while (true) {
				
				// send to server
				System.out.print("To Server >>> ");
				String toServer = sc.nextLine();
				if (toServer.equalsIgnoreCase("exit")) {
					System.out.println("Terminate client. Good Bye!");
					break;
				}
				
				bw.write(toServer + "\n");
				bw.flush();
				
				// receive from server
				String fromServer = br.readLine();   // readLine을 읽을 수 있다. Server에서 \n을 붙였기때문에.
				System.out.println("From server <<< " + fromServer);
				
			}		
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) { br.close(); }
				if (bw != null) { bw.close(); }
				if (!client.isClosed()) { client.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
