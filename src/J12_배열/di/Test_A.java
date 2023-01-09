package J12_배열.di;

public class Test_A {
	
	//여기에 전역변수로 호출
	// final 무조건 초기화가 있어야한다. 중간에 프로그램이 바뀌면 안되는 것에는 final을 걸어준다.
	private final Test_B tb; 
//  testB는 testA 를 의존하고있다. 디펜더스
	//의존성이 높다 = 결합도가 높다
	//생성자의 매개변수를 통해 주는것
	public Test_A(Test_B tb) {
		this.tb = tb;
	}
	//셋터를 통해 주는것
//	public void setTb(Test_B tb) {
//		this.tb = tb;
//	}
	public void testA1() {
		System.out.println("테스트A1 메소드 호출!!");
		//전역변수로 뺏기떄문에 필요X
//		Test_B tb = new Test_B();
		
		tb.testB1();
	}
	
	public void testA2() {
		System.out.println("테스트A2 메소드 호출");
		//전역변수로 뺏기떄문에 필요X
//		Test_B tb = new Test_B();
				
		tb.testB1();
	
	}
}
