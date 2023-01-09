package J12_배열.di;

public class Main {

	public static void main(String[] args) {		
		
		Test_C tc = new Test_C();
//		Test_C tc2 = new Test_C();  ex) 학생만뽑고싶을때
		
		Test_B tb = new Test_B(tc);
//		Test_B tb = new Test_B(tc2); ex) 선생만뽑고싶을때
		//디펜더시인덱션
		Test_A ta = new Test_A(tb);
		
		
		//셋터를 통해 객체 주입방식
//		ta.setTb(tb);
		
		ta.testA1();
		ta.testA2();
	}

}
