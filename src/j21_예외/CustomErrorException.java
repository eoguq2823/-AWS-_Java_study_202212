package j21_예외;

public class CustomErrorException extends RuntimeException{
//커스텀에러이셉션은 런타임이셉션을 상속받는다.
	
	public CustomErrorException() {
		System.out.println("내가 만든 예와 생성");
		
	}
	public CustomErrorException(String message) {
		super(message);
	}
}
