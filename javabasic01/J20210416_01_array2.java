package javabasic01;

import java.util.Scanner;

public class J20210416_01_array2 {

	public static void main(String[] args) {
		//----------------------------------------------------------------------
		// 이차배열
		
//		int[][] arr = new int[3][4];
//		int[][] arr = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//		int[][] arr = { {1,2,3,4},  {5,6,7,8},  {9,10,11,12} };
//		
//		//이차배열 출력
//		for (int i = 0; i<arr.length; i++) {
//			for (int j =0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+" "); //"%2d ",arr[i][j]
//			}
//			System.out.println();
//		}
//		
//		//for each문으로 출력하기
//		for (int[] a :arr) { //2차 배열 -> 1차
//			for(int b :a) { //1차배열 -> 값
//				System.out.println(b);
//			}
//		}
		
		//----------------------------------------------------------------------
		//1) 반복문을 이용한 초기화 (1씩 증가하는 number 활용)
//		int[][] arr = new int[3][4];
//		int no=0;
//		
//		for (int i =0; i<arr.length; i++) {
//			
//			for(int j = 0; j<arr[i].length; j++) {
//				arr[i][j] = ++no;
//				System.out.println(arr[i][j]);
//			}
//		}
		//----------------------------------------------------------------------
		//2) 반복문을 이용한 초기화
		
		// i j0  1  2  3  
		// 0  1  2  3  4  j+1 
		// 1  5  6  7  8  (i*4)+(j+1)
		// 2  9  10 11 12
		
//		int[][] arr = new int[3][4];
//		for (int i =0; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				arr[i][j] = (i*4)+(j+1);
//				System.out.println(arr[i][j]);
//			}
//		}
		
		//----------------------------------------------------------------------
		//두 학생의 각 국/영/수 점수를 입력받아 배열에 저장 > switch&case로 바꿔보고 예외처리 try&catch로 감싸기
		//학생별 합계와 평균
		
		Scanner sc= new Scanner(System.in);
		int[][] score = new int[2][3];
		String[] sub = {"국어","영어","수학"};
		String[] std = {"서우리", "우유리"};
		
		while (true) { //프로그램시작
			System.out.println("---------------------");
			System.out.println("성적 입력 프로그램v1.0");
			System.out.println("---------------------");
			
			System.out.println("1. 성적입력");
			System.out.println("2. 학생별 합계/평균");
			System.out.println("3. 과목별 합계/평균");
			System.out.println("9. 종료");
			System.out.println("---------------------");
			System.out.print("실행할 번호는? ");
			int num = sc.nextInt();
			
			if (num==1) { //1. 성적입력
				System.out.println("-------------------");
				System.out.println("성적입력");
				for (int i =0; i<score.length; i++) {
					for (int j =0; j<score[i].length; j++) {
						System.out.print(std[i] + "학생의 " + sub[j] + "과목의 점수는? ");
						score[i][j] = sc.nextInt();
					}
				}
				
			}else if (num==2) { //2. 학생별 합계/평균
				System.out.println("-------------------");
				System.out.println("학생별 합계/평균");
				for (int i =0; i<score.length; i++) {
					int sum=0;
					for (int j =0; j<score[i].length; j++) {
						sum+=score[i][j];
					}

					System.out.println(std[i] + "학생의 총점: " + sum + " 평균: " + sum/3.);
				}
				
			}else if (num==3) {//3. 과목별 합계/평균
				System.out.println("-------------------");
				System.out.println("과목별 합계/평균");
			
				for(int k = 0; k<sub.length; k++) {
				int sum = 0;
					for (int l = 0; l<std.length; l++) {
						sum+=score[l][k];
					}
				System.out.println(sub[k]+"과목의 합계 "+sum + " 평균" + sum/std.length);
				}
				
			}
			else if (num==9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("-------------------");
				System.out.println("잘못된 번호");
			}
		
		} //while끝
		
		//윈도우 cmd > javac -encoding utf-8 J20210416_02_score.java 컴파일 가능! > class 파일이 생성됨
		// java javabasic01.J20210416_02_score 
		// 실행명령어 패키지명.클래스파일이름 > 실행됨!
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
