package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainClass {

	public static void main(String[] args) {
		
		try {
		// 1. oracle.jdbc.driver.OracleDriver 클래스를 메모리에 올립니다.
			Class.forName("oracle.jdbc.driver.OracleDriver");   // ClassNotFoundException 발생 가능
			
		// 2. 접속 정보
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";  // Oracle 11g Express Edition용이다.  @ : Oracle이 설치되어있는 IP주소 (회사면 회사에서 알려줌) 
														 // DB서버주소  127.0.0.1 (==localhost)
														 // 1521 : 연결포트번호 (Oracle 11g Express Edition / mySQL용..등 다 다름)
			String user = "spring";  // 대소문자 구분 없음
			String password = "1111";
			
		// 3. 접속
		// DriverManager 클래스가 접속을 담당하고, 
		// 접속 결과는 Connection 인터페이스에 저장합니다.  (= 드라이버매니저를 실행하면 결과가 커넥션이라는 얘기)
		Connection con = DriverManager.getConnection(url, user, password);  // SQLException 발생 가능
			
		// 4. 접속이 성공하면 여기로 도착 (접속 실패하면 exception으로 떨어짐. try ~ catch로 잡아놨기때문에)
		System.out.println("DB에 접속되었습니다.");
		
		// 5. 접속 종료
		con.close();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
