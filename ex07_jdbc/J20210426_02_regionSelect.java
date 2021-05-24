package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_02_regionSelect {

	public static void main(String[] args) {
		
		//커넥션(통로) 객체 얻기
		Connection a = DBconn.getConn();
		
		String select = "SELECT * FROM REGIONS"; //SQL문장입력
		List<RegionsDTO> list = new ArrayList<>(); //리스트 만들기
		
		try {
			//주고받을 객체
			Statement stat = a.createStatement();
			//executeQuery: SLECT SQL문장을 넘겨주고 행과열(resultset)을 반환
			ResultSet result = stat.executeQuery(select);
			
			
			//result.next(): 참이면 계속 실행
			while(result.next()) {
				int region_id = result.getInt("region_id");
				String region_name = result.getString("region_name");

				//테이블의 DTO를 생성(DATA TRANSACTION OBJECT)
				RegionsDTO region = new RegionsDTO(region_id, region_name);
				list.add(region);
			}
						
		} catch (SQLException e) {
			System.out.println("SQL fail");
			e.printStackTrace();
		}

		//출력
		System.out.println("출력값");
		for (RegionsDTO b: list) {
			System.out.println(b.getRegion_id()+" "+b.getRegion_name());
		}
		
	}

}
