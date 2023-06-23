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
					SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata
					FROM boards
					""";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, "winter");
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt(1));
				board.setBtitle(rs.getString(2));
				board.setBcontent(rs.getString(3));
				board.setBwriter(rs.getString(4));
				board.setBdate(rs.getDate(5));
				board.setBfilename(rs.getString(6));
				board.setBfiledata(rs.getBlob(7));
				
				
				System.out.println(board.getInfo());
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
