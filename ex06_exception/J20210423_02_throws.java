package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J20210423_02_throws {

	static void arrayIndex(int index) {
		int[] arr =  {10,20,30};
		try {
			System.out.println(arr[index-1]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("※Exception! 잘못된 index");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	static void arrayIndex_throws(int index) throws ArrayIndexOutOfBoundsException {
		int[] arr =  {10,20,30};
		System.out.println(arr[index-1]);
	}
	
	static void fileRead(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner sc = new Scanner(file); //인코딩 방식이 다른 경우, (file,"utf-8")로 Charset 맞출것! 
		System.out.println("  ★ 읽기 성공! ★  ");
		System.out.println("----파일 내용----");
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println(s);
			}
	}
	
	public static void main(String[] args) {
		//예외를 메소드에서 처리
		J20210423_02_throws.arrayIndex(4);
		
		//throws:예외던지기
		//예외를 받은 곳(호출한 곳)에서 처리를 해야한다.
		try {
			J20210423_02_throws.arrayIndex_throws(4);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("※throw처리: 잘못된 index");
		} catch (Exception e) {
			System.out.println("예외발생");
		}
		
		//파일읽기메소드(메소드에서 처리하지 않고 던짐)
		try {
			J20210423_02_throws.fileRead("sample.txt");
		} catch (Exception e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		
		//throw:예외발생시키기 Exception e = new Exception("Exception"); throw e;
		
		
	}
	
	

}
