<%@page import="book.Book"%>
<%@page import="book.BookService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file = "member_login_check.jspf" %>
<% 
	String code = request.getParameter("code");
	BookService bookService = BookService.getBookService();
	Book book = bookService.book_detail_read(code);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div id="container">
		<div id="wrapper">
		<form name="f" >
	<h2 style='text-align:center'><%= book.getBook_name()%></h2>
	<hr />
	<img src='<%= book.getBook_image()%>' width="300" height="300">
	<ol>
		<li>��ǰ��:<%= book.getBook_name() %></li>
		<li>��&nbsp;&nbsp;&nbsp;��:<%= book.getBook_price()%></li>
		<li>��&nbsp;&nbsp;&nbsp;��:<%= book.getBook_desc() %></li>
		<li>����Ʈ:<%= book.getBook_point() %></li>
		<li>���ǻ�:<%= book.getBook_company() %></li>
		<li>������:<%= book.getBook_page() %></li>
	</ol>

		<table>
			<tr>
				<td>����</td>
				<td>
					<table>
						<tr>
							<td>
							<input type='text' name='count' value='1' size='3'
								readonly>
							<td>
							<td><img src='image/btn_up.gif' onclick='change(1);'><br>
								<img src='image/btn_down.gif' onclick='change(-1);'></td>
						</tr>
					</table>

				</td>
			</tr>
		</table>
		<table border=0 cellpadding=0 cellspacing=1>
			<tr>
				<td align=center>
				<input type="hidden" value=<%= book.getBook_code() %> name='book_code'>
				<input type="hidden" value=1 name='jumun_no'>
				<input type="button" value="�ֹ��ϱ�" onclick="jumun();"> &nbsp;
				<input type="button" value="��ٱ���" onclick="cart();"> &nbsp;</td>
			</tr>
		</table>
	</form>
	</div>
	</div>
</body>
</html>