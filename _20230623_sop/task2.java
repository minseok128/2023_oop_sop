package ch10.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

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
			
			String sql = new StringBuilder()
					.append("UPDATE boards SET ")
					.append("btitle=?, ")
					.append("bcontent=?, ")
					.append("bfilename=?, ")
					.append("bfiledata=?")
					.append("WHERE bno=?")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Final Exam Mod");
			pstmt.setString(2, "Modified final exam");
			pstmt.setString(3, "java2.png");
			pstmt.setBlob(4, new FileInputStream("src/ch10/sec01/java2.png"));
			pstmt.setInt(5, 2);
			
			int rows = pstmt.executeUpdate();
			System.out.println("The number of update rows : " + rows);
			
//			if (rows == 1) {
//				ResultSet rs = pstmt.getGeneratedKeys();
//				
//				if (rs.next()) {
//					int bno = rs.getInt(1);
//					System.out.println("bno for the saved row: " + bno);
//				}
//				rs.close();
//			}
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
