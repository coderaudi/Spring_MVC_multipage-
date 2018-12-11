<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact System </title>
</head>
<body>

<h1>Online ContactBOOK</h1>

<h3> User Signup </h3>

using Request param method ..

<form action="signup" method="post">
Name : <input type="text" name="name">
Email : <input type="text" name="email">
<input type="submit" value="Signup">
</form>

<pre>
	controller class code 
	
		@RequestMapping("/signup")
	public void signup(@RequestParam String name , String email) {
		System.out.println(name+email);
	}

</pre>

<hr>

sendig data to the pojo class form model .. set the data using  modelattribute
<form action="signupobj" method="post">
Name : <input type="text" name="name">
Email : <input type="text" name="email">
<input type="submit" value="Signup">

<pre>
	controller class code 
	
	@RequestMapping(value = "/signupobj", method = RequestMethod.POST) 
	 public void trySignUp(@ModelAttribute CS_UserPojo c1) 
	 { 
		System.out.println(c1.getEmail());
		System.out.println(c1.getName());
		
	 }

</pre>

<hr>

Send datat to new jsp page and disp on jsp page using modelandview ...

<br>
<form action="sendmv" method="post">
Name : <input type="text" name="name">
Email : <input type="text" name="email">
<input type="submit" value="Signup">
<pre>
controller code ..


</pre>
</body>
</html>