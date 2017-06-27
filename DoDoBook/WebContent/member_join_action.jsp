<%@page import="common.ExistedMemberException"%>
<%@page import="member.MemberService"%>
<%@page import="member.Member"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");

	String m_id = request.getParameter("m_id");
	String m_pw = request.getParameter("m_pw");
	String m_pass_question = request.getParameter("m_pass_question");
	String m_pass_answer = request.getParameter("m_pass_answer");
	String m_name = request.getParameter("m_name");
	String m_zipcode = request.getParameter("m_zipcode");
	String m_addr1 = request.getParameter("m_addr1");
	String m_addr2 = request.getParameter("m_addr2");
	String m_phone = request.getParameter("m_phone");
	String m_email = request.getParameter("m_email");
	String m_birth = request.getParameter("m_birth");
	String m_gender = request.getParameter("m_gender");
	
	int m_intBirth = Integer.parseInt(m_birth);
	
	Date date = new Date(System.currentTimeMillis());
	
	Member member = 
	new Member(0,m_id,m_pw,m_pass_question,m_pass_answer,m_name,m_intBirth,m_gender,m_email,m_zipcode,m_addr1,m_addr2,m_phone,0,date);
	
	MemberService memberService = new MemberService();
	
	
	try{
	int res = memberService.joinDoDoBook(member);
	
	String str ="회원가입성공";
	
	out.println("<script>");
	out.println("alert('"+str+"')");
	out.println("</script>");
	
	response.sendRedirect("member_login_form.jsp");
	
	
	}catch(ExistedMemberException e){
		
		e.printStackTrace();
		out.println("<script>");
		out.println("alert('"+e.getMessage()+"')");
		out.println("location.href='member_join_form.jsp';");
		out.println("</script>");
		
		
	}catch(Exception e){
		
		//error페이지 생성
	}
	
	
	
	
	
	
%>