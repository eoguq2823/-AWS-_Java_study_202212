package j19_컬렉션;

import java.util.ArrayList;

public class listStringMain {

	public static void main(String[] args) {
		String[] strArray = new String[] {"java", "python", "C++"};
		
		String[] newStrArray = new String[strArray.length + 1];
		
		for(int i = 0; i < strArray.length; i++) {
			newStrArray[i] = strArray[i];
		}
		newStrArray[strArray.length] = "html";
		
		System.out.println("[strArray]");
		for(String str : strArray) {
			System.out.println(str);
		}
		System.out.println();
		
		System.out.println("[newstrArray]");
		for(String str : newStrArray) {
			System.out.println(str);
		}
		
		System.out.println();
		
		////////////////////////////////////////////////////////////////		
		ArrayList<String> strList = new ArrayList<String>();
//		ArrayList<?> strList = new ArrayList<?>();
//		((ArrayList<String>)strList).add("java");

		strList.add("java");
		strList.add("python");
		strList.add("C++");
		strList.add("html");
		strList.add("html");
		strList.add("html");
		strList.add("html");
		strList.add("html");
		strList.remove("html"); // 삭제
		strList.remove("java"); // 삭제
		strList.add(3, "java");
		strList.add(3, "python");
		strList.remove(5);
		
		System.out.println(strList);
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.print("[" + i + "]: ");
			System.out.println(strList.get(i));
		}
		for(String str : strList) {
			System.out.println(str);
		}

	}
}
