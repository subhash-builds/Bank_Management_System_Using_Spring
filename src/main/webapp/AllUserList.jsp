<%@page import="com.bank.entity.BankUserDetails"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All User List</title>
<style>
* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body {
    width: 100vw;
    min-height: 100vh;
    background: linear-gradient(to right, #bdc3c7, #2c3e50);
    padding: 2vw;
    display: flex;
    flex-direction: column;
    align-items: center;
    color: #fff;
    animation: fadeIn 1s ease-in;
}

h1 {
    margin-bottom: 1vw;
    font-size: 2.5vw;
    color: #f1f1f1;
}

h2 {
    margin-bottom: 1vw;
    font-size: 1.5vw;
    color: #e1e1e1;
}

form {
    margin-bottom: 2vw;
    display: flex;
    align-items: center;
    gap: 1vw;
}

input[type="text"] {
    padding: 0.6vw 1vw;
    font-size: 1vw;
    border-radius: 0.5vw;
    border: none;
    width: 20vw;
}

input[type="submit"], button {
    padding: 0.5vw 1.2vw;
    font-size: 1vw;
    background-color: #27ae60;
    color: white;
    border: none;
    border-radius: 0.4vw;
    cursor: pointer;
    transition: background-color 0.3s ease, transform 0.2s ease;
}

input[type="submit"]:hover, button:hover {
    background-color: #1e8449;
    transform: scale(1.05);
}

table {
    width: 90%;
    border-collapse: collapse;
    background-color: white;
    color: #333;
    border-radius: 0.8vw;
    overflow: hidden;
    box-shadow: 0 0 20px rgba(0,0,0,0.2);
}

th, td {
    padding: 1vw;
    text-align: center;
    border-bottom: 1px solid #ccc;
}

th {
    background-color: #2c3e50;
    color: white;
    font-size: 1.1vw;
}

tr:nth-child(even) {
    background-color: #f2f2f2;
}

tr:hover {
    background-color: #e6f7ff;
    transition: background-color 0.3s ease;
}

@keyframes fadeIn {
    from { opacity: 0; transform: translateY(20px); }
    to   { opacity: 1; transform: translateY(0); }
}
#deletebutton{
background-color: red}
</style>
</head>
<body>

<h1>All User List</h1>

<% List<BankUserDetails> allUser = (List<BankUserDetails>) request.getAttribute("allUserList"); %>

<h2>Total User Count: <%= allUser.size() %></h2>

<form action="fileruserdetails">
    <input type="text" placeholder="Search By Name" name="username">
    <input type="submit" value="Search">
</form>

<table>
<tr>
    <th>User Name</th>
    <th>User Emailid</th>
    <th>User Phone Number</th>
    <th>User Aadhaar Number</th>
    <th>User Address</th>
    <th>User Gender</th>
    <th>Balance</th>
    <th>User Status</th>
    <th colspan="2">Operation</th>
</tr>

<% for(BankUserDetails bankUserDetails : allUser) { %>
<tr>
    <td><%= bankUserDetails.getName() %></td>
    <td><%= bankUserDetails.getEmailid() %></td>
    <td><%= bankUserDetails.getMobilenumber() %></td>
    <td><%= bankUserDetails.getAadhaarnumber() %></td>
    <td><%= bankUserDetails.getAddress() %></td>
    <td><%= bankUserDetails.getGender() %></td>
    <td><%= bankUserDetails.getAmount() %></td>
    <td><%= bankUserDetails.getUserstatus() %></td>
    <td>
        <form action="updateuserdetails">
            <input value="<%= bankUserDetails.getUserid() %>" hidden="true" name="userid">
            <button type="submit">Update</button>
        </form>
    </td>
    <td>
        <form action="deletetheuserdetails">
            <input value="<%= bankUserDetails.getUserid() %>" hidden="true" name="userid">
            <button type="submit" id="deletebutton">Delete</button>
        </form>
    </td>
</tr>
<% } %>
</table>

</body>
</html>
