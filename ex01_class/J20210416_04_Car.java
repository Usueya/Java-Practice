package ex01_class;

//자동차 클래스 생성하기
//속성: name, color, power, speed
//기능: powerToggle, speedUp, speedDown

class Car {
	//필드1
	String name = "붕붕카";
	//필드2
	String color = "Yellow";
	//필드3
	boolean power;
	//필드4
	int speed;
	
	//메소드1
	void powerToggle() {
		power = !power;
	}
	//메소드2
	void speedUp() {
		if (speed <100)  speed++;
		System.out.println("현재 스피드: " + speed);
	}
	//메소드3
	void speedDown() {
		if (speed > 50)  speed--;
		System.out.println("현재 스피드: " + speed);
	}
}

public class J20210416_04_Car {
	public static void main(String[] args) {
		Car KE001 = new Car();
		String KE001name = "AKF-11";
		System.out.println("차종: " +KE001.name + " " +KE001name);
		System.out.println("칼라: " +KE001.color);
		KE001.powerToggle();
		System.out.println("파워: " + KE001.power);
		
		System.out.println("처음 속도: " + KE001.speed);
		
		for(int i=0; i<105;i++) {
			KE001.speedUp();
		}
		System.out.println("변경 속도: " + KE001.speed);
		
		for(int i=0; i<65;i++) {
			KE001.speedDown();
		}
		System.out.println("변경 속도: " + KE001.speed);
		
		KE001.powerToggle();
		System.out.println("파워: " + KE001.power);

	}

}
