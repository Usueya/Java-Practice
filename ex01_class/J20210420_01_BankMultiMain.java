package ex01_class;

import java.util.Scanner;

public class J20210420_01_BankMultiMain {
	public static void main(String[] args) {
		//계좌 다중등록
		
		Scanner sc = new Scanner(System.in);
		Bank [] banks = new Bank[3]; //bank 
		int custno = 0;
		
		while (true) {
		
		System.out.println("\n▶ 계좌 Main ◀");
		System.out.println("▶ 고객번호"+custno+" ◀");
		System.out.println("--------------");
		System.out.println("0.고객 번호");
		System.out.println("1.계좌 개설");
		System.out.println("2.입금 하기");
		System.out.println("3.출금 하기");
		System.out.println("4.계좌 정보");
		System.out.println("9.종 료");
		System.out.println("--------------");
		System.out.print("번호를 입력하세요.");
		int num = sc.nextInt();
		sc.nextLine(); //nextInt다음에 엔터값(버퍼)이 남아있어서
		
			switch (num) {
			case 0:
				System.out.print("\n고객번호를입력하세요. ");
				custno = sc.nextInt();
				if (custno>0 && custno<banks.length+1) {
					System.out.println("로그인성공! 회원번호: "+ custno);
					break;
				}
				else {
					System.out.println("회원번호 오류");
					break;
				}
			case 1:
				System.out.println("\n▶계좌개설◀");
				System.out.print("은행명: ");
				String bankname = sc.nextLine();
				System.out.print("계좌번호: "); String bankno = sc.nextLine();
				banks[custno-1] = new Bank(bankname,bankno);
				System.out.println("계좌가 생성되었습니다.");
				break;
			case 2:
				if(banks[custno-1]==null) {
					System.out.println("계좌를 개설하세요.");
					break;
				}
				System.out.print("\n입금할 금액: ");
				int input = sc.nextInt();
				banks[custno-1].deposit(input);
				System.out.println("잔액: " + banks[custno-1].getBalance());
				break;
			case 3:
				if(banks[custno-1]==null) {
					System.out.println("계좌를 개설하세요.");
					break;
				}
				System.out.print("\n출금할 금액: ");
				int output = sc.nextInt();
				banks[custno-1].withdraw(output);
				System.out.println("잔액: " + banks[custno-1].getBalance());
				break;
			case 4:
				System.out.println("\n은행명: " + banks[custno-1].getBankname());
				System.out.println("계좌번호: " + banks[custno-1].getBankno());
				System.out.println("잔액: " + banks[custno-1].getBalance());
				break;
			case 9:
				System.out.println("종료합니다.");
				System.exit(0); //***프로그램종료(while까지)
			default:
				System.out.println("잘못된 번호입니다.");
				break;
				
			}//switch종료
			
		}//while종료

	}

}
