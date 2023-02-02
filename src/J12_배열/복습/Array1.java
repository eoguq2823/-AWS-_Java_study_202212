package J12_배열.복습;


public class Array1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		String[] strings = new String[3];
		strings[0] = "강";
		strings[1] = "대";
		strings[2] = "협";
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		int[] nums2 = new int[] {10, 20, 30, 40, 50};
		for(int i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		
		int[] nums3 = {10, 20, 30, 40, 50}; 
		for(int i = 0; i < nums3.length; i++) {
			System.out.println(nums3[i]);
		}
		
		System.out.println(new int[] {10, 20, 30 ,40, 50}); //배열의 주소
		System.out.println((new int[] {10, 20, 30 ,40, 50})[1]);
	}
}
