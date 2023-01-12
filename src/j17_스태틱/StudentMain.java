package j17_스태틱;

public class StudentMain {

	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		Teacher[] teachers = new Teacher[5];
		
		System.out.println(Student.getAutoIncrement());
		
		
		students[0] = new Student("이현수");
		students[1] = new Student("김재영");
		students[2] = new Student("이상현");
		students[3] = new Student("박성진");
		students[4] = new Student("윤선영");
		
		teachers[0] = new Teacher("김준일");
		teachers[1] = new Teacher("김준이");
		teachers[2] = new Teacher("김준삼");
		teachers[3] = new Teacher("김준사");
		teachers[4] = new Teacher("김준오");
		
		for(int i = 0; i < students.length; i ++) {
			System.out.println(students[i]);
			System.out.println(teachers[i]);
			System.out.println();
		}
		
		System.out.println(Student.getAutoIncrement());
		
		int j = 0;
		
		for(Student s : students) {
			System.out.println(s);
			System.out.println(teachers[j]);
			j++;
			System.out.println();
		}
		
		for(Teacher t : teachers) {
			System.out.println(t);
		}
	
	}
}
