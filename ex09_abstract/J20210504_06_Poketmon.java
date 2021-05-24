package ex09_abstract;

abstract class Poketmon{
	abstract void attack();
	abstract void sound();
}
class Pikachu extends Poketmon{
	
	@Override
	void attack() {
		System.out.println("전기공격!");
	}
	
	@Override
	void sound() {
		System.out.println("피카피카!");
	}
	
}
class Squirtle extends Poketmon{

	@Override
	void attack() {
		System.out.println("물대포!");
	}

	@Override
	void sound() {
		System.out.println("꼬북꼬북!");
	}
	
}
class GamePlay{
	void attackPlay(Poketmon poke) {
		poke.attack();
	}
	void soundPlay(Poketmon poke) {
		poke.sound();
	}
}
public class J20210504_06_Poketmon {

	public static void main(String[] args) {
		GamePlay game = new GamePlay();
		game.attackPlay(new Pikachu());
		game.soundPlay(new Squirtle());
	}

}
