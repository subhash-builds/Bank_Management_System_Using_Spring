<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
*{
padding: 0px;
margin: 0px;

}

body{

width: 100vw;
height: 100vh;
display: flex;
justify-content: center;
align-items: center;
}
form{
width:30vw;
height:50vh;
display: flex;
flex-direction: column;
align-items:center;
border-radius:2vw;
background-color: lightpink;


}
input,button {
border: none;
outline: none;
margin-top: 1vw;
padding-left:.3vw; 
border-radius: .2vw;
font-size: 1.3vw;
}

button {
	
	width: 5vw;
	padding-left:0vw; 
	align-items: center;
}
span{
position: absolute;
bottom: 10vw;
color: red;
font-family: monospace;
font-size: 1.4vw;
}
</style>
<body>


<form action="bankaccountregistrationrequest">
<h1>Account Registration Form</h1>
<input type="text" name="name" placeholder="UserName">
<input type="email" name="emailid" placeholder="EmailId">
<input type="text" name="aadhaarnumber" placeholder="AadhaarNumber">
<input type="tel" name="mobilenumber" placeholder="MobileNumber">
<input type="text" name="gender" placeholder="Gender">
<!-- <textarea rows="3" cols="" type="text" name="address" placeholder="Address"></textarea> 
 -->
 <input type="text" name="address" placeholder="Address">
 <input type="text" name="amount" placeholder="Amount">

<button type="submit" >Submit</button>

</form>
<% String msg=(String)request.getAttribute("exceptionmessage"); %><!-- Get the object from HttpservletRequest   -->
<span><%=msg %></span>

</body>
</html>