package j17_스태틱.싱글톤;
// 모든 싱글톤은 이렇게 만든다.
public class KIA {

	private static KIA instance = null;
	
	private KIA() {}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
			
		}
		return instance;
	}
	
	public void printCompanyName() {
		System.out.println(getClass().getSimpleName());
	}
}
