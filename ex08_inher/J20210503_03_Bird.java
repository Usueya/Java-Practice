package ex08_inher;

//클래스 앞 final은 상속불가 의미
//final class Bird{}
class Bird{
	private String name;
	
	Bird(String name){
		this.name = name;
	}
	void born() {
		System.out.println(name+" 알 낳기");
	}
	//final void fly() { : overriding 불가
	//필드에 final은 상수를 의미
	void fly() {
		System.out.println(name+" 날기");
	}
}
class Sparrow extends Bird{
	private String name = "참새";
	
	Sparrow(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}

/*
 *오버라이딩:부모클래스를 다시 정의
 *source > override/implement methods 자동생성
 *단, 부모 매소드 앞 final 있는 경우 재정의(overriding) 불가
 *F4를 통해 계층구조 확인
 */

class Ostrich extends Bird{ 
	private String name = "타조";
	
	Ostrich(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	void fly() {
		System.out.println(name+" 날 수없다.");
	}
}

public class J20210503_03_Bird {

	public static void main(String[] args) {
		
		Sparrow s = new Sparrow("참새");
		Ostrich o = new Ostrich("타조");
		s.born();
		o.fly();
		
		Object o2 = new Ostrich("타조"); //업캐스팅(자동)
		Bird b2 = new Sparrow("참새");
		Ostrich o3 = (Ostrich)o2; //다운캐스팅(수동)
		
		

	}

}
