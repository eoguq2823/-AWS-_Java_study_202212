package J04_연산자;

public class Operation5 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int result = num1 > num2 ? num1 * -1 : num2 * -1; 
		System.out.println(result);
		
		int num = 10;
		
		char sss = num > 0 ? '응' : '놉';
		System.out.println(sss);
		
		int num4 = 79;
		
//		int result2 = num4 / 90 == 1 ? 90 : num4 / 80 == 1 ? 80 : num4 / 70 == 1 ? 70 : 0;
		
		int result2 = num4 / 90 == 1 ? 90 
				: num4 / 80 == 1 ? 80 
				: num4 / 70 == 1 ? 70 : 0;
		// 항상 연산자 앞에서 줄을 바꿔준다. 상황연산자는 클론앞에서 줄을 바꿔준다.
		// 줄을 바꿔줬을때는 2번의 들여쓰기한다. 
		System.out.println(result2);
		
	}
}
