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
<form action="updateduserdetails">
<h1>Update User details</h1>
<input type="number" value=<%=bankUserDetails.getUserid()%> name="id" placeholder="UserName" readonly="readonly">
<input type="text" value=<%=bankUserDetails.getName()%> name="name" placeholder="UserName">
<input type="text" value=<%=bankUserDetails.getEmailid()%>  name="emailid" placeholder="EmailId">
<input type="text" value=<%=bankUserDetails.getAadhaarnumber()%> name="aadhaarnumber" placeholder="AadhaarNumber">
<input type="tel" value=<%=bankUserDetails.getMobilenumber()%> name="mobilenumber" placeholder="MobileNumber">
<input type="text" name="gender" placeholder="Gender" value=<%=bankUserDetails.getGender() %>>
<input type="text" name="address" placeholder="Address" value=<%=bankUserDetails.getAddress()%>>
<input type="number" name="amount" placeholder="Amount" value=<%=bankUserDetails.getAmount() %>>
<input type="submit" value="UPDATE">
</form>
<!-- private Integer id;
	private String name;
	private String emailid;
	private Long aadhaarnumber;
	private Long mobilenumber;
	private String gender;
	private String address;
	private Double amount; -->
</body>
</html>