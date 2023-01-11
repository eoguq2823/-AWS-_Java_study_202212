package j16_Object;

import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	
	// alt + shift + s (필드s)
	public Student(String name, int age) {  // object클래스가 상속되어 있는 상태라서 사용가능
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {

		return "이름: " + name + "\n나이: " + age;
 	}
	
	@Override
	public boolean equals(Object obj) {
		//주소 체크
		if(this == obj) { // 두개 주소가 같으면 무조건 true
			return true;
		}
		//널 체크
		if(obj == null) { // null체크 널이면 무조건 false
			return false;
		}
		//동일한 객체인지 체크 , instanceof는 상속되었을때 문제가 생긴다.
//		if(!(obj instanceof Student)) {
		//갯클래스가 
		if(!(obj.getClass() == Student.class)) {
			return false;
		}
		//이름과 나이가 같은지 체크
		Student s = (Student) obj; // 업캐스팅 되어있는 name을 다운캐스팅
		boolean result = name.equals(s.name) && age == s.age; //나이가 달라도 트루가나오기때문에 &&(앤드) age도 입력해줘야한다.
		
		return result;	
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name, age);
		

		
	}
}
