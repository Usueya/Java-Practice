package ex01_class;

//클래스 이름은 대문자로 시작하는 관례
//객체를 만들기 위한 틀 : class

class Dog { 
	//다른 클래스를 한 파일에 만들어도되지만, 퍼블릭은 하나만 존재해야한다.
	//하나의 클래스는 하나의 파일로 생성하지만, 지금은 교육을 위해 !
	
	//속성 : 변수처럼 보이지만 클래스안에 만들어진 속성을 필드라고 한다.
	//       클래스의 속성(필드)은 자동 초기화 (boolean 초기화값: false)
	String type = "강아지";
	String name = "달이";
	int legs = 4;
	int cnt; //걸음 수 저장
	
	//기능:메소드
	void walking() {//걷는 기능
		cnt++;
		System.out.println(name + " 걷는다.");
	}
	void eating() {//먹는 기능
		System.out.println(name + " 먹는다.");
	}
	void leave() {//퇴근 기능
		System.out.println(name + " 퇴근한다.");
	}
	
}

public class j20210416_03_class {                          //퍼블릭(누구나접근) 클래스는 파일의 이름이 같아야 하는 규칙!
	public static void main(String[] args) {
		Dog d1 = new Dog(); //
		System.out.println(d1.type);
		System.out.println(d1.legs);
		System.out.println(d1.name);
		d1.walking();
		d1.eating();
		d1.leave();
	}

}
