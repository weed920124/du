package book;

import java.sql.Date;

public class Book {
	private String book_code;
	private String book_name;
	private int book_price;
	private int book_point;
	private String book_image;
	private int book_stock;
	private int book_page;
	private String book_writer;
	private String book_company;
	private Date book_publish;
	private String book_desc;
	private String book_contents;
	private int book_salecount;
	
	public Book() {	}

	public Book(String book_code, String book_name, int book_price, int book_point, String book_image, int book_stock,
			int book_page, String book_writer, String book_company, Date book_publish, String book_desc,
			String book_contents, int book_salecount) {
		super();
		this.book_code = book_code;
		this.book_name = book_name;
		this.book_price = book_price;
		this.book_point = book_point;
		this.book_image = book_image;
		this.book_stock = book_stock;
		this.book_page = book_page;
		this.book_writer = book_writer;
		this.book_company = book_company;
		this.book_publish = book_publish;
		this.book_desc = book_desc;
		this.book_contents = book_contents;
		this.book_salecount = book_salecount;
	}

	public String getBook_code() {
		return book_code;
	}

	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	public int getBook_point() {
		return book_point;
	}

	public void setBook_point(int book_point) {
		this.book_point = book_point;
	}

	public String getBook_image() {
		return book_image;
	}

	public void setBook_image(String book_image) {
		this.book_image = book_image;
	}

	public int getBook_stock() {
		return book_stock;
	}

	public void setBook_stock(int book_stock) {
		this.book_stock = book_stock;
	}

	public int getBook_page() {
		return book_page;
	}

	public void setBook_page(int book_page) {
		this.book_page = book_page;
	}

	public String getBook_writer() {
		return book_writer;
	}

	public void setBook_writer(String book_writer) {
		this.book_writer = book_writer;
	}

	public String getBook_company() {
		return book_company;
	}

	public void setBook_company(String book_company) {
		this.book_company = book_company;
	}

	public Date getBook_publish() {
		return book_publish;
	}

	public void setBook_publish(Date book_publish) {
		this.book_publish = book_publish;
	}

	public String getBook_desc() {
		return book_desc;
	}

	public void setBook_desc(String book_desc) {
		this.book_desc = book_desc;
	}

	public String getBook_contents() {
		return book_contents;
	}

	public void setBook_contents(String book_contents) {
		this.book_contents = book_contents;
	}

	public int getBook_salecount() {
		return book_salecount;
	}

	public void setBook_salecount(int book_salecount) {
		this.book_salecount = book_salecount;
	}
	
	@Override
	public String toString() {
		return book_code + "\t" +
				   book_name + "\t" + 
				   book_price + "\t" +
				   book_point + "\t" +
				   book_image + "\t" +
				   book_stock + "\t" +
				   book_page + "\t" +
				   book_writer + "\t" +
				   book_company + "\t" +
				   book_publish + "\t" +
				   book_desc + "\t" +
				   book_contents + "\t" +
				   book_salecount + "\n";
	}
}
