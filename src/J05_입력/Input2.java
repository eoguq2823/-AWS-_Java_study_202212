package J05_입력;

import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
/*		
		char str1 = 0;
		char str2 = 0;
		int number1 = 0;
		double number2 = 0;
*/		
		System.out.print("문자열1: ");
		String str1 = scanner.nextLine(); //띄어쓰기 허용 o
		System.out.print("문자열2: ");
		String str2 = scanner.next(); //띄어쓰기 허용 X
		System.out.print("정수: ");
		int number1 = scanner.nextInt();
		System.out.print("실수: ");
		double number2 = scanner.nextDouble();
		
		System.out.println("문자열1" + str1);
		System.out.println("문자열2" + str2);
		System.out.println("정수" + number1);
		System.out.println("실수" + number2);
				


	}
}
