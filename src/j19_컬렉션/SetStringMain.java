package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class SetStringMain {

	public static void main(String[] args) {
		Set<String> setStr = new HashSet<>(); //해쉬셋의 값을 통해 정렬법
		List<String> listStr = new ArrayList<>();
		
		listStr.add("임나영");
		listStr.add("이강용");
		listStr.add("임나영");
		listStr.add("임나영");
		
		System.out.println(listStr); //리스트는 중복해서 들어감
		
		setStr.add("김상현");
		setStr.add("강대협");
		setStr.add("손지호");
		setStr.add("최해혁");
		setStr.add("최해혁"); //값이 중복 X 
		setStr.addAll(listStr); //addAll을 통해 리스트를 다넣을수있다.중복값 사라짐
		
		System.out.println(setStr);
		//값을 직접 비교
		String searchName = "손지호";
		
		//키 값이 없기 때문에 값을 직접 꺼내야함
		for(String name : setStr) {
			if(name.equals(searchName)) {
				System.out.println(name);
				
			}
		}
		//
		Iterator<String> iterator = setStr.iterator();
		while(iterator.hasNext()) {
			String n = iterator.next();
			if(n.equals(searchName)) {
				System.out.println(n);
			}
		}
	}
}
