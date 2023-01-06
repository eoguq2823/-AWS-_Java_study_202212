package j07_반복;

import java.util.Scanner;

public class Loop2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startNumber = 0;
		int endNumber = 0;
		
		System.out.print("시작: ");
		startNumber = scanner.nextInt();
		System.out.print("끝: ");
		endNumber = scanner.nextInt();		
		
		int sum = 0;
		
		for (int i = 0; i < endNumber - startNumber + 1; i++) {
			sum += startNumber + i;
		}	
		System.out.println("총합: " + sum);
//끝의 숫자에서 시작숫자를 빼면 총합
			
}
}