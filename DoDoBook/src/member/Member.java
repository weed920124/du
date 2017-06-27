package member;

import java.sql.Date;

public class Member {

	//15개
	private int member_no;   
	private String member_id;
	private String member_password;
	private String member_question;
	private String member_answer;
	private String member_name;
	private int member_birthdayday;
	private String member_gender;
	private String member_email;
	private String member_zipcode;
	private String member_address1;
	private String member_address2;
	private String member_phone;
	private int member_point;
	private Date member_since;

	public Member() {
	} // 기본생성자

	public Member(int member_no, String member_id, String member_password, String member_question, String member_answer,
			String member_name, int member_birthday, String member_gender, String member_email, String member_zipcode,
			String member_address1, String member_address2, String member_phone, int member_point, Date member_since) {
		super();
		this.member_no = member_no;
		this.member_id = member_id;
		this.member_password = member_password;
		this.member_question = member_question;
		this.member_answer = member_answer;
		this.member_name = member_name;
		this.member_birthdayday = member_birthday;
		this.member_gender = member_gender;
		this.member_email = member_email;
		this.member_zipcode = member_zipcode;
		this.member_address1 = member_address1;
		this.member_address2 = member_address2;
		this.member_phone = member_phone;
		this.member_point = member_point;
		this.member_since = member_since;
	}

	/*
	 * Getter / Setter
	 */

	public int getMember_no() {
		return member_no;
	}

	public String getMember_answer() {
		return member_answer;
	}

	public void setMember_answer(String member_answer) {
		this.member_answer = member_answer;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_password() {
		return member_password;
	}

	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}

	public String getMember_question() {
		return member_question;
	}

	public void setMember_question(String member_question) {
		this.member_question = member_question;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public int getmember_birthday() {
		return member_birthdayday;
	}

	public void setmember_birthday(int member_birthday) {
		this.member_birthdayday = member_birthday;
	}

	public String getMember_gender() {
		return member_gender;
	}

	public void setMember_gender(String member_gender) {
		this.member_gender = member_gender;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_zipcode() {
		return member_zipcode;
	}

	public void setMember_zipcode(String member_zipcode) {
		this.member_zipcode = member_zipcode;
	}

	public String getMember_address1() {
		return member_address1;
	}

	public void setMember_address1(String member_address1) {
		this.member_address1 = member_address1;
	}

	public String getMember_address2() {
		return member_address2;
	}

	public void setMember_address2(String member_address2) {
		this.member_address2 = member_address2;
	}

	public String getMember_phone() {
		return member_phone;
	}

	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}

	public int getMember_point() {
		return member_point;
	}

	public void setMember_point(int member_point) {
		this.member_point = member_point;
	}

	public Date getMember_since() {
		return member_since;
	}

	public void setMember_since(Date member_since) {
		this.member_since = member_since;
	}

	public boolean isMatchPassword(String password){
		boolean isMatch=false;
		if(this.member_password.equals(password)){
			isMatch=true;
		}
		return isMatch;
	}
	
	
	
}
