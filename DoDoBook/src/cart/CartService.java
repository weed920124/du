package cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class CartService {
	private static CartService _Instance = null;
	private CartDao cartDao = null;
	
	// 싱글톤 서비스
	private CartService() {
		cartDao = CartDao.getCartDao();
	}
	
	public static CartService getCartService() {
		if(_Instance == null)
			_Instance = new CartService();
		return _Instance;
	}
	
	// 카트에 도서 추가
	public int cart_create(Cart cart) throws Exception {
		int result = cartDao.create(cart);
		return result;
	}
	
	// 카트목록의 도서 삭제
	public int cart_delete(int no) throws Exception {
		int result = cartDao.deleteByNo(no);
		return result;
	}
	
	// 카트의 도서 수량 조절
	public int cart_count_update(Cart cart) throws Exception {
		int result = cartDao.update(cart);
		// 수량 조절 -> update? create?
		return result;
	}
	
	// 카트 전체 조회
	public ArrayList<HashMap<String, Object>> cart_list() throws Exception {
		ArrayList<HashMap<String, Object>> cartListReadAll = cartDao.cartList();
		return cartListReadAll;
	}
}
