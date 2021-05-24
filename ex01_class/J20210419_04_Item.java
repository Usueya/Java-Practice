package ex01_class;

import java.util.Scanner;

//상품클래스만들기
//필드: itemcode, itemname, price
//메소드:
//1)판매금액 리턴(매개변수:판매수량), 리턴값(판매금액)

class Item{
	//접근제한자(private): 클래스 내부에서만 접근이 가능(public과 반대)
	// >> 은닉화, 캡슐화라고 함(외부에서 수정하지 못하도록 막는 것)
	private String itemcode;
	private String itemname;
	private int price;
	
	int pay(int a) {
		return price*a;
	}
	
	//세터(setter) : private은 매소드를 이용하여 접근 
	//항상 set을 쓰고 아이템명의 첫번째를 대문자로 하자는 관례
	void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	void setItemname(String itemname) {
		this.itemname = itemname;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	//게터(getter) : 필드의 값을 불러오는 전용 함수
	//읽어서 반환만 하기때문에 매개변수가 없음.
	String getItemcode() {
		return itemcode;
	}
	String getItemname() {
		return itemname;
	}
	int getPrice() {
		return price;
	}
}

public class J20210419_04_Item {

	public static void main(String[] args) {
		Item item = new Item();
		item.setItemcode("kakao001");
		item.setItemname("apeach_case");
		item.setPrice(4500);
		System.out.printf(item.getItemcode()
				+" "+item.getItemname()
				+" 판매금액:%,d\n" , item.pay(1));

		Item item2 = new Item();
		item2.setItemcode("kakao101");
		item2.setItemname("apeach_keyring");
		item2.setPrice(3500);
		System.out.printf(item2.getItemcode()
				+" "+item2.getItemname()
				+" 판매금액:%,d\n", item2.pay(1));
		
		
	}

}
