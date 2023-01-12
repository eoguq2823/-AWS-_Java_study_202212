package j16_Object;

public class ToString {
	
	public static void main(String[] args) {
		
//		// 기본적으로 tostring을 달고 있다.
//		Object obj = new Object();
//		System.out.println(obj); //java.lang.Object@3d012ddd (주소값)
//			
////		String str2 = obj; 사용불가
//		
//		String str = obj.toString();
//		System.out.println(str); //java.lang.Object@3d012ddd
		
		Student student1 = new Student("조병철", 34);
		Student student2 = new Student("김동민", 28);
		Student student3= new Student("김두영", 28);
		Student student4 = new Student("강의진", 29);
		
// 		String str = student1; 객체주소이기때문에 String에 대입할 수 없다. 사용X 
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println();
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		
	}
		

}

