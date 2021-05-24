package ex01_class;
//원 클래스 생성
//필드:반지름,원주율
//메소드: 객체생성과 동시에 원의 넓이 구하기

class Circle{
	private double r;
	private double area;
	
	//생성자
	//overloading
	public Circle() {};
	public Circle(double r) {
		//this(); //생성자를 호출하는 것(클래스 이름은 생성 후 사용이기 때문에)
		
		this.r = r;
		areaCal(r);
		//생성자에서 메소드 실행, 반환값이 없음.
		//객체 실행하고 동시에 메소드 실행 가능.
	}

	
	//게터
	double getArea() {
		return area;
	}
	double getR() {
		return r;
	}
	
	//메소드. 원의 넓이 계산
	//overloading
	double areaCal(double r) {
		area = r*r*Math.PI; //Math.PI:원주율값
		return area;
	}
	double areaCal(int r) {
		area = r*r*Math.PI;
		return area;
	}
	double areaCal(double r, double pi) {
		area = r*r*pi;
		return area;
	}
	double areaCal(int r, double pi) {
		area = r*r*pi;
		return area;
	}

	
	@Override
	public String toString() {
		return "Circle [r=" + r + ", area=" + area + "]";
	}

	
}
public class J20210420_05_Area {

	public static void main(String[] args) {
		Circle c = new Circle(3);
		System.out.println(c);
		System.out.println(c.getArea());
		System.out.println(c.getR());
		

	}

}
