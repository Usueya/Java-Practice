package ex14_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class J20210507_10_file_charactor {

	public static void main(String[] args) {
		// 문자기반 데이터 입출력 스트림
		// char형 변수: 2byte
		// java는 모든문자를 유니코드를 기준으로 표현
		// 문자단위로 쓰기
		
		//파일쓰기
		//try-with문: finally에 close하지 않아도 자동 close
		//System.out.println("자".getBytes().length);
//		try (FileWriter fw = new FileWriter("./data/charSample.txt")) {			
//			fw.write('A');
//			fw.write("자바");
//			fw.write("good");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//파일읽기
//		int ch;
//		try(FileReader fr = new FileReader("./data/charSample.txt")){
//			while((ch = fr.read()) !=-1) {
//				 System.out.print((char)ch);
//			}			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//실습)좋아하는 칼라를 입력받아 파일을 만들고
		//파일을 읽어서 리스트를 출력하기
//		Scanner sc = new Scanner(System.in);
//		String color = null;
//		try (FileWriter favorWri = new FileWriter("./data/color.txt")){
//			while(true) {
//				System.out.print("컬러는? ");
//				color = sc.nextLine();
//				if (color.equals("q")) break;
//				else {
//					favorWri.write(color);
//				}
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		int read;
//		try (FileReader favorRea = new FileReader("./data/color.txt")){
//			while((read = favorRea.read()) != -1) {
//				System.out.print((char)read);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		//실습)이름과 점수를 입력받아 파일에 저장하고
		//파일을 읽어서 합계와 평균 구하기
		//문자를 숫자로바꾸기 Integer.parseInt("100")
		
		try(FileWriter namW = new FileWriter("./data/score.txt")) {
			namW.write("김흥부,20,30,40\n");
			namW.write("김놀부,20,30,40");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int r;
		try (FileReader namR = new FileReader("./data/score.txt")){
			while((r= namR.read()) !=-1) {
				System.out.print(r+" ");
				if (r==5) System.out.println(); //엔터10 ,44
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
