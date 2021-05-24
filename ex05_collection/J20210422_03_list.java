package ex05_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Collection framewark컬렉션 프레임워크
//데이터를 효율적으로 다루기 위한 클래스들의 집합
//자료구조를 클래스로 제공
//골격을 만들어줬다는 것에 대해 라이브러리와의 차이점을 가짐

public class J20210422_03_list {

	public static void main(String[] args) {
		//List<E>
		//저장순서(index)가 있다.
		//데이터의 중복허용
		
		//-------------------------------------------------
		//1) ArrayList: 배열구조(연속적공간의 할당)
		//   검색시 속도가 빠름. 추가/삭제가 느리다.
		//   ArrayList.add 기본형은 Object e 이기 때문에 객체안에 모든형 입력가능.(오류증가)
		//   따라서 만들 때 형을 지정하여 오류를 줄일 수 있다.
		
//		ArrayList<Integer> arrlist = new ArrayList<>();
//		arrlist.add(10);
//		arrlist.add(20); 
//		arrlist.add(30); 
//		System.out.println(arrlist);
		
//		//for문 초기화(ArrayList초기사이즈0)
//		for(int i=0; i<3;i++) {
//			arrlist.add((i+1)*10);
//		}
//		
//		//for문
//		for(int i =0; i<arrlist.size(); i++) { //배열은 length필드, arrlist는 size활용
//			System.out.println(arrlist.get(i) + 100); //계산이 가능하다!
//		}
//		
//		//for each문
//		for(Integer a:arrlist) { //(int a:arrlist)도 가능
//			System.out.println(a);
//		}
//		
//		//배열의 예시
//		//첫 객체생성시 사이즈를 지정 vs ArrayList는 초기사이즈 0 입력에 따라 사이즈 증가
//		//int[] arr = new int[3];
//
//		arrlist.remove(1); //int index
//		System.out.println(arrlist);
//		
//		arrlist.add(1, 70); //int index, element
//		System.out.println(arrlist);
		
		
		//실습)이름 입력을 받아 ArrayList만들기
		// .set( , ) 0번 인덱스를 어떤 값으로 바꾸기
		
		ArrayList<String> arrName = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
//		
//		while (true) {
//			System.out.print("이름을 입력하세요. ");
//			String s = sc.next();
//			if (s.equals("종료")) { //*equals*
//				break;
//			}	
//			arrName.add(s);
//			System.out.println(arrName);
//		}
//		System.out.println("--------------");
//		System.out.print("입력된값은 ");
//		System.out.println(arrName);
//		
//		for(int i=0; i<arrName.size(); i++) {
//			System.out.println(i+1 + ":" + arrName.get(i));
//		}
		
		//삭제
		//1안)
//		arrName.add("hong");arrName.add("park");arrName.add("kim");
//		System.out.print("삭제할 이름은? ");
//		String name = sc.next();
//		for(int i = 0; i<arrName.size(); i++) {
//			if(arrName.get(i).equals(name))
//				arrName.remove(i);
//		}
//		System.out.println(arrName);
		
		
		//2안
		//반복자 : iterator (인덱스를 사용하지 않음)
//		arrName.add("hong");arrName.add("park");arrName.add("kim");arrName.add("park");
//		System.out.println(arrName);hasNext
//		System.out.print("삭제할 이름은? ");
//		String name = sc.next();
//		Iterator<String> it =  arrName.iterator(); //반복자(포인터?) 생성
//		while(it.hasNext()) {
//			String n = it.next();
//			if (n.equals(name)) {
//				it.remove();
//			}
//		}
		
		
		//실습)
		//iterator를 이용한 출력
		//List<String> list = Arrays.asList("red", "blue", "yellow", "green");
//		List<String> list = new ArrayList<String> (Arrays.asList("red", "blue", "yellow", "green") );
//		System.out.println(list);
//		Iterator<String> it = list.iterator();
//		System.out.println(it.next());//포인터 이동
//		System.out.println(it.hasNext());//다음요소가 있는지? boolean반환
//		it = list.iterator();
//		System.out.println("---------");
//		while(it.hasNext()) {//다음요소가 있으면 반복!
//			System.out.println(it.next());
//		}
		

		//실습)반 학생들의 키의 평균값 구하기
		//100.0/0 : 실수 나누기 0은 무한Infinity
		//100/0 : 정수 나누기 0은 수학적으로 불가!
//		ArrayList<Double> height = new ArrayList<>();
//		double sum=0;
//		while(true) {
//			System.out.print("키는? ");
//			double d = sc.nextDouble();
//			if (d == 0) break;
//			height.add(d);
//			sum+=d;
//		}
//		System.out.printf("반 학생들의 평균키: %.2f" ,sum/height.size());
		
		
		//-------------------------------------------------
		//LinkedList:리스트기반
		//각요소가 자신의 이전요소의 주소와 다음요소의 주소를 가지고 있다.
		//추가삭제가 쉽고 검색시 성능 저하
		LinkedList<String> linklist = new LinkedList<>();
		linklist.add("python");
		linklist.add("java");
		linklist.add("c");
		System.out.println(linklist);
		
		for(int i = 0; i<linklist.size();i++) {
			System.out.print(linklist.get(i) + " ");
		}
		
		//List<String> linklist = new LinkedList<>();
		//ArraysList도 LinkedList도 List로 저장을 많이 한다.(일반적)
		//인터페이스 List는 클래스와 클래스를 이어주는 역할.
		//둘다 list의 자식클래스로 같이 상속을 받아 사용한다.
		
		
		
		
		
	}

}
