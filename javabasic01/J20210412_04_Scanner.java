package javabasic01;

import java.util.Scanner;

public class J20210412_04_Scanner {

	public static void main(String[] args) {
		//Scanner : 사용자에게 입력받기
		//heap이라는 영역에 (동적메모리공간)객체를 만드는데, 객체를 만드려면 new로 만들어야 함.
		//in이 기울임체인 이유는 static이기 때문.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수는? ");
//		int a = sc.nextInt();
//		System.out.println("입력받은 값은 " + a);
		
		//반지름을 입력받아 원의 넓이 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("반지름은? "); double a = sc.nextDouble();
//		//Math.PI : 원주율(3.14....)상수, 커서화면 > "F":final
//		System.out.printf("원의 넓이는 %.2f입니다." , (a*a*Math.PI));
		
		//문자열 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름은? "); 
//		String name = sc.next();
//		System.out.println("당신의 이름은 " + name + "입니다.");
		
//		//한줄 문자열 입력받기
//		Scanner sc = new Scanner (System.in);
//		System.out.print("이름은? ");
//		String name = sc.nextLine();
//		System.out.println("이름은 " + name + "입니다.");
		
		//실습) 이름과 나이와 이메일을 받아 출력하기.
//		Scanner sc = new Scanner(System.in); //읽어 들일 수 있는 객체 생성
//		System.out.print("이름은? "); String name = sc.next();
//		System.out.print("나이는? "); int age = sc.nextInt();
//		sc.nextLine(); //엔터읽고 출력하거나 변수에 넣는거 xx
//		System.out.print("메일은? "); String mail = sc.nextLine();
//		System.out.println("이름: " + name + "\n나이: " + age + "\n메일: " + mail);
		
		
		/**
		 * Scanner(형.클래스) sc = new Scanner(System.in) > inputstream을 통해 읽어 드리겠다는 객체 생성
		 * String name = sc(객체).next()(매소드); > inputstream을 통해 입력된 객체내용을 넣을 변수 name생성
		 * sc.next(); > 공백이 있으면 공백 앞까지 읽어들이게 되는 문제
		 * sc.nextLine(); > 엔터값을 기준으로 한줄을 읽어 들이는 메소드 존재 : 
		 * System(클래스).out(필드).println(매소드)
		 * inputStream에 입력된 내용을 꺼낼 때,
		 * email을 입력하고 엔터 > email 내용만 읽고 엔터를 남기기 때문에 엔터처리> 버퍼를 비우기위해서 sc.nextLine(); 사용
		 * char형의 한글자도 String으로 변수를 만들어야함! char a = sc.next(); > 불가
		 */
		
		
		//실습) 학원, 이름, 파이썬, C, 자바의 점수를 입력받아 1)반/이름은 출력, 2)세과목의 총점과 평균 출력
		Scanner in = new Scanner(System.in);
		System.out.print("반, 이름? "); 
		String ins = in.next(); //공백기준
		String name = in.nextLine(); //엔터기준
		System.out.print("Python, C, Java 점수? "); 
		int psco = in.nextInt();
		int csco = in.nextInt();
		int jsco = in.nextInt();
		System.out.println("---------------");
		System.out.println("반: " + ins);
		System.out.println("이름: " + name);
		System.out.println("---------------");
		int sum = psco+csco+jsco; double avg = sum/3.;
		System.out.println("평균: " + String.format("%.2f",avg) + "점");
		
		
		/**
		 * 자바의 경우 int a라는 공간을 만들고 그 공간안에 값을 넣을 수 있는 기본형을 만든다.
		 * (python의 경우에는 int a자체가 객채로 어떤 값이 있는 주소를 가리키지만?)
		 * Scanner를 이용하면, stack에 변수를(String name;)선언하여, 
		 * heap에 생성된 객체의 주소(동적변수)를 가리키도록 되어있다.
		 * 
		 **/

		
	}

}
