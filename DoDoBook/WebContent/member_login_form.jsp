     
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content=s"text/html; charset=EUC-KR">
<link rel=stylesheet href="css/styles.css" type="text/css">
<link rel=stylesheet href="css/user.css" type="text/css">


<script type="text/javascript">


	 function memberJoin() {
		f.action = "member_join_form.jsp";
		f.submit(); 
	} 
	
	 
	function login() {
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
		

		f.action = "member_login_action.jsp";
		document.f.method = 'POST';
		f.submit();
	}
</script>



</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0
	marginwidth=0 marginheight=0>
	

				<table border=0 cellpadding=0 cellspacing=0>
					<tr>
						<td><br />
							<table style="padding-left: 10px" border=0 cellpadding=0
								cellspacing=0>
								<tr>
									<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>
											DoDoShop�α���</b></td>
								</tr>
							</table> <!-- login Form  -->
							<form name="f" method="post">
								<table border="0" cellpadding="0" cellspacing="1"
									bgcolor="BBBBBB">
									<tr>
										<td width=100 align=center bgcolor="E6ECDE" height="22">�����
											���̵�</td>
										<td width=490 align="left" bgcolor="ffffff"
											style="padding-left: 10px"><input type="text"
											style="width: 150" name="m_id" value="">&nbsp;&nbsp;<font color="red"></font></td>
									</tr>
									<tr>
										<td width=100 align=center bgcolor="E6ECDE" height="22">��й�ȣ</td>
										<td width=490 align="left" bgcolor="ffffff"
											style="padding-left: 10px"><input type="password"
											style="width: 150" name="m_pw" value="">&nbsp;&nbsp;<font color="red"></font></td>
									</tr>
								</table>
							</form> <br />
							<table border="0" cellpadding="0" cellspacing="1">
								<tr>
									<td align=center><input type="button" value="�α���"
										onClick="login();"> &nbsp; 
										<input type="button" value="ȸ������" onClick="memberJoin()"></td>
								</tr>
							</table></td>
					</tr>
				</table>

</body>
</html>