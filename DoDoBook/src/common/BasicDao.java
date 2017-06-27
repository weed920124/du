package common;
import java.sql.Connection;
/*
 * ��� DAO ��ü�� ������ �ϴ� ���� ����� ���� dao�� �ֻ���Ŭ����
 */
public class BasicDao {
	/*
	 * db�� ���� Connection ���, �ݳ� �޼ҵ�
	 */
	public Connection getConnection() throws Exception{
		return ConnectionPool.getInstance().getConnection();
	}
	
	public void releaseConnection(Connection con) throws Exception{
		ConnectionPool.getInstance().releaseConnection(con);
	}
}
