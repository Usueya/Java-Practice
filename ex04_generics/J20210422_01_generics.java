package ex04_generics;

//사각형 클래스
//필드: 가로(int), 세로(int), 넓이(int)
//제네릭타입: 인스턴스생성시 형을 결정
//T(Type)는 임의 알파벳으로 지정하지만 많이 쓰는 알파벳이 있다.
//K:Key, V:Value, E:Element
class Rectangle<T>{
	private T width;
	private T height;
	private double area;
//	public Rectangle() {};
	public Rectangle(T width, T height) {
		super();
		this.width = width;
		this.height = height;
		area = getArea(width, height);
		
	}
	public T getWidth() {
		return width;
	}
	public void setWidth(T width) {
		this.width = width;
	}
	public T getHeight() {
		return height;
	}
	public void setHeight(T height) {
		this.height = height;
	}
	public double getArea(T width, T height) {
		double result = 0;
		if(width instanceof Integer) {
			result = (int)width * (int)height;
		}else if (width instanceof Double) {
			result = (double)width*(double)height;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + "]";
	}
}

public class J20210422_01_generics {

	public static void main(String[] args) {
		Rectangle<Integer> r1 = new Rectangle<Integer>(10,2);
		System.out.println(r1);
		
		//Rectangle r1 = new Rectangle(5.5,2.5);
		//int형을 매개변수로 받기 때문에 실수형입력시 오류 발생
		//double형으로 받기 위해서는 새로운 클래스를 생성해야하는 문제발생
		
		//제너릭 Generics: 자료형에 의존하지 않는 클래스(다형성문제 해결)
		//객체를 생성할때 필드들의 형을 지정<Integer>
		//단 기본형 입력은 불가.
		
		Rectangle<Double> r2 = new Rectangle<>(6.5,2.4);
		System.out.println(r2);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
