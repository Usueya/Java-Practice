package ex01_class;

import java.util.Arrays;

//학생 클래스 만들기
//필드:group(반), name(이름), score(점수):배열{자바,파이썬,C}, sum(합계)
//메소드:sumCal(합계계산), avgCal(평균)을 계산해서 반환

class Student{
	String group = "병아리반";
	String name = "둘리";
	int[] score = new int[3];
	int sum;
	
	//method의 overloading--------------------------------------
	
	//1) call_by_value
	//각 과목별 점수를 매개변수로 받기(int a, int b, int c
	void sumCal(int java, int python, int c) {
		sum=0;
		score[0]=java; score[1]=python; score[2]=c;
		sum = java+python+c;
	}
	//2) call_by_reference
	//배열을 매개변수로 받기 (int[] score)
	//객체안에 있는 score지정 : this.score #얕은복사
	void sumCal(int[] score) {
		sum=0;
		this.score = score;
		for(int i = 0; i<score.length; i++) {
			sum+=score[i];
		}
	}
	
	//작은형 int -> 큰 형 double 자동 형변환
	double avgCal() {
		return (double)sum/score.length;
	}
	
}

public class J20210419_03_Student {

	public static void main(String[] args) {
		Student std = new Student();

		std.sumCal(10, 20, 30); System.out.println(std.sum);
		System.out.println(Arrays.toString(std.score));
		
		std.sumCal(new int[] {20,30,40});System.out.println(std.sum);
		System.out.println(Arrays.toString(std.score));
		
		System.out.println(std.avgCal());
	}

}
