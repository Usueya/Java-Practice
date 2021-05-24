package ex07_jdbc.sales;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class JunitTest {
	
	SalesDAO sdao = new SalesDAO();

	@Test
	void test() {
		List<Map<String, Object>> list = sdao.dayItemSalesList();
		
		for(Map<String, Object> map : list) {
			//System.out.println(map);
			System.out.println(map.get("saledate"));
			System.out.println(map.get("itemcode"));
			System.out.println(map.get("itemname"));
			System.out.println(map.get("qty"));
			System.out.println(map.get("amount"));
		}

	}
	
	@Test
	void testsum() {
		List<Map<String,Object>> list = sdao.dayItemSalesSum();
		
//		for(Map<String,Object> map:list) {
//			System.out.println(map);
//		}
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
		
	@Test
	void testsum1() {
		List<Map<String, Object>> list = sdao.dayItemSalesTotal("2021-04-28");
		for (Map<String,Object> map : list) {
			System.out.println(map.get("itemcode")+" "+
			map.get("itemname")+" "+
			map.get("price")+" "+
			map.get("amount"));
		}
	}
	
	@Test
	void test2() {
		List<Map<String, Object>> list = sdao.dayItemSalesView("2021-04-29");
		for (Map<String,Object> map : list) {
			System.out.println(map.get("itemcode")+" "+
			map.get("itemname")+" "+
			map.get("amount")+" "+
			map.get("regdate"));
		}
		
	}
	
	
	
	
	
	
	
		
}
