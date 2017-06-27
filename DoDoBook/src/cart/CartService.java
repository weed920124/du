package cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class CartService {
	private static CartService _Instance = null;
	private CartDao cartDao = null;
	
	// �̱��� ����
	private CartService() {
		cartDao = CartDao.getCartDao();
	}
	
	public static CartService getCartService() {
		if(_Instance == null)
			_Instance = new CartService();
		return _Instance;
	}
	
	// īƮ�� ���� �߰�
	public int cart_create(Cart cart) throws Exception {
		int result = cartDao.create(cart);
		return result;
	}
	
	// īƮ����� ���� ����
	public int cart_delete(int no) throws Exception {
		int result = cartDao.deleteByNo(no);
		return result;
	}
	
	// īƮ�� ���� ���� ����
	public int cart_count_update(Cart cart) throws Exception {
		int result = cartDao.update(cart);
		// ���� ���� -> update? create?
		return result;
	}
	
	// īƮ ��ü ��ȸ
	public ArrayList<HashMap<String, Object>> cart_list() throws Exception {
		ArrayList<HashMap<String, Object>> cartListReadAll = cartDao.cartList();
		return cartListReadAll;
	}
}
