package J05_입력;

import java.util.Scanner;

public class Input1test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0; //가능하면 = 0; 붙여줄것
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
// 내가 쓰는 소스가 무엇인지 보기위해 변수선언은 위에 쓴다.
		System.out.print("입력1: ");
		num1 = scanner.nextInt(); //nextInt는 정수만 // Int charAt Long Double Boolean Line
		System.out.print("입력2: ");
		num2 = scanner.nextInt();
		System.out.print("입력3: ");
		num3 = scanner.nextInt();
		System.out.print("입력4: ");
		num4 = scanner.nextInt();
		System.out.print("입력5: ");
		num5 = scanner.nextInt();
		
	    System.out.println("더한값:" + (num1 + num2 + num3 + num4 + num5));		
	}

}
