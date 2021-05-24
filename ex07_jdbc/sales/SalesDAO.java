package ex07_jdbc.sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import ex07_jdbc.DBconn;

public class SalesDAO {
	//일일상품판매리스트
	List<Map<String, Object>> dayItemSalesList(){
		
		List<Map<String, Object>> list = new ArrayList<>();
		
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALEDATE, S.SEQ, S.ITEMCODE, I.ITEMNAME, S.QTY, S.AMOUNT ");
		sb.append("FROM SALES S INNER JOIN ITEM I ON(S.ITEMCODE = I.ITEMCODE) ");
		sb.append("ORDER BY S.SALEDATE, S.SEQ");
		
//		String sql = "SELECT S.SALEDATE, S.SEQ, S.ITEMCODE, I.ITEMNAME, S.QTY, S.AMOUNT\r\n" + 
//				"FROM SALES S INNER JOIN ITEM I ON(S.ITEMCODE = I.ITEMCODE)\r\n" + 
//				"ORDER BY S.SALEDATE, S.SEQ";
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String saledate = rs.getString("SALEDATE");
				int seq = rs.getInt("SEQ");
				String itemcode = rs.getString("ITEMCODE");
				String itemname = rs.getString("ITEMNAME");
				int qty = rs.getInt("QTY");
				int amount = rs.getInt("AMOUNT");
				
				//System.out.println(saledate+" "+seq+" "+itemcode+" "+itemname+" "+qty+" "+amount);
				//매출1건의 데이터만 저장
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				
				list.add(map);
				
			}
			
		} catch (SQLException e) {
			System.out.println("sql fail");
			e.printStackTrace();
		}
		
		return list;
	}
	//일일상품별판매집계
	List<Map<String,Object>> dayItemSalesSum(){
		
		List<Map<String,Object>> list = new ArrayList<>();
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		
		sql.append("SELECT S.SALEDATE, S.ITEMCODE, MAX(I.ITEMNAME) ITEMNAME,SUM(S.QTY) QTY,SUM(S.AMOUNT) AMOUNT ");
		sql.append("FROM SALES S INNER JOIN ITEM I ON(S.ITEMCODE = I.ITEMCODE) ");
		sql.append("GROUP BY S.SALEDATE, S.ITEMCODE ");
		sql.append("ORDER BY S.SALEDATE, S.ITEMCODE");
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				String saledate = result.getString("SALEDATE");
				String itemcode = result.getString("ITEMCODE");
				String itemname = result.getString("ITEMNAME");
				int qty = result.getInt("QTY");
				int amount = result.getInt("AMOUNT");
				
				//System.out.println(saledate+" "+itemcode+" "+itemname+" "+qty+" "+amount);
				
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				
				list.add(map);

			}
			
		} catch (SQLException e) {
			System.out.println("sql fail");
			e.printStackTrace();
		}
		return list;
	}
	
	//상품별판매집계
	
	//일자별 판매집계조회
	List<Map<String,Object>> dayItemSalesTotal(String saledate) {
		
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		List<Map<String,Object>> list = new ArrayList<>();
		
		sql.append("SELECT I.*, NVL(S.AMOUNT,0) AMOUNT ");
		sql.append("FROM ITEM I LEFT JOIN ");
		sql.append("(SELECT ITEMCODE, SUM(AMOUNT) AMOUNT ");
		sql.append("FROM SALES ");
		sql.append("WHERE SALEDATE = ? ");
		sql.append("GROUP BY ITEMCODE) S ");
		sql.append("ON I.ITEMCODE = S.ITEMCODE ORDER BY I.ITEMCODE");
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, saledate);
			
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {				
				Map<String, Object> map = new HashMap<>();
				map.put("itemcode", result.getString("itemcode"));
				map.put("itemname", result.getString("itemname"));
				map.put("price", result.getInt("price"));
				map.put("bigo", result.getString("bigo"));
				map.put("regdate", result.getString("regdate"));
				map.put("amount", result.getInt("amount"));
				list.add(map);	
			}
		} catch (SQLException e) {
			System.out.println("sql fail");
			e.printStackTrace();
		}
		return list;
	}
	
	//VIEW출력하기
	List<Map<String,Object>> dayItemSalesView(String saledate) {
		
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		List<Map<String,Object>> list = new ArrayList<>();
		
		sql.append("SELECT * FROM DAY_ITEM_SALES_VIEW ");
		sql.append("WHERE SALEDATE = ?");
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, saledate);
			
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {				
				Map<String, Object> map = new HashMap<>();
				map.put("itemcode", result.getString("itemcode"));
				map.put("itemname", result.getString("itemname"));
				map.put("amount", result.getInt("amount"));
				map.put("regdate", result.getString("regdate"));
				list.add(map);	
			}
		} catch (SQLException e) {
			System.out.println("sql fail");
			e.printStackTrace();
		}
		
		return list;
		
	}
	

	
}
