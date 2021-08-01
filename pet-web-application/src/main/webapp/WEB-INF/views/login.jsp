<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<body>
<form action="/login" method="post">
<p><font color ="red"> ${errorMsg} </font></p>
Enter your name : <input type="text" name="name"/> 
<br/>
<br/>
Enter your password : <input type="password" name="password"/> 
<br/>
<br/>
<input type="submit" value="login"/>

</form>
</body>
</html>