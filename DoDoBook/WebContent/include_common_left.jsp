<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>			
<%
	boolean isLogin = false;
	String sUserId = (String)session.getAttribute("sMemberid");
	if(sUserId == null) {
		
	}
%>
<p>
	<strong>�� ��</strong>
</p>
<ul>
		<%if(session.getAttribute("sMemberid") != null) { %> 
		<li>
			<a href=""><%=session.getAttribute("sMemberid") %>��</a>&nbsp;
			<a href="member_logout_action.jsp">�α׾ƿ�</a>
		</li>
		<% } else { %>
		<li><a href="member_login_form.jsp">�α���</a></li>
		<li><a href="member_join_form.jsp">ȸ������</a></li>
		<% } %>
</ul>