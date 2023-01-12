//package j17_스태틱.싱글톤;
//
//public class A {
//	
//	private static A instance = null;
//
//	private Student[] students;
//	
//	private A() {
//		students = new Student[3];
//	}
//	
//	public static A getInstance() {
//		if(instance == null) {
//			instance = new A();
//			
//		}
//		return instance;
//	}
//	
//	public void addStudent(Student student) { //학생을 전달받는다.학생을 추가하는 작업 공간이 있는지 부터 확인 공간이 있으면 돌려라
//	for(int i = 0; i < students.length; i++) { 
//		if(students[i] == null) { //비었다는것
//			students[i] = student; //비어있는 공간에 student를 대입해라
//			return; // 브레이크나 리턴을 안돌려주면 똑같은 학생만 계속 들어간다.
//			//브레이크로 끊으면 밑에 있는 sysout들이 같이 출력된다. (반복만 멈춤)
//			// 리턴을 만나면 메소드를 탈출한다. 쓸수 있는 이유 void이기때문에
//		}
//	}
//	
//}
//
//
//	
//	
////
////	public A() {
////		students = new Student[3];
////	}
////
////	
////		System.out.println("더 이상 학생을 추가할 수 없습니다.");
////		System.out.println();
////		
////	}
////	
////	public void showStudents() {
////		for(Student student : students) {
////			
////				System.out.println(student); //이름이있으면 이름 없으면 null이 추가
////		}
////		System.out.println();
////	}
////}
