package J12_배열;

public class J12_Array4 {

	public static void main(String[] args) {
		J12_User[] users = new J12_User[3];
		J12_User[] users2 = new J12_User[] {
				new J12_User("aaa", "1234", "김종환", "aaa@gmail.com"),
				new J12_User("bbb", "1254", "이종현", "bbb@gmail.com"),
				new J12_User("ccc", "1264", "진채희", "ccc@gmail.com")
		};
		J12_User[] users3 = {
				new J12_User("aaa", "1234", "김종환", "aaa@gmail.com"),
				new J12_User("bbb", "1254", "이종현", "bbb@gmail.com"),
				new J12_User("ccc", "1264", "진채희", "ccc@gmail.com")
		};

		 
		
		users[0] = new J12_User("aaa", "1234", "김종환", "aaa@gmail.com");
		users[1] = new J12_User("bbb", "1254", "이종현", "bbb@gmail.com");
		users[2] = new J12_User("ccc", "1264", "진채희", "ccc@gmail.com");
		
		for(int i = 0; i < users.length; i++) {
			
			System.out.println(users[i].toString());
			System.out.println(users2[i].toString());
			System.out.println(users3[i].toString());
		}
	}

}
