package j17_스태틱.싱글톤;

public class Student {

	private static final int CODE = 20230000; //기본적인 코드
	private static int ai = 1; //auto_increment
//	private static int ai = 20230000; //auto_increment
	
	private int studentCode;
	private String name;
	
	public Student(String name) { //생성할때 이름만준다
		studentCode = CODE + ai;
		ai++;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
}
