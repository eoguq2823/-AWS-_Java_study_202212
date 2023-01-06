package J02_변수;

public class Variavble1 {

	public static void main(String[] args) {
		int num = 0; // 선언과 초기화를 동시에 명시
		int num2; //4byte의 메모리 공간을 할당할 것이고 그 공간의 이름을 num2라 하겠다! (선언)
		num2 = 10; //num2변수명을 가진 메모리 공간의 데이터를 비우고 10의 값을 대입하겠다. (초기화)
		//공간에 메모리 주소는 알수가없다.
		System.out.println(num+1); // 10, -10 가능
		System.out.println(num2);

	}

}
