package book;

import java.sql.Date;

public class BookTestMain {
	public static void main(String[] args) throws Exception {
		BookService bookService = BookService.getBookService();
		
		System.out.println(bookService.book_search_name("a"));
		System.out.println("------------------------------------");
		System.out.println(bookService.book_search_writer("a"));
		//BookDao bookDao = BookDao.getBookDao();
		//System.out.println(bookDao.readByCode("a"));
		//bookDao.create(new Book("e", "a", 1, 1, "a", 1, 1, "a", "a", new Date(System.currentTimeMillis()), "a", "a", 1));
		//System.out.println(bookDao.readAll());
		//System.out.println("------------------------------------");
		//bookDao.deleteByNo("0");
		//bookDao.update(new Book("a", "aaa", 4, 4, "a", 1, 1, "a", "a", new Date(System.currentTimeMillis()), "a", "a", 1));
		//System.out.println(bookDao.readAll());
	}
}
