package j01_출력;

import j17_스태틱.싱글톤.KIA;

public class HelloJava { //클래스는 무조건 대문자, 중괄호 = 이 클라스 는 여기다
	// 주석 : 코드 내부에 메모를 할 때 사용함.
	// 컴파일 시에 무시됨.
	// : 한줄 주석
	// <-- 빈공간 들여쓰기(tap)
	/* 하고 엔터 여기서 열리고
	 * 1: 여러줄 주석
	 * 2
	 * 3
	 */ //여기서끝
	/**
	 * 클래스, 메소드 등의 정보를 설명하기 위한 주석
	 */ 
	// 프로그램의 시작점이다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub 자동으로 만들면 따라오는 주석 지워도 무관
		System.out.println("Hello, Java!!");
		System.out.println("이름 : 강대협");
		System.out.println("주소 : 양산시");
		System.out.println("연락처 : 010.2823.9227");
		System.out.println("수업 : AWS기반 공공빅데이터 활용 웹개발자 양성");
		//println <- ln은 (줄바꿈 한줄의 문자열을 출력후 끝에 줄바꿈을 해라.)
		//시스템 아웃은 콘솔에 출력
		
		System.out.println();
		
		KIA.getInstance().printCompanyName();
	}
}
