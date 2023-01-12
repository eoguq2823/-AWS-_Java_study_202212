package j17_스태틱.싱글톤;

public class KiaMain {
	
	public static void main(String[] args) {
		//주소를 받아올수 있게끔 만들어준다.
		KIA kia = KIA.getInstance();
//		KIA kia2 = new KIA(); 사용불가0
		
		kia.printCompanyName();
	}
}
