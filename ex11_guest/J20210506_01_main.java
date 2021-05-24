package ex11_guest;

import java.util.List;
import java.util.Scanner;

public class J20210506_01_main {

	public static void main(String[] args) {
		//개발자간의 약속을 위해 interface를 먼저 생성
		//DB에 접속하는 공통모듈 생성
		//main(view) <-> DTO(VO/Bean) <-> DAO <-> DB
		
		//DAOImpl -> JunitTest
		//화면구현설계
		//1.방명록작성
		//2.방명록수정
		//3.방명록삭제
		//4.방명록조회
		//9.종료
		
		GuestDAO gdao = new GuestDAOImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-------------------");
			System.out.println("  Guest Program");
			System.out.println("-------------------");
			System.out.println("1. 방명록  작성");
			System.out.println("2. 방명록  수정");
			System.out.println("3. 방명록  삭제");
			System.out.println("4. 방명록  조회");
			System.out.println("9. Program Exit");
			System.out.println("-------------------");
			System.out.print("번호: ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.println("-------------------");
			if (num == 1) {
				GuestDTO gdto = new GuestDTO();
				System.out.println("방명록을 작성합니다.");
				System.out.print("이름: ");
				gdto.setName(sc.nextLine());
				System.out.print("이메일: ");
				gdto.setEmail(sc.nextLine());
				System.out.print("비밀번호: ");
				gdto.setPasswd(sc.nextLine());
				System.out.print("방명록내용: ");
				gdto.setContent(sc.nextLine());
				int cnt = gdao.insert(gdto);
				System.out.println(cnt + "건 등록");
			}else if (num ==2) {
				GuestDTO gdto = new GuestDTO();
				System.out.println("방명록을 수정합니다.");
				System.out.println("[ 방명록 리스트 ]");
				gdao.selectList();
				List<GuestDTO> list = gdao.selectList();
				for(GuestDTO a: list) {
					System.out.println(a.getSeq()+" "+a.getName()+" "
							+a.getEmail()+" "+a.getContent());
				}
				System.out.println("-------------------");
				System.out.print("등록번호: ");
				gdto.setSeq(sc.nextInt());
				sc.nextLine();
				System.out.print("이름: ");
				gdto.setName(sc.nextLine());
				System.out.print("이메일: ");
				gdto.setEmail(sc.nextLine());
				System.out.print("비밀번호: ");
				gdto.setPasswd(sc.nextLine());
				System.out.print("방명록내용: ");
				gdto.setContent(sc.nextLine());
				int cnt = gdao.update(gdto);
				System.out.println(cnt+"건 수정완료");
			}else if (num == 3) {
				System.out.println("방명록을 삭제합니다.");
				System.out.println("-------------------");
				System.out.println("[ 방명록 리스트 ]");
				gdao.selectList();
				List<GuestDTO> list = gdao.selectList();
				for(GuestDTO a: list) {
					System.out.println(a.getSeq()+" "+a.getName()+" "
							+a.getEmail()+" "+a.getContent());
				}
				System.out.println("-------------------");
				System.out.print("등록번호: ");
				int cnt = gdao.delete(sc.nextInt());
				System.out.println(cnt + "건 삭제완료");
			}else if (num == 4) {
				System.out.println("[ 방명록 리스트 ]");
				gdao.selectList();
				List<GuestDTO> list = gdao.selectList();
				for(GuestDTO a: list) {
					System.out.println(a.getSeq()+" "+a.getName()+" "
							+a.getEmail()+" "+a.getContent());
				}
			}else if (num == 9) {
				System.out.println("프로그램 종료");
				DBConn.dbClose();
				break; //또는 System.exit(0);
			}else {
				System.out.println("잘못된 번호입니다.");
			}	
		}

	}

}
