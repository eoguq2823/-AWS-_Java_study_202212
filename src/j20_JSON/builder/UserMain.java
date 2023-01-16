
package j20_JSON.builder;


public class UserMain {
	public static void main(String[] args) {
//		User user = new User();
		User.UserBuilder userBuilder = new User.UserBuilder();
		
		User user2 = User.builder()
				.username("aaa")
				.password("asd233!")
				.name("KDH")
				.email("eoguq9227@naver.com")
				.build();
		
		System.out.println(user2);
	}
}	
