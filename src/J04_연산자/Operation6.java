package J04_연산자;

public class Operation6 {
	public static void main(String[] args) {
		/*
		 * 시험 성적을 학점으로 계산하는 프로그램
		 * 
		 * 정수자료형 score변수 선언
		 * 88점으로 초기화
		 * 
		 * 문자자료형 grade변수 선언
		 * 
		 * 조건
		 * score가 0점보다 작거나 100점보다 크면 X를 출력
		 * score가 90~100 =A , 80~89 = B, 70~79 = C, 60~69 = D, 60 > = F
		 * 
		 */
		
		int score = 50;		

/*		char grade = score < 0 ? 'X' 
 * 				: score < 60 ? 'F' 
				: score < 70 ? 'D' 
				: score < 80 ? 'C'  
				: score < 90 ? 'B' 
				: score > 100 ? 'X' : 'A';					
				
				: score < 101 ? 'A' : 'X';
*/		
		char grade = score > 100 || score < 0 ?  'X'
				: score > 89 ? 'A' 
				: score > 79 ? 'B' 
				: score > 69 ? 'C' 
				: score > 59 ? 'D' : 'F';
//				: score > -1 ? 'F' : 'X';
// 				: score < 0 ? 'X' : 'F';		
				
		char gradeP = score > 100 ? '\0'  
				: score > 94 ? '+'
				: score > 84 ? '+'
				: score > 74 ? '+'					
				: score > 64 ? '+' : '\0';
// 		char plue = score > 100 || score < 60 ? '\0 : score % 10 > 4 :: score == 100? '+' : '\0';
		System.out.println("점수(" + score + ") = "  + gradeP + grade + "학점");
	}
}
