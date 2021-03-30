package ex01_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenStreamMainClass {

	public static void main(String[] args) {
		
		URL url = null;
		HttpURLConnection con = null;       // httpURLConnection은 -> URLConnection 플러스알파라고 생각하면 됨. 결과만 casting한다.
		InputStreamReader isr = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		
		try {
			
			url = new URL("https://m.naver.com/");    // 네이버 모바일 버젼
			con = (HttpURLConnection) url.openConnection();
			isr = new InputStreamReader(con.getInputStream());
			br = new BufferedReader(isr);
			
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				sb.append(line).append("\n");
			}
			
			System.out.println("글자수: " + sb.toString().length());
			
			// finally가 귀찮을 때
			// br.close();
			// con.disconnect();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) { br.close(); }
				if (con != null) { con.disconnect(); }
		} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
