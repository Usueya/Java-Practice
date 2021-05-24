package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J20210427_05_selectOne {

	public static void main(String[] args) {
		// 1건만조회
		
		Connection conn  = DBconn.getConn();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		ItemDTO idto = null;
		
		String sql = "SELECT *  FROM ITEM\r\n" + 
				"WHERE ITEMCODE = ?";
		String itemcode = "8801";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemcode);
			result = pstmt.executeQuery();
			
			if(result.next()) {
				
				
				String itemname = result.getString("itemname");
				int price = result.getInt("price");
				String bigo = result.getString("bigo");
				Date regdate = result.getDate("regdate");
				
				idto = new ItemDTO(itemcode, itemname,price,bigo,regdate);
				
			}
			
			
		} catch (SQLException e) {
			System.out.println("sql fail");
			e.printStackTrace();
		}

		//item출력
		System.out.println(idto);
		System.out.println(idto.getItemcode()+" "
				+idto.getItemname()+" "
				+idto.getPrice()+" "
				+idto.getBigo()+" "
				+idto.getRegdate());

	}

}
