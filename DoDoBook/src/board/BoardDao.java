package board;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.ConnectionPool;
import sun.nio.cs.ext.ISCII91;

public class BoardDao {
	/*
	 * create (새글작성)
	 */
	public int create(Board board) throws Exception {
		BoardSQL boardSQL = new BoardSQL();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		/*
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
	 * read (글읽기)
	 */
	public void read() {
			
		}
	
	/*
	 * update (글수정)
	 */
	public void update() {
		
	}
	
	/*
	 * delete (글삭제)
	 */
	public void delete() {
		
	}
}
