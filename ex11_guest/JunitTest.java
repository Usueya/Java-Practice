package ex11_guest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testInsert() {
		GuestDAO gdao = new GuestDAOImpl();
		GuestDTO gdto = new GuestDTO("홍길동","hong@gmail.com","1234@","가입인사");
		int cnt = gdao.insert(gdto);
		System.out.println(cnt+"건 등록");
	}
	
	@Test
	void testUpdate() {
		GuestDAO gdao = new GuestDAOImpl();
		GuestDTO gdto = new GuestDTO(4,"텔레토비","tele@gmail.com","50088@","수정3");
		int cnt = gdao.update(gdto);
		System.out.println(cnt+"건 수정");
	}
	@Test
	void testDelete() {
		GuestDAO gdao = new GuestDAOImpl();
		int cnt = gdao.delete(5);
		System.out.println(cnt+"건 삭제");
	}
	@Test
	void testSelectOne() {
		GuestDAO gdao = new GuestDAOImpl();
		System.out.println(gdao.selectOne(3));
	}
	
	@Test
	void testSelectList() {
		GuestDAO gdao = new GuestDAOImpl();
		List<GuestDTO> list = gdao.selectList();
		for(GuestDTO a: list) {
			System.out.println(a.getSeq()+" "+a.getName()+" "+a.getEmail()+" "+a.getContent());
		}
	}
		
	

}
