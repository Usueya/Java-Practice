package ex04_generics;

//일반멤버클래스
//필드:id, pw
class Member{
	private String userid;
	private String passwd;
	public Member() {};
	public Member(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + "]";
	}
}

//VIP멤버클래스
//필드: 아이디, 비밀번호, 할인율
class Vip{
	private String userid;
	private String passwd;
	private double rate;
	public Vip() {};
	public Vip(String userid, String passwd, double rate) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.rate = rate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Vip [userid=" + userid + ", passwd=" + passwd + ", rate=" + rate + "]";
	}	
}

//로그인 관리 클래스
class LoginManager<T>{
	void loginMember(T m){
		System.out.println(m);
		if(m instanceof Member) {
			System.out.println(((Member)m).getUserid() + "님 로그인 성공!");
		}else if (m instanceof Vip) {
			System.out.println(((Vip)m).getUserid() + "님 로그인 성공!");
		}
	}
}

public class J20210422_02_Member {

	public static void main(String[] args) {
		Member m1 = new Member("java","0000");
		System.out.println(m1);
		Vip v1 = new Vip("python","1111",0.1);
		System.out.println(v1);
		
		LoginManager<Member> lm1 = new LoginManager<>();
		lm1.loginMember(m1);
		
		LoginManager<Vip> lm2 = new LoginManager<>();
		lm2.loginMember(v1);
		
		
	}

}
