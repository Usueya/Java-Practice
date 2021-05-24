package ex08_inher;

class School{
	void schoolName() {
		System.out.println("국제학교");
	}
	void info(String name) {
		//compile error 방지
	}
}
class Stud extends School{
	@Override
	void info(String name) {
		System.out.println(name+" 학생");
	}
}
class Teach extends School{
	@Override
	void info(String name) {
		System.out.println(name+" 선생님");
	}
}

public class J20210504_01_Student {

	public static void main(String[] args) {
		School s1 = new Stud();
		s1.schoolName();
		((Stud)s1).info("David");

		s1 = new Teach();
		((Teach)s1).info("Rion");
	}
	
}



















