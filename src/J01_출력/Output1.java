package J01_출력;

public class Output1 {

	public static void main(String[] args) { //메인이 시작점이되고 실행
		System.out.print("이름:");
		System.out.println("강대협");
		System.out.print("나이:");
		System.out.println(27); //글자(문자)는 ""안에 넣어야함/ 27 =숫자 "27"문자에서의27
		System.out.println("27"+1); //271 문자열에다 +어떤값을 넣든 문자열로 바뀐다.
		System.out.println(27+1); //28
		System.out.println("이름:" + "강대협");
	}

}
