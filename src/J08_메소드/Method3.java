package J08_메소드;

public class Method3 {
	//매개 변수의 형태가 다르면 똑같은 이름을 사용할 수 있다.
	//메소드 오버로딩 (오버로드)
	//오버로딩 = 부를때 사용하는 것
	//오버라이딩 = 쓰는 것 (덮어쓰는것)
	public static void ov1() {
		System.out.println("매개변수 없음");
		
	}
	public static void ov1(int a) {
		System.out.println("int 매개변수 하나");
		
	}
	public static void ov1(int a, String b) {
		System.out.println("int 먼저 그다음 String");
		
	}
	public static void ov1(String a, int b) {
		System.out.println("String 먼저 그다음 int");
		
	}
	public static void main(String[] args) {
		ov1();
		ov1(10);
		ov1(10, "강대협");
		ov1("강대협", 10);
	}
	
	

}