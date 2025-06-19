<%@page import="com.bank.entity.BankUserDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Dashboard</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"/>

    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body {
            background: linear-gradient(to bottom right, #fff2fd, #dfa1fb);
            min-height: 100vh;
            padding: 25px;
            animation: fadeIn 1s ease;
        }

        header {
            background: linear-gradient(to right, #9f3e5f, #4fa1ff);
            color: white;
            text-align: center;
            padding: 20px 0;
            font-size: 28px;
            margin-bottom: 25px;
            border-radius: 8px;
        }

        .main-container {
            display: flex;
            flex-wrap: wrap;
            gap: 30px;
        }

        /* Profile module with distinct style */
        .user-info {
            flex: 1 1 330px;
            background: linear-gradient(to bottom, #5f2c82, #49a09d);
            padding: 30px;
            border-radius: 15px;
            color: #fff;
            box-shadow: 0 6px 16px rgba(0,0,0,0.1);
        }

        .user-info h3 {
            font-size: 22px;
            margin-bottom: 20px;
        }

        .user-info p {
            font-size: 17px;
            margin: 12px 0;
            display: flex;
            align-items: center;
            gap: 10px;
        }

        .user-info .highlight {
            color: #ffeaa7;
            font-weight: bold;
        }

        .transactions {
            flex: 2 1 600px;
            background: #ffffff;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0 3px 12px rgba(0,0,0,0.08);
        }

        .transactions h3 {
            font-size: 22px;
            color: #2d3436;
            margin-bottom: 15px;
        }

        .transactions ul {
            list-style: none;
        }

        .transactions li {
            padding: 12px 18px;
            margin: 10px 0;
            border-radius: 6px;
            font-weight: 500;
        }

        .transactions .in {
            background-color: #dff9d7;
            color: #27ae60;
        }

        .transactions .out {
            background-color: #ffe0e0;
            color: #c0392b;
        }

        /* Beneath transaction modules */
        .actions {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
            gap: 30px;
            margin-top: 40px;
        }

        .card {
            padding: 28px;
            border-radius: 12px;
            color: white;
            box-shadow: 0 10px 18px rgba(0,0,0,0.1);
            animation: slideUp 0.6s ease forwards;
            opacity: 0;
        }

        .card h4 {
            font-size: 20px;
            display: flex;
            align-items: center;
            gap: 10px;
            margin-bottom: 18px;
        }

        .card form input[type="submit"] {
            padding: 12px 25px;
            font-size: 16px;
            border: none;
            border-radius: 6px;
            background-color: rgba(255,255,255,0.3);
            color: white;
            cursor: pointer;
            transition: 0.3s ease;
        }

        .card form input[type="submit"]:hover {
            background-color: rgba(255,255,255,0.6);
        }

        .deposit      { background: linear-gradient(135deg, #00b894, #55efc4); }
        .withdraw     { background: linear-gradient(135deg, #d63031, #ff7675); }
        .statement    { background: linear-gradient(135deg, #6c5ce7, #a29bfe); }
        .security     { background: linear-gradient(135deg, #0984e3, #74b9ff); }
        .close-account{ background: linear-gradient(135deg, #fdcb6e, #ffeaa7); }
        .logout       { background: linear-gradient(135deg, #636e72, #b2bec3); }

        @keyframes fadeIn {
            from {opacity: 0;}
            to   {opacity: 1;}
        }

        @keyframes slideUp {
            from { transform: translateY(30px); opacity: 0; }
            to   { transform: translateY(0); opacity: 1; }
        }
    </style>
</head>

<body>
<%
    BankUserDetails user = (BankUserDetails) request.getAttribute("loginedbankuserdetails");
    String accNum = user.getUserid() + "";
    String last3Digits = accNum.length() > 3 ? accNum.substring(accNum.length() - 3) : accNum;
%>

<header>Welcome, <%= user.getName() %>!</header>

<div class="main-container">
    <div class="user-info">
        <h3><i class="fas fa-user-circle"></i> Profile Summary</h3>
        <p><i class="fas fa-envelope"></i> Email: <%= user.getEmailid() %></p>
        <p><i class="fas fa-address-card"></i> Acc No: **** *** <span class="highlight"><%= last3Digits %></span></p>
        <p><i class="fas fa-wallet"></i> Balance: <span class="highlight">₹<%= user.getAmount() %></span></p>
        <p><i class="fas fa-phone"></i> Phone: <%= user.getMobilenumber() %></p>
        <p><i class="fas fa-venus-mars"></i> Gender: <%= user.getGender() %></p>
    </div>

    <div class="transactions">
        <h3><i class="fas fa-list"></i> Recent Transactions</h3>
        <ul>
            <li class="in"><i class="fas fa-plus-circle"></i> ₹4,000 — UPI Received</li>
            <li class="out"><i class="fas fa-minus-circle"></i> ₹850 — ATM Withdrawal</li>
            <li class="in"><i class="fas fa-plus-circle"></i> ₹1,500 — Salary</li>
            <li class="out"><i class="fas fa-minus-circle"></i> ₹300 — Recharge</li>
        </ul>
    </div>
</div>

<!-- Operations -->
<div class="actions">
    <div class="card deposit">
        <h4><i class="fas fa-arrow-down"></i> Deposit Funds</h4>
        <form action="depositRequest">
        
            <input type="text" value="<%= user.getUserid() %>" name="userid" hidden>
        <input type="submit" value="Add Money"></form>
    </div>
    <div class="card withdraw">
        <h4><i class="fas fa-arrow-up"></i> Withdraw Funds</h4>
        <form action="withdrawRequest">
        
            <input type="text" value="<%= user.getUserid() %>" name="userid" hidden>
        <input type="submit" value="Withdraw"></form>
    </div>
    <div class="card statement">
        <h4><i class="fas fa-file-alt"></i> Account Statement</h4>
        <form action="getStatement">
        
            <input type="text" value="<%= user.getUserid() %>" name="userid" hidden>
        <input type="submit" value="View Statement"></form>
    </div>
    <div class="card security">
        <h4><i class="fas fa-shield-alt"></i> Security Settings</h4>
        <form action="changePassword">
        
            <input type="text" value="<%= user.getUserid() %>" name="userid" hidden>
        <input type="submit" value="Change Password"></form>
    </div>
    <div class="card close-account">
        <h4><i class="fas fa-user-slash"></i> Close Account</h4>
        <form action="closeaccount">
            <input type="text" value="<%= user.getUserid() %>" name="userid" hidden>
            <input type="submit" value="Request Closure">
        </form>
    </div>
    <div class="card logout">
        <h4><i class="fas fa-sign-out-alt"></i> Logout</h4>
        <form action="logoutUser"><input type="submit" value="Exit Session"></form>
    </div>
</div>

</body>
</html>
