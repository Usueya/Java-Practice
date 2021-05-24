package ex01_class;

class NewCal{
	//필드: maker, result
	String maker = "New Casio Cal";
	double result;
	
	//메소드: result = 결과값에 더하는 기능
	//오버로딩: 매개변수의 갯수나 형이 다른 경우 메소드 이름 중복가능
	
	void add(double a) {
		result += a;
	}
	
	double add(double a, double b) {
		return a+b;
	}
	
	void add(int a) {
		result += a;
	}
	
	void sub(double a) {
		result -=a;
	}
	
	void mul(double a) {
		result *= a;
	}
	
	void div(double a) {
		result /=a;
	}
	
}

public class J20210419_02_newCal {

	public static void main(String[] args) {
		NewCal nc1 = new NewCal();
//		System.out.println(nc1.result);
//		nc1.add(10);
//		System.out.println(nc1.result);
//		nc1.sub(1.2); System.out.println(nc1.result);
//		nc1.mul(2); System.out.println(nc1.result);
//		nc1.div(2);System.out.println(nc1.result);

		System.out.println(nc1.add(10,20));
		nc1.add(50); System.out.println(nc1.result); 
		
	}

}
