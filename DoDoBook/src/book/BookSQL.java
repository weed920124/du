package book;

public class BookSQL {
	public final static String BOOK_CREATE = "insert into book values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	public final static String BOOKREADBYCODE = "select * from book where book_code=?";
	public final static String BOOKREADBYNAME = "select * from book where book_name=?";
	public final static String BOOKREADBYWRITER = "select * from book where book_writer=?";
	public final static String BOOKREADALL = "select * from book";
	public final static String BOOKUPDATE = "update book set book_name=?, "
											+ "book_price=?, "
											+ "book_point=?, "
											+ "book_image=?, "
											+ "book_stock=?, "
											+ "book_page=?, "
											+ "book_writer=?, "
											+ "book_company=?, "
											+ "book_publish=?, "
											+ "book_desc=?, "
											+ "book_contents=?, "
											+ "book_salecount=? "
											+ "where book_code=?";
	public final static String BOOKDELETEBYCODE = "delete from book where book_code=?";
}
