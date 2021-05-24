package ex12_inner;

interface Cal{
	int add(int a, int b);
//	int sub(int a, int b);
}
public class J20210507_05_Cal {

	public static void main(String[] args) {
		//Anonymous Class
		Cal c1 = new Cal() {

			@Override
			public int add(int a, int b) {
				return a+b;
			}

//			@Override
//			public int sub(int a, int b) {
//				return a-b;
//			}
			
		};

		System.out.println(c1.add(10, 30));
//		System.out.println(c1.sub(100, 70));
		
		//람다식
		//한개의 추상매소드만 가지고 있어야 한다. (함수적 인터페이스)
		Cal c2 = (a,b)->a+b;
		System.out.println(c2.add(10, 21));
	}

}
