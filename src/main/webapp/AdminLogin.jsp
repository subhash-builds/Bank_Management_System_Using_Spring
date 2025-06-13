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
body{
width:100vw;
height:100vh;
display: flex;
justify-content: center;
align-items: center;
background-color: #FFE4E1;
}
form {
display: flex;
flex-direction: column;
	justify-content: center;
	align-items: center;
	background-color: #F0FFF0;
}
input,button {
	margin: 1vw;
	border: none;
	outline: none;
	background-color: lightgreen;
}
input::placeholder{
	color: brown;
	text-align: center;
}
</style>
</head>
<body>

<form action="loginreq">
<h2>Admin Logic</h2>
<input type="number" placeholder="Admin id" name="adminid">
<button type="submit">Submit</button>

</form>
<%String execmessage=(String)request.getAttribute("idExce"); %>
<span><%=execmessage%></span>
</body>
</html>