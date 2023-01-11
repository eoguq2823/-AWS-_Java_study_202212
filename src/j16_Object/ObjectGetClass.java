package j16_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectGetClass {
	
	public static void main(String[] args) {
		Student student = new Student("김재영", 29);
		
		//클래스라는 타입 (클래스 클래스)
		//student 는 Student클래스로 만들어 졌다.
		System.out.println(student.getClass());
		// 자료형.class을 찍으면 클래스클래스정보만 가져온다. 
		System.out.println(Student.class);
		
		//클래스클래스 변수담기X
		System.out.println(student.getClass().getName());
		System.out.println(student.getClass().getSimpleName());
		
		//클래스클래스 변수에담기
		Class studentClass = student.getClass();
		
		String className = studentClass.getName();
		System.out.println("클래스 이름: " + className);
		
		String simpleName = studentClass.getSimpleName();
		System.out.println("클래스 이름만:" + simpleName);
		
		//필드						 필드 배열
		Field[] fields = studentClass.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field);
			
		}
		//메소드						메소드 배열
		Method[] methods = studentClass.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
		
	}
}
