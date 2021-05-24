package ex14_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class J20210507_11_buffer {

	public static void main(String[] args) {
		//char단위로 쓰고 읽어야 할 때
		//라인단위로 쓰고 읽어 들이고 싶을 때
		
//2		BufferedWriter bw = new BufferedWriter( //문자단위 버퍼보조
//		new FileWriter("./data/bufferWriter.txt")); //파일에 문자단위로 출력		

//1		FileWriter fw = new FileWriter("./data/bufferWriter.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		
//		Scanner sc = new Scanner(System.in);
//		
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("./data/bufferWriter.txt"))) {
//			while(true) {
//				System.out.print("이름,국,영,수점수? ");
//				String data = sc.nextLine();
//				if(data.equals("quit")) {
//					System.out.println("종료합니다.");
//					break;
//				}
//				bw.write(data);
//				bw.newLine();
//			}			
//		}catch (IOException e) {
//			System.out.println("예외발생");
//			//Exception:가장최상위의예외로 모든예외
//		}
		//bw.close() - try~with문으로 파일 자동 close
		
		//FileReader:파일을 문자단위로 읽기
		//BufferedReader:문자단위보조스트림>라인별 읽기가능
		
		try(BufferedReader br = new BufferedReader(new FileReader("./data/bufferWriter.txt"));){
			String s = null;
			while((s = br.readLine()) != null) {
				//System.out.println(s);
				String[] data = s.split(",");
				//System.out.println(Arrays.toString(data));
				int sum=0;
				for(int i = 1; i<4; i++) {
					sum += Integer.parseInt(data[i]);
				}
				System.out.println("이름: "+data[0]);
				System.out.println("합계: "+sum);
				System.out.printf("평균: %.2f\n",sum/3.);
				System.out.println("----------------");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	

	}

}
