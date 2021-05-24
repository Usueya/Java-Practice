package ex01_class;

import java.util.Arrays;

//책 클래스
//필드: 책코드(String), 책명(String), 단가(int), 할인율(double)
//생성자, 게터, 세터, toString
//메소드: 판매금액계산(매개변수:수량, 반환값:판매금액)

class Book{
	private String code;
	private String name;
	private int price;
	private double discount;
	
	public Book() {
		super();
	}
	public Book(String code, String name, int price, double discount) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Book [code=" + code + ", name=" + name + ", price=" + price + ", discount=" + discount + "]";
	}

}
//판매관리 클래스
class Manager{
	//판매금액 합계 저장할 배열
	//Bk001의 합계:0, BK002의 합계:1
	
	int[] tot = new int[10];
	
	int[] getTot() {
		return tot;
	}
	
	
	//판매금액계산
	int sale(Book book, int qty, int index) {
//		System.out.println(book);
//		System.out.println(qty);
		
		String bookcode = book.getCode();
		int price = book.getPrice();
		double discount = book.getDiscount();
		
		int totPrice = (int)(price*(1-discount))*qty;
		
		if(bookcode.equals("BK001")) {
			tot[index]+=totPrice;
		}else if(bookcode.equals("BK002")) {
			tot[index]+=totPrice;
		}
			
		return totPrice;
	}
	
}



public class J20210421_01_Book {

	public static void main(String[] args) {
		Book[] barr = new Book[10];
		barr[0]= new Book("BK001","이것이자바다",30000,0.1);
		
//		Book b1 = new Book("BK001","이것이자바다",30000,0.1);
//		System.out.println(b1);
//		System.out.println(b1.sale(1));
		
		barr[1] = new Book("BK002","파이썬100제",18000,0.15);
//		Book b2 = new Book("BK002","파이썬100제",18000,0.15);

		Manager m1 = new Manager();
		System.out.println("책명              판매금액");
		System.out.printf("%-8s %8d\n", barr[0].getName(),+m1.sale(barr[0],3,0));
//		System.out.println(barr[0].getName() + " 금액: "+m1.sale(barr[0],3,
		System.out.printf("%-8s %9d\n",barr[0].getName() ,m1.sale(barr[0],5,0));
		System.out.printf("%-8s %10d\n",barr[1].getName() ,m1.sale(barr[1],2,1));
		
		System.out.println("------------------------");
		System.out.println(Arrays.toString(m1.getTot()));
		
	}

}
