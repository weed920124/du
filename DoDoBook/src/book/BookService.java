package book;

import java.util.ArrayList;

import cart.CartDao;

public class BookService {
	private static BookService _Instance = null;
	private BookDao bookDao = null;
	
	// 싱글톤 BookService
	private BookService() {	
		bookDao = BookDao.getBookDao();
	}
	
	public static BookService getBookService() {
		if(_Instance == null) {
			_Instance = new BookService();
		}
		return _Instance;
	}
	
	// 도서 추가
	public int book_create(Book book) throws Exception {
		int result = bookDao.create(book);
		return result;
	}
	// 도서 삭제
	public int book_delete(String code) throws Exception {
		int result = bookDao.deleteByNo(code);
		return result;
	}
	// 도서 수정
	public int book_update(Book book) throws Exception {
		int result = bookDao.update(book);
		return result;
	}
	// 도서 기본 상세보기
	public Book book_detail_read(String code) throws Exception {
		Book detail_book = bookDao.readByCode(code);
		return detail_book;
	}
	// 도서 기본 리스트보기
	public ArrayList<Book> book_list() throws Exception {
		ArrayList<Book> bookList = bookDao.readAll();
		return bookList;
	}
	// 도서명으로 검색 리스트
	public ArrayList<Book> book_search_name(String name) throws Exception {
		ArrayList<Book> bookSearchName = bookDao.readByName(name);
		return bookSearchName;
	}
	// 저자명으로 검색 리스트
	public ArrayList<Book> book_search_writer(String writer) throws Exception {
		ArrayList<Book> bookSearchWriter = bookDao.readByWriter(writer);
		return bookSearchWriter;
	}
}
