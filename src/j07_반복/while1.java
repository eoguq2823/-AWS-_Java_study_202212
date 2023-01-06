package j07_반복;

public class while1 {
	
	public static void main(String[] args) {
/* index : 순서가 있는 경우
 *  어디부터 어디까지
 */
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("출력된것이 똑같음");
		
		int i = 0;
/* 순서보다 조건이 중요할 때
 * 		
 */
		while (i < 10) {
			System.out.println(i);
			
			i++;
		}
}
}