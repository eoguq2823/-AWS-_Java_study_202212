package j19_컬렉션;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapStringMain {

	public static void main(String[] args) {
		
		Map<String, String> strMap = new HashMap<>();
		
		strMap.put("이종현", "a");
		strMap.put("진채희", "b");
		strMap.put("김재영", "c");
		strMap.put("이상현", "d");
		
		System.out.println(strMap);
		
		System.out.println(strMap.get("이종현")); //이종현의 밸류값 구하기
		System.out.println(strMap.get("이상현")); 
		
		//기본 for문으로는 반복돌릴 수 X
		//keySet()
		for(String k : strMap.keySet()) {
			System.out.println("key: " + k);  //키값
			System.out.println("valuse: " + strMap.get(k)); //밸류
		}
		
		for(String v : strMap.values()) {
			System.out.println("value: " + v); //키값의 해시코드에 따라 순서가 달라진다.
		}
		System.out.println("==================================================");
		Set<Entry<String, String>> s = null;
//		System.out.println(strMap.entrySet()); //키와밸류전체를 셋으로본다.
		//그리고 키와밸류하나하나를 앤트리라고 부름
		for(Entry<String, String> entry : strMap.entrySet()) {
			System.out.println(entry);
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
			System.out.println();
		}
		
		strMap.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		
	}
}
