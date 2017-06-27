package member;

public class MemberSQL {

	/*
	 
이름              널?       유형            
--------------- -------- ------------- 
MEMBER_NO       NOT NULL NUMBER(10)    
MEMBER_ID       NOT NULL VARCHAR2(20)  
MEMBER_PASSWORD NOT NULL VARCHAR2(20)  
MEMBER_QUESTION NOT NULL VARCHAR2(50)  
MEMBER_ANSWER   NOT NULL VARCHAR2(50)  
MEMBER_NAME     NOT NULL VARCHAR2(20)  
MEMBER_BIRTHDAY NOT NULL NUMBER(10)    
MEMBER_GENDER   NOT NULL VARCHAR2(10)  
MEMBER_EMAIL    NOT NULL VARCHAR2(50)  
MEMBER_ZIPCODE  NOT NULL VARCHAR2(10)  
MEMBER_ADDRESS1 NOT NULL VARCHAR2(100) 
MEMBER_ADDRESS2 NOT NULL VARCHAR2(30)  
MEMBER_PHONE    NOT NULL VARCHAR2(20)  
MEMBER_POINT    NOT NULL NUMBER(10)    
MEMBER_SINCE    NOT NULL DATE      
	 */
	
	
	/*
	 *  insert
	 */
	public final static String createSQL=
			"insert into member values (MEMBER_NO_SEQ.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	
	/*
	 * read
	 */
	
	public final static String readbyNoSQL=
			"select * from member where member_no=?";
	
	public final static String readbyIdSQL=
			"select * from member where member_id=?";
	
	public final static String readAllSQL=
			"select * from member";
	
	
  /*
   *  delete
   *  
   */
	public final static String deleteSQL=
			"delete member where member_no=?";
	
	
	/*
	 * update
	 */
	public final static String updateSQL=
			"update member set "
			+ "member_id=?,"
	 		+ "member_password = ?,"
			+ "member_question = ?,"
			+ "member_answer = ?,"
			+ "member_name = ?,"
			+ "member_birthday = ?,"
			+ "member_gender = ?,"
			+ "member_email = ?,"
			+ "member_zipcode = ?,"
			+ "member_address1 = ?,"
			+ "member_address2 = ?,"
			+ "member_phone = ?, "
			+ "member_point = ?, "
			+ "member_since = ?"
			+ "where member_no=?";
			 
    /*
     * existedMember
     */
    public final static String existedMemberSQL 
    = "select count(*) cnt from member" 
    + " where member_id=?";
 
			 
}
