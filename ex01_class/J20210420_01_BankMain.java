package ex01_class;

import java.util.Scanner;

public class J20210420_01_BankMain {

	public static void main(String[] args) {
		
//		Bank b1 = new Bank("신한은행", "110-000-12345678");	
//		System.out.println("은행명 "+b1.getBankname());
//		System.out.println("계좌번호 "+b1.getBankno());
//		System.out.printf("잔액 %,d\n",b1.getBalance());
//		System.out.println(b1); 
		//클래스에서 toString을 만들면 필드값 확인가능
		//println : 객체를 받으면 obj.toString()을 실행하는 기능이 있음.
		
//		Bank b2 = new Bank("기업은행", "220-050-147855678",1254800);
//		System.out.println("은행명 "+b2.getBankname());
//		System.out.println("계좌번호 "+b2.getBankno());
//		System.out.printf("잔액 %,d\n",b2.getBalance());
//		System.out.println(b2);
		
//		b1.deposit(150000);
//		b2.withdraw(54800);
//		System.out.printf("잔액 %,d\n",b1.getBalance());
//		System.out.printf("잔액 %,d\n",b2.getBalance());
		
		Scanner sc = new Scanner(System.in);
		Bank b1 = null;
		
		while (true) {
		
		System.out.println("\n▶ 계좌 Main ◀");
		System.out.println("--------------");
		System.out.println("1.계좌개설");
		System.out.println("2.입금하기");
		System.out.println("3.출금하기");
		System.out.println("4.계좌정보");
		System.out.println("9.종료");
		System.out.println("--------------");
		System.out.print("번호를 입력하세요.");
		int num = sc.nextInt();
		sc.nextLine(); //nextInt다음에 엔터값(버퍼)이 남아있어서
		
			switch (num) {
			case 1:
				System.out.println("\n▶계좌개설◀");
				System.out.print("은행명: ");
				String bankname = sc.nextLine();
				System.out.print("계좌번호: "); String bankno = sc.nextLine();
				b1 = new Bank(bankname,bankno);
				System.out.println("계좌가 생성되었습니다.");
				continue;
			case 2:
				if(b1==null) {
					System.out.println("계좌를 개설하세요.");
					continue;
				}
				System.out.print("\n입금할 금액: ");
				int input = sc.nextInt();
				b1.deposit(input);
				System.out.println("잔액: " + b1.getBalance());
				continue;
			case 3:
				if(b1==null) {
					System.out.println("계좌를 개설하세요.");
					continue;
				}
				System.out.print("\n출금할 금액: ");
				int output = sc.nextInt();
				b1.withdraw(output);
				System.out.println("잔액: " + b1.getBalance());
				continue;
			case 4:
				System.out.println("\n은행명: " + b1.getBankname());
				System.out.println("계좌번호: " + b1.getBankno());
				System.out.println("잔액: " + b1.getBalance());
				continue;
			case 9:
				System.out.println("종료합니다.");
				System.exit(0); //***프로그램종료(while까지)
			default:
				System.out.println("잘못된 번호입니다.");
				continue;
				
			}//switch종료
			
		}//while종료

	}

}
