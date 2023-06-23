package ch10.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.FileInputStream;

public class Assignment10 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/orcl",
					"java",
					"1234"
					);
			System.out.println("Connection success");
			
			String sql = "" +
					"INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) "
				+
					"VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno"});
			
			pstmt.setString(1, "Notification for sofware project");
			pstmt.setString(2, "Thank you");
			pstmt.setString(3, "minseok chang");
			pstmt.setString(4, "java.png");
			pstmt.setBlob(5, new FileInputStream("src/ch10/sec01/java.png"));
			int rows = pstmt.executeUpdate();
			
			if (rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				
				if (rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("bno for the saved row: " + bno);
				}
				rs.close();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
					System.out.println("Connection disconnected");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
