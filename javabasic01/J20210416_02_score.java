package javabasic01;

import java.util.Scanner;

public class J20210416_02_score {

	public static void main(String[] args) {
		
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
			
			switch(num) {
			case 1:
					System.out.println("-------------------");
					System.out.println("성적입력");
					for (int i =0; i<score.length; i++) {
						for (int j =0; j<score[i].length; j++) {
							System.out.print(std[i] + "학생의 " + sub[j] + "과목의 점수는? ");
							score[i][j] = sc.nextInt();
						}
					}
					break;
			case 2:
					System.out.println("-------------------");
					System.out.println("학생별 합계/평균");
					for (int i =0; i<score.length; i++) {
						int sum=0;
						for (int j =0; j<score[i].length; j++) {
							sum+=score[i][j];
						}
						System.out.println(std[i] + "학생의 총점: " + sum + " 평균: " + sum/3.);
					}
					break;
			 
			case 3:
			
					System.out.println("-------------------");
					System.out.println("과목별 합계/평균");
				
					for(int k = 0; k<sub.length; k++) {
					int sum = 0;
						for (int l = 0; l<std.length; l++) {
							sum+=score[l][k];
						}
					System.out.println(sub[k]+"과목의 합계 "+sum + " 평균" + sum/std.length);
					} break;
				
			case 9:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0); //프로그램종료 (여기의 break 입력하게되면, switch종료를 의미.)
				
			default:
					System.out.println("잘못된 번호");
				
			}
		}	

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
