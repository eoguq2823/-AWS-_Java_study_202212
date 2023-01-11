package j02_변수;

public class Variavble2 {

	public static void main(String[] args) {
		char firstName1 = '대'; //챌터
		char firstName2 = '협'; // 뒤에 작은 따음표 문자열이 아니고 그냥 문자
		// 한글자 인 경우 '?' 로 표기 문자이기 때문에
		// char 에는 딱 한글자만 들어가야함
		char alphabetA = 'A';
		
		System.out.println("강" + firstName1 + firstName2);
		System.out.println("알파벳A" + alphabetA);
		
		System.out.println(alphabetA+1); //출력하면 A1 이아니라 66이 출력된다. 
		System.out.println(alphabetA); 
		System.out.println(alphabetA+'B'); // AB가 아닌 131 
		System.out.println("\uAC00"); // 유니코드 표기법
		System.out.println(firstName1+0); //'대'에 대한 유니코드값이 나옴
	}

}
