package ex08_inher;

//부모클래스:사칙연산기능
//부모클래스의 생성자를 자식클래스에서 실행
class Cal{
	private String color;
	protected int result;
	//private int result; 같은패키지의 자식클래스에서 접근가능
	//int result; 디폴트로 같은 패키지 내에서 접근가능
	//protected result; 다른패키지의 자식클래스에서 접근가능
	Cal(String color){
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public int getResult() {
		return result;
	}
	int add(int a, int b){
		return a+b;
	}
//	int add(int a) {
//		result +=a;
//		return result;
//	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	double div(double a, double b) {
		return a/b;
	}
}

//자식클래스: 나머지, 제곱기능 추가
//자식클래스에서 부모클래스 생성자를 반드시 호출
class NewCal extends Cal{
	NewCal(String color) { //부모의 생성자가 1개라면,
		super(color); //부모(super)클래스의 생성자를 실행해야 자식클래스 생성가능
		//super(); 부모의 기본생성자 실행(생략 가능. jvm에서 자동실행)
	}
		int add(int a) {
		result +=a;
		return result;
	}
	int remainder(int a, int b) {
		return a%b;
	}
	double squ(int a, int b) {
		return Math.pow(a,b);
	}
}


public class J20210503_02_Cal {

	public static void main(String[] args) {
		NewCal nc1 = new NewCal("Red");
		System.out.println(nc1.add(10, 20));
		System.out.println(nc1.remainder(10, 3));
		System.out.println(nc1.squ(2, 2));
		System.out.println(nc1.getColor());
		nc1.add(10);
		nc1.add(2);
		nc1.add(18);
		System.out.println(nc1.getResult());
		
		//object의 메소드 사용가능
		nc1.hashCode();
	}

}
