package ex08_inher;

class Shape{
	private int height;
	private int width;
	
	void printShape() {
		System.out.println("다각형");
	}
}
class Rectangle extends Shape{
	private String name = "직사각형";
	@Override
	void printShape() {
		System.out.println("직사각형");
	}
}
class Triangle extends Shape{
	private String name = "삼각형";
	@Override
	void printShape() {
		System.out.println("삼각형");
	}
}

public class J20210503_04_polymorphism {

	public static void main(String[] args) {
		
		/*다형성을 이용해 매소드를 실행할 경우
		 *overriding이 되어 있어야한다. (없을 경우 컴파일 에러/문법적 에러)
		 *자식 클래스에서 메소드 overriding하려면 다형성을 위해
		 *부모 클래스에 매소드명이 있어야한다. 
		 *overriding이 가능하기 때문에 소속된 어떤형이라도 참조변수 생성가능(다형성)
		 *런타임시에는 자식 매소드가 실행된다.
		 */
		
		Triangle t1 = new Triangle();
		t1.printShape();
		
		Shape t2 = new Triangle(); 



		
	}

}
