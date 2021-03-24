package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class DropTableMainClass {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		// try { } 블록과 finally { } 블록에서 모두 사용하기 위해서 main() 메소드(try 바깥)에 선언합니다.
		try {
			con = DBConnection.getConnection();
			String sql = "DROP TABLE staff";
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("staff 테이블이 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			if (ps != null) ps.close();
			if (con != null) 
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
