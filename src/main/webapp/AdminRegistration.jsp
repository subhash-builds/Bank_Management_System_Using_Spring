<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

*{

	padding: 0px;
	margin: 0px;

}

body {
	width: 100vw;
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;	
	
}
form {
background-color:lightsalmon;
	display: flex;
	flex-direction: column;
	justify-content: center;align-items: center;
	border-radius: .5vw;
}
input {
    font-size:2vw;
	margin: 1vw;
	border: none;
	outline: none;
	padding: .3vw;
	border-radius: .2vw;
	
}
input::placeholder {
color: maroon;
	
}
span {
	color: red;
	position: absolute;
	bottom: 12vw;
	font-size: 2vw;
}
button {
	border: none;
	width:7vw;
	outline: none;
	color:white;
	margin: .5vw;
	font-size: 2vw;
	background-color: black;
	border-radius: .2vw;
}
</style>
</head>

<body>

	<form action="adminregrequest">
	<h2>Admin Registration</h2>
	<input type="text" placeholder="Admin Name" name="adminname">
	<input type="password" placeholder="Admin Password" name="adminpassword">
	<input type="text" placeholder="Admin Role" name="adminrole">
	<button type="submit">Submit</button>
	
	</form>
	
	<%String msg=(String)request.getAttribute("excMessage"); %>//reuest is httpServletRequest 
	<span><%=msg %></span>

</body>
</html>