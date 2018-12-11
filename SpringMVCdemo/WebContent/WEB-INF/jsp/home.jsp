<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Home page one</h1>


<form action="testdemo" method="get">
<input type="text" name="name">
<input type="submit">
</form>


<h3>Test ModelAndView .. form  send obj tojsp and sip info</h3>


<form action="mvform" method="post">
Name : <input type="text" name="name"> <br>
Email : <input type="text" name="email"> <br>
Mobile : <input type="tel" name="mobile"> <br>

State : <input type="text" name="userAddress.state"> <br>
city : <input type="text" name="userAddress.city"> <br>
pin : <input type="text" name="userAddress.pin">
<input type="submit" value="signup ">

</form>

</body>
</html>