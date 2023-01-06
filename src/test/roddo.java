package test;

import java.util.Arrays;
import java.util.Random;

public class roddo {

	public static void main(String[] args) {
		Random roddo = new Random();
		
		
		int[] nums = new int[6];
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length; i++) {
			while(true) {
				boolean findFlag = true;
				
				int roddoNum = roddo.nextInt(45) + 1;
				
				for(int j = 0; j < nums.length; j++) {
					if(nums[j] == roddoNum) {
						findFlag = false;
						break;
					}
				}
				
				if(findFlag == true) {
					nums[i] = roddoNum;
					break;
				} 
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
