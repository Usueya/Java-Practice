package javabasic01;

import java.util.Scanner;

public class J20210414_02_while {

	public static void main(String[] args) {
		//반복문 while
		
		//----------------------------------------------------------------------
		//원의 넓이 구하기 + 반지름에 0을 입력하면 종료
		
		//1안 : r을 선언하지 않아도 되는 경우
//		Scanner sc = new Scanner(System.in);
//		double r ;
//		
//		while(true) {
//			System.out.print("반지름은? ");
//			r = sc.nextDouble();
//			if (r==0) break;
//			System.out.println("넓이는 " + r*r*3.14);
//		}
		
		//2안 : r을 선언해야하는 경우
//		Scanner sc = new Scanner(System.in);
//		double r = 1 ;
//		
//		while(r!=0) {
//		System.out.print("반지름은? ");
//		r = sc.nextDouble();
//		System.out.println("넓이는 " + r*r*3.14);
//	}
		
		//3안 : do while
//		Scanner sc = new Scanner(System.in);
//		double r;
//		
//		do {
//			System.out.print("반지름은? ");
//			r = sc.nextDouble();
//			System.out.println("넓이는 " + r*r*3.14);
//		}while (r!=0);
		
		//----------------------------------------------------------------------
		//실습) n을 입력받아 1부터 n까지의 합계 출력(while활용)
		
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		
		System.out.print("마지막 숫자는? ");
		int n = sc.nextInt();
		
		while (true) {
			num++;
			if (num>n) break; //처리 순서 중요!
			sum +=num;
		}
		System.out.println(sum);
		
	}

}
