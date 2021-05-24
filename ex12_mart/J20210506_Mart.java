package ex12_mart;

import java.util.ArrayList;
import java.util.List;

class HeadOffice{
	
}
class Branch1 extends HeadOffice implements ProductCorner, MeatCorner{
	String meatItem;
	String productItem;
	
	@Override
	public void setMeatItem(String name) {
		this.meatItem = name;
	}

	@Override
	public void getMeatItem() {
		System.out.println(meatItem);
	}

	@Override
	public void setProductItem(String name) {
		this.productItem = name;
	}

	@Override
	public void getProductItem() {
		System.out.println(productItem);
	}
	
}
class Branch2 extends HeadOffice implements ProductCorner, ClothCorner{
	String clothItem;
	String productItem;
	
	@Override
	public void setClothItem(String name) {
		
	}

	@Override
	public void getClothItem() {
		
	}

	@Override
	public void setProductItem(String name) {
		
	}

	@Override
	public void getProductItem() {
		
	}
		
}


public class J20210506_Mart {

	public static void main(String[] args) {
		Branch1 b1 = new Branch1();
		b1.setMeatItem("꽃갈비살");
		b1.getMeatItem();
		b1.setProductItem("프링글스");
		b1.getProductItem();
	}

}
