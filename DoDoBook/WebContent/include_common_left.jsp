<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>			
<%
	boolean isLogin = false;
	String sUserId = (String)session.getAttribute("sMemberid");
	if(sUserId == null) {
		
	}
%>
<p>
	<strong>메 뉴</strong>
</p>
<ul>
		<%if(session.getAttribute("sMemberid") != null) { %> 
		<li>
			<a href=""><%=session.getAttribute("sMemberid") %>님</a>&nbsp;
			<a href="member_logout_action.jsp">로그아웃</a>
		</li>
		<% } else { %>
		<li><a href="member_login_form.jsp">로그인</a></li>
		<li><a href="member_join_form.jsp">회원가입</a></li>
		<% } %>
</ul>