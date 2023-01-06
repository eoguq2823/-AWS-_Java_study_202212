package J09_클래스;

public class J09_Student {
//         변수
//	String name;
	String name = "강대";
//	int age;
    int age = 100; // 초기화 기본값을 넣을 수 있다.
//	생성 과정에서 할당된것이 없으면 기본값들이 할당이된다.
//	클래스안에서는 초기화 X
	J09_Student() {
		System.out.println("생성됨!!!");
// 		생성자는 반환 자료형이 없다.
//		그런데 호출하고 주소값이 들어있다.
//		반환자료형을 지정할 필요없다.
//		주소값을 반환하기 때문에
	}
	
//        메소드	
	void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}


