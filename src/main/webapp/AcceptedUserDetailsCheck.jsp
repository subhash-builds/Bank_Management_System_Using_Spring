<%@page import="com.bank.entity.BankUserDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Dashboard</title>
<style type="text/css">
* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body {
    width: 100vw;
    height: 100vh;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 2vw;
    background: linear-gradient(to right, #6dd5fa, #2980b9);
    animation: fadeIn 1.5s ease-in;
    padding: 2vw;
}

/* Shared card style */
.div {
    width: 30vw;
    min-height: fit-content;
    padding: 2vw;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: flex-start;
    border-radius: 1.5vw;
    box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
    transition: transform 0.3s ease, box-shadow 0.3s ease;
    animation: slideUp 1.2s ease;
}

/* Hover animation */
.div:hover {
    transform: translateY(-5px);
    box-shadow: 0 0 25px rgba(0, 0, 0, 0.3);
}

/* Personal Info */
#personalinfo {
    background: linear-gradient(145deg, #1e3c72, #2a5298);
    color: #fff;
}

/* Admin Choice */
#adminchoice {
    background: linear-gradient(to bottom right, #ffafbd, #ffc3a0);
    text-align: center;
    align-items: center;
}

#adminchoice h2,
#adminchoice p {
    color: #333;
}

input[type="submit"] {
    margin-top: 1.5vw;
    padding: 0.8vw 2vw;
    font-size: 1.2vw;
    border: none;
    border-radius: 0.5vw;
    background-color: #d7263d;
    color: white;
    cursor: pointer;
    transition: background-color 0.3s ease, transform 0.2s ease;
}

input[type="submit"]:hover {
    background-color: #a31327;
    transform: scale(1.05);
}

/* Animations */
@keyframes fadeIn {
    from { opacity: 0; }
    to   { opacity: 1; }
}

@keyframes slideUp {
    from {
        transform: translateY(30px);
        opacity: 0;
    }
    to {
        transform: translateY(0);
        opacity: 1;
    }
}

p {
    font-size: 1.1vw;
    margin: 0.5vw 0;
}
</style>
</head>
<body>
<% BankUserDetails bankUserDetails = (BankUserDetails) request.getAttribute("acceptedbankuserdetails"); %>

<div id="personalinfo" class="div">
    <h2>Personal Information</h2>
    <p><strong>ID:</strong> <%= bankUserDetails.getUserid() %></p>
    <p><strong>Name:</strong> <%= bankUserDetails.getName() %></p>
    <p><strong>Email ID:</strong> <%= bankUserDetails.getEmailid() %></p>
    <p><strong>Aadhaar Number:</strong> <%= bankUserDetails.getAadhaarnumber() %></p>
    <p><strong>Mobile Number:</strong> <%= bankUserDetails.getMobilenumber() %></p>
    <p><strong>Gender:</strong> <%= bankUserDetails.getGender() %></p>
    <p><strong>Address:</strong> <%= bankUserDetails.getAddress() %></p>
    <p><strong>Account Balance:</strong> ₹<%= bankUserDetails.getAmount() %></p>
</div>

<div id="adminchoice" class="div">
    <form action="getpendinguserdetails">
        <h2>Account Management</h2>
        <p>View all pending account requests and verification</p>
        <input type="submit" value="View All Pending Details">
    </form>
</div>

</body>
</html>
