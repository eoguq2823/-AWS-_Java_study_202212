package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		//밸류에 자료형을 오브젝트로 넣으면 무엇이든 들어간다.
		//키값은 중복이 안되니깐 중복안시키기위해 리스트로 쓰기위해서 오브젝트를사용
		Map<String, Object> dataMap = new HashMap<>(); //정렬방법을 해쉬맵(코드)로
		dataMap.put("username", "aaa");
		dataMap.put("password", "1234");
		dataMap.put("name", "김준일");
		dataMap.put("email", "aaa@gmail.com");
		
		List<String> hobby = new ArrayList<>();
		hobby.add("골프");
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("음악감상");
		
		dataMap.put("hobbys", hobby); //밸류에 리스트형태로 들어올수있다.
		
		System.out.println(dataMap);
							//다운캐스팅
		List<String> list = (List<String>) dataMap.get("hobbys");
		System.out.println(list.get(2));
	}
}
