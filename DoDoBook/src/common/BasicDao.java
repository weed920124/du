package common;
import java.sql.Connection;
/*
 * 모든 DAO 객체가 가져야 하는 공통 기능을 가진 dao의 최상위클래스
 */
public class BasicDao {
	/*
	 * db로 부터 Connection 얻기, 반납 메소드
	 */
	public Connection getConnection() throws Exception{
		return ConnectionPool.getInstance().getConnection();
	}
	
	public void releaseConnection(Connection con) throws Exception{
		ConnectionPool.getInstance().releaseConnection(con);
	}
}
