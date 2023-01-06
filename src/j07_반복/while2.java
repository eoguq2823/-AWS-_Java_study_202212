package j07_반복;

public class while2 {
	
	public static void main(String[] args) {
		int i = 0;

		
		while (i < 10) {
			int j = 0;
			while (j < i + 1) {
				System.out.print("*");
				j++;
			}
			
			i++;
		System.out.println();
		}
}
}