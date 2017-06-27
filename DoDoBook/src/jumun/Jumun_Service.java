package jumun;

import java.util.ArrayList;
import java.util.HashMap;

public class Jumun_Service {
	private static Jumun_Service _Instance;
	private JumunDao jumunDao = new JumunDao();
	private Jumun_detailDao jumun_detailDao = new Jumun_detailDao();
	
	/*
	 * 주문내역
	 */
	//주문내역 추가
	public int create(Jumun jumun) throws Exception{
		int result = jumunDao.create(jumun);
		return result;
	}
	//주문내역 수정
	public int update(Jumun jumun) throws Exception{
		int result = jumunDao.update(jumun);
		return result;
	}
	//주문내역 삭제
	public int delete(int jumun_no) throws Exception{
		int result = jumunDao.delete(jumun_no);
		return result;
	}
	//주문내역 1개확인
	public Jumun read(int jumun_no) throws Exception{
		return jumunDao.read(jumun_no);
	}
	//주문내역 전체확인
	public ArrayList<Jumun> readAll() throws Exception{
		return jumunDao.readAll();
	}
	
	/*
	 * 주문상세
	 */
	//주문상세내역 추가
	public int create_D(Jumun_detail jumun_detail) throws Exception{
		int result = jumun_detailDao.create(jumun_detail);
		return result;
	}
	//주문상세내역 수정
	public int update_D(Jumun_detail jumun_detail_no) throws Exception{
		int result = jumun_detailDao.update(jumun_detail_no);
		return result;
	}
	//주문상세내역 삭제
	public int delete_D(int jumun_detail_no) throws Exception{
		int result = jumun_detailDao.delete(jumun_detail_no);
		return result;
	}
	//주문상세내역 1개확인
	public Jumun_detail read_D(int jumun_detail_no) throws Exception{
		return jumun_detailDao.read(jumun_detail_no);
	}
	//주문내역 전체확인
	public ArrayList<Jumun_detail> readAll_D() throws Exception{
		return jumun_detailDao.readAll();
	}
	
	/*
	 * 멤버1개의 주문내역확인
	 */
	public ArrayList<HashMap<String,Object>> readHistory(int member_no) throws Exception{
		return jumun_detailDao.readMemberJumunList(member_no);
	}
}
