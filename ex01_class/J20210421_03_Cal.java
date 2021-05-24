package ex01_class; //package : 클래스를 모아놓은 집합

public class J20210421_03_Cal {
	public static final String maker = "국제계산기";
	private int result;
	private boolean light;
	
	public boolean isLight() {
		return light;
	}
	
	//두수를 매개변수로 받아 합을 리턴하는 메소드
	//static 메소드 안에서는 static 필드만 사용 가능!
	static int add(int a, int b){
		return a+b;
	}
	int add(int a) {
		this.result +=a;
		return result;
	}
	
	void lightToggle() {
		light = !light;
	}


	public static void main(String[] args) {
	//main에 static이 붙은 이유?
	//클래스는 객체를 생성해야 하지만 생성없이 실행되어야 하기 때문에!
		
		J20210421_03_Cal cal = new J20210421_03_Cal();
		//System.out.println(cal.add(10, 20));
		
		System.out.println(J20210421_03_Cal.add(50, 60));
		J20210421_03_Cal.add(10,20);
		
		cal.lightToggle();
		cal.lightToggle();
		
		if(cal.isLight()) System.out.println("on");
		else System.out.println("off");
		

		

		
	}

}
