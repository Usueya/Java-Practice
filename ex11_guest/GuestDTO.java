package ex11_guest;

public class GuestDTO {
	//은닉화
	private int seq;
	private String name;
	private String email;
	private String passwd;
	private String content;
	private String regdate;
	
	public GuestDTO() {}
	public GuestDTO(String name, String email, String passwd, String content) {
		super();
		this.name = name;
		this.email = email;
		this.passwd = passwd;
		this.content = content;
	}
	public GuestDTO(int seq, String name, String email, String passwd, String content) {
		super();
		this.seq = seq;
		this.name = name;
		this.email = email;
		this.passwd = passwd;
		this.content = content;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return regdate;
	}
	public void setDate(String date) {
		this.regdate = date;
	}
	@Override
	public String toString() {
		return "GuestDTO [seq=" + seq + ", name=" + name + ", email=" + email + ", passwd=" + passwd + ", content="
				+ content + ", regdate=" + regdate + "]";
	}

}
