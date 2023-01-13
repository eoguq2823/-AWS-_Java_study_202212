package j18_제네릭;

public class Main {

	public static void main(String[] args) {
	
		TestData<String, Integer> td = new TestData<String, Integer>("강대협", 30); //생성될때 결정된다
		TestData<String, Double> td2 = new TestData<String, Double>("강대협", 100.0);// 생성된 후에는 변경 불가
//		TestData<?, ?> td3 = new TestData<>("강대협", 100.0);
		System.out.println(td);
		System.out.println(td2);
		
		CMRespDto<TestData<String, Integer>> cm =
				new CMRespDto<TestData<String, Integer>>(200, "성공", td);
//		CMRespDto<<?, ?> cm2 = new CMRespDto<>(200, "성공", td3);
		
		System.out.println(cm); 
		
	}
}
 