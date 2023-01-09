package J12_배열;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class J12_UserService {
	
	private Scanner scanner; 
	private J12_UserRepository userRepository; 
	
	public J12_UserService(J12_UserRepository userRepository) {
		
		scanner = new Scanner(System.in);
		this.userRepository = userRepository;
	}
	
	public void run() {
		boolean loopFlag = true;
		char select = '\0';
		
		while(loopFlag) {
			showMainMenu();
			select = inputSelect("메인");
			loopFlag = mainMenu(select);

		}
	}
	
	public void stop() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500); // 500이 0.5초
				System.out.println("프로그램 종료중...(" + (i + 1) + "/10)");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("프로그램 종료");
	}
	
	private char inputSelect(String menuName) {
		System.out.print("메뉴선택: ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}
	
	//원래 뷰로 따로만들어야함
	//메인메뉴 메소드
	private void showMainMenu() {
		System.out.println("========<<메인메뉴>>========");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 등록");
		System.out.println("3. 사용자 이름으로 회원조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("============================");
		System.out.println("q. 프로그램 종료");
		System.out.println();
	}
	//회원 전체 조회
	private void showUsers() { //이거때문에 겟을 만들었다.
		//유저 배열 가져오기
		J12_User[] users = userRepository.getUserTable();
		
		System.out.println("========<< 회원 전체 조회 >>========");
		
		for(J12_User user : users) {
			System.out.println(user.toString());
		}
		System.out.println("====================================");
		
	}
	//회원 등록 
	private void registerUser() {
		J12_User user = new J12_User();
		
		
		System.out.println("========<< 회원 등록 >>========");
		System.out.print("사용자이름: ");
		user.setUsername(scanner.nextLine());
		
		System.out.print("비밀번호: ");
		user.setPassword(scanner.nextLine());
		
		System.out.print("성명: ");
		user.setName(scanner.nextLine());
		
		System.out.print("이메일: ");
		user.setEmail(scanner.nextLine());
		
		System.out.println("===============================");
		
		userRepository.saveUser(user);
	}
	//사용자 이름으로 회원 조회
	private void userLookup() {
		System.out.print("사용자이름: ");
		String name = scanner.nextLine();
		System.out.println(userRepository.findUserName(name));
	}
	
	private void userUpdate() {
		System.out.println("=======<<수정메뉴>>=======");
		System.out.println("==========================");
		System.out.println("1. 비밀번호 변경");
		System.out.println("2. 이름 변경");
		System.out.println("3. 이메일 변경");
		System.out.println("==========================");
		System.out.println("b. 뒤로가기");
		System.out.println();
	}
	
	private boolean mainMenu(char select) {
		boolean flag = true;
		
		if(isExit(select)) {
			flag = false; 
			
		}else {
			if(select == '1') {
				showUsers();
			}else if(select == '2') {
				registerUser();
			}else if(select == '3') {
				userLookup();
			}else if(select == '4') {
				userUpdate();
			}else {
				System.out.println(getSelectedErrorMessage());
			}

		}	
		System.out.println();
		
		return flag;
	}
	//나가는 메소드
	private boolean isExit(char select) {
//		boolean flag = select == 'q' || select =='Q';
		return select =='q' || select =='Q';
		//리팩토리 기능 이전의 소스를 정리하는것 굳이 변수를 설정할 필요 없을때
	}
	
	private String getSelectedErrorMessage() {
		return "###<< 잘못된 입력입니다. 다시 입력하세요. >>###";
	}
	
}
