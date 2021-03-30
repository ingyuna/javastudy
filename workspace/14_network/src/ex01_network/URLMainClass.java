package ex01_network;

import java.net.URL;

public class URLMainClass {

	public static void main(String[] args) {
		
		// URL : Uniform Resource Locator
		// 형식이 정해져 있는 자원의 표기방법
		// 프로토콜://호스트:포트?파라미터
		
		URL url1 = null;
		URL url2 = null;
		
		try {
			url1 = new URL("https://www.naver.com?query=java&page=3");   // https = protocol : 인터넷 문서를 보내는 protocal 
															// ? = naver 서버로 전달하는 변수값. 
										// query라는 변수에 java라는 텍스를 담아서 네이버쪽으로 보내는걸 query라고 한다. 네이버 같은 경우 실제로 변수를 query라고 한다. 구글은 q.
			System.out.println(url1.getHost());
			System.out.println(url1.getDefaultPort());
			System.out.println(url1.getProtocol());
			System.out.println(url1.getQuery());
			
			url2 = new URL("https://www.naver.com/webtoon/webtoon.jsp");
			System.out.println(url2.getFile());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
