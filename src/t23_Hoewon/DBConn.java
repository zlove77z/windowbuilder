package t23_Hoewon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	
	public DBConn() {
		String ur1 = "jdbc:mysql://localhost:3306/javagroup";
		String user = "root";
		String password = "1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(ur1,user,password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패~~" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("드라이버 연동 실패~~" + e.getMessage());
		}
	}
	public void connClose() {
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {}
	}
	public void pstmtClose() {
		try {
			if(pstmt != null) pstmt.close();
		} catch (SQLException e) {}
 }
	public void rsClose() {
		try {
			if(rs != null) rs.close();
		} catch (SQLException e) {}
		pstmtClose();
	}
	
}
