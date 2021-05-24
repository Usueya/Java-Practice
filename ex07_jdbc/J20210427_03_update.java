package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20210427_03_update {

	public static void main(String[] args) {
		//UPDATE:수정
		
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;
		
		String itemname = "코카콜라";
		String itemcode = "8802";
		
		String sql = "UPDATE ITEM\r\n" + 
				"SET ITEMNAME = ?\r\n" + 
				"WHERE ITEMCODE = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemname);
			pstmt.setString(2, itemcode);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 수정");
			
		} catch (SQLException e) {
			System.out.println("SQL fail");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
