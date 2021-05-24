package ex05_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//학생클래스
class Student{
	private int no;
	private String name;
	private String tel;
	
	public Student() {};
	public Student(int no, String name, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", tel=" + tel + "]";
	}	
}

public class J20210422_05_Student {

	public static void main(String[] args) {
//		Student s1 = new Student(1,"고길동","010-1234-5678");
//		Student s2 = new Student(2,"둘리","010-2345-6789");
//		Student s3 = new Student(3,"또치","010-3456-7890");
		
		//배열기반
//		List<Student> arrStd = new ArrayList<>();
//		arrStd.add(s1);arrStd.add(s2);arrStd.add(s3);
//		//출력1
//		System.out.println(arrStd);
//		//출력2
//		System.out.println("-----------------");
//		for(int i = 0; i<arrStd.size();i++) {
//			Student s = arrStd.get(i);
//			System.out.println(s.getNo()+" "+s.getName() +" "+s.getTel());
//		}
//		//출력3
//		System.out.println("-----------------");
//		for(Student s:arrStd) {
//			System.out.println(s.getNo()+" "+s.getName()+" "+s.getTel());
//		}
		
		//map기반(key:no, value:Student)
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(s1.getNo(), s1);
//		map.put(s2.getNo(), s2);
//		map.put(s3.getNo(), s3);
//		Scanner sc = new Scanner(System.in);

//		while (true) {
//			System.out.print("학생의 번호는? ");
//			int num = sc.nextInt();
//			if (num==0) {
//				System.out.println("종료");
//				break;
//			}
//			System.out.print(map.get(num).getNo()+" ");
//			System.out.print(map.get(num).getName()+" ");
//			System.out.println(map.get(num).getTel());
//		}
		
//		System.out.println(map.keySet());
		//Set<Integer> java.util.Map.keySet()
		//Returns:a set view of the keys contained in this map

//		Set<Integer> a = map.keySet();
//		System.out.println(a); //Set 형태로 출력 [1, 2, 3]
		
//		for(int k:a) {
//			System.out.println(map.get(k));
//		}
		
//		for(int i =0; i<a.size();i++) {
//			System.out.println(a[i]);
//		} //Set은 순서(index)가 없어서 불가.
		
//		Iterator<Integer> ai = a.iterator();
//		while(ai.hasNext()) {
//			//다음자료가 있음이 true이면 반복
//			int key = ai.next();
//			System.out.print(key+" ");System.out.println(map.get(key));
//		}
		
		//실습)
		//result : "success"
		//data : ArrayList<Student>
		Student s1 = new Student(1,"고길동","010-1234-5678");
		Student s2 = new Student(2,"둘리","010-2345-6789");
		Student s3 = new Student(3,"또치","010-3456-7890");
		Map<String, Object> hmap = new HashMap<>();
		hmap.put("result", "success");
		
		List<Student> slist = new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
//		System.out.println(slist);
		
		hmap.put("data", slist);
//		System.out.println(hmap);
		
		String obj = (String) hmap.get("result"); //Object > String 다운캐스팅
		//만약 result가 success라면 학생정보를 출력, 아니면 에러를 출력
		if (obj == "success") {
			System.out.println("성공");
			List<Student> stdlist = (List<Student>)hmap.get("data");
			for(Student s:stdlist) {
				System.out.println(s.getNo()+" "+s.getName()+" "+s.getTel());
			}
		}else
			System.out.println("에러");
		
	}

}
