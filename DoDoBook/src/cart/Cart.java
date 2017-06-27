package cart;

public class Cart {
	private int cart_no;		// 카트번호
	private int cart_count;		// 수량
	private String book_code;	// 도서번호(FK)
	private int member_no;		// 회원번호(FK)
	
	public Cart() {	}
	
	public Cart(int cart_no, int cart_count, String book_code, int member_no) {
		super();
		this.cart_no = cart_no;
		this.cart_count = cart_count;
		this.book_code = book_code;
		this.member_no = member_no;
	}

	public int getCart_no() {
		return cart_no;
	}
	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}
	public int getCart_count() {
		return cart_count;
	}
	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	
	@Override
	public String toString() {
		return cart_no + "\t" + cart_count + "\t" + book_code + "\t" + member_no + "\n";
	}
}
