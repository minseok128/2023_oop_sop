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
			
			String sql = """
					DELETE FROM boards WHERE bwriter=?
					""";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "minseok chang");
			
			int rows = pstmt.executeUpdate();
			System.out.println("The number of deleted rows :" + rows);
			
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
