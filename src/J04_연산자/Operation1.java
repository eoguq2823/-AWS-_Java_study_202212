package J04_연산자;

public class Operation1 {
	public static void main(String[] args) {
		int add = 1 + 2;
		int sub = 10 - 5;
		int mul = 10 * 2;
		int div = 10 / 4; // 정수와 정수를 나누면 정수만나오고 실수와 실수를 나누면 실수만나온다. 
		int remainder = 10 % 5; 
		// 나머지가 0이 되면 5의 배수
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(remainder); 
		// 2로 나누어서 0 이면 짝수 아니면 홀수 
		System.out.println(remainder == 0? "5의배수이다" : "5의 배수가 아니다"); // == : 같다
		
	}
}
