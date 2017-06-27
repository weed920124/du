<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="member_login_check.jspf"%>

    
    <%
    	/*
    	session.invalidate();
		이 세션을 무효로 해, 바인드 된 모든 객체의 바인드를 해제합니다.
		오류 :
		IllegalStateException -이 메소드가 벌써 무효가되어 불려 갔을 때에 불려 갔을 경우
		세션
    	*/
    	session.invalidate();
		response.sendRedirect("book_gridview.jsp");
    %>