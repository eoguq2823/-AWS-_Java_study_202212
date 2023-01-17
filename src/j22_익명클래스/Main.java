package j22_익명클래스;

public class Main {

	public static void main(String[] args) {
		Calculator c1 = new Addition();
		
		System.out.println(c1.calc(10, 20));
		
	//////////////////////////////////////////////////////
		
		Calculator c2 = new Calculator() { //클래스이름이없다.
			//1회성 다른곳에서 사용 불가 
			//임시로 구현한 클래스 
			//ex) 로그인을하고나면 로그인이 필요가없다
			@Override
			public int calc(int x, int y) {
				// TODO Auto-generated method stub
				return x - y;  
			}
		};
		System.out.println(c2.calc(200, 100));
	}
}
