package cart;

public class CartSQL {
	// CartDao
	public final static String CART_CREATE = "insert into cart values(cart_no_seq.nextval, ?, ?, ?)";
	public final static String CART_READBYNO = "select * from cart where cart_no=?";
	public final static String CART_READALL = "select * from cart";
	public final static String CART_UPDATE = "update cart set cart_count=? where cart_no=?";
	public final static String CART_DELETEBYNO = "delete from cart where cart_no=?";
	public final static String CART_SEQ = "select cart_no_seq.nextval as cart_no from cart";
	
	// CartService
	public final static String CART_SERVICE_READALL = "select cart_no, book_name, book_price, cart_count, cart_count*book_price as book_sum, "
			+ "case when book_price >= 10000 then '¹«·á' else '2500¿ø' end delivery_fee, book_point "
			+ "from book b, cart c " + "where b.book_code = c.book_code";
}
