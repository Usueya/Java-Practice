package ex08_inher;

import java.util.HashMap;
import java.util.Map;

class Thing{
	
}
class Note extends Thing{
	@Override
	public String toString() {
		return "노트";
	}
}
class Pen extends Thing{
	@Override
	public String toString() {
		return "펜";
	}	
}
class Enter{
	Map<String, Integer> stock = new HashMap<>();
	
	void enter(Thing t, int qty) {
		System.out.println(t+" "+qty+"개 입고");
		//System.out.println(t.toString()+" "+qty+"개 입고");
		
		Integer stockQty = stock.get(t.toString());
		if(stockQty ==null) stockQty = 0;
		stock.put(t.toString(), stockQty+qty);
	}
	
	void stockPrint(Thing t) {
		System.out.println(stock.get(t.toString()));
	}
}

public class J20210504_04_Thing {

	public static void main(String[] args) {
		Enter e1 = new Enter();
		Thing t1 = new Note();
		e1.enter(t1,10);
		t1 = new Pen();
		e1.enter(t1, 5);e1.enter(t1, 10);
		e1.stockPrint(t1);
		
		
	}

}
