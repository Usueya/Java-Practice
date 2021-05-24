package ex14_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class J20210507_09_File {

	public static void main(String[] args) {
		//File Read&Writing
		//Stream:FIFO, Byte(InputStream, OutputStream), Char(Read,Writing)
		
		//1)파일출력
//		FileOutputStream fout = null;
//		try {
//			fout = new FileOutputStream("sample.txt");
//			//바이트단위(만약 숫자로 넣으려면 4byte필요)로 아스키 코드값
//			fout.write(97);
//			fout.write('b');
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("File 오류");
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("fout.write오류");
//			e.printStackTrace();
//		} finally {
//			try {
//				if(fout!=null) fout.close();
//			} catch (IOException e) {
//				System.out.println("Close 오류");
//				e.printStackTrace();
//			}
//		}
		
		//2)파일읽기
//		FileInputStream fin = null;
//		try {
//			fin = new FileInputStream("./data/sample.txt");
//			int data;
//			while ((data = fin.read()) != -1) {
//				//int data = fin.read();
//				//if (data == -1) break;
//				System.out.println(data);
//				System.out.println((char)data);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("File 없음");
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("read 오류");
//			e.printStackTrace();
//		} finally {
//			try {
//				if (fin != null) fin.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	

	}

}
