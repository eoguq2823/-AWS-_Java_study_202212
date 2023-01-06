package J12_배열;

public class J12_UserMain {

	public static void main(String[] args) {
		J12_UserService service = new J12_UserService();
		
		service.run(); //무한루프
		service.stop(); // 끝이 난다.

	}

}
