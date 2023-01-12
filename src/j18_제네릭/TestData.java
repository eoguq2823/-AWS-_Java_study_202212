package j18_제네릭;
// 제네릭은 래퍼 클래스만 사용가능하다.
public class TestData<T> { // <?> = 제네릭  <T, E> 로 두개 줄수 있다.

	private String data1;
	private T data2; // int -> Interger로 변경 (Wrapper Class 래퍼클래스)
	
	public TestData(String data1, T data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "TestData [data1=" + data1 + ", data2=" + data2 + "]";
	}
	
	
}
