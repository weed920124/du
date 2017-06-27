<%@page import="book.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="book.BookService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	BookService bookService = BookService.getBookService();
	ArrayList<Book> bookList = bookService.book_list();
	int count = 0;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="include_common_left.jsp"></jsp:include>

		<table border="1" width="300px" height="450px" align="center">
			<tr>
				<%
					for (Book book : bookList) {
				%>
				<td style="text-align: center"><a
					href='book_detail.jsp?code=<%=book.getBook_code()%>'> 
					<img src='<%=book.getBook_image()%>' width="200" height="200"><br />
						<%=book.getBook_name()%></a><br /> <%=book.getBook_price()%>원</td>
				<%
					count++;
						if (count % 3 == 0) {
				%>
			</tr>
			<tr>
				<%
					}
					}
				%>
			</tr>
		</table>
</body>
</html>