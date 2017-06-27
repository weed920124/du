package cart;

public class CartTestMain {
	public static void main(String[] args) throws Exception {
		CartDao cartDao = CartDao.getCartDao();
		CartService cartService = CartService.getCartService();
		//cartDao.create(new Cart(0, 3, "a", 2));
		//System.out.println(cartDao.readByNo(1));
		//System.out.println("------------------------------");
		System.out.println(cartDao.readAll());
		//System.out.println(cartService.cart_count_update(new Cart(1, 5, "a", 2)));
		System.out.println(cartService.cart_list());
		//cartDao.deleteByNo(0);
		//cartDao.update(new Cart(1, 3, "a", 2));
		//System.out.println(cartDao.readAll());
		
	}
}
