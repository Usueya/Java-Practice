package ex07_jdbc.member;

import java.util.List;
import java.util.Scanner;

public class J20210427_06_member {

	//VIEW에 표기될 내용 > FRONT에서 작업
	//BACK에서는 메소드별 단위테스트를 Junit을 통해 진행
	//테스트할 패키지에 new > junit test case 만들기
	//M(Model) -> dto, dao
	//V(View) -> html, css, js
	//C(Controler) -> id중복체크 등
	
	public static void main(String[] args) {

		MemberDAO mdao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		boolean logincheck = false;
		String loginuserid="";
		
		while(true) {
			System.out.println("---------------");
			System.out.println("★회원관리프로그램★");
			if(logincheck) {
				System.out.println("★[ "+loginuserid+" ]★");
			}
			System.out.println("---------------");
			System.out.println("0.로그인");
			System.out.println("1.회원가입");
			System.out.println("2.회원수정");
			System.out.println("3.회원삭제");
			System.out.println("4.특정회원조회");
			System.out.println("5.전체회원조회");
			System.out.println("9.프로그램종료");
			System.out.println("---------------");
			System.out.print("실행번호: ");
			int no = sc.nextInt();
			sc.nextLine();
			
			if (no==0) {
				//로그인기능
				System.out.println("---------------");
				System.out.println("---<로그인>---");
				MemberDTO mdto;

				while(true) {
					System.out.print("아이디 입력: ");
					loginuserid =sc.next();
					mdto = mdao.selectOne(loginuserid);
					if (mdto == null) {
						System.out.println("아이디 오류");
						logincheck = false;
					}else break;
				}
				while(true) {
					System.out.print("비밀번호 입력: ");
					String passwd =sc.next();
					if (mdto.getPasswd().equals(passwd)) {
						System.out.println("로그인 완료");
						logincheck = true;
						break;
					}
					else System.out.println("비밀번호 오류");
				}
				
				
				
			}else if(no==5) {
				if (!logincheck) {
					System.out.println("로그인 후 사용");
					continue;
				}
				System.out.println("---------------");
				System.out.println("<전체회원 조회>");
				List<MemberDTO> mlist = mdao.selectList();
				for(MemberDTO a:mlist) {
					System.out.println(a);
				}
			}else if(no==4) {
				System.out.println("<회원 조회>");
				System.out.print("아이디 입력: ");
				String userid = sc.nextLine();
				MemberDTO mdto = mdao.selectOne(userid);
				//getter를 이용한 출력
				System.out.print("▶조회 결과: ");
				System.out.println(mdto.getUserid()+" "+mdto.getPasswd()+" "+
				+mdto.getBirthyear()+" "+mdto.getRegdate());
			
			}else if(no==1) {
				System.out.println("---------------");
				System.out.println("<회원 가입>");
				String userid;
				
				while(true) {
					System.out.print("아이디 입력: ");
					userid =sc.nextLine();
					//아이디중복체크
					MemberDTO mdto = mdao.selectOne(userid);
					if (mdto !=null) {
						System.out.println("중복된 ID");
					}else break;
				}				
				
				System.out.print("비밀번호 입력: ");
				String passwd =sc.nextLine();
				System.out.print("출생년도 입력: ");
				int birthyear =sc.nextInt();
				
				MemberDTO mdto = new MemberDTO(userid,passwd,birthyear);
				int cnt = mdao.insert(mdto);
				if (cnt>0) {
					System.out.println("회원가입 완료");
				}else {
					System.out.println("회원가입 실패");
				}
				
			}else if(no==2) {
				
				if (!logincheck) {
					System.out.println("로그인 후 사용");
					continue;
				}
				System.out.println("---------------");
				System.out.println("  <회원 수정>  ");
				System.out.print("아이디 입력: ");
				String userid =sc.nextLine();
				//로그인된 아이디 정보만 수정가능
				
				//기존정보 조회 해두고 다시 입력한 값 수정정보와 같이 전달
				MemberDTO mdto = mdao.selectOne(userid);

				System.out.print("비밀번호 입력: ");
				String passwd =sc.nextLine();
				System.out.print("출생년도 입력: ");
				int birthyear =sc.nextInt();
				
				mdto = new MemberDTO(userid,passwd,birthyear);
				int cnt = mdao.update(mdto);
				if (cnt>0) {
					System.out.println("정보수정 완료");
				}else {
					System.out.println("정보수정 실패");
				}
				
			}else if(no==3) {
				//로그인된 정보만 삭제 가능
				if (!logincheck) {
					System.out.println("로그인 후 사용");
					continue;
				}
				System.out.println("---------------");
				System.out.println("<회원 삭제>");
				System.out.print("아이디 입력: ");
				String userid = sc.nextLine();
				
				if (!loginuserid.equals(userid)) {
					System.out.println("삭제권한이 없습니다.");
					continue;
				}
				int cnt = mdao.delete(userid);
				if (cnt>0) {
					System.out.println("회원삭제 완료");
					loginuserid = "";
				}else {
					System.out.println("회원삭제 실패");
				}
				
			}else if(no==9) {
				System.out.println("프로그램종료");
				break;
			}

			
		}

		
		

		
	}

}
