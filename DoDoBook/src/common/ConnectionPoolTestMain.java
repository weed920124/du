package common;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPoolTestMain {

	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionPool.getInstance().getConnection();
	}

}
