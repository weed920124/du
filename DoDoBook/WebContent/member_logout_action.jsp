<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="member_login_check.jspf"%>

    
    <%
    	/*
    	session.invalidate();
		�� ������ ��ȿ�� ��, ���ε� �� ��� ��ü�� ���ε带 �����մϴ�.
		���� :
		IllegalStateException -�� �޼ҵ尡 ���� ��ȿ���Ǿ� �ҷ� ���� ���� �ҷ� ���� ���
		����
    	*/
    	session.invalidate();
		response.sendRedirect("book_gridview.jsp");
    %>