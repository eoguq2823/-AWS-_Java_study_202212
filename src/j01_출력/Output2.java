package j01_출력;

public class Output2 {

	public static void main(String[] args){
		int year = 5;
		
		System.out.println("이름 :강대협"); // s y s o u t + 컨트롤 +스페이스 + 엔터
		System.out.println("나이 :"+ (27 + year)); //여기서 year= 변수명 그래서 ""X
		System.out.println("이름 :홍길동"); //커서설정후 컨트롤알트 밑방향키
		System.out.println("나이 :"+ (28 + year));
		System.out.println("이름 :홍길자"); 
		System.out.println("나이 :"+ (29 + year)); //알트 원하는 곳에 커서 
		System.out.println("이름 :홍길순"); 
		System.out.println("나이 :"+ (30 + year));
		
	}
}
	/* IDE : 통합 개발 환경 (이클립스)
	 * -Integrated Development Environment
	 * 
	 * JDK : 개발자는 여기까지
	 * -Java Development Kit
	 * 
	 * JRE : 프로그램 실행 할수있는 환경 (내언어로 실행할수있는 환경)
	 * -Java Runtime Environment
	 * 
	 * JVM : 
	 * -Java Virtual Machine
	 */
     /* 변수 = 변하는 수 (자료형+변수명)
      * - int lever;
      * 메모리는 
      * 비트와 바이트로 관리된다
      * 비트 = 0또는 1 의 값을 저장하기 위한 최소 단위 (4가지)
      * 1빝가 가지는 총 경우의 수는 0과 1, 두가지이다.
      * 바이트 = 8빝를 한 단위로 표준화한 요량 단위 (0~255가지)
      * 1바이트가 나타낼 수 있는 총 경우의 수 
      * 00000000~11111111   -> 2*2*2*2*2*2*2 = 2^8
      *
      */

