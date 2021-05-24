package ex02_access;

import ex01_class.Bank;

public class J20210421_04_package {

	public static void main(String[] args) {
		
		//같은 패키지 안의 클래스 호출
			Test test = new Test();
			System.out.println(test.getA());
		
		//다른 패키지 안의 클래스 호출
		//1.호출시 앞에 패키지 명 사용
		//2.ctrl + spacebar 를 통해 import 입력하면 패키지명 없이 사용
		
			//ex01_class.Bank b1 = new ex01_class.Bank("국제통장", "111-222-345678");
			Bank b1 = new Bank("국제통장", "111-222-345678");
		
		//접근제어자
		//public: 모든 클래스가 접근가능
		//private: 자신의 클래스 내부에서 접근가능
		//default: 같은 패키지에서만 접근가능(접근제한자 없음)
		//protected: 같은 패키지 허용, 자식 클래스 허용*
		
			
			
	}

}
