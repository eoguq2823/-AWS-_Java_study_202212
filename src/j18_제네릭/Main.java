package j18_제네릭;

public class Main {

	public static void main(String[] args) {
	
		TestData<Integer> td = new TestData<Integer>("강대협", 30); //생성될때 결정된다
		TestData<Double> td2 = new TestData<Double>("강대협", 100.0);// 생성된 후에는 변경 불가
		System.out.println(td);
		System.out.println(td2);
		
	}
}
 