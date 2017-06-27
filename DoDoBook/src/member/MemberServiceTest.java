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
		

		/*1. 회원가입 테스트 */
		

		Member joinMember = new Member(
			0, "do", "zz", "zz", "핑크", "두용선", 9103, "남", "@naver", "405-11", "수원", "영통", "0107777", 0, date);

		
        try {
			memberService.joinDoDoBook(joinMember);
			
			
		} catch (Exception e1) {
			 
			e1.printStackTrace();
		}
		
		
		
		/*2. 로그인 테스트 */
	/*	try{
			
		 Member loginMember=memberService.login("do", "yyy");
	     
		 if(loginMember!=null){
			 System.out.println("로그인 성공");
		 }
		 
		 
		}catch(Exception e){
			
			e.printStackTrace();
		}*/
		//////////////////////
		
	}
	
	
}
