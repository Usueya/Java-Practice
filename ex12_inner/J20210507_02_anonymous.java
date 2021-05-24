package ex12_inner;
class Dog{
	void walking() {
		System.out.println("뽀짝뽀짝");
	}
}

//class HuntDog extends Dog{
//	void walking() {
//		System.out.println("못 걷는다.");
//	}
//}

public class J20210507_02_anonymous {

	public static void main(String[] args) {
//		HuntDog hdog = new HuntDog();
//		hdog.walking();
		
		//익명클래스: 부모의 클래스로 재정의(@Override)하여 생성
		//1회성 사용 목적
		Dog hdog = new Dog() {
			@Override
			void walking() {
				System.out.println("걸을 수 없다.");
			}
			//부모에 없는 메소드라면 사용불가
//			void eating() {
//				System.out.println("먹는다.");
//			}
		};
		hdog.walking();

	}

}
