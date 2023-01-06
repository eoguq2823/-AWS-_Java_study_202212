package J05_입력;

import java.util.Scanner;

public class Input4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int age = 0;
		String address = null;
		String number = null;
		
		System.out.print("이름: ");
		name = scanner.next();
		System.out.print("나이: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("주소: ");
		address = scanner.nextLine();
		System.out.print("연락처: ");
		number = scanner.next();
		
		System.out.print("사용자의 이름은 " + name + "이고");
		System.out.println(" 나이는 " + age + "살입니다.");
		System.out.println("주소는 " +  address + "에 거주중입니다.");
		System.out.println("연락처는 " + number + " 입니다.");
	}
}
