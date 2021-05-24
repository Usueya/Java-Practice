package javabasic01;

import java.util.Scanner;

public class J20210414_03_for {

	public static void main(String[] args) {
		
		// 반복문 for : 반복횟수가 정해져있는 경우 추천!
		//----------------------------------------------------------------------
//		int sum = 0;
//		
//		for (int i = 1; i<11; i++) {
//			sum +=i;
//		}
//		System.out.println("합계는 " + sum);
		
		//----------------------------------------------------------------------
		//Make UpDown Game ver1.0
		//1) 1-100사이 중 랜덤으로 한 숫자를 변수에 저장(Math.random활용) r*(end - start +1) + start
		//2) 사용자에게 정수를 입력을 받아 랜덤 수와 비교 후 Up 또는 Down 입력 x 반복
		//3) 5번만에 맞춰야 한다. (for활용)
		
//		int r = (int)(Math.random()*100+1);
//		
//		System.out.println("☆ -------------------- ☆");
//		System.out.println("☆     Up-Down Game     ☆");
//		System.out.println("☆ -------------------- ☆");
//		
//		for ( int i = 0; i <5 ; i++) {
//			System.out.print("남은 기회: " + (5-i) + " ");
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.print("숫자는? ");
//			int unum = sc.nextInt();
//			
//			if (r == unum) {
//				System.out.println("★Success★"); break;
//			}else if (r > unum) 
//				System.out.println("▲ up ▲");
//			else 
//				System.out.println("▼ down ▼");
//		}
//		System.out.println("☆ -------------------- ☆");
//		System.out.println("정답은 " + r + "입니다.");
		
		
		//----------------------------------------------------------------------
		//Make UpDown Game ver2.0 : 숫자가 아닌 값이 입력되었을 때
		
//		int r= (int)(Math.random()*100+1);
//		System.out.println("랜덤값: "+ r);
//		
//		Scanner sc = new Scanner(System.in);
//		int a; boolean win = false; //성공여부
//		
//		for(int i=0; i<5; i++) {
//				System.out.printf("%d)숫자를 맞춰라 ", i+1);
//				
//				if(!sc.hasNextInt()) { //입력한 값이 숫자가 아니면
//					System.out.println("숫자를 입력하세요");
//					sc.nextLine(); //버퍼비우기..***********
//					i--; //게임 잔여수 복구
//					continue; //반복문 처음으로 돌아가서 실행
//				}
//				
//				a = sc.nextInt();
//				
//				if (r==a) {
//					win = true;
//					System.out.println("성공"); break;
//				}else if (r > a) {
//					System.out.println("업");
//				}else  {
//					System.out.println("다운");
//				}
//		}
//		if (!win) System.out.println("실패");
		
		//----------------------------------------------------------------------
		//설탕배달 문제풀기(https://www.acmicpc.net/problem/2839)
		//봉지는 3kg, 5kg가 있고, 최대한 적은 봉지 들고가기
		//N kg -> 5로 나눈 몫을 구하여 N - (5*몫)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("배달 kg? ");
//		int kilo = sc.nextInt();
//		int okilo; //5kg 몫
//		int rekilo1; //5kg 봉지 제외한 남은 n kg
//		
//		int skilo; //3kg 몫
//		int rekilo2; //3kg 봉지 제외한 남은 n kg
//		
//		okilo = kilo/5;
//		rekilo1 = kilo-(5*okilo);
//		System.out.println("5kg 봉지: "+ okilo);
//		skilo = rekilo1/3;
//		System.out.println("3kg 봉지: "+ skilo);
//		rekilo2 = rekilo1-(3*skilo);
//		System.out.println("배달불가 kg : "+ rekilo2);
//		System.out.println("총 배달할 봉지의 갯수: " + (okilo+skilo));
		
		//----------------------------------------------------------------------
		//설탕배달 다른분 풀이
//		Scanner sc = new Scanner(System.in);
//		System.out.println("설탕을 주문하세요.");
//		int N = sc.nextInt();
//		
//		int i = 0;
//		while(N>0) {
//			if(N%5==0) {
//				N = N-5;
//			}else if(N%3==0) {
//				N = N-3;
//			}else
//				N=N-5;
//			i++;	
//		}
//		if(N<0) {
//			i = -1;
//		}
//		System.out.println(i);
		

		//----------------------------------------------------------------------
		//소수판별하기(prime number : 1과 자신만으로 나누어 떨어지는 수)
		
//		int a = 17;
//		
//		for (int i = 2; i<a; i++) {
//			if (a%i==0) {
//				System.out.println("소수아님"); break;
//			}else
//				System.out.println("소수임"); break;
//		}
		
		//----------------------------------------------------------------------
		//소수판별 풀이 * 지역변수 선언 주의!
		
//		int a1 = 9;
//		int i;
//		
//		for(i = 2; i<a1; i++) {
//			if(a1%i==0) {
//				System.out.println("소수아님");
//				break;
//			}
//		}
//		if (i==5) {
//			System.out.println("소수이다");
//		}
		
		//----------------------------------------------------------------------
		//1~100 소수구하기 
		//2부터 n번(포함)으로 나누어 나머지가 0으로 떨어지는 갯수가 1인 경우 > 소수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자는? ");
		int num = sc.nextInt();
		int cnt = 0;
		
		for (int i = 2; i<=num; i++) {
			//System.out.println(i);
			
				for (int j = 2; j<=i; j++) {
					
						if (i%j==0) {
							cnt++;
						}
						
				}
			if (cnt==1) {
				System.out.print(i+" ");
			}
			cnt = 0;
		}
		
		//----------------------------------------------------------------------
		//1~100 소수구하기 풀이
		//boolean(1.참/0.거짓)형 > True/False를 갖고 있을 수 있는 형태
		//
		
//		boolean b;
//		for(int j = 2; j<101; j++) {
//			b=true;
//			for(int i = 2; i<j; i++) {
//				if(j%i==0) {
//					b=false; break;
//				}
//			}
//			if (b) {
//				System.out.println(j + " ");
//			}
//		}
		
		//설탕배달 강사님 풀이
		//5kg과  3kg의 봉지 몇개가 필요한지, 가장 작은수의 봉지구하기
		//15kg : 5kg * 3
		//18kg : 5kg * 3 + 3kg * 1
		//11kg : 5kg * 1 + 3kg * 2
		//7kg : -1
		//1kg : -1
		
		int nKg, count5, count3, rest; //이동할 kg수, 5kg봉지수, 3kg봉지수, 나머지
		//이동해야할 kg수 입력
		System.out.print("배달해야할 설탕의 무게(kg)는?"); 
		
		nKg = sc.nextInt();
		count5 = nKg / 5;	//만약 1kg이라면 => 0
		while (true) {
			rest = nKg - (5 * count5);  
			if (rest % 3 == 0) { //나누어 떨어지면 
				count3 = rest / 3;
				System.out.printf("필요한 봉지의 수: %d(5kg) + %d(3kg)", count5, count3);
				break;
			}
			else {
				if (count5 == 0) { //5kg이 0이면 - 할수 없다
					System.out.printf("%d\n", -1);
					break;
				}
				count5 -= 1;  //5kg짜리 봉지수를 1 줄인다
			}
		}		
		

	}

}
