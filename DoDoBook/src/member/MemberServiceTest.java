package member;

import java.sql.Date;

import common.MemberNotFoundException;
import common.PasswordMismatchException;

public class MemberServiceTest {

//	MemberDao memberDao =new MemberDao();
//	
	
	public static void main(String[] args) {

		MemberService memberService = new MemberService();
		
		
		Date date = new Date(System.currentTimeMillis());
		

		/*1. ȸ������ �׽�Ʈ */
		

		Member joinMember = new Member(
			0, "do", "zz", "zz", "��ũ", "�ο뼱", 9103, "��", "@naver", "405-11", "����", "����", "0107777", 0, date);

		
        try {
			memberService.joinDoDoBook(joinMember);
			
			
		} catch (Exception e1) {
			 
			e1.printStackTrace();
		}
		
		
		
		/*2. �α��� �׽�Ʈ */
	/*	try{
			
		 Member loginMember=memberService.login("do", "yyy");
	     
		 if(loginMember!=null){
			 System.out.println("�α��� ����");
		 }
		 
		 
		}catch(Exception e){
			
			e.printStackTrace();
		}*/
		//////////////////////
		
	}
	
	
}
