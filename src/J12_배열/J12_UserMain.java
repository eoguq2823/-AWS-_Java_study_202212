package J12_배열;

public class J12_UserMain {

	public static void main(String[] args) {
		// Service 배열 생성
		J12_User[] users = new J12_User[0];
		J12_User[] users2 = new J12_User[100];
		
		
//		J12_User[] users = new J12_User[0];
		
		//users -> userRepository
		J12_UserRepository userRepository = new J12_UserRepository(users);
		J12_UserRepository userRepository2 = new J12_UserRepository(users2);
		
		//userRepository -> UserService
		J12_UserService service = new J12_UserService(userRepository);
		
				
		service.run(); //무한루프
		service.stop(); // 끝이 난다.

	}

}
