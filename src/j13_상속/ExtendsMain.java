package j13_상속;

public class ExtendsMain {
	
	public static void main(String[] args) {
		
		KiaCar kiaCar = new KiaCar();
		
		System.out.println(kiaCar);
		
		kiaCar.setPrice(30000000);
		
		System.out.println(kiaCar);
		
		System.out.println(kiaCar.getPrice());
		System.out.println(kiaCar.discountPrive(20));
	
		
	}
}
