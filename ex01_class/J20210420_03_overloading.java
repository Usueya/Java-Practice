package ex01_class;

import java.util.Arrays;

//계산기 클래스

class Sum{
	
	//매소드1. 매개변수 두 정수의 합
	int add(int a, int b) {
		return a+b;
	}
	
	//매소드2. 매개변수 세 정수의 합
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	//매소드3. 매개변수 배열의 합
	int add(int[] a) {
		//System.out.println(Arrays.toString(a));
		int sum=0;
		for (int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	//매소드4. 가변인자
	//int형의 여러 인자(...)를 배열로 만들어서 실행
	int add1(int... arr) {
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	//매소드5. 문자열을 가변인자로 받아 출력
	void variableString(String... arr) {
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
		
		for(String a:arr) {
			System.out.println(a);
		}
	}
	
}



public class J20210420_03_overloading {

	public static void main(String[] args) {
		Sum s = new Sum();
//		System.out.println("매소드1: "+s.add(10, 20));
//		System.out.println("매소드2: "+s.add(10, 20, 30));
//		System.out.println("-----------");
		
		int[] arr= {10,20,30,40,50};
		System.out.println("매소드3: "+s.add(arr));
		System.out.println("매소드4: "+s.add1(10,20,30,40));
		System.out.println("-----------");
		
		s.variableString("java","c","python");
		
		
	}

}
