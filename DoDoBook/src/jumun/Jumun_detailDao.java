package jumun;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import common.BasicDao;
import common.ConnectionPool;

public class Jumun_detailDao extends BasicDao{
	/*
	 * singleton
	 * 
	private static Jumun_detailDao _Jumun_detailDao;
	
	private Jumun_detailDao(){
	}
	
	public static Jumun_detailDao getJumun_detailDao(){
		if(_Jumun_detailDao==null){
			_Jumun_detailDao = new Jumun_detailDao();
		}
		return _Jumun_detailDao;
	}
	*/
	
	// 주문상세정보 삽입
	public int create(Jumun_detail jumun_detail) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(JumunSQL.JUMUN_DETAIL_INSERT);
			pstmt.setInt(1, jumun_detail.getJumun_detail_count());
			pstmt.setInt(2, jumun_detail.getJumun_no());
			pstmt.setString(3, jumun_detail.getBook_code());
			pstmt.executeUpdate();

			pstmt = con.prepareStatement("select JUMUN_DETAIL_NO_SEQ.currval as jumun_detail_no from dual");
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int jumun_detail_no = rs.getInt("jumun_detail_no");

			rs.close();
			return jumun_detail_no;
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				releaseConnection(con);
		}
	}
	
		// 주문상세정보 수정
	public int update(Jumun_detail jumun_detail) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(JumunSQL.JUMUN_DETAIL_UPDATEBYNO);
			pstmt.setInt(1, jumun_detail.getJumun_detail_count());
			pstmt.setInt(2, jumun_detail.getJumun_no());
			pstmt.setString(3, jumun_detail.getBook_code());
			pstmt.setInt(4, jumun_detail.getJumun_detail_no());
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
				
	// 주문상세정보 삭제
	public int delete(int jumun_detail_no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(JumunSQL.JUMUN_DETAIL_DELETEBYNO);
			pstmt.setInt(1, jumun_detail_no);
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
	
	// 주문상세정보 1개 검색
	public Jumun_detail read(int jumun_detail_no) throws Exception {
		Jumun_detail jumun_detail = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(JumunSQL.JUMUN_DETAIL_SELECTBYNO);
			pstmt.setInt(1, jumun_detail_no);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				jumun_detail = new Jumun_detail(
						rs.getInt("jumun_detail_no"), 
						rs.getInt("jumun_detail_count"), 
						rs.getInt("jumun_no"),
						rs.getString("book_code"));
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
		return jumun_detail;
	}

	// 모든주문상세정보 검색
	public ArrayList<Jumun_detail> readAll() throws Exception {
		ArrayList<Jumun_detail> jumun_detailList = new ArrayList<Jumun_detail>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(JumunSQL.JUMUN_DETAIL_SELECTALL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				jumun_detailList.add(new Jumun_detail(
						rs.getInt("jumun_detail_no"), 
						rs.getInt("jumun_detail_count"), 
						rs.getInt("jumun_no"),
						rs.getString("book_code")));
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
		return jumun_detailList;
	}
	
	// 회원번호에 맞는 주문내역검색
	public ArrayList<HashMap<String, Object>> readMemberJumunList(int member_no)
			throws ClassNotFoundException, SQLException, IOException, Exception {
		ArrayList<HashMap<String, Object>> memberJumunList = new ArrayList<HashMap<String, Object>>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPool.getInstance().getConnection();
			pstmt = con.prepareStatement(JumunSQL.JUMUN_DETAIL_BOOK_SELECTALL);
			pstmt.setInt(1, member_no);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				//주문
				int jumun_no = rs.getInt("jumun_no");
				Date jumun_date = rs.getDate("jumun_date");
				String jumun_reciever = rs.getString("jumun_reciever");
				String jumun_zipcode = rs.getString("jumun_zipcode");
				String jumun_address1 = rs.getString("jumun_address1");
				String jumun_address2 = rs.getString("jumun_address2");
				String jumun_phone = rs.getString("jumun_phone");
				String jumun_state = rs.getString("jumun_state");
				//주문상세
				int jumun_detail_no = rs.getInt("jumun_detail_no");
				int jumun_detail_count = rs.getInt("jumun_detail_count");
				//도서
				String book_code = rs.getString("book_code");
				String book_name = rs.getString("book_name");
				int book_price = rs.getInt("book_price");
				int book_point = rs.getInt("book_point");
				String book_image = rs.getString("book_image");

				HashMap<String, Object> rowMap = new HashMap<String, Object>();

				rowMap.put("jumun_no", jumun_no);
				rowMap.put("jumun_date", jumun_date);
				rowMap.put("jumun_reciever", jumun_reciever);
				rowMap.put("jumun_zipcode", jumun_zipcode);
				rowMap.put("jumun_address1", jumun_address1);
				rowMap.put("jumun_address2", jumun_address2);
				rowMap.put("jumun_phone", jumun_phone);
				rowMap.put("jumun_state", jumun_state);
				rowMap.put("jumun_detail_no", jumun_detail_no);
				rowMap.put("jumun_detail_count", jumun_detail_count);
				rowMap.put("book_code", book_code);
				rowMap.put("book_name", book_name);
				rowMap.put("book_price", book_price);
				rowMap.put("book_point", book_point);
				rowMap.put("book_image", book_image);

				memberJumunList.add(rowMap);
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
		return memberJumunList;
	}
}
