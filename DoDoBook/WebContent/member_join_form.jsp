<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ȸ������</title>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script type="text/javascript">

	function memberCreate() {
		if (document.f.m_id.value == "") {
			alert("����� ���̵� �Է��Ͻʽÿ�.");
			f.m_id.focus();
			return false;
		}
		if (document.f.m_pw.value == "") {
			alert("��й�ȣ�� �Է��Ͻʽÿ�.");
			f.m_pw.focus();
			return false;
		}
		 
		if (document.f.m_pass_question.value == "") {
			alert("��й�ȣ������ �Է��Ͻʽÿ�.");
			f.m_pass_question.focus();
			return false;
		}
		if (document.f.m_pass_answer.value == "") {
			alert("��й�ȣ�亯�� �Է��Ͻʽÿ�.");
			f.m_pass_answer.focus();
			return false;
		}
		if (document.f.m_name.value == "") {
			alert("�̸��� �Է��Ͻʽÿ�.");
			f.m_name.focus();
			return false;
		}
		if (document.f.m_zipcode.value == "") {
			alert("�����ȣ�� �Է��Ͻʽÿ�.");
			f.m_zipcode.focus();
			return false;
		}
		if (document.f.m_addr1.value == "") {
			alert("�ּҸ� �Է��Ͻʽÿ�.");
			f.m_addr1.focus();
			return false;
		}
		if (document.f.m_addr2.value == "") {
			alert("���ּҸ� �Է��Ͻʽÿ�.");
			f.m_addr2.focus();
			return false;
		}
		 
		if (document.f.m_phone.value == "") {
			alert("�޴���ȭ�� �Է��Ͻʽÿ�.");
			f.m_phone.focus();
			return false;
		}
		if (document.f.m_email.value == "") {
			alert("�̸��� �ּҸ� �Է��Ͻʽÿ�.");
			f.m_email.focus();
			return false;
		}
		if (document.f.m_birth.value == "") {
			alert("��������� �Է��Ͻʽÿ�.");
			f.m_birth.focus();
			return false;
		}
		if (document.f.m_gender.value == "") {
			alert("������ �Է��Ͻʽÿ�.");
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
	<h1>ȸ�������ۼ���</h1>
	<form name="f" method="post">
		<table>

			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">���̵�</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_id" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">��й�ȣ</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left">
					<input type="password" style="width: 150px" name="m_pw" value=""> 
					&nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>

			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">��й�ȣ ����</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_pass_question" value=""> &nbsp;&nbsp; <font
					color="red"></font></td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">��й�ȣ �亯</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_pass_answer" value=""> &nbsp;&nbsp; <font
					color="red"></font></td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">�̸�</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_name" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">�������</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_birth" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">����</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_gender" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">�̸���</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_email" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">�����ȣ</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_zipcode" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">�ּ�</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_addr1" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">���ּ�</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_addr2" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>

			<tr>
				<td width=100 align=center bgcolor="E6ECDE" height="22">�޴���ȭ</td>
				<td width=490 bgcolor="ffffff" style="padding-left: 10px"
					align="left"><input type="text" style="width: 150px"
					name="m_phone" value=""> &nbsp;&nbsp; <font color="red"></font>
				</td>
			</tr>
			

			
		</table>
		<table border=0 cellpadding=0 cellspacing=1>
			<tr>
				<td align=center><input type="button" value="�Ϸ�"
					onclick="memberCreate();" /> &nbsp; <input type="button" value="���"
					onClick="login();"></td>
			</tr>
		</table>
	</form>
</body>
</html>