package J12_배열;

public class J12_User {
//	Entity : 정보를 담는다.
	private String username;    //사용자 이름(아이디, 계정) 프로그램내에서는 아이디사용X 유저네임
	private String password;    //비밀번호 
	private String name;		//성명
	private String email;		//이메일
	
	public J12_User() {
		
	}
	
	public J12_User(String username, String password, String name, String email) {
		//생성자 alt + shift + s
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "J12_User [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email
				+ "]";
	}
	



}
	
	
	
	
	
	




