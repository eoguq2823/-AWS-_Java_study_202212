package j19_컬렉션.복습;

import java.util.HashMap;
import java.util.Map;

public class SearchData {

	public static void main(String[] args) {
		Map<String, Object> searchData = new HashMap<>();
		
		searchData.put("catagory", "소설");
		searchData.put("searchValue", "불편한 편의점");
		//단순히 map을 tostring한것
		System.out.println(searchData);
		
		//키값으로 가져오는 가장 기본적인 사용법
		System.out.println(searchData.get("catagory"));
		System.out.println(searchData.get("searchValue"));
		
		//키값들만 반복가능
		System.out.println(searchData.keySet());
		//벨류값들만 반복가능
		System.out.println(searchData.values());
		//다가져옴 반복가능
		System.out.println(searchData.entrySet());
		
//		for(int i = 0; i < searchData.size(); i++) {
//			System.out.println(searchData.get(null));
//		}
		//키값을 반복해서 가져와 밸류값을 가져온다.
		for(String key : searchData.keySet()) {
			System.out.println(searchData.get(key));
		}
		
	}

}
