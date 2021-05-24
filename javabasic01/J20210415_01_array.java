package javabasic01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J20210415_01_array {

	public static void main(String[] args) {
		//----------------------------------------------------------------------
		//배열 : java는 동적배열
		
//		int cnt = 5;
//		int[] arr //int형을 여러개 가지고 있는 a변수 선언/ stack에 생성된 참조변수_주소값저장
//		= new int[cnt]; //사이즈 필수! new연산자는 -> heap영역(동적메모리관리공간)에 객채를 생성
//		//동적배열이기 때문에 실행시에 크기를 지정할 수 있다.
//		
//		arr[0] = 10; System.out.println(arr[0]);
//		arr[5] = 100; //5번인덱스는 없음으로 런타임시 IndexOutofBounds...에러발생
		
//		int[] arr = new int[5]; //stack에 만들어지는 것은 초기화가 x, heap은 자동 초기화(int = 0)
//		//참조변수는 .도트연산자가 있음. arr.length > int값으로 리턴 > 길이를 알려줌
//		
//		//1~5값을 대입
//		for (int i=0; i<arr.length; i++) {
//			arr[i] = (i+1)*10;
//		}
//		
//		//배열의 값 출력
//		for (int i = 0; i<arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
		//달팽이 숫자 입력하기 문제 & 패턴별 입력방법.. 등 문제 풀어보기 권장!
		
		//선언과 초기화 > 사이즈 생략! 또는 new int[] 생략가능!
		//int[] arr = new int[] {10,20,30};
//		int[] arr = {10,20,30};
//		
//		for (int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//for each문 (배열을 반복적으로 찍기위한 문법)
//		for(int a:arr) {
//			System.out.println(a);
//		}
		
		//Arrays 클래스: 단순하게 배열안의 값을 확인하고 싶을 때
		//.toString(매소드명 동일, 넘겨주는 매개변수의 형태가 다름) > 오버로딩
//		System.out.println(Arrays.toString(arr)); //[10, 20, 30] 문자열 리턴 > 오버로딩
//		
//		System.out.println(arr.toString()); //println메소드는 toString()실행 > 오버라이딩
//		System.out.println(arr); //println메소드는 toString()실행
		
		//오버라이딩 > 부모와 형태가 같음. 부모의 기능을 재정의하여 사용하는 것

		//----------------------------------------------------------------------
		//실습) 국영수 점수가 초기화 되어 있을 때 합계와 평균
		
//		int[] score = {88,89,77};
//		int sum=0;
//		
//		for (int i = 0; i<score.length; i++) {
//			sum +=score[i];
//		}
//		
//		System.out.println(Arrays.toString(score));
//		System.out.println("합계: " + sum + "점");
//		System.out.printf("평균: %.2f점",(double)sum/score.length);
		
		//----------------------------------------------------------------------
		//3명의 학생의 점수를 입력받아서 합계와 평균
		
//		Scanner sc = new Scanner(System.in);
//		int[] score = new int[3];
//		int sum = 0;
//		
//		for(int i=0; i<score.length; i++) {
//			System.out.print(i+1+ ")" + "점수는? ");
//			score[i] = sc.nextInt();
//			sum+=score[i];
//		}
//		
//		System.out.println("-------------------------");
//		System.out.println("입력한 값: " + Arrays.toString(score));
//		System.out.println("합계: " + sum);
//		System.out.printf("평균: %.2f",(double)sum/score.length);
		
		//----------------------------------------------------------------------
		//문자열 배열 String[] arr; Char[] arr;
		//String형의 기본값: null > 다음에 들어올 데이터가 불분명 > 즉, 주소값을 가진다!?
		//값을 입력하면 입력한 값을 가리키는 주소값이 인덱스에 입력
		
//		String[] arr = {"java","python","c"}; // String[] arr = new String[] {"java","python","c"}; 랑 같다.
//		
//		System.out.println(arr);
//		
//		for(String s:arr) {
//			System.out.println(s); //s.toString 이랑 같은 값 출력
//		}
		
		//----------------------------------------------------------------------
		//좋아하는 칼라 3개를 입력받아 배열에 저장하고 출력하자.
		
//		Scanner sc = new Scanner(System.in);
//		String [] color = new String[3];
//		
//		for (int i = 0; i<color.length; i++) {
//			System.out.print(i+1 + ") 좋아하는 컬러는? ");
//			 color[i]= sc.nextLine();
//		}
//		
//		System.out.println("-----------------");
//		for (String s:color) {
//			System.out.print(s + " ");
//		}
		
		//----------------------------------------------------------------------
		//피보나치의 수열 n개(입력받기) 구하기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇개? ");
//		int num = sc.nextInt();
//		
//		int [] pibo = new int[num];
//		pibo[0] = 0; 
//		pibo[1] = 1;
//		//1) pibo[2] = pibo[0]+pibo[1]
//		//2) pibo[3] = pibo[1]+pibo[2]
//		//3) pibo[3] = pibo[2]+pibo[3]
//		
//		
//		for(int i =2; i<num; i++) {
//			pibo[i] = pibo[i-2]+pibo[i-1];
//		}
//		
//		for (int s:pibo) {
//			System.out.println(s);
//		}

		//----------------------------------------------------------------------
		//시험 채점 프로그램
		//정답 배열 : 1,4,2,4,3
		//제출 배열 : 2,4,2,3,3
		//100점 만점으로 몇점일까요? (개당 20점)
		
//		int[] right = {1,4,2,4,3}; //정답내용
//		int[] answer = new int[5];
//		int cnt = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i<answer.length; i++) {
//			System.out.print((i+1) + "번 정답: ");
//			answer[i] = sc.nextInt();
//			
//			if ( right[i]==answer[i] ) {
//				cnt++;
//			}
//		}
//		System.out.printf("정답갯수: %d 점수: %d", cnt, cnt*(100/answer.length));

		//----------------------------------------------------------------------
		//최대값, 최소값 출력
		
//		int[] arr = {4,6,7,2,5};
//		int max = arr[0];
//		for (int i =1; i<arr.length; i++) {
//			if (arr[i]>max) max = arr[i];
//		}
//		System.out.println("최대값은: " + max);
		
//		int[] arr = {4,6,7,2,5};
//		int max = 0;
//		for (int i =0; i<arr.length; i++) {
//			if (arr[i]>max) max = arr[i];
//		}
//		System.out.println("최대값은: " + max);
//		
//		
//		int min = arr[0];
//		for (int i = 0; i<arr.length; i++) {
//			if(arr[i]<min) min = arr[i];
//		}
//		System.out.println("최소값은: " + min);
//		
		//선택정렬(오름차순정렬/내림차순정렬) 새로운 배열을 만들어서 가장 큰 값(작은 값)부터 넣기 <<<<<<숙제
		// maxx :j    arr :i
		//인덱스0 = 0~4까지의 최소값
		//인덱스1 = 1~4까지의 최소값
		//인덱스2 = 2~4까지의 최소값
		
//		int[] arr = {4,6,7,2,5};
//		int[] maxx = new int[5];
//		
//		
//		for (int j = 0; j<maxx.length; j++) { //maxx배열에 순서대로 넣기 총 5번
//			int max=0;
//			
//			for (int i =j; i<arr.length; i++) { //arr배열에서 최대값 찾기
//				if (arr[i]>max) 
//					max = arr[i];
//			}
//			
//		}
//		
//		for (int m:maxx) {
//			System.out.println(m);
//		}
		
		

		//1)번호를 입력받아 Math.random()*100+1 랜덤번호를 생성하여 int배열에 넣고 랜덤번호에 일치여부
		
		
		//2)번호6개 입력받아 랜덤번호와 일치하는 갯수여부
//		int[] no = {9, 12, 21, 25, 33, 42};
//		//로또번호 6를 만들기
		//1)Math.random()*100 +1;
		//2)Random() 
//		int[] lotto ;
		//int의 범위
		System.out.println("Max: "+Integer.MAX_VALUE); 
		System.out.println("Min:" +  Integer.MIN_VALUE);
		
		int[] no = new int[6];
		Random rd = new Random();
		
		for(int i=0; i<no.length; i++) {
			boolean b = false; //기존에 존재 하지 않는다
			int r = rd.nextInt(10)+1;
			//기존에 번호가 등록되어 있다면
			for(int j=0; j<i;j++) {
				if (no[j]==r) {
					i--;
					b = true; //존재 한다
					break;
				}
			}
			if (!b) no[i] = r;  //존재하지 않는다면 넣는다
		}
		
		Arrays.sort(no); //오름차순 정렬
		System.out.println(Arrays.toString(no));
		
		
		
		//----------------------------------------------------------------------
		//배열의 복사_얕은 복사(주소만 복사)
		
//		int[] src = {1,2,3,4,5};
//		int[] dest = src;
//		
//		System.out.println(src);
//		System.out.println(dest);
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		System.out.println("-------------------");
//		src[1] = 20; dest[3]=40;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
		
		//----------------------------------------------------------------------
		//배열의 복사_깊은 복사(값을 복사하여 객체생성)
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[6];
//		
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		
//		for (int i = 0; i<src.length; i++) {
//			dest[i] = src[i];
//		}
//		
//		System.out.println(src);
//		System.out.println(dest);
//		
//		dest[5]=6;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		
//		src = dest;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		
//		//프레임워크를 이용한 데이터 추가
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10); arr.add(20);
//		System.out.println(arr);
		
		//----------------------------------------------------------------------
		//배열의 복사
		//System.arraycopy(src, srcPos, dest, destPos, length)
		
		int[] src = {1,2,3,4,5};
		int[] dest = {0,0,0,0,0};
		
		System.arraycopy(src, 2, dest, 0, 2);
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
		
		
		
		
		
		
	}

}
