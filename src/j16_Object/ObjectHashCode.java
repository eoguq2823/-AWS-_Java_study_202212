package j16_Object;

public class ObjectHashCode {
	public static void main(String[] args) {
		Student s1 = new Student("김수현", 31);
		Student s2 = new Student("김수현", 31);
		SubStudent s3 = new SubStudent("김수현", 31);
		
		//주소값
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		//이퀄스 안쓰고 값 비교 "김수현"과 31의 해시코드를 받아 밑에 김수현 31과 해시코드와 같은지 비교
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.hashCode() == s3.hashCode());
	}
}
