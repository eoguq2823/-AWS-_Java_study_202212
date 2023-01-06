package J11_접근지정자;

import J11_접근지정자.default1.J11_StudentDefault;

public class J11_StudentMain {
	
	public static void main(String[] args) {
		J11_Student s1 = new J11_Student(null, 0);
		s1.setName("강대협");
		s1.setAge(28);
				
		s1.printInfo();
	
		J11_StudentDefault s2 = new J11_StudentDefault();
		// 다른 패키지 안에 있기 때문에	
// 자료형이면 import해줘야한다.
// import J11_접근지정자.default1.J11_StudentDefault;
//		s2.name = "홍길동";
		
		s2.setName("홍길동");
		
//		System.out.println("이름:" + s2.name);
		System.out.println("이름:" + s2.getName());
		
	}
	
}
