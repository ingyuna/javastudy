package ex01_network;

import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressMainClass {

	public static void main(String[] args) {
		
		// 원격 호스트
		String host = "www.naver.com";
		
		// 인터넷 주소를 처리하는 InetAddress
		InetAddress ia = null;
		
		try {
			ia = InetAddress.getByName(host);
			System.out.println(ia);  // www.naver.com/125.209.222.142
			System.out.println(ia.getHostName());   // www.naver.com
			System.out.println(ia.getHostAddress());   // 125.209.222.142
			
			InetAddress[] ias = InetAddress.getAllByName(host);  // 동일한 ip가 여러개 나올 수 있기때문에 이렇게 쓴다.
			for (InetAddress i : ias) {  // 여러개일 경우 이렇게 반복문을 통해서 접근 할 수 있다. 
				System.out.println(i.getHostName() + "의 ip 주소: " + i.getHostAddress());
			}
			
			byte[] byteIp = ia.getAddress();
			System.out.println(Arrays.toString(byteIp));
			
			short[] ip = new short[byteIp.length];
			for (int i = 0; i < ip.length; i++) {
				ip[i] = (short)(byteIp[i] < 0 ? byteIp[i] + 256 : byteIp[i]);     
			}
			System.out.println(Arrays.toString(ip));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
