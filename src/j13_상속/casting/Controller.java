package j13_상속.casting;

import java.util.Scanner;

public class Controller {

	private View view; 
	private Scanner scanner;
		
	//뷰면 뷰에 따라 돌아가고
	//업데이트면 업데이트에 따라 돌아간다.
		
	public Controller(View view) {
		this.view = view;
		scanner = new Scanner(System.in);
	}
	public void run() {
		boolean flag = true;
		String select = null;
		
		while(flag) {
			view.show();
			System.out.print("명령 입력: ");
			select = scanner.nextLine();
			flag = view.menu(select);
			System.out.println();
		}
	
		
	}
}
