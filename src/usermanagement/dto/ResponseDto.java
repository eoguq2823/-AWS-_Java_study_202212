package usermanagement.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ResponseDto<T> {

	private String code;
	private T boby;
}
