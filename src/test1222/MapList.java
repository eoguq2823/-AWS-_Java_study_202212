package test1222;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapList {

	public static void main(String[] args) {
		List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
		   Map<String, Object> map = new HashMap<>();
	        map = new HashMap<String, Object>();
	        map.put("name", "홍길동");
	        map.put("rating", "vip");
	        map.put("age", 30);
	        customers.add(map);
	        
	        `Map<String, Object> map2 = new HashMap<>();
	        map2.put("name", "김기영");
	        map2.put("rating", "gold");	        
	        map2.put("age", 35);
	        customers.add(map2);
		for(Map<String, Object> customer : customers) {
			for(Entry<String, Object> entry : customer.entrySet()) {
				System.out.println(entry);
				
			}
		
		}
	}
}
