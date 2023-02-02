
class Student {
	private int studentCode;
	private String studentName;
	
	public Student(int studentCode, String studentName) {
		this.studentCode = studentCode;
		this.studentName = studentName;
	}
	
	public void showStudent() {
		System.out.println("학번: " + studentCode + ", " + "이름: " + studentName);
	}
}
