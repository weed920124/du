package member;

import java.sql.Date;

public class MemberDaoTest {

	public static void main(String[] args) {
		
		MemberDao memberDao = new MemberDao();
		
		Date date = new Date(System.currentTimeMillis());
		
		System.out.println(date);
		
	 	try {
		//	int result =memberDao.create(new Member(0, "dodo", "yy", "�뼱?", "��ũ", "�ο뼱", 9103, "��", "@naver", "405-11", "����", "����", "0107777", 0, date));
		//	System.out.println(result);
	 		 
		  int res =memberDao.update(
			new Member(2, "do", "yy", "�뼱?", "��ũ", "�ο뼱", 9103, "��", "@naver", "405-11", "����", "����", "0107777", 0, date));
		  System.out.println(res);
	 	} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	/*	
		try {
			Member member =memberDao.read(2);
			System.out.println(member);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	/*	try {
			memberDao.delete(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}
}
