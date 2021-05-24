package ex12_inner;

//InnerClass를 OuterClass 밖에 생성한다면
//OuterClass에서 InnerClass inner = new InnerClass();로 생성
//차이점은 class 파일이 다르게 생성된다.
//ex. OuterClass$InnerClass.class
//ex. OuterClass.class

class OuterClass{
	class InnerClass{
		public String toString() {
			return "인스턴스 클래스";
		}
	}
	//필드성
	InnerClass inner = new InnerClass(); 
	
	//메소드 안에서의 변수
	void method1() {
		InnerClass localinner = new InnerClass();
		System.out.println(localinner);
	}
	
	class InnerClassNew{
		public String toStirng() {
			return "새로운 인스턴스 클래스";
		}
	}

	
}
public class J20210507_01_Inner {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		System.out.println(outer.inner);
		outer.method1();
		
		//이너클래스생성과 객체의 형
		OuterClass.InnerClassNew innerNew = outer.new InnerClassNew();
	}

}
