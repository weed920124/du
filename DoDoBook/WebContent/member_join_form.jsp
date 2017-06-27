<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>회원가입</title>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script type="text/javascript">

	function memberCreate() {
		if (document.f.m_id.value == "") {
			alert("사용자 아이디를 입력하십시요.");
			f.m_id.focus();
			return false;
		}
		if (document.f.m_pw.value == "") {
			alert("비밀번호를 입력하십시요.");
			f.m_pw.focus();
			return false;
		}
		 
		if (document.f.m_pass_question.value == "") {
			alert("비밀번호질문을 입력하십시요.");
			f.m_pass_question.focus();
			return false;
		}
		if (document.f.m_pass_answer.value == "") {
			alert("비밀번호답변을 입력하십시요.");
			f.m_pass_answer.focus();
			return false;
		}
		if (document.f.m_name.value == "") {
			alert("이름을 입력하십시요.");
			f.m_name.focus();
			return false;
		}
		if (document.f.m_zipcode.value == "") {
			alert("우편번호를 입력하십시요.");
			f.m_zipcode.focus();
			return false;
		}
		if (document.f.m_addr1.value == "") {
			alert("주소를 입력하십시요.");
			f.m_addr1.focus();
			return false;
		}
		if (document.f.m_addr2.value == "") {
			alert("상세주소를 입력하십시요.");
			f.m_addr2.focus();
			return false;
		}
		 
		if (document.f.m_phone.value == "") {
			alert("휴대전화를 입력하십시요.");
			f.m_phone.focus();
			return false;
		}
		if (document.f.m_email.value == "") {
			alert("이메일 주소를 입력하십시요.");
			f.m_email.focus();
			return false;
		}
		if (document.f.m_birth.value == "") {
			alert("생년월일을 입력하십시요.");
			f.m_birth.focus();
			return false;
		}
		if (document.f.m_gender.value == "") {
			alert("성별을 입력하십시요.");
			f.m_gender.focus();
			return false;
		}
		 
		document.f.action = "member_join_action.jsp";
		document.f.method = 'POST';
		document.f.submit();
	}
</script>
</head>
<body>
	<h1>회원가입작성란</h1>
	<form name="f" method="post">
		<table>

			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">아이디</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_id" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">비밀번호</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left">
					<input type="password" style="width: 150px" name="m_pw" value=""> 
					&nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>

			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">비밀번호 질문</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_pass_question" value=""> &nbsp;&nbsp; <font
					color="red"></font></td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">비밀번호 답변</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_pass_answer" value=""> &nbsp;&nbsp; <font
					color="red"></font></td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">이름</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_name" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">생년월일</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_birth" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">성별</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_gender" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">이메일</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_email" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">우편번호</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_zipcode" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">주소</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_addr1" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">상세주소</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_addr2" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>

			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">휴대전화</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_phone" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			

			
		</table>
		<table border=0 cellpadding=0 cellspacing=1>
			<tr>
				<td align=center><input type="button" value="완료"
					onclick="memberCreate();" /> &nbsp; <input type="button" value="취소"
					onClick="login();"></td>
			</tr>
		</table>
	</form>
</body>
</html>