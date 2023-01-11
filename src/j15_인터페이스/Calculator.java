package j15_인터페이스;
//인터페이스도 클래스다
public interface Calculator {

//				(대문자)
	public int ERROR = -99999999; //파이널을 생략하고 이렇게 쓰면 상수다.
	
	public double plus(double x, double y);

	public double minus(double x, double y);

	public default double multiplication(double x, double y) { //default를 사용해야지만 일반 메소드로 사용할수있다.
		
		return x * y;
	}
	
	public double division(double x, double y);
}
	