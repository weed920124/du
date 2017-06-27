package member;

import java.io.IOException;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.BasicDao;
import common.ConnectionPool;

public class MemberDao extends BasicDao {

	/*
	 * dao 메서드 규칙
	 * 
	 * 1. create
	 * 
	 * 2. read
	 * 
	 * 3. update
	 * 
	 * 4. delete
	 */

	/*private static MemberDao _memberDao;

	private MemberDao() {
	}

	public static MemberDao getMemberDao() {
		if (_memberDao == null) {
			_memberDao = new MemberDao();
		}
		return _memberDao;
	}*/

	public int create(Member member) throws Exception {

		Connection con = null;
		PreparedStatement pstmt = null;
		int row;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(MemberSQL.createSQL);

			pstmt.setString(1, member.getMember_id());
			pstmt.setString(2, member.getMember_password());
			pstmt.setString(3, member.getMember_question());
			pstmt.setString(4, member.getMember_answer());
			pstmt.setString(5, member.getMember_name());
			pstmt.setInt(6, member.getmember_birthday());
			pstmt.setString(7, member.getMember_gender());
			pstmt.setString(8, member.getMember_email());
			pstmt.setString(9, member.getMember_zipcode());
			pstmt.setString(10, member.getMember_address1());
			pstmt.setString(11, member.getMember_address2());
			pstmt.setString(12, member.getMember_phone());
			pstmt.setInt(13, member.getMember_point());
			pstmt.setDate(14, member.getMember_since());

		    row = pstmt.executeUpdate();
	

		} finally {
			if (pstmt != null)  
				pstmt.close();
			if (con != null) {  
				releaseConnection(con);
			}
		}
		return row;
	} // create
	
	
	
	
		/**************** read  ***********************/
	
	public Member readbyNo(int no) throws Exception{
		
		Member member=null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try{
			con = getConnection();
			pstmt = con.prepareStatement(MemberSQL.readbyNoSQL);
			pstmt.setInt(1, no);
			rs= pstmt.executeQuery();
			
			if(rs.next()){
				member =new Member(
						rs.getInt("member_no"),
						rs.getString("member_id"),
						rs.getString("member_password"),
						rs.getString("member_question"),
						rs.getString("member_answer"),
						rs.getString("member_name"),
						rs.getInt("member_birthday"),
						rs.getString("member_gender"),
						rs.getString("member_email"),
						rs.getString("member_zipcode"),
						rs.getString("member_address1"),
						rs.getString("member_address2"),
						rs.getString("member_phone"),
						rs.getInt("member_point"),
						rs.getDate("member_since")
						
								
					);
						
			}
			
			
		}finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null) {
				releaseConnection(con);
			}
		}
		
		 
		return member;
	} // 
	
	
	public Member readbyId(String id) throws Exception {
		
		Member member=null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try{
			con = getConnection();
			pstmt = con.prepareStatement(MemberSQL.readbyIdSQL);
			pstmt.setString(1, id);
			rs= pstmt.executeQuery();
			
			if(rs.next()){
				member =new Member(
						rs.getInt("member_no"),
						rs.getString("member_id"),
						rs.getString("member_password"),
						rs.getString("member_question"),
						rs.getString("member_answer"),
						rs.getString("member_name"),
						rs.getInt("member_birthday"),
						rs.getString("member_gender"),
						rs.getString("member_email"),
						rs.getString("member_zipcode"),
						rs.getString("member_address1"),
						rs.getString("member_address2"),
						rs.getString("member_phone"),
						rs.getInt("member_point"),
						rs.getDate("member_since")
						
								
					);
						
			}
			
			
		}finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null) {
				releaseConnection(con);
			}
		}
		
		 
		return member;
	} // 
	
	
	public ArrayList<Member> readAll() throws Exception{
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			con = getConnection();
			pstmt = con.prepareStatement(MemberSQL.readAllSQL);
			rs = pstmt.executeQuery();

			while(rs.next()){
				memberList.add(
						
						new Member(
								rs.getInt("member_no"),
								rs.getString("member_id"),
								rs.getString("member_password"),
								rs.getString("member_question"),
								rs.getString("member_answer"),
								rs.getString("member_name"),
								rs.getInt("member_birth"),
								rs.getString("member_gender"),
								rs.getString("member_email"),
								rs.getString("member_zipcode"),
								rs.getString("member_address1"),
								rs.getString("member_address2"),
								rs.getString("member_phone"),
								rs.getInt("member_point"),
								rs.getDate("member_since")
								
								
								)
						);
					
			}
			
		}finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null) {
				releaseConnection(con);
			}
		}
		
		return memberList;
		
	}////
	
	
	/*delete */
	
	public int delete(int no) throws Exception {
		 
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();
			pstmt = con.prepareStatement(MemberSQL.deleteSQL);
			pstmt.setInt(1, no);
			int rows = pstmt.executeUpdate();
			return rows;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (con != null) {
				releaseConnection(con);
			}
		}
	}
	
	/*
	 *  update
	 */
	
	public int update(Member member) throws Exception {
		 
		Connection con = null;
		PreparedStatement pstmt = null;

		int rows=0;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(MemberSQL.updateSQL);

			pstmt.setString(1, member.getMember_id());
			pstmt.setString(2, member.getMember_password());
			pstmt.setString(3, member.getMember_question());
			pstmt.setString(4, member.getMember_answer());
			pstmt.setString(5, member.getMember_name());
			pstmt.setInt(6, member.getmember_birthday());
			pstmt.setString(7, member.getMember_gender());
			pstmt.setString(8, member.getMember_email());
			pstmt.setString(9, member.getMember_zipcode());
			pstmt.setString(10, member.getMember_address1());
			pstmt.setString(11, member.getMember_address2());
			pstmt.setString(12, member.getMember_phone());
			pstmt.setInt(13, member.getMember_point());
			pstmt.setDate(14, member.getMember_since());
			pstmt.setInt(15, member.getMember_no());
			
			rows = pstmt.executeUpdate();
			
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (con != null) {
				releaseConnection(con);
			}
		}
		
		return rows;
	}
	
	
	
	public boolean existedMember(String member_id) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
 		try {
			con = getConnection();
			pstmt = con.prepareStatement(MemberSQL.existedMemberSQL);
			pstmt.setString(1, member_id);
			rs = pstmt.executeQuery();
			int count = 0;
			if (rs.next()) {
				count = rs.getInt("cnt");
			}
			if (count == 1) {
				return true;
			} else {
				return false;
			}
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null) {
				releaseConnection(con);
			}
		}

	}
	
	
	
}