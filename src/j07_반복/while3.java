package j07_반복;

import java.util.Scanner;

public class while3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String select = null;
		

		//와일에 트루를 넣으면 무한루트
		//문자열을 비교할때는 ==쓰면안되고
		//equals를 사용하여야한다.
		while(true) {
			System.out.print("x입력시 멈춤: ");
			select = scanner.nextLine();
			
			if(select.equals("x") || select.equals("X")) {
				System.out.println("프로그램을 멈춥니다.");
				break;
				
			}
			System.out.println("계속 실행");
		}
		System.out.println("프로그램 종료됨");
		
	
	
	}	
}