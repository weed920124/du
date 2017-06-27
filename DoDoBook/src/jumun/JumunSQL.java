package jumun;

public class JumunSQL {
	// Jumun 클래스 SQL
	public final static String JUMUN_INSERT=
	"insert into jumun values(JUMUN_NO_SEQ.nextval,?,?,?,?,?,?,?,?)";
	public final static String JUMUN_DELETEBYNO=
	"delete from jumun where jumun_no=?";
	public final static String JUMUN_UPDATEBYNO=
	"update jumun set jumun_date=?,jumun_reciever=?,jumun_zipcode=?,jumun_address1=?,"
	+ "jumun_address2=?,jumun_phone=?,jumun_state=?,member_no=? where jumun_no=?";
	public final static String JUMUN_SELECTBYNO=
	"select * from jumun where jumun_no=?";
	public final static String JUMUN_SELECTALL=
	"select * from jumun";
	
	
	// Jumun_detail 클래스 SQL
	public final static String JUMUN_DETAIL_INSERT=
	"insert into jumun_detail values(JUMUN_DETAIL_NO_SEQ.nextval,?,?,?)";
	public final static String JUMUN_DETAIL_DELETEBYNO=
	"delete from jumun_detail where jumun_detail_no=?";
	public final static String JUMUN_DETAIL_UPDATEBYNO=
	"update jumun_detail set jumun_detail_count=?,jumun_no=?,book_code=? where jumun_detail_no=?";
	public final static String JUMUN_DETAIL_SELECTBYNO=
	"select * from jumun_detail where jumun_detail_no=?";
	public final static String JUMUN_DETAIL_SELECTALL=
	"select * from jumun_detail";
	
	// jumun, Jumun_detail, book Join
	public final static String JUMUN_DETAIL_BOOK_SELECTALL=
	"SELECT * FROM "
	+ "jumun_detail jd, jumun j, book b "
	+ "WHERE jd.jumun_no=j.jumun_no AND jd.book_code=b.book_code AND j.MEMBER_NO=? order by j.JUMUN_NO desc";
	

}
