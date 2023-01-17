package j21_예외;

import java.util.Arrays;
import java.util.List;

public class ThrowsException {
	
	public static void printList(List<String> list, int size) throws Exception{
		
		for(int i = 0; i < size; i++) {
			System.out.println("[" + i + "]" + list.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] names = {"김수현", "이종현", "박성진", "김동민"};
		
		try {
			printList(Arrays.asList(names), 5);
		} catch (Exception e) {
			System.out.println("예외처리");
			e.printStackTrace(); //어떤예외인지 출력해주는것
		} finally { //파이널리 정상적으로 실행이되도 캐치가 실행되도 실행이된다.
			System.out.println("무조건실행");
		}
		System.out.println("프로그램 정상 종료");
	}
	
}
