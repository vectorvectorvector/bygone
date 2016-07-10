<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>bygone</title>
</head>

<%  
	ArrayList imagelists=(ArrayList)request.getAttribute("imagesPathList");
%> 

<body>
	<%
		for(int i=0;i<imagelists.size();i++)
		{
	%>
		<img alt="" src="<%=imagelists.get(i)%>">
		<br/>
	<%
		}
	%>
</body>
</html>
