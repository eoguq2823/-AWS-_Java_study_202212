package J09_클래스;

public class J09_StudantMain {

	public static void main(String[] args) {
		
//		new J09_Student();
//		System.out.println(new J09_Student());
		//스틱영역은 자동으로 할당이 안되기때문에 0이라는 초기화를 해줘야한다.
		//메소드안에서는 초기화 O
		int a = 0;
		
		System.out.println(a);
		J09_Student s1 = new J09_Student();
		J09_Student s2 = new J09_Student();
		
		s1.name = "강대협";
		s1.age = 28;
		
		s1.printInfo();
		s2.printInfo();
		
	}
//	     자료형     변수명 대입        값
//		J09_Student studant1 = new J09_Student();
//		J09_Student studant2 = new J09_Student();
//							   새로운  생성자 
//		 동적 메모리 할당 = new / 다른 메모리의 남은 영역부분의 양을 빌리는 것
//  							  빌리는 행위가 생성자		
//		 정적 메모리 = 스택 
//		 동적 메모리 = 힙 
//		System.out.println(studant1);
//		System.out.println(studant2);
//	}

}
