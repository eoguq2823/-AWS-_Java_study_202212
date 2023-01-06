package J12_배열;

public class J12_Array2 {
	
	
	public static void printNames(String[] names) {
		
		for (int i = 0 ; i < names.length; i++) {
			System.out.println("이름: [" + (i + 1) + "]: " + names[i]);
		}
		
		System.out.println();
	}	
	
	
	
	public static void main(String[] args) {
		
		String[] names = new String[3]; //크기를 지정하는 곳은 여기 [3]
		
		names[0] = "강대협";
		names[1] = "임나영";
		names[2] = "김종환";
		//안의 개수를 보고 자바가 알아서 결정지어준다.
		String[] names2 = new String[] {"이상현", "손지호", "이강용"};//이 값자체가 배열이다.

		String[] names3 = {"김두영", "강대협", "이현수", "김두한","","","","","","","","","","",""}; // 선언일 때만 허용해서 이부분은 안된다.
		
		printNames(names);
		
		printNames(names2);
		printNames(new String[] {"이상현", "손지호", "이강용"});
		
		printNames(names3);
	
	}
}	
		
//		for (int i = 0 ; i < 3; i++) {
//			System.out.println("이름: [" + (i + 1) + "]: " + names[i]);
//		}
//		// 들어가있는 값이 정해져있지 않을때 
//		// 어떤 값이 들어가는 공간이 정해져있을때
//		
//		System.out.println();
//		
//		
//		for (int i = 0 ; i < 3; i++) {
//			System.out.println("이름: [" + (i + 1) + "]: " + names2[i]);		
//		}
//		//들어가야할 값이 정해져있을때 
//		//매개변수 차이
//		System.out.println();
//		
//		for (int i = 0 ; i < 3; i++) {
//			System.out.println("이름: [" + (i + 1) + "]: " + names3[i]);
//		}
//		//들어가야할 값이 정해져있을때
//		//매개변수 차이
//		System.out.println();
//	}
//
//}
