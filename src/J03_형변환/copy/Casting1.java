package J03_형변환.copy;

public class Casting1 {

	public static void main(String[] args) {
		char a = 'a';
		int num1 = a;
		//문자를 숫자로 바꾼것 출력시 문자a가아니라 숫자a(97)이 나온다.
		System.out.println(num1);
		
		char b = 'b';
		int num2 = b;
		
		System.out.println((int) b);
		//형변환 코드 ((int) 바꾸고싶은자료형);
		
		char c = 'c';
		int num3 = c;
		
		System.out.println((double) c);
		System.out.println((char) 99.0);
		System.out.println((byte) 300);
	}

}
