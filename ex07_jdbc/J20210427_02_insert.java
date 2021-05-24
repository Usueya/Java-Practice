package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J20210427_02_insert {

	public static void main(String[] args) {
		// insert: 데이터추가
		
		Connection conn = DBconn.getConn();
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("itemcode: "); String itemcode = sc.next();
		sc.nextLine();
		System.out.print("itemname: "); String itemname = sc.nextLine();
		System.out.print("price: "); int price = sc.nextInt();
				
//		String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE)VALUES ('"
//		+itemcode+ "','" +itemname+ "'," +price+ ")";
		
		String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE)VALUES (?,?,?)";
		System.out.println(sql);
		
		try {
			//conn.setAutoCommit(false)
			//conn.commit(); 자바는 자동 commit
			
			//createStatement 보안취약
//			stmt = conn.createStatement(); 
			
			//prepareStatement 사용권장
			pstmt = conn.prepareStatement(sql); 

			//SQL문 ?에 값을 대치(parameterIndex, 값)
			pstmt.setString(1, itemcode); 
			pstmt.setString(2, itemname);
			pstmt.setInt(3, price);
			
			int cnt = pstmt.executeUpdate(); //executeUpdate 돌려주는것은 int
			System.out.println(cnt+" 건");
			
		} catch (SQLException e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
		System.out.println("Program close");
		
	}

}
