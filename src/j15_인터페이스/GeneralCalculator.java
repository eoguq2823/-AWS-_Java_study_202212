package j15_인터페이스;
							  //확장 딱하나의클래스에만 가능	
public class GeneralCalculator extends Equipment implements Calculator {
	//상속도 받고 구현도 했다					//인터페이스도구를 이 클래스에 장착하겠다.
	@Override
	public void powerOn() {
		System.out.println("일반 계산기 전원을 켭니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("일반 계산기 전원을 끕니다.");
	}

	@Override
	public double plus(double x, double y) {
		System.out.println("일반계산기에서 더하기 실행");
		return x + y;
	}

	@Override
	public double minus(double x, double y) {
		System.out.println("일반계산기에서 빼기 실행");
		return x - y;
	}

	@Override
	public double division(double x, double y) {
		System.out.println("일반계산기에서 나누기 실행");
		if(x == 0 || y == 0) {
			return ERROR;
		}

		return x / y;
	}
	

}
