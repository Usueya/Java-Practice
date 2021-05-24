package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {
	
	static Connection conn; //(필드)컨텍션의 참조변수
	
	//Connection을 리턴하는 메소드
	public static Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pssword = "hr";
		
		try {
			//드라이버 로딩 Class.forName(로딩할 드라이버 이름)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Oracle Driver Loading Success!");
			
			//커넥션 객체 생성(커넥션을 리턴)
			conn =  DriverManager.getConnection(url, user, pssword);
			//System.out.println("Connection Success!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver missing!");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Connection Fail!");
			e.printStackTrace();
		}
		return conn;
	}


}
