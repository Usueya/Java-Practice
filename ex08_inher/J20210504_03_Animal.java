package ex08_inher;

class Animal{
}
class Rabbit extends Animal{
	@Override
	public String toString() {
		return "토끼";
	}
	
}
class Lion extends Animal{
	@Override
	public String toString() {
		return "사자";
	}
}

class AnimalCare{
	void feed(Animal a) {
		System.out.println("feed a "+a);
	}
	void wash(Animal a) {
		System.out.println(a+" washing");
	}
}

public class J20210504_03_Animal {

	public static void main(String[] args) {
		AnimalCare care = new AnimalCare();
		Animal ani = new Rabbit();
		care.feed(ani);
		ani = new Lion();
		care.wash(ani);

	}

}
