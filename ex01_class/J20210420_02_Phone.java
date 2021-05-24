package ex01_class;

//핸드폰 클래스
//필드: 브랜드, 용량, 화소
//생성자, 게터, 세터, toString

class Phone{
	//private 접근제한자
	private String name;
	private int capacity;
	private int pixel;
	
	//constructor
	public Phone(){} //기본 생성자를 만들어주는게 좋다!(프레임워크 오류대비)
	public Phone(String name, int capacity, int pixel) {
		this(name,capacity);
//	    this()생성자 자신을 의미: 자신의 생성자 호출
//		생성자호출은 반드시 첫줄에 작성
//		this.name = name;
//		this.capacity = capacity;
		this.pixel = pixel;
	}
	public Phone(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	
	//setter,getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", capacity=" + capacity + ", pixel=" + pixel + "]";
	}
}

public class J20210420_02_Phone {
	public static void main(String[] args) {
		Phone p1 = new Phone("아이폰",258,6500);
		System.out.println(p1);
	}

}
