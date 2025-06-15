<%@page import="com.bank.entity.BankUserDetails"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
width: 100vw;
height: 100vh;
display: flex;
flex-direction:column;
justify-content: center;
align-items: center;
background-;
}
body,th,td,table{
border: 1px solid red;
border-collapse: collapse;
}
</style>
</head>
<body>
<h1>All User List</h1>
<%List<BankUserDetails> allUser=(List<BankUserDetails>)request.getAttribute("allUserList"); %>
<h2>Total User Count:<%=allUser.size() %></h2>
<table>

<tr><th>User Name</th>
<th>User Emailid</th>
<th>User Phone Number</th>
<th>User Aadhaar Number</th>
<th>User Address</th>
<th>User Gender</th>
<th colspan="2">Operation</th>
</tr>
<%for(BankUserDetails bankUserDetails:allUser){ %>
<tr><td><%=bankUserDetails.getName() %></td>
<td><%=bankUserDetails.getEmailid() %></td>
<td><%=bankUserDetails.getMobilenumber() %></td>
<td><%=bankUserDetails.getAadhaarnumber() %></td>
<td><%=bankUserDetails.getAddress() %></td>
<td><%=bankUserDetails.getGender() %></td>
<td><form action="updateuserdetails">
<input value=<%=bankUserDetails.getUserid() %> hidden="true" name="userid">
<button type="submit">Update</button>
</form>

</td>

<td>
<form action="deletethedetails">
<input value=<%=bankUserDetails.getUserid() %> hidden="true" name="userid">
<button type="submit">Delete</button>
</form>
</td>
</tr>

<%} %>
</table>
<!-- <%String mess=(String)request.getAttribute("deleteresp"); %>
<span><%=mess %></span> -->
</body>
</html>