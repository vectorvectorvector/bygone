<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/singleupload" method="post" enctype="multipart/form-data">
	<label>用户名：</label><input type="text" name="username"/><br/>  
    <label>密 码：</label><input type="password" name="password"/><br/> 
		<input type="file" name="file">
		<br> 
		<input type="submit" value="submit">
	</form>
</body>
</html>