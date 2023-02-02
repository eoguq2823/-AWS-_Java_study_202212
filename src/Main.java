import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1001, "홍길동"));
		students.add(new Student(1002, "강철수"));
		students.add(new Student(1003, "김영희"));
		
		for(Student student : students) {
			student.showStudent();
		}
	}
}
