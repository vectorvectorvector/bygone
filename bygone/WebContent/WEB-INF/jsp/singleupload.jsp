<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>bygone</title>
<style type="text/css">
<!--
.STYLE3 {
	font-size: 9pt
}
-->
</style>
</head>

<%  
	String basePath=(String)request.getAttribute("imagesPath");
	//String path = request.getContextPath();  
	//String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
	System.out.println("JSP显示文件保存的位置："+basePath);
	//request.setAttribute("basePath", basePath);  
%> 

<body>
	<img src="<%=basePath%>">  
	<center>
		<span class="STYLE3">用户注册</span>
	</center>
	<form action="regController.html" method="post">
		<table align="center">
			<tr>
				<td height="23"><span class="STYLE3">输入用户名：</span></td>
				<td height="23"><input name="name" type="text"></td>
			</tr>
			<tr>
				<td height="23"><span class="STYLE3">输入密码：</span></td>
				<td height="23"><input name="pwd" type="password"></td>
			</tr>
			<tr>
				<td height="23"><span class="STYLE3">确认密码：</span></td>
				<td height="23"><input name="pwd1" type="password"></td>
			</tr>
			<tr>
				<td height="23"><span class="STYLE3">电子邮箱：</span></td>
				<td height="23"><input name="mail" type="text"></td>
			</tr>
			<tr>
				<td height="23" colspan="2" align="center"><span class="STYLE3">
						<input type="submit" value="注册"> <input type="reset"
						value="重置">
				</span></td>
			</tr>
		</table>
	</form>
</body>
</html>
