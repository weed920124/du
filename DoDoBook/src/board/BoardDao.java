package board;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.ConnectionPool;
import sun.nio.cs.ext.ISCII91;

public class BoardDao {
	/*
	 * create (�����ۼ�)
	 */
	public int create(Board board) throws Exception {
		BoardSQL boardSQL = new BoardSQL();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		/*
		private int b_no; //�Խù���ȣ
		
		private String b_title; //�Խù�����
		private String b_content; //�Խù�����
		private String b_writer; //�Խù��ۼ���
		private Date b_date; //�ۼ��ð�
		private int b_groupno; //�׷��ȣ
		private int step; //����
		private int b_depth; //����
		private int b_inq_count; //��ȸ��
		private String b_pass; //��й�ȣ
		private int m_no; //ȸ����ȣ(FK)
		private int b_typeno; //�Խ���Ÿ�Թ�ȣ(FK)
		private int r_no; //��۹�ȣ(FK)
		 */
		
		try {
		con = ConnectionPool.getInstance().getConnection();
		pstmt = con.prepareStatement(boardSQL.createSQL);
		pstmt.setString(1, board.getB_title());
		pstmt.setString(2, board.getB_content());
		pstmt.setString(3, board.getB_writer());
		pstmt.setInt(4, board.getB_groupno());
		pstmt.setInt(5, board.getStep());
		pstmt.setInt(6, board.getB_depth());
		pstmt.setInt(7, board.getB_inq_count());
		pstmt.setString(8, board.getB_pass());
		pstmt.setInt(9, board.getM_no());
		pstmt.setInt(10, board.getB_typeno());
		pstmt.setInt(12, board.getR_no());
		int row = pstmt.executeUpdate();
		
		return row;
		} catch (Exception e) {
			// TODO: handle exception			
			e.printStackTrace();
		}  finally {
			if (con != null) {
				ConnectionPool.getInstance().releaseConnection(con);
			}
		}
		return 0;
		
		
		
		
	}
	
	/*
	 * read (���б�)
	 */
	public void read() {
			
		}
	
	/*
	 * update (�ۼ���)
	 */
	public void update() {
		
	}
	
	/*
	 * delete (�ۻ���)
	 */
	public void delete() {
		
	}
}
