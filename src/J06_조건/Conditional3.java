package J06_조건;

import java.util.Scanner;
/*
 * 시험 성적을 학점으로 계산하는 프로그램
 * 
 * 정수자료형 score변수 선언
 * 88점으로 초기화
 * 
 * 문자자료형 grade변수 선언
 * 
 * 조건
 * score가 0점보다 작거나 100점보다 크면 계산불가를 출력
 * score가 90~100 =A , 80~89 = B, 70~79 = C, 60~69 = D, 60 > = F
 * + 학점 까지 추가
 */
public class Conditional3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		String grade = null;
		
		System.out.print("점수 입력: ");
		score = scanner.nextInt();
/*		
		if(score > 100 || score < 0) {
			System.out.println("계산실패");
			}  
		else  if(score > 89) {
				grade = "A";
			if(score % 10 > 4 || score == 100)
				grade = "+A";
			}
		else if(score > 79) {
				grade = "B";
		    if(score % 10 > 4)
		    	grade = "+B";
		    }
		else if(score > 69) {
			grade = "C";
	    	if(score % 10 > 4)
	    		grade = "+C";
	    	}
	    else if(score > 59) {
			grade = "D";
	    	if(score % 10 > 4)
	    		grade = "+D";
	    	}
	    else {
	    	grade = "F";
		}
	    if(grade !=null) {  // null에 빈값이 안들어가면
	    	System.out.println("점수(" + score + "): " + grade + "학점");
	    }
*/	    
	    if(score > 100 || score < 0) {
	    	grade = null;
			}  
	    else  if(score > 89) {
			grade = "A";
	    }else  if(score > 79) {
			grade = "B";
	    }else  if(score > 69) {
			grade = "C";
	    }else  if(score > 59) {
			grade = "D";
	    }else {
	    	grade = "F";
	    }
	    if ((score > 59 && score < 101) && (score % 10 > 4 || score == 100)) {
	    	grade += "+";
	    }
	    if (grade == null) {
	    	System.out.println("계산불가");
	    }else {
	    	System.out.println("점수(" + score + "): " + grade + "학점");
	    }
	} 
}
