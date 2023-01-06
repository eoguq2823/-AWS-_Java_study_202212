package J03_형변환.copy;

public class Casting2 {

	public static void main(String[] args) {
		char char_a ='a';
		int num = char_a;
		//원래형태로 적으면 int num = (int) char_a;
		//char 에서 int 로변환한것이니깐 업캐스팅 (자동으로 변환하기때문에 명시X (묵시적 형변환))
		
//	    char char_b = num + 1; 형변환 X
//		char char_b = (char) num;
		/* 다운 캐스팅일때는 무조건 뭘로 변환할것인지 명시해야함
		 * 넓은곳에서 좁은곳으로 가는것은 (명시적 형변환) 
		 * 형변환이 +보다 우선순위가 높다.
		 */
		char char_b = (char) (num+1); //숫자부터 계산할수 있게 괄호
		System.out.println('a'+1);
		System.out.println(char_b);
	
		
	}

}
