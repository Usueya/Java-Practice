package ex01_class;

//은행클래스: Bank
//필드: 은행명(bankname), 계좌번호(bankno), 계좌잔액(balance)
//생성자, 게터, 세터 생성하기

public class Bank{
	private String bankname;
	private String bankno;
	private int balance;
	
	//생성자 자동생성
	//source > Generate Constructor using Fields
	
	public Bank(String bankname, String bankno) {
		this.bankname = bankname;
		this.bankno = bankno;
	}

	public Bank(String bankname, String bankno, int balance) {
		super(); //상속관계관련 > 부모클래스의 생성자를 실행하라는 의미
		this.bankname = bankname;
		this.bankno = bankno;
		this.balance = balance;
	}
	
	//setter, getter 생성자 자동생성
	public String getBankname() {
		return bankname;
	}
	public String getBankno() {
		return bankno;
	}
	public int getBalance() {
		return balance;
	}
	
	//입금메소드
	void deposit(int a) {
		balance+=a;
	}
	
	//출금메소드
	void withdraw(int a) {
		if (balance-a<0) System.out.println("잔액이 부족합니다.");
		else balance-=a;
	}
	
	
	//어노테이션
	//오버라이딩 @Override: 부모클래스의 toString() 메소드를 재정의
	//부모클래스 지정 > class Bank extend Object
	//F4를 통해 관계 확인가능
	
	//필드 값이 잘 담겼는지 확인 할 수 있는 기능 toString
	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", bankno=" + bankno + ", balance=" + balance + "]";
	}
	
}
