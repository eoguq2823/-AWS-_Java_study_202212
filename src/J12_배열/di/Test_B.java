package J12_배열.di;

public class Test_B {
	
	private Test_C tc;
	
	public Test_B(Test_C tc) {
		this.tc = tc;
	}
	
	public void testB1() {
		System.out.println("\t테스트 B1 메소드 호출");
		
		tc.testC1();
	}
	

}

