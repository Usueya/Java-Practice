package ex11_guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//싱글톤패턴: 인스턴스(객체)를 하나만 생성해서 재사용
	//getConn을 통해서만 Connection에 접근할 수 있도록 필드생성
	private static Connection conn = null;
	
	public static Connection getConn() {
		//컨넥션을 리턴하는 메소드
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		try {
			//만약 Connection객체가 널이거나 클로즈라면
			if (conn == null || conn.isClosed()) {
				//드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//컨넥션객체 생성
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("*Connection Success");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션객체 생성 실패");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//Connection close
	public static void dbClose() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("*Connection Close");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

