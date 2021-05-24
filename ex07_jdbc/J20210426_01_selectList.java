package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_01_selectList {
	static Connection conn; //필드로서 자동 초기화
	
	public static void main(String[] args) {
		//오라클 DB연결
		//Connection conn = null; //지역변수로서 초기화 필요!
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver Loading Success!");
			//드라이버를 통해 접속의 통로가 생겼음.
			//url은 오라클에서 제공함 jdbc:oracle:thin:@localhost:1521:xe
			//Connection 타입의 통로를 선언
			conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("Connection Success!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver missing!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection Fail!");
			e.printStackTrace();
		}
		
		if (conn == null) return; //커넥션 실패시 종료될 수 있도록 설정

		//DB 정보 가져오기(select)
		//외부장치와의 연결은 체크예외 발생
		ResultSet rs = null;
		Statement stmt = null;
		List<Countries> list = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			String sql = "SELECT* FROM COUNTRIES"; //;제외
			rs = stmt.executeQuery(sql); //조회
			while (rs.next()) {
//				System.out.print(rs.getString(1));
//				System.out.print(" ");
//				System.out.print(rs.getString(2));
//				System.out.print(" ");
//				System.out.println(rs.getInt(3));
				
				String country_id = rs.getString(1);
				String country_name = rs.getString("country_name");
				int region_id = rs.getInt("region_id");
				Countries cot = new Countries(country_id, country_name,region_id);
				list.add(cot);
				
			}
			
		} catch (SQLException e) {
			System.out.println("createStatement Fail!");
			e.printStackTrace();
		} finally { //무조건 실행
			//connection객체가 맺어져 있는 경우 타인이 접속 불가 > 연결여부와 관계없이 끊어줘야한다.
			//conn > stmt > rs 순으로 생성했기 역으로 끊어줘야 한다.
			try {
				if (rs !=null) rs.close();
				if (stmt !=null) stmt.close();
				if (conn !=null)conn.close();
			} catch (SQLException e) {
				System.out.println("close fail");
				e.printStackTrace();
			}
			
		}
		
		//출력할 클래스 만들기 > Countries테이블명과 동일하게
		//System.out.println(list);
//		for (Countries a:list) {
//			System.out.println(a.getCountry_id()+" "+a.getCountry_name()+" "+a.getRegion_id());
//		}
//		for(int i = 0; i<list.size(); i++) {
//			Countries c = list.get(i);
//			System.out.println(c.getCountry_id()+" "+c.getCountry_name()+" "+c.getRegion_id());
//		}
		
		
		
	}

}
