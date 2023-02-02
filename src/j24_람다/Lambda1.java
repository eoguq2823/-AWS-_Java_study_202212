package j24_람다;

public class Lambda1 {

	public static void main(String[] args) {
		Instrument instrument = new Instrument() {
			
			@Override //클래스를 구현,정의하는 공간
			public String play(String instrument) {
				return instrument + "을(를) 연주합니다.";
			}
		};
		System.out.println(instrument.play("단소"));
		
		String playText = instrument.play("드럼");
		System.out.println(playText);
	
		//람다식
		Instrument instrument2 = (String itm) -> {
			return itm + "을(를) 연주합니다."; //정의와 생성
		};
		System.out.println(instrument2.play("피아노")); //play메소드를 호출
		
		
		//매개변수의 자료형을 생략할 수 있다.
		//매개변수의 이름을 바꿀 수 있다.
		Instrument instrument3 = (itm) -> {
			return itm + "를 생략할 수 있다."; //정의와 생성
		};
		System.out.println(instrument3.play("매개변수"));
	
		
		//매개변수가 하나이면 매개변수를 감싸는 괄호를 생략할 수 있다.
		Instrument instrument4 = itm -> {
			return itm + "가 하나이면 매개변수를 감싸는 괄호를 생략할 수 있다."; //정의와 생성
		};
		System.out.println(instrument4.play("매개변수"));
		
		
		//구현부의 명령(실행)문이 하나일 때 중괄호를 생략할 수 있다.
		//이때 리턴자료형이 정해저 있으면 리턴값으로 사용이 된다.
		//중괄호를 생략하는 경우 반드시 return도 같이 생략해야한다.
		Instrument instrument5 = itm -> itm + "의 명령이 하나일 때 중괄호를 생략할 수 있다.";
		System.out.println(instrument5.play("구현부"));
	
	
	    int result = 10 + 20;
	    Instrument instrument6 = itm -> {
	    	return itm + " result를 사용할 수 있다. " + result + "!!!";
	    			
	    };
	    System.out.println(instrument6.play("지역변수"));
	}
}
