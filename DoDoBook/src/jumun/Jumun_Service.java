package jumun;

import java.util.ArrayList;
import java.util.HashMap;

public class Jumun_Service {
	private static Jumun_Service _Instance;
	private JumunDao jumunDao = new JumunDao();
	private Jumun_detailDao jumun_detailDao = new Jumun_detailDao();
	
	/*
	 * �ֹ�����
	 */
	//�ֹ����� �߰�
	public int create(Jumun jumun) throws Exception{
		int result = jumunDao.create(jumun);
		return result;
	}
	//�ֹ����� ����
	public int update(Jumun jumun) throws Exception{
		int result = jumunDao.update(jumun);
		return result;
	}
	//�ֹ����� ����
	public int delete(int jumun_no) throws Exception{
		int result = jumunDao.delete(jumun_no);
		return result;
	}
	//�ֹ����� 1��Ȯ��
	public Jumun read(int jumun_no) throws Exception{
		return jumunDao.read(jumun_no);
	}
	//�ֹ����� ��üȮ��
	public ArrayList<Jumun> readAll() throws Exception{
		return jumunDao.readAll();
	}
	
	/*
	 * �ֹ���
	 */
	//�ֹ��󼼳��� �߰�
	public int create_D(Jumun_detail jumun_detail) throws Exception{
		int result = jumun_detailDao.create(jumun_detail);
		return result;
	}
	//�ֹ��󼼳��� ����
	public int update_D(Jumun_detail jumun_detail_no) throws Exception{
		int result = jumun_detailDao.update(jumun_detail_no);
		return result;
	}
	//�ֹ��󼼳��� ����
	public int delete_D(int jumun_detail_no) throws Exception{
		int result = jumun_detailDao.delete(jumun_detail_no);
		return result;
	}
	//�ֹ��󼼳��� 1��Ȯ��
	public Jumun_detail read_D(int jumun_detail_no) throws Exception{
		return jumun_detailDao.read(jumun_detail_no);
	}
	//�ֹ����� ��üȮ��
	public ArrayList<Jumun_detail> readAll_D() throws Exception{
		return jumun_detailDao.readAll();
	}
	
	/*
	 * ���1���� �ֹ�����Ȯ��
	 */
	public ArrayList<HashMap<String,Object>> readHistory(int member_no) throws Exception{
		return jumun_detailDao.readMemberJumunList(member_no);
	}
}
