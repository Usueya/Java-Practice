package javabasic01;

import java.util.Scanner;

public class J20210414_01_switch {

	public static void main(String[] args) {
		/*
		 * 조건문 : switch
		 * switch(변수) {
		 * case 1 : 
		 * }
		 */
		
		//----------------------------------------------------------------------
		//숫자에 영어단어 출력
//		int a= 3;
//		switch(a) {
//		case 1:
//			System.out.println("One"); break;
//		case 2:
//			System.out.println("Two"); break;
//		case 3:
//			System.out.println("Three"); break;
//		default:
//			System.out.println("잘못된 숫자"); 
//		}
		
		//----------------------------------------------------------------------
		//h:고등학교, m:중학교, e:초등학교 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학교는?");
//		String school = sc.next();
//		
//		switch(school) { //String값으로 반환하기 때문에 " "사용하여 String형으로 사용.
//		case "h":
//			System.out.println("High School"); break;
//		case "m":
//			System.out.println("Middle School"); break;
//		case "e":
//			System.out.println("Elementary  School"); break;
//		default:
//			System.out.println("잘못된 문자"); 
//		}
		
		
		//----------------------------------------------------------------------
		//문자열의 비교
		//(s1==s3)주소를 비교
		//(s1==s2)주소를 비교하는 것은 맞지만 상수풀안에서 주소를 비교한다는 의미(단, 이것은 문자를 비교하는것은 x)
		//값을 비교하기위해서는 결국 equals 메소드를 사용하여 참/거짓을 판별해야함.
		
//		String s1 = "java"; //상수풀에 java를 만들어서 java의 주소를 s1(stack)
//		String s2 = new String("java"); //heap에 (string형)객체 생성 후 지닌 값이 java
//		String s3 = "java";
//		
//		if (s1==s3) { 
//			System.out.println("같습니다.");
//		}else
//			System.out.println("다릅니다");
		
		//----------------------------------------------------------------------
		//실습)짝수, 홀수 출력
//		int a = 16;
//		
//		switch(a%2) {
//		case 0 :
//			System.out.println("짝수"); break;
//		case 1 :
//			System.out.println("홀수"); break;
//		}
		
		//----------------------------------------------------------------------
		//학점 100~90:A 89~80:B 79~70:C 69~60:D 59~:F 출력하기
		int score = 89;
		switch (score/10){
		case 10:
		case 9:
			System.out.println("A");break;
		case 8:
			System.out.println("B");break;
		case 7:
			System.out.println("C");break;
		case 6:
			System.out.println("D");break;
		default:
			System.out.println("F");
		}
		
		//----------------------------------------------------------------------
		
		
		
	}

}
