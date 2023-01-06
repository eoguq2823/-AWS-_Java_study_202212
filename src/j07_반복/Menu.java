package j07_반복;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
/*		String name = "강대협";
		System.out.println(name.charAt(0));
		'강'만 가져온다 문자 딱 한개만 가져오고 싶을 때 사용
*/		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';
			
			System.out.println("==========<<식당>>==========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 탄탄면");
			System.out.println("3. 홍대개미");
			System.out.println("4. 밥앤밥");
			System.out.println("============================");
			System.out.println("q. 프로그램 종료");
			System.out.println("============================");

			System.out.print("식상 선택: ");
			select = scanner.next().charAt(0);
//'q', 'Q'는 프로그램에서 종료로 자주 사용한다.
			
			if(select == 'q' || select == 'Q') {
				loopFlag1 = false;
			} else if(select == '1') {
				boolean loopFlag2 = true;
				while(loopFlag2) {
					System.out.println("========<<김밥천국>>========");
					System.out.println("1. 김밥");
					System.out.println("2. 라면");
					System.out.println("3. 떡국");
					System.out.println("4. 오므라이스");
					System.out.println("============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("============================");
	
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if(select == 'b') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println("김밥 선택");
					} else if (select == '2') {
						System.out.println("라면 선택");
					} else if (select == '3') {
						System.out.println("떡국 선택");
					} else if (select == '4') {
						System.out.println("오므라이스 선택");
					} 
				}
				
			} else if (select == '2') {
				boolean loopFlag3 = true;
				while(loopFlag3) {
					System.out.println("========<<탄탄면>>========");
					System.out.println("1. 탄탄멘");
					System.out.println("2. 소유라멘");
					System.out.println("3. 챠슈라멘");
					System.out.println("4. 츠케멘");
					System.out.println("============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("============================");
	
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if(select == 'b') {
						loopFlag3 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag3 = false;
					} else if (select == '1') {
						System.out.println("탄탄멘 선택");
					} else if (select == '2') {
						System.out.println("소유라멘 선택");
					} else if (select == '3') {
						System.out.println("챠슈라멘 선택");
					} else if (select == '4') {
						System.out.println("츠케멘 선택");
					} 
				}
				
			} else if (select == '3') {
				boolean loopFlag4 = true;
				while (loopFlag4) {
					System.out.println("========<<홍대개미>>========");
					System.out.println("1.스테이크덮밥");
					System.out.println("2.큐브스테이크덮밥");
					System.out.println("3.연어덮밥");
					System.out.println("4.막창덮밥");
					System.out.println("============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("============================");
					
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if(select == 'b') {
						loopFlag4 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag4 = false;
					} else if (select == '1') {
						System.out.println("스테이크덮밥 선택");
					} else if (select == '2') {
						System.out.println("큐브스테이크덮밥 선택");
					} else if (select == '3') {
						System.out.println("연어덮밥 선택");
					} else if (select == '4') {
						System.out.println("막창덮밥 선택");
					}
					}
				} else if (select == '4') {
					boolean loopFlag5 = true;
					while (loopFlag5) {
						System.out.println("========<<밥앤밥>>========");
						System.out.println("1.소고기 미역국");
						System.out.println("2.뚝배기불고기");
						System.out.println("3.얼큰순두부");
						System.out.println("4.된장순두부");
						System.out.println("============================");
						System.out.println("b. 뒤로가기");
						System.out.println("q. 프로그램 종료");
						System.out.println("============================");
						
						System.out.print("메뉴 번호 선택: ");
						select = scanner.next().charAt(0);
						
						if(select == 'b') {
							loopFlag5 = false;
						} else if (select == 'q' || select == 'Q') {
							loopFlag1 = false;
							loopFlag5 = false;
						} else if (select == '1') {
							System.out.println("소고기미역국 선택");
						} else if (select == '2') {
							System.out.println("뚝배기불고기 선택");
						} else if (select == '3') {
							System.out.println("얼큰순두부 선택");
						} else if (select == '4') {
							System.out.println("된장순두부 선택");
						}
					}
					
				
			} else if (select == '4') {
				
			} else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호 입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				
				
			}
				
			
		}
		System.out.println("프로그램 정상 종료!");
	}	
}