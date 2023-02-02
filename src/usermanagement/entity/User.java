package usermanagement.entity;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {

	private int userId;
	private String username;
	private String password;
	private String name;
	private String email;
	
	private List<RoleDtl> roleDtls;
}
