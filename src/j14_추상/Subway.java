package j14_추상;

public class Subway extends Transportation{
	
	@Override  //@로 시작하는 문법을 어노테이션이라고 한다.
	public void go() {
		System.out.println("지하철을 타고 출발");

	}
	
	@Override
	public void stop() {
		System.out.println("지하철을 타고 도착");

	}
	
	public void checkRoute() {
		System.out.println("지하철 노선 확인");
	}
}