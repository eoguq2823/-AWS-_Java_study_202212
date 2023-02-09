package usermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class RequestDto<T> {
	
	private String resource;
	private T body;
	
}
