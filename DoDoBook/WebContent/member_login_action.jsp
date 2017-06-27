<%@page import="common.PasswordMismatchException"%>
<%@page import="common.MemberNotFoundException"%>
<%@page import="member.Member"%>
<%@page import="member.MemberService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%
 
 
		 request.setCharacterEncoding("EUC-KR");
 		String m_id =	request.getParameter("m_id");
 		String m_pw =	request.getParameter("m_pw");
 		
 		
 		
 		MemberService memberService = new MemberService();
 		
 		//get 으로 들어올때 막는 거 나중에 추가
 		
 		
 		try{
 			Member loginMember=memberService.login(m_id, m_pw);
 			session.setAttribute("sMemberid", m_id);
 	    	session.setAttribute("sMember", loginMember);
 			response.sendRedirect("book_gridview.jsp");
 			
 		}catch(MemberNotFoundException e){
 			e.printStackTrace();
    		out.println("<script>");
    		out.println("alert('"+e.getMessage()+"')");
    		out.println("location.href='member_login_form.jsp';");
    		out.println("</script>");
 		}catch(PasswordMismatchException e){
 			e.printStackTrace();
    		out.println("<script>");
    		out.println("alert('"+e.getMessage()+"')");
    		out.println("location.href='member_login_form.jsp';");
    		out.println("</script>");
 		}catch(Exception e){
 			e.printStackTrace();
 			//error page 필요
 		}
 
 	 
 		
 		
 
 %>