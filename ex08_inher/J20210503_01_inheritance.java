package ex08_inher;

//부모클래스
class Person{
	protected String name; //protected:자식클래스 접근가능
	void setName(String name) {
		this.name = name;
	}
	void breath() {
		System.out.println(name+" 숨쉬기");
	}
	void eat() {
		System.out.println(name+" 먹기");
	}
	
}
//자식클래스:자식을 먼저 실행한 뒤 부모로 이동
class Student extends Person{
	private String name = "학생";
	Student(){
		super.name = this.name; //super:부모 클래스
	}
	void learn() {
		System.out.println(name+" 배우기");
	}
	
}
//자식클래스
class Teacher extends Person{
	private String name = "선생님";
	Teacher(){
		super.name = this.name;
	}
	void teach() {
		System.out.println(name+" 가르침");
	}
}


public class J20210503_01_inheritance {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.breath();
		s1.eat();
		s1.learn();
		
		Teacher t1 = new Teacher();
		t1.breath();
		t1.eat();
		t1.teach();
		
		
	}

}
