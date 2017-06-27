package member;

import java.util.ArrayList;

import common.ExistedMemberException;
import common.MemberNotFoundException;
import common.PasswordMismatchException;

public class MemberService {

	MemberDao memberDao=new MemberDao();
	
	
	/*
	 *   1.회원가입
	 */
	
	 	public int joinDoDoBook(Member member) throws Exception {
	 		
	 		/*
	 		 *  1-1) 아이디 존재여부 확인 
	 		 */
	 	
	 		if(memberDao.existedMember(member.getMember_id())){
	 			
	 			throw new ExistedMemberException(member.getMember_id()+"는 존재하는 아이디입니다.");
	 		}
	 		
	 		/*
	 		 *  1-2) 회원가입
	 		 */
	 		 int result = memberDao.create(member);
	 		 return result;
	 	}
	
	
	 	/*
	 	 *  2.회원탈퇴
	 	 */
	 	
	 	
	 	public int removeMember(Member member) throws Exception{
	 		
	 		
	 		int res =memberDao.delete(member.getMember_no());
	 		
	 		return res;
	 	}
	 	
	 	
	
	/*
	 *  3.로그인
	 */
	
	 public Member login(String m_id, String m_pw) throws Exception{
		 
		 
		 /*
		  *  3-1) 아이디 존재 여부
		  */
		 
		Member readMember = memberDao.readbyId(m_id);
		if(readMember==null){
			throw new MemberNotFoundException(m_id + "는 존재하지 않는 아이디입니다.");
		}
		
		/*
		 *  3-2) 패스워드 일치여부
		 */
		if(!readMember.isMatchPassword(m_pw)){
			//패쓰워드 불일치
			throw new PasswordMismatchException("패스워드가 일치하지 않습니다.");
	
		}
			return readMember;
 	 
	 }
	 	
	
	 
	 
	
	/*
	 *  회원전체보기 
	 */
	
		public ArrayList<Member> readMemberList() throws Exception {
			return memberDao.readAll();
		}
	 
	 
	/*
	 *  회원한명보기
	 */
		public Member readOneMember(String m_id) throws Exception {
			Member member = memberDao.readbyId(m_id);
			return member;
		}
		
	
	
}
