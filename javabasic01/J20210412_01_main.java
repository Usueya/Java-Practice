package javabasic01;

//파일 이름과 public class의 이름은 같아야 한다.
public class J20210412_01_main { //클래스의 이름

	//main(메소드): 진입점 메소드
	public static void main(String[] args) { //String[] args:문자열의 배열

		System.out.print("헬로우 자바 "); //print:개행x
		System.out.println("헬로우 자바"); //println:개행O
		//System 클래스이름의 첫자는 대문자. out필드.println메소드
		System.out.println("나의 나이는 " + 20); //sysout + ctrl + spacebar
		//10 + 20 = 30
		System.out.println(10 + "+" + 20 + "=" + (10+20));
		System.out.printf("%d+%d=%d\n", 10, 20, 10+20);
		
	}

}
