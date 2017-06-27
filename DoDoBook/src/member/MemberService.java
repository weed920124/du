package member;

import java.util.ArrayList;

import common.ExistedMemberException;
import common.MemberNotFoundException;
import common.PasswordMismatchException;

public class MemberService {

	MemberDao memberDao=new MemberDao();
	
	
	/*
	 *   1.ȸ������
	 */
	
	 	public int joinDoDoBook(Member member) throws Exception {
	 		
	 		/*
	 		 *  1-1) ���̵� ���翩�� Ȯ�� 
	 		 */
	 	
	 		if(memberDao.existedMember(member.getMember_id())){
	 			
	 			throw new ExistedMemberException(member.getMember_id()+"�� �����ϴ� ���̵��Դϴ�.");
	 		}
	 		
	 		/*
	 		 *  1-2) ȸ������
	 		 */
	 		 int result = memberDao.create(member);
	 		 return result;
	 	}
	
	
	 	/*
	 	 *  2.ȸ��Ż��
	 	 */
	 	
	 	
	 	public int removeMember(Member member) throws Exception{
	 		
	 		
	 		int res =memberDao.delete(member.getMember_no());
	 		
	 		return res;
	 	}
	 	
	 	
	
	/*
	 *  3.�α���
	 */
	
	 public Member login(String m_id, String m_pw) throws Exception{
		 
		 
		 /*
		  *  3-1) ���̵� ���� ����
		  */
		 
		Member readMember = memberDao.readbyId(m_id);
		if(readMember==null){
			throw new MemberNotFoundException(m_id + "�� �������� �ʴ� ���̵��Դϴ�.");
		}
		
		/*
		 *  3-2) �н����� ��ġ����
		 */
		if(!readMember.isMatchPassword(m_pw)){
			//�о����� ����ġ
			throw new PasswordMismatchException("�н����尡 ��ġ���� �ʽ��ϴ�.");
	
		}
			return readMember;
 	 
	 }
	 	
	
	 
	 
	
	/*
	 *  ȸ����ü���� 
	 */
	
		public ArrayList<Member> readMemberList() throws Exception {
			return memberDao.readAll();
		}
	 
	 
	/*
	 *  ȸ���Ѹ���
	 */
		public Member readOneMember(String m_id) throws Exception {
			Member member = memberDao.readbyId(m_id);
			return member;
		}
		
	
	
}
