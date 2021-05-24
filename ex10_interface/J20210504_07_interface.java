package ex10_interface;

//interface:구현부없음(추상매소드).다중상속가능.객체생성불가.
//매소드 앞 (public) abstract생략가능(default)
interface Attack{
	//필드: static final생략
	String name = "포켓몬 공격"; 
	void attack(); 
	//default: 일반매소드생성
	default void gameTime() {
		System.out.println("24시간 공격");
	}
}
interface Sound{
	String name = "포켓몬 소리";
	abstract void sound();
}
class Pika implements Attack, Sound{
	@Override
	public void attack() {
		System.out.println("전기공격~~~");
	}

	@Override
	public void sound() {
		System.out.println("피카피카~!");
	}
	
}
class Squirtle implements Attack, Sound{	
	@Override
	public void attack() {
	System.out.println("물대포~~~");
}

	@Override
	public void sound() {
		System.out.println("꼬북꼬북~!");
		
	}
}
class GamePlay{
	void attack(Attack a) {
		a.attack();
	}
	void sound(Sound s) {
		s.sound();
	}
}

//다중상속 불가(자바의 단점) > 인터페이스 활용
//class Squirtle extends Attack, Sound{

public class J20210504_07_interface {

	public static void main(String[] args) {
		Pika pika = new Pika();
		pika.attack();pika.sound();
		Squirtle squ = new Squirtle();
		squ.attack();squ.sound();
		
		//class Pika implements Attack, Sound{
		//class Squirtle implements Attack, Sound{	
		Attack atta= new Pika();
		atta.attack();
		Sound soun = new Pika();
		soun.sound();
		
		//void attack(Attack a)
		GamePlay game = new GamePlay();
		game.attack(pika);
		game.sound(new Squirtle());
		
		//interface's field : static final
		System.out.println(soun.name);
		
		//inerface's normal method(default method)
		pika.gameTime();
	}

}
