package ex08_inher;

class MyCar{
	static final String name = "Audi SQ8";
}
class Tire extends MyCar{
	private String company;

	public Tire(String company) {
		super();
		this.company = company;
	}

	@Override
	public String toString() {
		return "Tire_company= " + company;
	}
}
class Mirror extends MyCar{
	private String company;

	public Mirror(String company) {
		super();
		this.company = company;
	}

	@Override
	public String toString() {
		return "Mirror_company= " + company;
	}
}
class Repair{
	//Overloading
	void changePart(Tire t) {
		System.out.println(t+" 교체");
	}
	void changePart(Mirror m) {
		System.out.println(m+" 교체");
	}
	//다형성 이용
	void changePart(MyCar o) {
		System.out.println(o+" 교체");
	}
}
public class J20210504_02_Car {

	public static void main(String[] args) {
		System.out.println(MyCar.name);
		MyCar car1 = new Tire("금호타이어");
		System.out.println(car1);
		
		MyCar car2 = new Mirror("한국미러");
		System.out.println(car2);
		
		Repair r1 = new Repair();
		r1.changePart((Tire)car1);
		r1.changePart((Mirror)car2);
		r1.changePart(car2);
		
		
		
	}

}
