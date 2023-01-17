package windowBuilder;

import java.awt.EventQueue;

import windowBuilder.view.frame.MainFrame;

public class UserManagementApplication {

	/**
	 * Launch the application.SS
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() { // 이 중괄호가 익명클래스 
			public void run() {
				try {
					
					MainFrame frame = new MainFrame();
					frame.setVisible(true); //false로 잡으면 실행시 아무것도 안보인다.
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

