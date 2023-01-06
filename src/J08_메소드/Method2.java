package J08_메소드;

public class Method2 {
	
// 	매개변수 : x, 반환 x 
// 	void는 반환 X
	public static void method1() { 
		System.out.println("단순실행");
		System.out.println();
	}
	
	public static void method2(int num) {
		System.out.println("num: " + num);
		System.out.println();
	}
//	 매개변수 : int 두개 입력, 반환 : X
	public static void method3(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println();
	}
//	 매개변수 : x , 반환 : String
//	반환은 1개만 가능 여러개를보내려면 List나 배열로 묶어서 보내야한다.
	public static String method4() {
//		String ageStr = age + "살"
//		return ageStr;
		return "데이터 반환";
	
	}
//	 
	public static String method5(int age) {
		return age + "살";
	}
//	main안에 메소드는 독립된 공간이기 때문에 서로 지역안으로 들어가면 안된다.
//	main에서의 age(변수)와 메소드에서의 age(변수)는 다르다.
	public static void main(String[] args) {
		method1(); // 함수 호출
		method2(100); //호출하기전 100이라는것을 준다.
		method3(200, 300);
		
		System.out.println(method4());
		System.out.println();
		
		String data1 = method4();
		System.out.println(data1);
		System.out.println();
	
		System.out.println(method5(30));
		System.out.println();
	
	}
	

}