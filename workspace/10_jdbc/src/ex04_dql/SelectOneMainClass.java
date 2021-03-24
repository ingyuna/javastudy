package ex04_dql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import connection.DBConnection;

public class SelectOneMainClass {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;   // SELECT문의 결과 행(Row)을 저장합니다.
		
		try {
			con = DBConnection.getConnection(); 
			String sql = "SELECT no, name, department, hireDate FROM staff WHERE no = 1";    // 여기서는 중복이 없는 no으로만 할 수 있다.
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();   // SELECT문의 실행은 executeQuery() 메소드입니다.
			
			// rs에 저장된 데이터는 "반드시" next() 메소드를 호출해서 꺼냅니다.
			// next() 메소드 
			// 1. 결과 행에서 순서대로 한 행씩 꺼냅니다.
			// 2. 꺼낼 결과 행이 존재하면 true를 반환하고, 없으면 false를 반환합니다.
			
			if (rs.next()) {
				
				int no = rs.getInt(1);  // rs.getInt("no")
				String name = rs.getString(2);  // rs.getString("name")
				String departmnet = rs.getString(3);  // rs.getString("department")
				Date hireDate = rs.getDate(4);  // rs.getDate("hireDate")
				System.out.println("no=" + no + ", name=" + name + ", department=" + departmnet + ", hireDate=" + hireDate);
			
				// HashMap에 저장하기
				Map<String, Object> staff = new HashMap<String, Object>();
				staff.put("no", rs.getInt("no"));    // Object말고 String도 가능하다. 지금 타입이 섞여있으니까 다 String으로 주든, 모든 타입이 가능한 Object로 하던.
				staff.put("name", rs.getString("name"));
				staff.put("department", rs.getString("department"));
				staff.put("hireDate", rs.getDate("hireDate"));
				System.out.println("no=" + staff.get("no") + ", name=" + staff.get("name") + ", department=" + staff.get("department") + ", hireDate=" + staff.get("hireDate"));
			} else {
				System.out.println("해당 staff이 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) { rs.close(); }
				if (ps != null) { ps.close(); }
				if (con != null) { con.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
