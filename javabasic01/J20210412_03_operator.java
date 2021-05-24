package javabasic01;

public class J20210412_03_operator {

	public static void main(String[] args) {
		//연산자
		
		//삼항연산자
//		int a = 10;
//		String s1 = (a>0)? "양수":"음수";
//		System.out.println(s1);
		
		//실습)두 수 중에서 큰 수를 출력
		int a= 100, b=50;
		int max = (a>b)? a : (b>a)? b : 0;
		System.out.println("큰 값: " + max);
		
		//실습1)세 수중에서 큰 수를 출력***
		int num1 = 20, num2 = 10, num3 = 30;
		int max2 = (num1>num2)? ((num1>num3)? num1 : num3): num2;
		System.out.println("큰 값: " + max2);
			//풀이1)
			//int amx = a>b? (a>c)? a:c : (b>c)? b:c;
		
		//실습2)짝 홀수 출력하기
		int odd = 10;
		String holjjak = (odd%2==0)? "짝수":"홀수";
		System.out.println(holjjak);
		
		//실습3)세과목이 모두 60점 이상이면 합격 아니면 불합격
		int kor = 90, eng = 85, math = 50;
		String pass =(kor >= 60 && eng >= 60 && math >= 60)? "합격":"불합격";
		System.out.println(pass);
			//풀이3
			//System.out.println((kor >= 60 && eng >= 60 && math >= 60)? "합격":"불합격");

		
		// 

	}

}
