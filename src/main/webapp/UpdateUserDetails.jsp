<%@page import="com.bank.entity.BankUserDetails"%>
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

</style>
</head>
<body>
<%BankUserDetails bankUserDetails=(BankUserDetails)request.getAttribute("bankUserDetails"); %>
<form action="">
<h1>Update User details</h1>
<input type="text" value=<%=bankUserDetails.getName()%>>
<input type="text" value=<%=bankUserDetails.getEmailid()%>>
<input type="text" value=<%=bankUserDetails.getAadhaarnumber()%>>
<input type="text" value=<%=bankUserDetails.getMobilenumber()%>>
<input type="submit" value="UPDATE">
</form>
</body>
</html>