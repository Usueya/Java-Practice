package ex12_inner;

interface School{
	void namePring();
}
//class HighSchool implements School{
//	@Override
//	public void namePring() {
//		System.out.println("국제 고등학교");
//	}
//}

public class J20210507_03_interface_anonymous {

	public static void main(String[] args) {
		
//		HighSchool hs = new HighSchool();
//		hs.namePring();
		
		//익명클래스 생성
		//interface는 추상화로 객체생성불가
		//interface//School//를 상속받는 익명의 개체를 생성
		//익명은 형이 없음으로 다형성으로 상속받은 interface형으로 변수선언
		School high = new School() {
			@Override
			public void namePring() {
				System.out.println("익명 고등학교");
			}
		};
		high.namePring();
	}

}
