<%@page import="com.bank.entity.BankUserDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserWithdraw</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f2f5;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    form {
        background-color: white;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 350px;
    }

    label {
        font-weight: bold;
    }

    input[type="number"],
    input[type="text"],
    select {
        width: 100%;
        padding: 8px;
        margin: 8px 0 20px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="submit"] {
        width: 100%;
        background-color: #4CAF50;
        color: white;
        padding: 10px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<%String msg=(String) request.getAttribute("balanceExcep"); %>
<%=(msg!=null)? msg:"" %>
<%
    BankUserDetails bankUserDetails = (BankUserDetails) request.getSession().getAttribute("withdrawinguser");
%>

<form action="withdrawservlet" method="post">
    <input type="hidden" name="userid" value="<%= bankUserDetails.getUserid() %>">
    <input type="hidden" name="transactiontype" value="withdraw">

    <label for="amount">Enter Amount:</label>
    <input type="number" name="amount" min="1" required>

    <label for="mode">Select Payment Mode:</label>
    <select name="mode" required>
        <option value="">--Select--</option>
        <option value="UPI">UPI</option>
        <option value="NetBanking">Net Banking</option>
        <option value="DebitCard">Debit Card</option>
        <option value="CreditCard">Credit Card</option>
    </select>

    <label for="remarks">Remarks (optional):</label>
    <input type="text" name="remarks">

    <input type="submit" value="Withdraw">
</form>

</body>
</html>