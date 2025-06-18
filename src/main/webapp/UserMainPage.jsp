<%@page import="com.bank.entity.BankUserDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserMainPage</title>
<style type="text/css">
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    body {
        background-color: #f2f6fc;
        display: flex;
        flex-direction: column;
        height: 100vh;
    }

    header {
        background-color: #002b5c;
        color: white;
        padding: 20px;
        font-size: 24px;
        text-align: center;
    }

    .container {
        display: flex;
        flex: 1;
    }

    .sidebar {
        width: 220px;
        background-color: #1a3b6d;
        color: white;
        padding: 20px;
    }

    .sidebar h3 {
        margin-bottom: 20px;
    }

    .sidebar ul {
        list-style-type: none;
    }

    .sidebar ul li {
        margin: 12px 0;
        padding: 10px;
        background-color: #284b7b;
        border-radius: 6px;
        cursor: pointer;
        text-align: center;
    }

    .sidebar ul li:hover {
        background-color: #3e5f92;
    }

    .content {
        flex: 1;
        padding: 30px;
        background-color: #ffffff;
    }

    .profile-card {
        background-color: #e0ecff;
        border-left: 5px solid #002b5c;
        padding: 20px;
        border-radius: 8px;
        margin-bottom: 30px;
    }

    .profile-card h2 {
        margin-bottom: 15px;
    }

    .profile-card p {
        margin: 6px 0;
    }

    .quick-actions h3 {
        margin-bottom: 10px;
        border-bottom: 2px solid #002b5c;
        padding-bottom: 5px;
    }

    .quick-actions ul {
        list-style: disc;
        margin-left: 20px;
    }

</style>
</head>
<body>

<%
    BankUserDetails bankUserDetails = (BankUserDetails) request.getAttribute("loginedbankuserdetails");
%>

<header>
    Welcome, <%= bankUserDetails.getName() %>
</header>

<div class="container">
    <div class="sidebar">
        <h3>Menu</h3>
        <ul>
            <li>Dashboard</li>
            <li>Account Info</li>
            <li>Transactions</li>
            <li>Transfer Funds</li>
            <li>Update Profile</li>
            <li>Logout</li>
        </ul>
    </div>

    <div class="content">
        <div class="profile-card">
            <h2>User Profile</h2>
            <p><strong>ID:</strong> <%= bankUserDetails.getUserid() %></p>
            <p><strong>Name:</strong> <%= bankUserDetails.getName() %></p>
            <p><strong>Email ID:</strong> <%= bankUserDetails.getEmailid() %></p>
            <p><strong>Aadhaar Number:</strong> <%= bankUserDetails.getAadhaarnumber() %></p>
            <p><strong>Mobile Number:</strong> <%= bankUserDetails.getMobilenumber() %></p>
            <p><strong>Gender:</strong> <%= bankUserDetails.getGender() %></p>
            <p><strong>Address:</strong> <%= bankUserDetails.getAddress() %></p>
            <p><strong>Account Balance:</strong> ₹<%= bankUserDetails.getAmount() %></p>
        </div>

        <div class="quick-actions">
            <h3>Quick Actions</h3>
            <ul>
                <li>Check Balance</li>
                <li>Transfer Money</li>
                <li>Download Statement</li>
                <li>Change Password</li>
            </ul>
        </div>
    </div>
</div>

</body>
</html>
