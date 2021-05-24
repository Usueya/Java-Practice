package javabasic01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210413_01_If {

	public static void main(String[] args) {
		/**조건문:If
		 * 참일때 수행하는 문장이 2문장 이상이라면, {} 사용.
		 * 중첩 if문
		 * if 조건식1 {}
		 * else if 조건식2 {}
		 * else {}
		 */
		
		//두수를 입력받아 큰 수를 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두수는? ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		if (num1>num2) {
//			System.out.println(num1);
//			System.out.println("num1이 더 큽니다.");
//		}else {
//			System.out.println(num2);
//			System.out.println("num2이 더 큽니다.");
//		}
		
		//(절대평가) 
		//점수를 입력받아 A(90점이상), B(80점이상), C(70점이상)
		//D(60점이상), F(60점 미만) 학점 출력하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수는? "); int score = sc.nextInt();
//		0
//		if (score >=90) 
//			System.out.println("A");
//		else if (score >= 80) 
//			System.out.println("B");
//		else if (score >=70) 
//			System.out.println("C");
//		else if (score >=60) 
//			System.out.println("D");
//		else 
//			System.out.println("F");
		
		//(상대평가)
		//등수와 전체인원수를 입력받아 상위 15% A, 상위 35% B, 상위 50% C학점
//		Scanner sc = new Scanner(System.in);
//		System.out.print("전체인원수는? "); int tot = sc.nextInt();
//		System.out.print("등수는? "); int grade = sc.nextInt();
//		
//		if ( grade <= (tot*0.15) )
//			System.out.println("A등급");
//		else if (grade <= tot*0.35)
//			System.out.println("B등급");
//		else if (grade <= tot*0.5)
//			System.out.println("C등급");
//		else
//			System.out.println("불합격");
		
		/**소수점 표기방법
		 * 1) *100 -> /100 : 더블형으로 변환시켜서 더블형 리턴
		 * 2) String.format : 문자형 반환
		 * 3) 메소드를 만드는법.
		 */
		
		/*
		실습)온도단위 섭씨(C) => 화씨(F)로 바꾸기
		공식 : (1) 화씨온도를 섭씨온로도 : 섭씨온도 = (화씨온도-32) * 5/9
		 (2) 섭씨온도를 화씨온도로 : 화씨온도 = (섭씨온도*9/5) + 32
		온도 : 10C 또는 100F
		*/
//		Scanner sc = new Scanner(System.in);
//		System.out.print("온도는? ");
//		int fc = sc.nextInt(); 
//		String fcc = sc.next();
//		System.out.println(fc +" "+ fcc);
//		
//		if (fcc.equals("C")) {
//			System.out.println( "화씨온도: " + (fc * (double)9/5 + 32) );
//		} else if (fcc.equals("F")) {
//			System.out.println( "섭씨온도: " + ( (fc -32) * (double)5/9 ) );
//		} else {
//			System.out.println( "잘못된 표기" );
//		}
		
		/*
		 String fcc > fcc는 참조변수로 주소값이 들어가 있기 때문에 (fcc=="C") 조건이 부합하지 않음
		 참조변수는 .매소드 기능이 있어 equals()를 통해 true/false 값 반환
		 문자열 비교시 equals 메소드 이용
		 */
		
		
		/*
		 실습) 계산기 프로그램
		 예. 10 + 20 입력 > 30 결과리턴	
		 */
//		try {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("계산식은? ");
//		int num1 = sc.nextInt();
//		String sign = sc.next();
//		int num2 = sc.nextInt();
//		//System.out.println(num1 + "," + sign + "," + num2);
//		
//		if (sign.equals("+"))
//			System.out.println("결과: " + (num1+num2));
//		else if (sign.equals("-"))
//			System.out.println("결과: " + (num1-num2));
//		else if (sign.equals("*"))
//			System.out.println("결과: " + (num1*num2));
//		else if (sign.equals("/"))
//			System.out.println("결과: " + String.format("%.2f", (double)num1/num2));
//		
//		}catch (InputMismatchException e) {
//			System.out.println("예외발생");
//		}

		
		/*
		 계산기(입력값 확인)
		 코드 인스펙션(규율) :  ==로 true, false로 비교하지 않는다.
		 sc.hasNextInt() == true 를 쓰면 규율에 어긋남 why? sc.hasNextInt() 값 자체가 true/false 이기 때문에
		 (!sc.hasNextInt()) 논리연산자 !를 쓰면 true -> false 로 변환시켜줌
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자값은? ");
//		//System.out.println("숫자? " + sc.hasNextInt());
//		
//		if (sc.hasNextInt()) {
//			int a = sc.nextInt();
//			System.out.println(a);
//			
//		}else {
//			System.out.println("숫자가 아닙니다");
//		}
//		

		/*
		 실습) 중첩조건문
		 아이디와 패스워드를 입력받아 > 로그인 성공 여부를 결정 짓는 프로그램
		 데이터는 하드코딩으로 작성하여 처리(추후 데이터 불러와서 처리할 예정)
		 */
//		String myid = "java"; String mypw = "1111";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디를 입력하세요. "); 
//		String id = sc.next();
//		
//		if ( id.equals(myid) ) { //myid.equals(id)로 작성해도 무방!
//			System.out.print("패스워드를 입력하세요. "); 
//			String pw = sc.next();
//			
//			if ( pw.equals(mypw) ) {
//				System.out.println("로그인 성공! ");
//			}else {
//				System.out.println("패스워드 불일치");
//			}
//		} else {
//			System.out.println("아이디 불일치");
//		}		
		
		
		/*
		실습) 전기사용량 구하기
		월 사용량을 입력받아 > 전기요금을 계산하자!
		*/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("▶전력량 요금 구간◀");
//		System.out.println("※ 200kwh이하     93.3원/kwh");
//		System.out.println("※ 201~400kwh이하 187.9원/kwh");
//		System.out.println("※ 400kwh초과     280.6원/kwh");
//		System.out.println("----------------------");
//		
//		System.out.print("사용량(kwh)을 입력하세요. "); int amt = sc.nextInt();
//		System.out.println("----------------------");
//		
//		if (amt > 400) {
//			System.out.println("전기요금: " +( (amt - 400)*280.6 + (200*187.9) + (200*93.3) ) +"원" );
//		}else if ( amt > 200) {
//			System.out.println("전기요금: " + ( (amt - 200)*187.9 + (200*93.3) ) +"원" );
//		}else if ( amt <= 200) {
//			System.out.println("전기요금: " + (amt*93.3) + "원" );
//		}
		
		/*
		 * 전기사용량 풀이
		 * 구간에 대한 정보를 데이터에서 가져와야 하지만 수업은 하드코딩!
		 * 필요변수:사용자가입력한 사용량use/기본요금base/전력량eleuse : 설계시 변수명도 설정.
		 */
//		double won ;
//		int use = 401; //사용량
//		double eleUse1 = 88.3; //1단계 전력량 요금
//		double eleUse2 = 182.9; //1단계 전력량 요금
//		double eleUse3 = 275.6; //1단계 전력량 요금
//		int base; 	//기본요금(배열이 이상적)_사용량에 따라 기본료 변동
//		
//		if (use <= 200) { //1단계
//			base = 910;
//			won = base + use * eleUse1;
//		}else if (use <= 400) { //2단계
//			base = 1600;
//			won = base + (200 * eleUse1) + ((use-200)*eleUse2) ;
//			
//		}else { //3단계 만약 이 부분에 else if ( use > 400) 조건을 넣는다면 won을 초기화해야하는 오류발생.
//			base = 7300;
//			won = base + (200 * eleUse1) + (200 * eleUse2) + ((use-400)*eleUse3) ;
//			
//		}
//		System.out.println(won);
//		System.out.println(Math.floor(won)); //버림
//		System.out.println(Math.ceil(won)); //올림
//		System.out.println(Math.round(won)); //반올림
//		
//		won = Double.parseDouble(String.format("%.0f", won)) ; //string > double 변환불가, Double.parseDouble > string값 변환
//		System.out.println("사용요금" + String.format("%.0f", won)); //반올림값 변환 사용요금61815.6 > 사용요금61816
//		
//		System.out.println("사용요금" + (int)won); //>>> 가장간편한 방법!
		
		/*
		실습) 윤년 체크하기
		다른 풀이
		if (year%4==0 && year%4!==100 || year%400==0){
		System.out.println("윤년");
		} else {
		System.out.println("평년");
		}
		*/
//		Scanner leap = new Scanner(System.in);
//		System.out.print("년도는? "); int year = leap.nextInt();
//		
//		if (year%4==0) {
//			if(year%100==0) {
//				
//				if (year%400==0) {
//					System.out.println("윤년입니다.");
//				}else {
//					System.out.println("평년입니다.");
//				}
//			}else {
//				System.out.println("윤년입니다.");
//			}
//		}
		
		//Math.random > 무작위 수를 가져올 수 있는 기능
		// 0 <= 랜덤값 < 1 : 기본
//		double r = Math.random();
//		System.out.println(r);
//		// 1 <= 랜덤값 < 6 : 기본값에 6을 곱하면, 0~5.999까지이기때문에 +1을 더함
//		System.out.println((int)(r*6+1));
//		//5~10사이의 숫자, 마지막값-시작값+1
//		System.out.println( (int) (r*(10-5+1)+5) );
//		//따라서 r*(end - start +1) 몇개를 구할지 값이 나옴
//		//r*(end - start +1) + start
//		//11~20사이의 숫자
//		System.out.println( (int) (r*(20-11+1)+11) );
		
		//주사위게임만들기(1~6)
		double r = Math.random(); int user1 = (int)(r*6)+1; //int user1 = (int)(Math.random()*6)+1;
		double g = Math.random(); int user2 = (int)(g*6)+1; //int user2 = (int)(Math.random()*6)+1;
		
		System.out.println(user1 +" "+ user2);
		
		if (user1 > user2) {
			System.out.println("user1의 승리입니다.");
		}else if (user2 > user1) {
			System.out.println("user2의 승리입니다.");
		}else
			System.out.println("무승부 입니다.");
		
		
		
	}
}
