package usermanagement.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.mindrot.jbcrypt.BCrypt;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usermanagement.entity.RoleDtl;
import usermanagement.entity.User;
import usermanagement.repository.UserRepository;

public class UserService {
	private UserRepository userRepository;
	private Gson gson;
	private Map<String, String> loginUser;
	
	private static UserService instance;
	
	public static UserService getInstance() {
		if(instance == null) {
			instance = new UserService();
			 
		}
		return instance;
	}
	private UserService() {
		userRepository = UserRepository.getInstance();
		gson = new GsonBuilder().setPrettyPrinting().create();

	}
	
	public Map<String, String> register(String userJson) {
		//response : 응답
		Map<String, String> response = new HashMap<>();
		
		Map<String, String> userMap = gson.fromJson(userJson, Map.class);
		for(Entry<String, String> userEntry : userMap.entrySet()) {
			if(userEntry.getValue().isBlank()) {
				response.put("error", userEntry.getKey() + "은(는) 공백일 수 없습니다.");
				return response;
			}
		}
		
		User user = gson.fromJson(userJson, User.class);
		System.out.println("서비스에 넘어옴! User 객체로 변환");
		System.out.println(user);
		
		if(duplicatedUsername(user.getUsername())) {
			response.put("error", "이미 사용중인 사용자 이름입니다.");
			return response;
		}
		if(duplicatedEamil(user.getEmail())) {
			response.put("error", "이미 사용중인 이메일입니다.");
			return response;
		}
		//세이브전에 비밀번호를 암호화해야한다.
//		String pw = BCrypt.hashpw("1234", BCrypt.gensalt());
//		System.out.println(pw);
//		System.out.println(BCrypt.checkpw("1234", pw));
//		user.setPassword(pw);
//		userRepository.saveUser(user);
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
		
		System.out.println("암호화 후");
		System.out.println(user);
		
		userRepository.svaeUser(user);
		
		RoleDtl roleDtl = RoleDtl.builder()
				.roleId(3)
				.userId(user.getUserId())
				.build();
		
		userRepository.saveRoleDtl(roleDtl); //권한 부여
	
		
		response.put("ok", "회원 가입이 완료되었습니다.");
		
		return response;
		
		
	}
	//아이디 중복
	private boolean duplicatedUsername(String username) {
		return userRepository.findUserByUsername(username) != null; 
	}
	private boolean duplicatedEamil(String email) {
		return userRepository.findUserByEmail(email) != null; 
	}
	public Map<String, String> authorize(String loginUserJson) {
		Map<String, String> loginUser = gson.fromJson(loginUserJson, Map.class);
		
		Map<String, String> response = new HashMap<>();
		for(Entry<String, String> entry : loginUser.entrySet()) {
			if(entry.getValue().isBlank()) {
				response.put("error", entry.getKey() + "은(는) 공백일 수 없습니다.");
				return response;
			}
		}

		
		User user = userRepository.findUserByUsername(loginUser.get("usernameAndEmail"));
		if(user == null) {
			user = userRepository.findUserByEmail(loginUser.get("usernameAndEmail"));
			if(user == null) {
				response.put("error", "사용자 정보를 확인해주세요1");
				return response;
			}
		}
		if(!(BCrypt.checkpw(loginUser.get("password"), user.getPassword()))) {
			response.put("error", "사용자 정보를 확인해주세요2");
			return response;
		}
		response.put("ok", user.getName() + "님 환영합니다.");
		return response;
	}

}
