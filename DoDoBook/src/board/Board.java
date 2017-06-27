package board;

import java.sql.Date;

public class Board {
	private int b_no; //게시물번호
	private String b_title; //게시물제목
	private String b_content; //게시물내용
	private String b_writer; //게시물작성자
	private Date b_date; //작성시간
	private int b_groupno; //그룹번호
	private int step; //스탭
	private int b_depth; //깊이
	private int b_inq_count; //조회수
	private String b_pass; //비밀번호
	private int m_no; //회원번호(FK)
	private int b_typeno; //게시판타입번호(FK)
	private int r_no; //댓글번호(FK)
	
	public Board() {	}

	public Board(int b_no, String b_title, String b_content, String b_writer, Date b_date, int b_groupno, int step,
			int b_depth, int b_inq_count, String b_pass, int m_no, int b_typeno, int r_no) {
		super();
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_writer = b_writer;
		this.b_date = b_date;
		this.b_groupno = b_groupno;
		this.step = step;
		this.b_depth = b_depth;
		this.b_inq_count = b_inq_count;
		this.b_pass = b_pass;
		this.m_no = m_no;
		this.b_typeno = b_typeno;
		this.r_no = r_no;
	}
	
	public Board(int b_no, String b_title, String b_content, String b_writer, int b_groupno, int step,
			int b_depth, int b_inq_count, String b_pass, int m_no, int b_typeno, int r_no) {
		super();
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_writer = b_writer;
		
		this.b_groupno = b_groupno;
		this.step = step;
		this.b_depth = b_depth;
		this.b_inq_count = b_inq_count;
		this.b_pass = b_pass;
		this.m_no = m_no;
		this.b_typeno = b_typeno;
		this.r_no = r_no;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_content() {
		return b_content;
	}

	public void setB_content(String b_content) {
		this.b_content = b_content;
	}

	public String getB_writer() {
		return b_writer;
	}

	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}

	public Date getB_date() {
		return b_date;
	}

	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}

	public int getB_groupno() {
		return b_groupno;
	}

	public void setB_groupno(int b_groupno) {
		this.b_groupno = b_groupno;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getB_depth() {
		return b_depth;
	}

	public void setB_depth(int b_depth) {
		this.b_depth = b_depth;
	}

	public int getB_inq_count() {
		return b_inq_count;
	}

	public void setB_inq_count(int b_inq_count) {
		this.b_inq_count = b_inq_count;
	}

	public String getB_pass() {
		return b_pass;
	}

	public void setB_pass(String b_pass) {
		this.b_pass = b_pass;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public int getB_typeno() {
		return b_typeno;
	}

	public void setB_typeno(int b_typeno) {
		this.b_typeno = b_typeno;
	}

	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	@Override
	public String toString() {
		return "Board [b_no=" + b_no + ", b_title=" + b_title + ", b_content=" + b_content + ", b_writer=" + b_writer
				+ ", b_date=" + b_date + ", b_groupno=" + b_groupno + ", step=" + step + ", b_depth=" + b_depth
				+ ", b_inq_count=" + b_inq_count + ", b_pass=" + b_pass + ", m_no=" + m_no + ", b_typeno=" + b_typeno
				+ ", r_no=" + r_no + "]";
	}
	
	
	
}
