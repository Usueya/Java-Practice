package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ex07_jdbc.DBconn;

//DAO:DB접근하는메소드들의 모음
public class MemberDAO {

	//메소드1) 전체조회 ----------------------------------------------------------
	List<MemberDTO> selectList() {
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		List<MemberDTO> mlist = new ArrayList<>();
		
		String sql = "SELECT * FROM MEMBER ORDER BY USERID";
		
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery();
			
			while(result.next()) {
				String userid = result.getString("userid");
				String passwd = result.getString("passwd");
				int birthyear = result.getInt("birthyear");
				Date regdate = result.getDate("regdate");
				
				MemberDTO dto = new MemberDTO(userid, passwd, birthyear, regdate);
				mlist.add(dto);
			}
			
		} catch (SQLException e) {
			System.out.println("sql fail");
			e.printStackTrace();
		} finally {
			try {
				if(result !=null) result.close();
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (SQLException e) {
				System.out.println("close fail");
				e.printStackTrace();
			}
		}

		return mlist;
	}
	//메소드2) 건별조회 ----------------------------------------------------------
	MemberDTO selectOne(String userid){
		MemberDTO mdto = null;
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		String sql ="SELECT * FROM MEMBER\r\n" + 
				"WHERE USERID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			
			result = pstmt.executeQuery();
			
			if(result.next()) {
				String passwd = result.getNString("passwd");
				int birthyear = result.getInt("birthyear");
				Date regdate = result.getDate("regdate");

				mdto = new MemberDTO(userid, passwd, birthyear, regdate);
			}
		} catch (SQLException e) {
			System.out.println("sql fail");
			e.printStackTrace();
		}finally {
			try {
				if (result !=null) result.close();
				if (pstmt !=null) pstmt.close();
				if (conn !=null) conn.close();
			} catch (SQLException e) {
				System.out.println("close fail");
				e.printStackTrace();
			}
		}

		return mdto;
	}
	
	//메소드3) 데이터추가(MemberDTO에 담아서 넘기기) ----------------------------
	int insert(MemberDTO mdto){
		int cnt = 0;
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO MEMBER (USERID,PASSWD,BIRTHYEAR) VALUES (?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mdto.getUserid());
			pstmt.setString(2, mdto.getPasswd());
			pstmt.setInt(3, mdto.getBirthyear());
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("sql fail");
			e.printStackTrace();
		} finally {
			
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					System.out.println("close fail");
					e.printStackTrace();
				}
		}
		return cnt;
	}
	
	//메소드4) 데이터수정 --------------------------------------------------------
	int update(MemberDTO mdto) {
		int cnt = 0;
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;

//		String sql = "UPDATE MEMBER\r\n" + 
//				"SET PASSWD = ?,\r\n" + 
//				"BIRTHYEAR = ?\r\n" + 
//				"WHERE USERID = ?";
		
		//쿼리문이 길어질 수록 StringBuffer이용이 성능향상에 좋다.
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE MEMBER "); //끝에 스페이스바
		sql.append("SET PASSWD = ?, ");
		sql.append("BIRTHYEAR = ? ");
		sql.append("WHERE USERID = ?");
		
		try {
			pstmt = conn.prepareStatement(sql.toString()); //String변경필요
			pstmt.setString(1, mdto.getPasswd());
			pstmt.setInt(2, mdto.getBirthyear());
			pstmt.setString(3, mdto.getUserid());
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("sql fail");
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	//메소드5) 데이터삭제 --------------------------------------------------------
	int delete(String userid) {
		int cnt = 0;
		Connection conn = DBconn.getConn();
		PreparedStatement pstmt = null;
		
		String sql ="DELETE FROM MEMBER\r\n" + 
				"WHERE USERID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("sql fail");
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
