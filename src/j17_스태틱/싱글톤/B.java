//package j17_스태틱.싱글톤;
//
//import java.util.Scanner;
//
//public class B {
//
//	private A a; 
//	
//	public B(A a) {
//		this.a = a; //A클래스에 들어있던 메소드 사용가능
//	}
//		
//	public A getA() {
//		return a;
//	}
//
//	public void insertStudent() {
//		Scanner scanner = new Scanner(System.in); //입력장치 스캐너 사용
//		
//		System.out.print("학생이름: "); 
//		String name = scanner.nextLine();
//		
//		Student student = new Student(name); //학생을 생성
//		a.getInstance().addStudent(student);; //a클래스안에 들어 있는 addstudent에 전달한다.
//		a.getInstance().showStudents(); //배열에 있는 것을 하나씩 꺼내서 출력해주는것
//		
//	}
//	
//	
//}
