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
		<li>상품명:<%= book.getBook_name() %></li>
		<li>가&nbsp;&nbsp;&nbsp;격:<%= book.getBook_price()%></li>
		<li>설&nbsp;&nbsp;&nbsp;명:<%= book.getBook_desc() %></li>
		<li>포인트:<%= book.getBook_point() %></li>
		<li>출판사:<%= book.getBook_company() %></li>
		<li>페이지:<%= book.getBook_page() %></li>
	</ol>

		<table>
			<tr>
				<td>수량</td>
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
				<input type="button" value="주문하기" onclick="jumun();"> &nbsp;
				<input type="button" value="장바구니" onclick="cart();"> &nbsp;</td>
			</tr>
		</table>
	</form>
	</div>
	</div>
</body>
</html>