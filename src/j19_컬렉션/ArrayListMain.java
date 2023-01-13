package j19_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		 List<String> strList = new ArrayList<>();
		 
		 System.out.println("★★★====<< 값 추가 >>====");
		 strList.add("java");
		 strList.add("python");
		 System.out.println(strList);
		 
		 System.out.println("====<< 값 원하는 위치에 추가 >>====");
		 strList.add(1, "android"); //1번인덱스에 넣어라
		 System.out.println(strList); 
	
		 System.out.println("★★★====<< 해당 인덱스의 값을 추출 >>====");
		 System.out.println(strList.get(0)); //0번인덱스에있는거 꺼내라
		 String lang = strList.get(1);
		 System.out.println(lang); // 1번인덱스에 있는걸 꺼내라0
		 
		 System.out.println("====<< 리스트에 해당 값이 있는지 확인(T, F) >>====");
		 System.out.println(strList.contains("c++"));
		 System.out.println(strList.contains("android"));
		 System.out.println(strList.contains(lang));
		
		 System.out.println("====<< 값 수정 >>====");
		 strList.set(2, "javascript"); //2번인덱스에있는 파이썬을 자바스트랩트로 바꾸겟다.
		 System.out.println(strList);
	
		 System.out.println("★★★====<< 값 삭제 >>====");
		 strList.remove("android"); //값으로 지우기
		 System.out.println(strList);
		 strList.remove(1); //인덱스 번호로 지우기
		 System.out.println(strList);
		 
		 System.out.println("★★★====<< 리스트 크기 확인 >>====");
		 System.out.println(strList.size()); //몇개 들어가있냐
		 
		 System.out.println("====<< 리스트가 비었는지 확인 >>====");
		 System.out.println(strList.isEmpty());

		 System.out.println("====<< 리스트 초기화 >>====");
		 strList.clear();
		 System.out.println(strList.isEmpty());
		 
		 System.out.println("==================================");
		 
		 
		 /* ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		  * 배열을 리스트로 변환
		  * Arrays.asList(배열); 
		  */
		 String[] langs = {"java", "c++", "python", "javascript"};
		 List<String> templist = Arrays.asList(langs);
		 strList.addAll(templist);
		 strList.addAll(2, templist);
		 System.out.println(strList);
		 
		 System.out.println("★★★====<< 해당 값의 위치(index)찾기 (왼쪽부터) >>====");
		 int findIndexLeft = strList.indexOf("python");
		 System.out.println(findIndexLeft);
		 
		 System.out.println("★★★====<< 해당 값의 위치(index)찾기 (오른쪽부터) >>====");
		 int findIndexright = strList.lastIndexOf("java");
		 System.out.println(findIndexright);
		 
		 System.out.println("=======================================================");

		 strList.set(1, "java");
		 System.out.println(strList);
		 strList.subList(strList.indexOf("java") + 1, strList.size()).indexOf("java");
		 
		 System.out.println("=======================================================");
		 
		System.out.println("====<< fromIndex 부터 toIndex전까지 리스트를 추출 >>====");
		//[java, 여기부터c++, java, c++여기까지, python, javascript, python, javascript]
		List<String> subList = strList.subList(1, 4);
		System.out.println(subList);
		 
		System.out.println("!!!!!!!!!!!!!!< < 반복 > >!!!!!!!!!!!!!!");
		 
		System.out.println("====<< 일반 반복문 >>====");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println("[" + i + "]: " + strList.get(i));
		}
		
		System.out.println("====<< forEeach >>====");
		for(String str : strList) {
			System.out.println("[값]: " + str);
		}
		System.out.println("====<< 람다식 forEeach >>====");
		strList.forEach(str -> System.out.println("[값]: " + str));
	
		System.out.println("====<< 반복자 >>====");
		Iterator<String> iterator = strList.iterator(); //1회성 와일문한번더돌리면 아무것도 안나온다.
		while(iterator.hasNext()) {
			String lang2 = iterator.next();
			System.out.println("[값]: " + lang2);
		}
		
//		iterator = strList.iterator();
		while(iterator.hasNext()) {
			String lang2 = iterator.next();
			System.out.println("[값]: " + lang2);
		}
		
	}
	
	
}
