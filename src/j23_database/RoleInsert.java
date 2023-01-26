package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RoleInsert {

	private DBConnectionMgr pool;
	
	public RoleInsert() {
		pool = DBConnectionMgr.getInstance();  // 매번 사용하기 때문에 전역으로 뺌
//			   싱글톤(안에 Vector가 10개의 공간으로 만들어져 있다.)
	}
	
	public int saveRole(String roleName) {
		int successCount = 0;
		
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection(); 
			sql = "insert into role_mst values (0, ?)"; 
			pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, roleName); //1이 첫번째물음표
			 //완성된 커리가 pstmt안에있다.
			successCount = pstmt.executeUpdate(); 
			
			int newKey = 0;  
			
			rs = pstmt.getGeneratedKeys(); //pstmt가 모든 쿼리를 관리하고있음. 거기에 방금만든키를 넣고 rs에 
			if(rs.next()) {
				newKey = rs.getInt(1);
				
			}
			System.out.println(newKey != 0 ? "새로운 키 값: " + newKey : "키가 생성되지 않음");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			pool.freeConnection(con, pstmt, rs); //
		}
		
		return successCount;
	}
	
	public static void main(String[] args) {
		
		RoleInsert roleInsert = new RoleInsert();
		
		int successCount = roleInsert.saveRole("ROLE_TESTER");
		System.out.println("insert 성공 건수: " + successCount);
	}	
}
