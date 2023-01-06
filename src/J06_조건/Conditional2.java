package J06_조건;

import java.util.Scanner;

public class Conditional2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
/*		int a, b, c;    이런 방법은 좋은 코드는 아니다.
		a = b = c = 0;  코드는 제일 스탠다드하게 바로 알 수 있게 작성
*/	
		int a = 0;
		int b = 0;
		int c = 0;
		
		int max = 0;
		int min = 0;
	
		System.out.println("정수 3개 입력: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		max = a;
		min = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;	
		}
		
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		//중괄호 필수입력
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	} 
}
