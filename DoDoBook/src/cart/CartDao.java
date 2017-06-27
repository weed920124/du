package cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import common.BasicDao;

public class CartDao extends BasicDao {
	private static CartDao _Instance = null;
	
	// 싱글톤 CartDao
	private CartDao() {	}
	
	public static CartDao getCartDao() {
		if(_Instance == null) 
			_Instance = new CartDao();
		return _Instance;
	}

	public int create(Cart cart) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int rowCount = 0;
		int seq_no = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(CartSQL.CART_CREATE);
			
			pstmt.setInt(1, cart.getCart_count());
			pstmt.setString(2, cart.getBook_code());
			pstmt.setInt(3, cart.getMember_no());
			
			rowCount = pstmt.executeUpdate();
			System.out.println(rowCount + "행이 삽입되었습니다");
			
			pstmt = con.prepareStatement(CartSQL.CART_SEQ);
			rs = pstmt.executeQuery();
			rs.next();
			seq_no = rs.getInt("cart_no");
		} finally {
			if(rs != null)
				rs.close();
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				releaseConnection(con);
		}
		return seq_no;
	}

	public Cart readByNo(int no) throws Exception {
		Cart readCart = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(CartSQL.CART_READBYNO);
			
			pstmt.setInt(1, no);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				readCart = new Cart(rs.getInt("cart_no"),
									rs.getInt("cart_count"),
									rs.getString("book_code"),
									rs.getInt("member_no"));
			}
		} finally {
			if(rs != null)
				rs.close();
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				releaseConnection(con);
		}
		return readCart;
	}
	
	public ArrayList<Cart> readAll() throws Exception {
		ArrayList<Cart> cartList = new ArrayList<>();
		Cart readCart = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(CartSQL.CART_READALL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				readCart = new Cart(rs.getInt("cart_no"),
								rs.getInt("cart_count"),
								rs.getString("book_code"),
								rs.getInt("member_no"));
				cartList.add(readCart);
			}
		} finally {
			if(rs != null)
				rs.close();
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				releaseConnection(con);
		}
		return cartList;
	}
	
	public int update(Cart cart) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(CartSQL.CART_UPDATE);
			pstmt.setInt(1, cart.getCart_count());
			pstmt.setInt(2, cart.getCart_no());
			
			rowCount = pstmt.executeUpdate();
			System.out.println(rowCount + "행이 수정되었습니다.");
		} finally {
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				releaseConnection(con);
		}
		return rowCount;
	}
	
	public int deleteByNo(int no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(CartSQL.CART_DELETEBYNO);
			pstmt.setInt(1, no);
			
			rowCount = pstmt.executeUpdate();
			System.out.println(rowCount + "행이 삭제되었습니다.");
		} finally {
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				releaseConnection(con);
		}
		return rowCount;
	}
	
	public ArrayList<HashMap<String, Object>> cartList() throws Exception {
		ArrayList<HashMap<String, Object>> cartList = new ArrayList<HashMap<String, Object>>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		con = getConnection();
		pstmt = con.prepareStatement(CartSQL.CART_SERVICE_READALL);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			HashMap<String, Object> rowMap = new HashMap<String, Object>();
			rowMap.put("cart_no", rs.getInt("cart_no"));
			rowMap.put("book_name", rs.getString("book_name"));
			rowMap.put("book_price", rs.getInt("book_price"));
			rowMap.put("cart_count", rs.getInt("cart_count"));
			rowMap.put("book_sum", rs.getInt("book_sum"));
			rowMap.put("delivery_fee", rs.getString("delivery_fee"));
			rowMap.put("book_point", rs.getInt("book_point"));
			
			cartList.add(rowMap);
		}
		
		if(rs != null)
			rs.close();
		if(pstmt != null)
			pstmt.close();
		if(con != null)
			releaseConnection(con);
		
		return cartList;
	}
}
