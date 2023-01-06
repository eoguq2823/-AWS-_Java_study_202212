package j07_반복;

public class star1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {  // 10줄 반복
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*"); // 별 개수 반복
			}
		
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++) { 
			for (int j = 0; j < 10 - i; j++) {
				System.out.print("*"); 
			}
		
			System.out.println();
		}
		
		System.out.println("==============================================");
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i - 1; j++) {
				 System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
					
		
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i ; j++) {
				 System.out.print(" ");
			}
			for (int k = 0; k < 10 - i; k++) {
				System.out.print("*");
			}
					
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i - 1; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				for (int j = 0; j < 10 - i -1; j++) {
					System.out.print(" ");
					
				}
				for (int j = 0; j < i * 2 + 1; j++) {
					System.out.print("*");
				}
		
			} else {
				for (int j = 0; j < i + 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 10 - i -1; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < 10 - i - 2 ; j++) {
					System.out.print("*");
					
				}
			}
			System.out.println();
			
		}

	}	
}

