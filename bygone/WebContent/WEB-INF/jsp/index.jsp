<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello...............
	<!-- <form action="http://localhost:8080/bygone/upload" method="post" enctype="multipart/form-data">
          <input type="file" name="file"><br>
          <input type="submit" value="submit">
      </form> -->


	<form action="http://localhost:8080/bygone/singleupload" method="post"
		enctype="multipart/form-data">
		<label>用户名：</label><input type="text" name="username" /><br /> <label>密
			码：</label><input type="password" name="password" /><br /> <input type="file"
			name="file"> <br> <input type="submit" value="submit">
	</form>
</body>
</html>