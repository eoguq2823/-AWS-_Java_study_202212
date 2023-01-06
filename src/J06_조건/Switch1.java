package J06_조건;


public class Switch1 {
	public static void main(String[] args) {
		
		String select = "B선택";
		//셀렉트랑 동일한 값을 찾아간다.
		//프로그램은 위에서 아래로 
		//if문은 한길로 가면 그길로 밖에 못간다.
		//B를 선택하면 BCD다나온다.
		//B만 넣고 싶으면 그곳에 break;를 걸어라
		switch(select) {
			case "A선택":
				System.out.println("PC(A)를 연결합니다.");
				break;
			case "B선택":
				System.out.println("PC(B)를 연결합니다.");
				break;
			case "C선택":
				System.out.println("PC(C)를 연결합니다.");
				break;
			case "D선택":
				System.out.println("PC(D)를 연결합니다.");
		}
	} 
}
