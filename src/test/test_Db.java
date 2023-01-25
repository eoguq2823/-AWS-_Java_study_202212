package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import j23_database.DBConnectionMgr;

public class test_Db {

	private DBConnectionMgr pool; 
	//DB를 연결해주고 전역변수로 선언
	
	public RoleInsert() {
		pool = DBConnectionMgr.getInstance(); 
		//전역변수 초기화
	}
	
	public int saveRole() { 
		//int로 반환 
		int successCount = 0; 
		// 지역변수로 선언, 초기화 
		String sql = null; 
		//string자료형으로 sql 선언과 초기화
		Connection con = null; 
		//DBsql의 Connection 을 con으로 선언과 초기화\
		PreparedStatement pstmt = null; 
		//sql에있는 DBsql의 PreparedStatement을 가져와pstmt로  선언과 초기화 
		
		try { // try catch 문으로 예외처리
			con = pool.getConnection(); 
			// dbconnection의 객체에서 getConnection을 사용해서 con에 대입
			sql = "insert into role_mst values (0, ?)"; 
			//sql문으로 DB에 있는 role_mst테이블을 연결 0은 테이블에있는 
			// role_id를 ?는 role_name sql에 대입 
			// 그리고 무슨 자료형이 들어올지몰라 ?라 표시한다.
			pstmt.setString(1, roleName); 
			// pstmt객체를 무슨 set자료형으로 변환할지 결정한다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
