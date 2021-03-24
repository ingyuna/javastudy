package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class InsertQuiz {

	public static void main(String[] args) {
		
		// 임의의 3명의 staff을 삽입하세요.
		// 반복문과 배열을 사용하세요.
		int[] noList = { 3, 4, 5};
		String[] nameList = {"david", "james", "jack" };
		String[] departList = { "총무", "영업", "고객" };
		String[] hireDateList = { "21/03/18", "21/03/15", "21/03/20" };
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "INSERT INTO staff VALUES (?, ?, ?, ?)";   // INTO다음에 괄호 생략. 뒤에 VAULES 다음에 괄호는 생략 못함.
			ps = con.prepareStatement(sql);
			int result = 0;
			for (int i = 0; i < noList.length; i++) {
				ps.setInt(1, noList[i]);
				ps.setString(2,  nameList[i]);
				ps.setString(3,  departList[i]);
				ps.setString(4, hireDateList[i]);   // -> setDate하면 오류나기때문에 sql에 맞게 String으로 바꿔준다. 
													// 날짜와 문자열을 통일해서 "" 다 문자열로 쓰는게 많다. 실행속도가 빨라지기때문에.
				result += ps.executeUpdate();
			}
			System.out.println("총 " + result + "명의 staff이 삽입되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if( ps != null) { ps.close(); }
				if( con != null) {con.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		

	}

}
