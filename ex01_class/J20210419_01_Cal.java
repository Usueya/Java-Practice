package ex01_class;

//계산기 클래스 만들기

class Cal{
	String maker = "Casio";
	
	//반환형이 없다면 void
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	double div(int a, int b) {
		return (double)a/b;
	}
}

public class J20210419_01_Cal {

	public static void main(String[] args) {
		Cal c1  = new Cal();
		System.out.println(c1.maker);
		
		int a = 20, b = 3;
		int r = c1.add(a,b);
		System.out.println("합계: " + r);
		
		System.out.println("빼기: " + c1.sub(a, b));
		System.out.println("곱하기: " + c1.mul(a, b));
		System.out.println("나누기(double형): " + c1.div(a, b));
		
	}

}
