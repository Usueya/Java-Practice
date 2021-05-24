package ex09_abstract;

//abstract:추상매소드를 가진다면 추상클래스 생성
abstract class Education{
	static final String name = "교육청";
	
	//구현부가 없는 추상매소드
	//자식 클래스가 구현(Override)할 목적
	abstract void schoolName();
}
class Elementary extends Education{

	//부모의 추상매소드 필수구현
	@Override
	void schoolName() {
		// TODO Auto-generated method stub
		System.out.println("Jinwee Elemantary");
	}

}
class Middle extends Education{
	void schoolName() {
		System.out.println("Kyounggi MiddleSchool");
	}
	
}
class High extends Education{
	void schoolName() {
		System.out.println("Seoul HighSchool");
	}
}

class EduInfo{
	void schoolNamePrint(Education edu) {
//		if (edu instanceof High)
//		((High) edu).schoolName();
//		else if (edu instanceof Middle)
//			((Middle) edu).schoolName();
//		else if (edu instanceof Elementary)
//			((Elementary) edu).schoolName();
		
		//형변환 없이 다형성을 위해 부모에 추상매소드 생성
		edu.schoolName();
	}
}

public class J20210504_05_abstract {

	public static void main(String[] args) {
		EduInfo info = new EduInfo();
		Elementary ele = new Elementary();
		Middle mid = new Middle();
		High hig = new High();
		
		//부모 매소드 없고, 자식에만 있는 매소드는 다운캐스팅 필요
		//void schoolNamePrint(Education edu) {..
		info.schoolNamePrint(ele);
		info.schoolNamePrint(mid);
		info.schoolNamePrint(hig);
		
		//부모 매소드의 오버라이딩
		info.schoolNamePrint(new Elementary());
		info.schoolNamePrint(new Middle());
		info.schoolNamePrint(new High());
		
		//abstract 추상클래스는 객체생성-new Education();-불가		
		
	}

}
