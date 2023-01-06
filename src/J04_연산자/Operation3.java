package J04_연산자;

/*
 * 논리 연산자
 * 거짓이아니면 무조건 참
 * 
 * 0이 아니면 뭐든 참
 * 
 * AND (곱셈) : T && T, T && F (T=1 F=0)  둘중에 하나라도 참이 아니면 거짓 
 * 			  ex) 로그인
 * OR (합) : T || T, T || F 많은 것중에 하나라도 참이면 참 
 * 
 * NOT (부정) !T, !F 참이면 거짓, 거짓이면 참
 *  
 */

public class Operation3 {
	public static void main(String[] args) {
		int num = 11;
		
		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = false;
		boolean flag4 = num % 2 == 0;
		boolean flag5 = num % 2 >= 0;
		
		System.out.println(flag1 && flag2);
		System.out.println(flag1 && flag3);
		System.out.println(flag2 || flag4);
		System.out.println(flag2 || flag4 && flag1);
		System.out.println(!(flag2 || flag4 && flag1));
		System.out.println(!(flag2) || !(flag4) && !(flag1));
	}
}
