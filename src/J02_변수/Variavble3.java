package J02_변수;

public class Variavble3 {

	public static void main(String[] args) {
		//변수
		int age = 20; //선언 
		age = 30; //초기화
		System.out.println(age);
		//상수 : 자료형 앞에 final이 붙는다.
		//한번 초기화(결정)하면 변하지않는다
		//상수는 상수명을 무조건 대문자로 사용을 한다.
		//만약 두개의 단어를 쓰고싶다 = NOW_AGE = 0;
//		final int AGE1; //선언   GE1 = 30; //초기화 최초의 초기화까지는 허용한다.
//		System.out.println(AGE1);
		final int AGE2; //선언 
		AGE2 = 30;
		//AGE2 = 40; X 
		System.out.println(AGE2);
		
		// final int AGE3;
		// System.out.println(AGE3); X
		final int AGE4 = 0;
		System.out.println(AGE4);
	
	}

}
