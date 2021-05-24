package ex07_jdbc.member;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

//단위테스트
class JunitTest {
	MemberDAO mdao = new MemberDAO();
	Scanner sc = new Scanner(System.in);

	@Test
	void testSelectList() {
		
		System.out.println("---------------");
		System.out.println("<전체회원 조회>");
		List<MemberDTO> mlist = mdao.selectList();
		for(MemberDTO a:mlist) {
			System.out.println(a.getUserid()+" "+a.getPasswd()+" "+
					+a.getBirthyear()+" "+a.getRegdate());
		}
		assertNotEquals(0, mlist.size()); //데이터가 없으면 실패
	}

	@Test
	void testSelectOne() {
		System.out.println("<회원 조회>");
		System.out.print("아이디 입력: ");
		String userid = sc.nextLine();
		MemberDTO mdto = mdao.selectOne(userid);
		//getter를 이용한 출력
		System.out.print("▶조회 결과: ");
		System.out.println(mdto.getUserid()+" "+mdto.getPasswd()+" "+
		+mdto.getBirthyear()+" "+mdto.getRegdate());
		//mdto가 null이 아니면 성공
		assertNotNull(mdto);
	}

	@Test
	void testInsert() {
		System.out.println("---------------");
		System.out.println("<회원 추가>");
		System.out.print("아이디 입력: ");
		String userid =sc.nextLine();
		System.out.print("비밀번호 입력: ");
		String passwd =sc.nextLine();
		System.out.print("출생년도 입력: ");
		int birthyear =sc.nextInt();
		
		MemberDTO mdto = new MemberDTO(userid,passwd,birthyear);
		int cnt = mdao.insert(mdto);
		
		//cnt가 0이 아니면 성공을 의미
		assertNotEquals(0, cnt);
	}

	@Test
	void testUpdate() {
		System.out.println("---------------");
		System.out.println("<회원 수정>");
		System.out.print("아이디 입력: ");
		String userid =sc.nextLine();
		System.out.print("비밀번호 입력: ");
		String passwd =sc.nextLine();
		System.out.print("출생년도 입력: ");
		int birthyear =sc.nextInt();
		
		MemberDTO mdto = new MemberDTO(userid,passwd,birthyear);
		int cnt = mdao.update(mdto);
		assertNotEquals(0, cnt);
	}

	@Test
	void testDelete() {

	}

}
