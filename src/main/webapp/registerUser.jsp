<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册用户</title>
</head>
<body>
<form action = "registerUser" method = "post">
	UserName:<input type = "text" name = "username">
	<br>
	Password:<input type = "text" name = "password">
	<br>
	Mobile:<input type = "text" name = "mobile">
	<br>
	email:<input type = "text" name = "email">
	<br>
	<input type = "submit" name = "Submit">
	<br>
	

</form>
${message}
</body>
</html>