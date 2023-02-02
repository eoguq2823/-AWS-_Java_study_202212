package usermanagement.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDtl {

	private int roleDtlId;
	private int roleId;
	private int userId;
	
	//join을 위해 만들어둠
	private RoleMst roleMst;
}
