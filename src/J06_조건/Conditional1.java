package J06_조건;

import java.util.Scanner;

public class Conditional1 {
	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1: ");
		num = scanner.nextInt();
		System.out.print("숫자2: ");
		num2 = scanner.nextInt();
//		if(num > num2) System.out.println("num이 num2보다 큽니다.");
//		else System.out.println("num이 num2보다 크지 않습니다.")
//		2가지만 비교

/*		if(num > num2) System.out.println("num이 num2보다 큽니다.");
		if(num == num2) System.out.println("num과 num2가 같습니다.");
		if(num < num2) System.out.println("num이 num2보다 작습니다.");
        비용처리 3번

*/		if(num > num2) 
			System.out.println("num이 num2보다 큽니다.");
		else 	if(num == num2) System.out.println("num과 num2가 같습니다.");
				else System.out.println("num이 num2보다 작습니다.");
//      비용처리 2번
//		else뒤에 if문이 들어올수 있다. 
//      
/*		if(num > num2) {
			System.out.println("num이 num2보다 큽니다.");
			System.out.println("num: " + num);
		}
		else 	if(num == num2) System.out.println("num과 num2가 같습니다.");
			else System.out.println("num이 num2보다 작습니다.");
*/	    // 중괄호를 이용
		
/*		if(num > num2) {
			System.out.println("num이 num2보다 큽니다.");
			System.out.println("num: " + num);
		}else if(num == num2){ 
				System.out.println("num과 num2가 같습니다.");
		}else{  
				System.out.println("num이 num2보다 작습니다.");
		}  중괄호를 이용하여 사용할 수 있다.
*/	
	
	} 
}
