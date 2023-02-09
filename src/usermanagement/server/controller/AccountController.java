package usermanagement.server.controller;

import java.util.Map;

import usermanagement.dto.ResponseDto;
import usermanagement.service.UserService;

public class AccountController {

	//싱글톤
	private static AccountController instance;
	private UserService userService;
	
	private AccountController() {
		userService = UserService.getInstance();
	}
	
	public static AccountController getInstance() {
//		synchronized (instance) { //동기화 -> synchronized  누군가가 사용하고있다면 접근못하게해준다. 쓰래드를 사용하는중에 싱글톤을 사용할려면 꼭 사용해야한다.
		if(instance == null) {
				instance = new AccountController();
		}
		return instance;
	}
	
	
	
	public ResponseDto<?> register(String userJson) {
		
		Map<String, String> resultMap = userService.register(userJson);
		if(resultMap.containsKey("error")) {
			return new ResponseDto<String>("error", resultMap.get("error"));
		}
		
		return new ResponseDto<String>("ok", resultMap.get("ok"));
	}
}
