package j22_익명클래스;

public class Main {

	public static void main(String[] args) {
		Calculator c1 = new Addition();
		
		System.out.println(c1.calc(10, 20));
		
	//////////////////////////////////////////////////////
		
		Calculator c2 = new Calculator() { //클래스이름이없다.  생
			//1회성 다른곳에서 사용 불가 						성
			//임시로 구현한 클래스 								부
			//ex) 로그인을하고나면 로그인이 필요가없다			터
			@Override										//	재
			public int calc(int x, int y) {					//	생
				return x - y;  
			}
		};
		System.out.println(c2.calc(200, 100));
		
		Calculator c3 = (x, y) -> x * y; //한줄에 생성부터 재생
		System.out.println(c3.calc(20, 3));
	}
}
