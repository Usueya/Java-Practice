package ex11_guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO담당자:작성 후 JunitTest를 통해 테스트
public class GuestDAOImpl implements GuestDAO{

	PreparedStatement pstmt = null;
	String sql = "";
	
	@Override
	public int insert(GuestDTO gdto) {
		Connection conn = DBConn.getConn();
		int cnt = 0;
		sql = "INSERT INTO GUEST (SEQ, NAME, EMAIL, PASSWD, CONTENT) \r\n" + 
				"VALUES(GUEST_SEQ.NEXTVAL, ?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int update(GuestDTO gdto) {
		Connection conn = DBConn.getConn();
		int cnt = 0;
		sql = "UPDATE GUEST\r\n"+ 
				"SET NAME = ?,\r\n"+ 
				"EMAIL = ?,\r\n"+ 
				"PASSWD = ?,\r\n"+ 
				"CONTENT = ?\r\n"+ 
				"WHERE SEQ = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			pstmt.setInt(5, gdto.getSeq());
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int delete(int seq) {
		Connection conn = DBConn.getConn();
		int cnt = 0;
		sql = "DELETE FROM GUEST\r\n" + 
				"WHERE SEQ = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return cnt;
	}

	@Override
	public GuestDTO selectOne(int seq) {
		Connection conn = DBConn.getConn();
		GuestDTO gdto = null;
		ResultSet result = null;
		
		sql = "SELECT*\r\n" + 
				"FROM GUEST\r\n" + 
				"WHERE SEQ = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			result = pstmt.executeQuery();
			
			if(result.next()) {
				String name = result.getString("name");
				String email = result.getNString("email");
				String passwd = result.getNString("passwd");
				String content = result.getNString("content");
				
				gdto = new GuestDTO(seq,name,email,passwd,content);
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gdto;
	}

	@Override
	public List<GuestDTO> selectList() {
		Connection conn = DBConn.getConn();
		ResultSet result;
		GuestDTO gdto;
		List<GuestDTO> list = new ArrayList<GuestDTO>();
		
		sql = "SELECT*\r\n" + 
				"FROM GUEST\r\n"+
				"ORDER BY SEQ";
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery();
			
			while(result.next()) {
				int seq = result.getInt("seq");
				String name = result.getString("name");
				String email = result.getString("email");
				String passwd = result.getString("passwd");
				String content = result.getString("content");
				
				gdto = new GuestDTO(seq,name,email,passwd,content);
				list.add(gdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}


}
