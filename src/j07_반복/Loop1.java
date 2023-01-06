package j07_반복;

public class Loop1 {
	
	public static void main(String[] args) {
/*		포문
	int i = 1; = i와 int 선언, i++탈출조건에대한 변화수식
	(;;) <- 포문의 원래 모양
	(int i = 0, int j = 0, k=0; ;) 여러개의 선언이 가능하다. 1번만 실행
	(;i < 10 || j < 20 || k <30;) 조건이 참이여야지 실행이된다. 참이아닌순간 반복은 끝난다. 참인순간 반복
	(;;i++, j++, k +=2) 
	반복문안에 반복문 사용 가능
	순서
	(1번;2번;4번)
	System.out.println(i); <- 3번
	1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 '''''거짓->끝
*/		
//		int i = 10; 이건 사용 불가능 
		for (int i = 0; i < 10; i++) { //여기서 i는 임시변수 index 
//			for (int i = 1; i < 101; i++) 위에서 이미 i를 쓰고있기때문에 사용불가능
			System.out.println(i);
		}	
//		포문의 기본틀 	
//		for (int i = 1; i < 101; i++) {
//				System.out.println(i);  똑같은것을 계속 사용가능		
//      int i = 10; 여기서는 사용가능 프로그램은 순차적으로 쓰이기때문에		
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}  // 컴퓨터는 항상 0부터 시작 
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}  // 1부터 시작
		for (int i = 0; i < 10; i++) { 
			System.out.println(i + 2);
		  // 2부터 시작
}
}
}