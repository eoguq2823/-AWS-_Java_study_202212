package j17_스태틱;

public class StaticMain {

	public static void main(String[] args) {
	
	//객체생성이안되었는데 메소드를 사용하고있다.
	System.out.println("출력1: " + TestA.getNum());	 
	System.out.println();	
	
	TestA.setNum(100);
	
	System.out.println("출력2: " + TestA.getNum());	 
	
	TestA.setNum(200);
	
	System.out.println("출력3: " + TestA.getNum());
	}
}
