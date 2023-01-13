package j18_제네릭;

public class Main2 {
	
//	<?> 와일드카드 = <Object> 같음
/* 
 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ? 와일드 카드 제약
 * extends 대상 객체 하위
 * super   대상 객체 상위
 */

	public CMRespDto<?> reponse(CMRespDto<?> cmRespDto) {
		System.out.println("[응답데이터]");
		System.out.println(cmRespDto);
		return cmRespDto;
	}
	
	public static void main(String[] args) {
		Main2 main = new Main2();
		
		CMRespDto<String> hello 
			= new CMRespDto<String>(200, "성공", "안녕하세요");
		
		CMRespDto<Integer> score
			= new CMRespDto<Integer>(200, "성공", 85);
		
		
	
		System.out.println("hello");
		System.out.println(main.reponse(hello));

		System.out.println("score");
		System.out.println(main.reponse(score));
	}	//안녕하세요.


}
