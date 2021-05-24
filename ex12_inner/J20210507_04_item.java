package ex12_inner;

interface Item{
	void itemPrint(String itemname);
}
//class ItemImpl implements Item{
//
//	@Override
//	public void itemPrint(String itemname) {
//		System.out.println(itemname);
//		
//	}
//	
//}
public class J20210507_04_item {

	public static void main(String[] args) {
//		ItemImpl item = new ItemImpl();
//		item.itemPrint("새우깡");
		
		Item item = new Item(){

			@Override
			public void itemPrint(String itemname) {
				System.out.println(itemname);
				
			}
			
		};
		
		item.itemPrint("감자깡");
	}

}
