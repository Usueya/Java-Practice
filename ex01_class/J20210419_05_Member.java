package ex01_class;

//회원클래스
//필드: ID, 비밀번호, 출생년도, 키
//data transaction object
class Member{
	//private 필드
	//클래스 내부에서만 접근가능(외부 접근은 메소드setter를 이용)
	
		private String id;
		private String pw;
		private int dob;
		private double hgt;
		
	//생성자:객체가 생성될 때 1번 실행되는 메소드
	//★★★반드시 객체가 생성될때  생성자가 실행되어야한다.
	//클래스의 이름과 같다. 반환형이 없다. 
		
	//기본생성자 Member(){};
	//만약 생성자가 없으면 컴파일러가 기본 생성자를 생성
	//만약 생성자를 만들면 컴파일러가 기본생성자를 생성하지 않는다.
		
	//>>>클래스 생성시에 반드시 생성자를 만들어야한다.
	//생성자의 오버로딩
		
		Member(){};
		Member(String id, String pw, int dob, double hgt){
			this.id = id;
			this.pw = pw;
			this.dob = dob;
			this.hgt = hgt;
		}
	
	//set:필드접근
		void setId(String id) {
			this.id = id;
		}
		//비밀번호 읽기불가 > get내용 삭제!
		void setPw(String pw) {
			this.pw = pw;
		}
		void setDob(int dob) {
			this.dob = dob;
		}
		void setHgt(double hgt) {
			this.hgt=hgt;
		}
	//get:필드값 반환
		String getId() {
			return id;
		}
		//비밀번호 노출 규칙 설정
		String getPw() {
			return pw.substring(0, 2)+"***";
		}
		int getDob() {
			return dob;
		}
		double getHgt() {
			return hgt;
		}
	
}

public class J20210419_05_Member {

	public static void main(String[] args) {

//		Member mr = new Member(); //기본생성자를 이용하여 객체 생성
//		mr.setId("kakao123");
//		mr.setPw("123@123");
//		mr.setDob(19871128);
//		mr.setHgt(182.3);
		
		Member mr = new Member("kakao123","123@123",19871128,182.3);
		System.out.println("아이디 "+mr.getId());
		System.out.println("패스워드 "+mr.getPw());
		System.out.println("--------");
		Member mr2 = new Member("talk123","456@143",1984,162.3);
		System.out.println("아이디 "+mr2.getId());
		System.out.println("패스워드 "+mr2.getPw());
		
		
	}

}
