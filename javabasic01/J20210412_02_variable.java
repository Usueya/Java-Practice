package javabasic01;

import java.math.BigDecimal;

public class J20210412_02_variable {

	public static void main(String[] args) {
		//정수형 변수
//		int a = 10, b=20;
//		System.out.println(a + "+" + b + "=" + (a+b));
//		System.out.printf("%d+%d=%d\n",a,b,(a+b));
//		System.out.printf("%d-%d=%d\n",a,b,(a-b));
//		System.out.printf("%d/%d=%.2f\n",a,b,((double)a/b));
//		byte c = 10;
//		System.out.println(c);
//		
//		//실수형 float_4byte, double_8byte
//		float f = 3.14f; //3.14가 더블형이기 때문에 3.14f로 표기하여 float로 변경 또는 (float)3.14
//		double d = 3.14; 
		
		//부동소수점의 오차 
//		double d= 608.4, d2 = 206.2;
//		System.out.println(d+d2); //결과값 814.5999999999999 >부동소수점으로 계산
//		System.out.printf("%.2f\n",d+d2); // 결과값 814.60 > 반올림처리를 하게되어 문제점 발생
		
		//부동소수점 오차를 해결하여 정확한 계산을 할 경우 (ex, 금전적 부분)
//		BigDecimal b1 = new BigDecimal("608.4");
//		BigDecimal b2 = new BigDecimal("206.2");
//		
//		BigDecimal result = b1.add(b2);
//		System.out.println(result);
		
		//문자형
		//숫자도 문자도 하나로 봄. 유니코드 체계에 의해 숫자를 바꿈
		//컴퓨터에서는 문자가 숫자. 0을 더하면 숫자(코드)화
//		char c = 'a'; System.out.println(c); //a
//		char c2 = '가'; System.out.println(c2); //가
//		System.out.println(c2+0); //44032는 가의 유니코드
		
		//논리형
//		boolean b = true;
//		System.out.println(b);
		
		//문자열(형이없다)
		//참조형으로 변수값이 주소를 가지고 있음.
//		String s1 = new String("자바"); //heap에 저장
//		String s2 = "자바"; //heap의 상수틀에 저장?
//		System.out.println(s1); System.out.println(s2);
//		//메모리 구조의 중요성
//		//다르다
//		if (s1==s2)
//			System.out.println("같다");
//		else
//			System.out.println("다르다");
//		//같다
//		if (s1.equals(s2))
//			System.out.println("같다");
//		else
//			System.out.println("다르다");
		
		//형변환
		//자동 형변환, 명시적 형변환
//		byte b = 10; int a = b; //4byte에 1byte를 넣을 수 있음(자동 형변환 : 작은형이 큰형으로 변환)
//		byte c = (byte)a; //불가하여 a를 명시적 형변환이 필요(명시적 형변환 : 큰형이 작은형으로 변환)
//		System.out.println(a);System.out.println(b);System.out.println(c);
		
		//상수명은 대문자로 작성하는 것이 관례
		//상수는 변경이 불가능 ex. PI = 5.15f;
//		final float PI = 3.14f;
//		System.out.println(PI);
		
			
	}

}
