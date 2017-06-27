package book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.BasicDao;

public class BookDao extends BasicDao {
	private static BookDao _Instance = null;

	// 싱글톤 BookDao
	private BookDao() {}

	public static BookDao getBookDao() {
		if (_Instance == null)
			_Instance = new BookDao();
		return _Instance;
	}
	
	public int create(Book book) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount;
		
		
		con = getConnection();
		pstmt = con.prepareStatement(BookSQL.BOOK_CREATE);
		
		pstmt.setString(1, book.getBook_code());
		pstmt.setString(2, book.getBook_name());
		pstmt.setInt(3, book.getBook_price());
		pstmt.setInt(4, book.getBook_point());
		pstmt.setString(5, book.getBook_image());
		pstmt.setInt(6, book.getBook_stock());
		pstmt.setInt(7, book.getBook_page());
		pstmt.setString(8, book.getBook_writer());
		pstmt.setString(9, book.getBook_company());
		pstmt.setDate(10, book.getBook_publish());
		pstmt.setString(11, book.getBook_desc());
		pstmt.setString(12, book.getBook_contents());
		pstmt.setInt(13, book.getBook_salecount());
		
		rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + "행이 추가되었습니다.");
		
		if(pstmt != null)
			pstmt.close();
		if(con != null)
			releaseConnection(con);
		
		return rowCount;
	}
	// 도서 코드로 검색
	public Book readByCode(String code) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Book readBook = null;
		con = getConnection();
		pstmt = con.prepareStatement(BookSQL.BOOKREADBYCODE);
		pstmt.setString(1, code);
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			readBook = new Book(rs.getString("book_code"), 
									 rs.getString("book_name"),
									 rs.getInt("book_price"),
									 rs.getInt("book_point"),
									 rs.getString("book_image"),
									 rs.getInt("book_stock"),
									 rs.getInt("book_page"),
									 rs.getString("book_writer"),
									 rs.getString("book_company"),
									 rs.getDate("book_publish"),
									 rs.getString("book_desc"),
									 rs.getString("book_contents"),
									 rs.getInt("book_salecount"));
		}
		
		if(rs != null)
			rs.close();
		if(pstmt != null)
			pstmt.close();
		if(con != null)
			releaseConnection(con);
		
		return readBook;
	}
	// 도서명으로 검색
	public ArrayList<Book> readByName(String name) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Book book = null;
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		con = getConnection();
		pstmt = con.prepareStatement(BookSQL.BOOKREADBYNAME);
		pstmt.setString(1, name);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			book = new Book(rs.getString("book_code"), 
					 rs.getString("book_name"),
					 rs.getInt("book_price"),
					 rs.getInt("book_point"),
					 rs.getString("book_image"),
					 rs.getInt("book_stock"),
					 rs.getInt("book_page"),
					 rs.getString("book_writer"),
					 rs.getString("book_company"),
					 rs.getDate("book_publish"),
					 rs.getString("book_desc"),
					 rs.getString("book_contents"),
					 rs.getInt("book_salecount"));
			bookList.add(book);
		}
		
		if(rs != null)
			rs.close();
		if(pstmt != null)
			pstmt.close();
		if(con != null)
			releaseConnection(con);
		
		return bookList;
	}
	// 도서 저자명으로 검색
	public ArrayList<Book> readByWriter(String writer) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Book book = null;
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		con = getConnection();
		pstmt = con.prepareStatement(BookSQL.BOOKREADBYWRITER);
		pstmt.setString(1, writer);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			book = new Book(rs.getString("book_code"), 
					 rs.getString("book_name"),
					 rs.getInt("book_price"),
					 rs.getInt("book_point"),
					 rs.getString("book_image"),
					 rs.getInt("book_stock"),
					 rs.getInt("book_page"),
					 rs.getString("book_writer"),
					 rs.getString("book_company"),
					 rs.getDate("book_publish"),
					 rs.getString("book_desc"),
					 rs.getString("book_contents"),
					 rs.getInt("book_salecount"));
			bookList.add(book);
		}
		
		if(rs != null)
			rs.close();
		if(pstmt != null)
			pstmt.close();
		if(con != null)
			releaseConnection(con);
		
		return bookList;
	}
	
	// 도서 기본 리스트 검색
	public ArrayList<Book> readAll() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Book book = null;
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		con = getConnection();
		pstmt = con.prepareStatement(BookSQL.BOOKREADALL);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			book = new Book(rs.getString("book_code"), 
					 rs.getString("book_name"),
					 rs.getInt("book_price"),
					 rs.getInt("book_point"),
					 rs.getString("book_image"),
					 rs.getInt("book_stock"),
					 rs.getInt("book_page"),
					 rs.getString("book_writer"),
					 rs.getString("book_company"),
					 rs.getDate("book_publish"),
					 rs.getString("book_desc"),
					 rs.getString("book_contents"),
					 rs.getInt("book_salecount"));
			bookList.add(book);
		}
		
		if(rs != null)
			rs.close();
		if(pstmt != null)
			pstmt.close();
		if(con != null)
			releaseConnection(con);
		
		return bookList;
	}
	
	public int update(Book book) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount;
		
		con = getConnection();
		pstmt = con.prepareStatement(BookSQL.BOOKUPDATE);
		pstmt.setString(1, book.getBook_name());
		pstmt.setInt(2, book.getBook_price());
		pstmt.setInt(3, book.getBook_point());
		pstmt.setString(4, book.getBook_image());
		pstmt.setInt(5, book.getBook_stock());
		pstmt.setInt(6, book.getBook_page());
		pstmt.setString(7, book.getBook_writer());
		pstmt.setString(8, book.getBook_company());
		pstmt.setDate(9, book.getBook_publish());
		pstmt.setString(10, book.getBook_desc());
		pstmt.setString(11, book.getBook_contents());
		pstmt.setInt(12, book.getBook_salecount());
		pstmt.setString(13, book.getBook_code());
		
		rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + "행이 수정되었습니다.");
		
		if(pstmt != null)
			pstmt.close();
		if(con != null)
			releaseConnection(con);
		
		return rowCount;
	}
	
	public int deleteByNo(String code) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount;
		
		con = getConnection();
		pstmt = con.prepareStatement(BookSQL.BOOKDELETEBYCODE);
		pstmt.setString(1, code);
		rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + "행이 삭제되었습니다.");
		
		if(pstmt != null)
			pstmt.close();
		if(con != null)
			releaseConnection(con);
		
		return rowCount;
	}
}
