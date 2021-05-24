package ex01_class;

import java.util.Date;

//수강생클래스----------------------------------------------
//필드:코드,이름,수강과목
class Attendee{
	private String cd;
	private String nm;
	private String sub;
	
	public Attendee() {
		super();
	}
	public Attendee(String cd, String nm, String sub) {
		super();
		this.cd = cd;
		this.nm = nm;
		this.sub = sub;
	}
	
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	@Override
	public String toString() {
		return "Attendee [cd=" + cd + ", nm=" + nm + ", sub=" + sub + "]";
	}
	
}//class Attendee 종료

//수강클래스----------------------------------------------
//메소드: 입실, 퇴실 출력
class LectureManager{
	//인스턴스 필드
	//객체변수. 인스턴스 생성시 생성, 객체소멸
	
	//클래스 필드
	//static 객체를 생성하지 않고 클래스이름으로 접근하여 필드,메소드 사용!
	//클래스가 메모리에 로딩될때 생성. 프로그램 종료시 소멸
	//static final : 상수(반드시 선언과 동시에 초기화)
	static String collegeName1 = "국제학원"; //변경할 수 있음!
	static final String collegeName2 = "국제학원"; //final은 상수화!
	

	static int buildYear = 2000;
	static Date day ;
	static{ //static블럭을 이용하여 초기화, 주로 db또는 파일에서 가져올 때
		Date now = new Date();
		day = now;
		
		//SimpleDateFormat sf = new SimpleDateFormat("dd");
		//day = Integer.parseInt(sf.format(now));
	}
	
	static void in(Attendee a) {
		//static안의 변수도 static이어야한다.
		//LectureManager.day = day2
		System.out.println(day +"일 "+ a.getSub()+"반 "+a.getNm()+"님 입실완료");
	}
	static void out(Attendee a) {
		System.out.println(day +"일 "+a.getSub()+"반 "+a.getNm()+"님 퇴실완료");
	}
	
	
}//class Attend 종료


public class J20210421_02_Attend {
	public static void main(String[] args) {
		
		//클래스 필드
		System.out.println(LectureManager.collegeName1);
		LectureManager.collegeName1 = "신림학원";
		//LectureManager.collegeName2 = "신림"; //The final field cannot be assigned
		System.out.println(LectureManager.collegeName1);
		System.out.println(LectureManager.buildYear);
		
		Attendee atd1 = new Attendee("nm001","신용권","JAVA");
		
		//인스턴스 필드
//		LectureManager lm = new LectureManager();
//		System.out.println(lm.collegeName);
//		System.out.println(lm.buildYear);
//		LectureManager.in(atd1); LectureManager.out(atd1);
		

	}

}
