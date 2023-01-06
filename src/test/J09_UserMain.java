package test;

public class J09_UserMain {

	public static void main(String[] args) {
		
	
	
	J09_User s1 = new J09_User();
	J09_User s2 = new J09_User();
	J09_User s3 = new J09_User();

	s1.username = "zxcv8678";
	s1.password = "password";
	s1.name = "강대협";
	s1.email = "eoguq2823@naver.com";
	
	s2.username = "eoguq2823";
	s2.password = "password1";
	s2.name = "강대철";
	s2.email = "eoguq111@naver.com";
	
	s3.username = "유저이름";
	s3.password = "비밀번호";
	s3.name = "이름";
	s3.email = "이메일";
	
	s1.printInfo();
	System.out.println();
	s2.printInfo();
	System.out.println();
	s3.printInfo();
	
	
	}
			
}
