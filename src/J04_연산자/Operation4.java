package J04_연산자;

public class Operation4 {
	public static void main(String[] args) {
		int num = 100;
		
		num = num + 1;
		num -= 100;
		num *= 1;
		num /= 2;
		num %= 2;
		num += 1; // 1을 증강시킬수있고 100을 증강시킬수있다.
	
		System.out.println(num);
	}
}
