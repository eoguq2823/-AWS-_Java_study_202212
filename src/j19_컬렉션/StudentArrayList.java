package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {

	public static void updateYear(
			List<Student> students,
			String searchName,
			int newYear) {
		for(Student student : students) {
			if(student.getName().equals(searchName)) {
				student.setYear(newYear);
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("김종환", 1));
		students.add(new Student("고병수", 2));
		students.add(new Student("손민재", 3));
		students.add(new Student("황창욱", 4));
		
//		System.out.println(students);
		
//		System.out.println(students.get(0).getName());
	
		String searchName = "손민재";
		//searchName이 손민재인 학생을 찾아서 학년을 4학년으로 바꿔라 
		//만약 searchName 동일한 이름이 없으면 "검색 실패" 메시지 출력
		
		boolean flag = true;
		for(int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if(student.getName().equals(searchName)) {
				student.setYear(4);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("검색실패");
		}
		System.out.println(students);
		
		updateYear(students, "고병수", 1);
		
		System.out.println(students);
		
		
		
		
	}	
	

}
