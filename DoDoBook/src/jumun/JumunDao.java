package jumun;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import common.BasicDao;
import common.ConnectionPool;

public class JumunDao extends BasicDao{
	/*
	 * singleton
	 * 
	private static JumunDao _JumunDao;
	
	private JumunDao(){
	}
	
	public static JumunDao getJumunDao(){
		if(_JumunDao==null){
			_JumunDao = new JumunDao();
		}
		return _JumunDao;
	}
	 */
	
	// 주문정보 삽입
	public int create(Jumun jumun) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(JumunSQL.JUMUN_INSERT);
			pstmt.setDate(1, jumun.getJumun_date());
			pstmt.setString(2, jumun.getJumun_reciever());
			pstmt.setString(3, jumun.getJumun_zipcode());
			pstmt.setString(4, jumun.getJumun_address1());
			pstmt.setString(5, jumun.getJumun_address2());
			pstmt.setString(6, jumun.getJumun_phone());
			pstmt.setString(7, jumun.getJumun_state());
			pstmt.setInt(8, jumun.getMember_no());

			pstmt.executeUpdate();

			pstmt = con.prepareStatement("select jumun_no_seq.currval as jumun_no from dual");
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int jumun_no = rs.getInt("jumun_no");
			rs.close();
			return jumun_no;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				releaseConnection(con);
		}
	}

	// 주문정보 수정
	public int update(Jumun jumun) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String updateQuery = JumunSQL.JUMUN_UPDATEBYNO;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(updateQuery);
			pstmt.setDate(1, jumun.getJumun_date());
			pstmt.setString(2, jumun.getJumun_reciever());
			pstmt.setString(3, jumun.getJumun_zipcode());
			pstmt.setString(4, jumun.getJumun_address1());
			pstmt.setString(5, jumun.getJumun_address2());
			pstmt.setString(6, jumun.getJumun_phone());
			pstmt.setString(7, jumun.getJumun_state());
			pstmt.setInt(8, jumun.getMember_no());
			pstmt.setInt(9, jumun.getJumun_no());
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

	// 주문정보 삭제
	public int delete(int jumun_no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(JumunSQL.JUMUN_DELETEBYNO);
			pstmt.setInt(1, jumun_no);
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

	// 주문정보 1개 검색
	public Jumun read(int jumun_no) throws Exception {
		Jumun jumun = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(JumunSQL.JUMUN_SELECTBYNO);
			pstmt.setInt(1, jumun_no);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				jumun = new Jumun(
						rs.getInt("jumun_no"), 
						rs.getDate("jumun_date"), 
						rs.getString("jumun_reciever"),
						rs.getString("jumun_zipcode"), 
						rs.getString("jumun_address1"), 
						rs.getString("jumun_address2"),
						rs.getString("jumun_phone"), 
						rs.getString("jumun_state"), 
						rs.getInt("member_no"));
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
		return jumun;
	}

	// 모든주문정보 검색
	public ArrayList<Jumun> readAll() throws Exception {
		ArrayList<Jumun> jumunList = new ArrayList<Jumun>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(JumunSQL.JUMUN_SELECTALL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				jumunList.add(new Jumun(
						rs.getInt("jumun_no"), 
						rs.getDate("jumun_date"), 
						rs.getString("jumun_reciever"),
						rs.getString("jumun_zipcode"), 
						rs.getString("jumun_address1"), 
						rs.getString("jumun_address2"),
						rs.getString("jumun_phone"), 
						rs.getString("jumun_state"), 
						rs.getInt("member_no")));
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
		return jumunList;
	}
		
}
