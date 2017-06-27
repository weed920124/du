package board;

public class BoardSQL {
	
	/*
	 * createSQL
	 */
	public final static String createSQL = 
	"insert into board values"
	+ "(board_no_seq.nextval,?,?,?,sysdate,?,?,?,?,?,?,?,?)"; 
	
	/*
	 * readSQL
	 */
	public final static String readSQL = "select * from board where b_no=?";
	
	/*
	 * updateSQL
	 */
	public final static String updateSQL = "";
	
	/*
	 * deleteSQL
	 */
	public final static String deleteSQL = "";
}
