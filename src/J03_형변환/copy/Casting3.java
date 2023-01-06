package J03_형변환.copy;

public class Casting3 {

	public static void main(String[] args) {
		double kor = 87.5;
		double eng = 95.7;
		double math = 80.5;
		
		int total = 0;
		double avg = 0;
//		total = (int) kor + eng + math; X (263)
//		totla = (int) (kor + eng + math); X (263)
//		total = (int) kor + (int) eng + (int) math; // ○ (262)
		
		total = (int) kor + (int) eng + (int) math; // ○ (262)
		
//		avg = (double) total / 3; ㅇ 

//		double avg = (double) total / 3; ㅇ 
//		avg = total / 3.0; //자료형이 다르면 연산 불가능  
		
		avg = total / 3.0; 
		System.out.println("합계:" + total);
		System.out.println("평균:" + avg);
	}
	

}
