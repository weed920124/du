package jumun;

import java.sql.Date;

public class Jumun {
	private int jumun_no;			//주문번호(PK)
	private Date jumun_date;		//주문일자
	private String jumun_reciever;	//수취인
	private String jumun_zipcode;	//배송지-우편번호
	private String jumun_address1;	//배송지-주소
	private String jumun_address2;	//배송지--상세주소
	private String jumun_phone;		//수취인전화번호
	private String jumun_state;		//배송상태
	private int member_no;			//회원번호(FK)
	
	public Jumun(){
		// TODO Auto-generated constructor stub
	}
	//생성자
	public Jumun(int jumun_no, Date jumun_date, String jumun_reciever, String jumun_zipcode, String jumun_address1,
			String jumun_address2, String jumun_phone, String jumun_state, int member_no) {
		this.jumun_no = jumun_no;
		this.jumun_date = jumun_date;
		this.jumun_reciever = jumun_reciever;
		this.jumun_zipcode = jumun_zipcode;
		this.jumun_address1 = jumun_address1;
		this.jumun_address2 = jumun_address2;
		this.jumun_phone = jumun_phone;
		this.jumun_state = jumun_state;
		this.member_no = member_no;
	}
	
	//setter and getter
	public int getJumun_no() {
		return jumun_no;
	}

	public void setJumun_no(int jumun_no) {
		this.jumun_no = jumun_no;
	}

	public Date getJumun_date() {
		return jumun_date;
	}

	public void setJumun_date(Date jumun_date) {
		this.jumun_date = jumun_date;
	}

	public String getJumun_reciever() {
		return jumun_reciever;
	}

	public void setJumun_reciever(String jumun_reciever) {
		this.jumun_reciever = jumun_reciever;
	}

	public String getJumun_zipcode() {
		return jumun_zipcode;
	}

	public void setJumun_zipcode(String jumun_zipcode) {
		this.jumun_zipcode = jumun_zipcode;
	}

	public String getJumun_address1() {
		return jumun_address1;
	}

	public void setJumun_address1(String jumun_address1) {
		this.jumun_address1 = jumun_address1;
	}

	public String getJumun_address2() {
		return jumun_address2;
	}

	public void setJumun_address2(String jumun_address2) {
		this.jumun_address2 = jumun_address2;
	}

	public String getJumun_phone() {
		return jumun_phone;
	}

	public void setJumun_phone(String jumun_phone) {
		this.jumun_phone = jumun_phone;
	}

	public String getJumun_state() {
		return jumun_state;
	}

	public void setJumun_state(String jumun_state) {
		this.jumun_state = jumun_state;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	
	
}


