package j13_상속;

public class KiaCar extends Car{
	
	public KiaCar() {
		super(); //부모가 먼저생상되어야해서 항상 위에다 쓴다.
		System.out.println("자식");
		
		
	}
	
//	public void test() {
//		KiaCar kc = this; //주소를 변수로 쓰고 싶을때 
//						//매개변수로 값이 들어가야한다.할때 사용
//		
//	}
	
	@Override //이걸안하면 car에있는걸 바로 호출한다.
	//이걸 하면 이걸통해서 호출한다. main에
	public int discountPrive(int percentage) {
		return super.discountPrive(percentage);
	} //부모의 주소에서 per을 호출해라
	
	
}
