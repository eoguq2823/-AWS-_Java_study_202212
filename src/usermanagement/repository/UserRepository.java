package usermanagement.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import j23_database.DBConnectionMgr;
import usermanagement.entity.User;

/* userrepository의 다른말
 * UserDao 데이터에세스오브젝트 데이터에 접근하는 용도의 오브젝트(객체)
 */
/*===============<< 회원가입 >>=================*/

public class UserRepository { 

	//싱글톤
//	private static UserRepository instance;
//	
//	public static UserRepository getInsance() {
//		if(instance == null) {
//			instance = new UserRepository();
//		}
//		return instance;
//	}
//	private UserRepository() {
	
	private static UserRepository instance;
	
	public static UserRepository getInstance() {
		if(instance == null) {
			instance = new UserRepository();
		}
		return instance;
	}
	
	private DBConnectionMgr pool;
	
	private UserRepository() {
		pool = DBConnectionMgr.getInstance();
	}
	
	
	//회원가입 건수가 리턴되야하기때문에 int , 매개변수는 User user
	public int svaeUser(User user) {
		int succssCount = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;  
		try {
			con = pool.getConnection();
			String sql = "INSERT INTO user_mst VALUES(0, ?, ?, ? ,?)";
			pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, user.getUsername()); //유저객체에 있는 username을 가져옴
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
		
			succssCount = pstmt.executeUpdate();
			
			rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				user.setUserId(rs.getInt(1)); //getint 1번에 대입 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		
		
		return succssCount;
	}
	
	public int saveRoleDtl(RoleDtl roleDtl) {
		int successCount = 0;
		
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = pool.getConnection();
			sql = "INSERT INTO role_dtl VALUES (0, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  roleDtl.getRoleId());
			pstmt.setInt(2,  roleDtl.getUserId());
			
			successCount = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return successCount;
	}
	
	public User findUserByUsername(String username) {
		User user = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();
			String sql = "select\r\n"
					+ "	   um.user_id,\r\n"
					+ "    um.username,\r\n"
					+ "    um.password,\r\n"
					+ "    um.name,\r\n"
					+ "    um.email,\r\n"
					+ "    rd.role_dtl_id,\r\n"
					+ "    rd.role_id,\r\n"
					+ "    rd.user_id,\r\n"
					+ "    rm.role_id,\r\n"
					+ "    rm.role_name\r\n"
					+ "from\r\n"
					+ "	   user_mst um\r\n"
					+ "	   left outer join role_dtl rd on(rd.user_id = um.user_id)\r\n"
					+ "    left outer join role_mst rm on(rm.role_id = rd.role_id)\r\n"
					+ "where\r\n"
					+ "	   username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			
			rs = pstmt.executeQuery();
			
			List<RoleDtl> roleDtls = new ArrayList<>(); //dtl을 담을 리스트가 필요함
			
			int i = 0; //첫번째반복인지 두번째반복인지 알수있게 인덱스 생성
			while(rs.next()) {
				if(i == 0) {
				user = User.builder()
						.userId(rs.getInt(1))
						.username(rs.getString(2))
						.password(rs.getString(3))
						.name(rs.getString(4))
						.email(rs.getNString(5))
						.build();
				}	
				RoleMst roleMst = RoleMst.builder() //dtl안에있는 mst먼저 생성
						.roleId(rs.getInt(9))
						.roleName(rs.getString(10))
						.build();
				
				RoleDtl roleDtl = RoleDtl.builder() 
						.roleDtlId(rs.getInt(6))
						.roleId(rs.getInt(7))
						.userId(rs.getInt(8))
						.roleMst(roleMst) //생성한 mst를 9번자리에 넣어줘야함
						.build();
				
				roleDtls.add(roleDtl); //dtl를 매번 만들어줌
				
				i++;
			}
			if(user != null) {
				user.setRoleDtls(roleDtls);
			} // 완성된 권한을 roleDtls(user)에 넣어줌
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return user;
	}
	
	
	public User findUserByEmail(String email) {
		User user = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();
			String sql = "select\r\n"
					+ "	   um.user_id,\r\n"
					+ "    um.username,\r\n"
					+ "    um.password,\r\n"
					+ "    um.name,\r\n"
					+ "    um.email,\r\n"
					+ "    rd.role_dtl_id,\r\n"
					+ "    rd.role_id,\r\n"
					+ "    rd.user_id,\r\n"
					+ "    rm.role_id,\r\n"
					+ "    rm.role_name\r\n"
					+ "from\r\n"
					+ "	   user_mst um\r\n"
					+ "	   left outer join role_dtl rd on(rd.user_id = um.user_id)\r\n"
					+ "    left outer join role_mst rm on(rm.role_id = rd.role_id)\r\n"
					+ "where\r\n"
					+ "	   email = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, email);
			
			rs = pstmt.executeQuery();
			
			List<RoleDtl> roleDtls = new ArrayList<>();
			
			int i = 0;
			while(rs.next()) {
				if(i == 0) {
				user = User.builder()
						.userId(rs.getInt(1))
						.username(rs.getString(2))
						.password(rs.getString(3))
						.name(rs.getString(4))
						.email(rs.getNString(5))
						.build();
				}	
				RoleMst roleMst = RoleMst.builder()
						.roleId(rs.getInt(9))
						.roleName(rs.getString(10))
						.build();
				
				RoleDtl roleDtl = RoleDtl.builder() 
						.roleDtlId(rs.getInt(6))
						.roleId(rs.getInt(7))
						.userId(rs.getInt(8))
						.roleMst(roleMst)
						.build();
				
				roleDtls.add(roleDtl);
				
				i++;
			}
			if(user != null) {
				user.setRoleDtls(roleDtls);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return user;
	}
	
}
