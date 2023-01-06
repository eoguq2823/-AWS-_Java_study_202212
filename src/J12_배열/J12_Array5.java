package J12_배열;

public class J12_Array5 {
	//orivate
	public static void transferArray(int[] oldArray, int[] newArray) { //새로운배열에
		for(int i = 0; i < oldArray.length; i++) { // 옮기는
			newArray[i] = oldArray[i]; // 행위만 있음
		}
	}
	//private
	public static int[] addArrayLength(int[] array) {
		int[] newArray = new int[array.length + 1]; //자동으로 늘려줌
		transferArray(array, newArray); //새로운배열에 
		return newArray;
	}
	
	public static int[] addData(int[] array, int data) {
		int[] newArray = addArrayLength(array);
		newArray[array.length] = data;
		return newArray;
	}
	
	
	
	public static void main(String[] args) {
	
		int[] nums = new int[0];
		
		nums = addData(nums, 1);
		nums = addData(nums, 2);
		nums = addData(nums, 3);
		nums = addData(nums, 4);
		nums = addData(nums, 5);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
// 1. []
// 2. addData([]번배열, 1)
//     1) addARrayLength ([]빈배열);
//			(1) 새배열이 만들어짐
//			(2) tranferArray ([빈배열] [새로생긴배열])
//			      - oldArray ([빈배열])
//			      - newArray ([새로운배열])