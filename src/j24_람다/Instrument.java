package j24_람다;

@FunctionalInterface
public interface Instrument {

	public String play(String instrument); 
	
	//메소드가 두개이면 빨간줄이 뜬다.
//	public String play2(String instrument); 
	
	//이건가능
	public default void testPrint() {
		System.out.println("테스트");
	}
	
}
