package jumun;

public class Jumun_detail {
	private int jumun_detail_no;	//�ֹ��󼼹�ȣ(PK)
	private int jumun_detail_count;	//�������ż���
	private int jumun_no;			//�ֹ���ȣ(FK)
	private String book_code;			//�����ڵ�(FK)

	public Jumun_detail() {
		// TODO Auto-generated constructor stub
	}
	
	// ������
	public Jumun_detail(int jumun_detail_no, int jumun_detail_count, int jumun_no, String book_code) {
		super();
		this.jumun_detail_no = jumun_detail_no;
		this.jumun_detail_count = jumun_detail_count;
		this.jumun_no = jumun_no;
		this.book_code = book_code;
	}

	//setter and getter
	public int getJumun_detail_no() {
		return jumun_detail_no;
	}

	public void setJumun_detail_no(int jumun_detail_no) {
		this.jumun_detail_no = jumun_detail_no;
	}

	public int getJumun_detail_count() {
		return jumun_detail_count;
	}

	public void setJumun_detail_count(int jumun_detail_count) {
		this.jumun_detail_count = jumun_detail_count;
	}

	public int getJumun_no() {
		return jumun_no;
	}

	public void setJumun_no(int jumun_no) {
		this.jumun_no = jumun_no;
	}

	public String getBook_code() {
		return book_code;
	}

	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	
	
}
