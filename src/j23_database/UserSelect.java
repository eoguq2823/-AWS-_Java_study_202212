package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import usermanagement.entity.User;
//셀렉트
public class UserSelect {
	
	private DBConnectionMgr pool;
	
	public UserSelect() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//User을 찾았을때 유저가 나오고 아니면 null이 리턴되는 메소드 (자주사용함)
	//리턴은 entity에 들어있는 User 
	public User findUserByUsername(String username) { //username으로 유저를 찾아라 
		User user = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //결과를 담는 공간
		
		try {
			con = pool.getConnection(); //db와 연결 빨간줄뜨면 try catch해라
	
			String sql = "SELECT user_id, username, password, name, email FROM user_mst WHERE username = ?"; //쿼리문
			pstmt = con.prepareStatement(sql); 
			pstmt.setString(1,  username);
			
			rs = pstmt.executeQuery(); //executeQuery 가 resultset을 받기때문에 rs = 해줘야함
//			System.out.println(rs); //이 rs가 결과를 가져온다 실행하면 주소로 들고온다
			if(rs.next()) { //rs.next가 존재하면
// 				System.out.println(rs.getInt(1)); //user_id
// 				System.out.println(rs.getString(2)); // username
// 				System.out.println(rs.getString(3)); // password
// 				System.out.println(rs.getString(4)); // name
// 				System.out.println(rs.getString(5)); // email
				
				user = User.builder() //user 생성 
						.userId(rs.getInt(1))
						.username(rs.getString(2))
						.password(rs.getString(3))
						.name(rs.getString(4))
						.email(rs.getString(5))
						.build();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return user;
	
	}
	public static void main(String[] args) { //위에 만든유저를 활용
		//finduser호출 
		UserSelect userSelect = new UserSelect();
		//유저네임이 aaa인 녀석을 찾아라
		User user = userSelect.findUserByUsername("ccc"); //aaa하면 aaa유저 정보 가져옴  
		
		System.out.println(user);
	
	}
}
