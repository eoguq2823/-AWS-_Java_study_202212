package j18_제네릭;

//풀네임 : Commit Message Response Data Transfer Object
//용도 : 클라이언트가 서버에게 요청을 날리면 동일한 형식으로 응답해주는 응답인터페이스
// 공통 응답객체
public class CMRespDto<T> {
	
	private int code;
	private String message;
	private T data;
//	private T[] data; 배열로도 사용가능
	
	public CMRespDto(int code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}


	@Override
	public String toString() {
		return "CMRespDto [code=" + code + ", message=" + message + ", data=" + data + "]";
	}
	
	
}

