package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210423_01_Exception {

	public static void main(String[] args) {
		//예외처리(Exception)≠에러
		//에러:개발자가 조치할 수 없는 수준(메모리 부족, JVM동작 이상)
		//예외:다른 방식으로 처리 가능한 오류, 입력값 오류, 파일입출력 오류

//		int a = 10, b = 0;
//		Scanner sc = new Scanner(System.in);
		
		//예외1) b의 값이 0인 경우 java.lang.ArithmeticException:
		//예외2) b의 값이 문자인 경우 java.util.InputMismatchException
		
		//catch의 오버로딩
		//Exception 모든예외의 최상위 부모 클래스
		/**
		 * try{
		 *     //예외발생 가능성 문장
		 * }catch() {
		 *     //예외발생 케이스별 catch 작성
		 *     //err.printStackTrace(); > 예외발생된 지점 추적 출력(유지보수목적)
		 * }catch(Exception e) {
		 *     //Exception은 마지막에 처리
		 * }
		 **/
		
//		while(true) {
//			System.out.print("나눌 수를 입력해주세요. ");
//			try{
//				//예외 발생 가능성 있는 문장
//				b = sc.nextInt();
//				System.out.println("결과는 "+a/b+"입니다.");
//				break;
//			}catch(InputMismatchException err) { 
//				System.out.println("숫자를 입력해주세요. ");
//				sc.nextLine();
//				err.printStackTrace();
//			}catch(ArithmeticException err) {
//				System.out.println("0으로 나눌 수 없습니다. ");
//				err.printStackTrace();
//			}catch(Exception err) {
//				System.out.println("예외발생! ");
//				err.printStackTrace();
//			}
//		}
//		System.out.println("프로그램 정상종료");

		
		//실습)
//		int[] arr = {10,20,30};
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("인덱스 번호를 입력하세요! ");
//			try {
//				int num = sc.nextInt();
//				System.out.println(arr[num-1]);
//				break;
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("잘못된 숫자");
//			}catch (java.util.InputMismatchException e) {
//				sc.nextLine();
//				System.out.println("잘못된 숫자");
//			}
//			catch(Exception err) {
//				System.out.println("예외발생! ");
//				err.printStackTrace();
//				break;
//			}
//		}
//		System.out.println("프로그램 정상종료");
		
		//C:\Users\301-17\Dropbox\coco\java\source\java_01 프로젝트 첫 위치에 file생성
		//Scanner(file source)
		
		//예외의 종류
		//1) 체크예외: RuntimeException을 상속하지 않은 예외(필수체크)
		//   예. 네트워크, DB, 외부장치 등과 연결되는 것
		//2) 언체크예외: RuntimeException을 상속한 예외
		
		File file = new File("sample.txt");
		try {
			Scanner sc = new Scanner(file); //throws FileNotFoundException
			System.out.println("  ★ 읽기 성공! ★  ");
			System.out.println("----파일 내용----");
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) { //체크예외 케이스
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
