package j16_Object;

public class ObjectEquals {
// 문자열 비교할때는 Equals를 써라
// "김준일" 리터널 = 정해진값
// 이퀄스는 실질적인 안의 값을 비교해주게해준다
	public static void main(String[] args) {
		//같은 주소가 name1 nmae2에 들어간것이다.
		String name1 = "김준일";
		String name2 = "김준일";
		String name3 = new String("김준일");
		
		System.out.println(name1);
		System.out.println(name2);
		
		// 주소를 비교한것이다.		
		System.out.println(name1 == name2);
		
		System.out.println("==============");
		
		System.out.println(name1 == name3);
		
		System.out.println("=========================");
		
		System.out.println(name1.equals(name3));
	
		System.out.println("==================================");
		
		
		// new 를 따로 해줘서 주소가 다르다.
		Student s1 = new Student("박은빈", 24);
		Student s2 = new Student("박은빈", 24);
		SubStudent s3 = new SubStudent("박은빈", 24);
		     
		// 주소 값 비교
		System.out.println(s1 == s2);
		
		System.out.println("============================================");
		
		System.out.println(s1.equals(s2)); //업캐스팅
	
		System.out.println("====================================================");
		
		Student s = new Student("박은빈", 24);
		Student s5 = s;
		Student s4 = s;
		
		System.out.println(s5 == s4);
	
	}
}
