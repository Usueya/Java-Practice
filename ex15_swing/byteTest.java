package ex15_swing;

import java.io.UnsupportedEncodingException;

public class byteTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String c ="홍길동";
		System.out.println(c.length()); //문자열의 길이
		System.out.println(c.getBytes("utf-8").length); //utf-8
		System.out.println(c.getBytes("euc-kr").length);
	}

}
